package typings
package dateDashArithmeticLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** dateArithmetic Public Instance Methods */
trait dateArithmeticStatic extends js.Object {
  /** Add specified amount of units to a provided date and return new date as a result */
  def add(date: stdLib.Date, num: scala.Double, unit: Unit): stdLib.Date
  /** Compare two dates and return true if they are equal */
  def eq(date: stdLib.Date, date2: stdLib.Date): scala.Boolean
  /** Compare two dates and return true if date is greater than date2 */
  def gt(date: stdLib.Date, date2: stdLib.Date): scala.Boolean
  /** Compare two dates and return true if date is greater or equal than date2 */
  def gte(date: stdLib.Date, date2: stdLib.Date): scala.Boolean
  /** Compare two dates and return true if date is less than date2 */
  def lt(date: stdLib.Date, date2: stdLib.Date): scala.Boolean
  /** Compare two dates and return true if date is less or equal than date2 */
  def lte(date: stdLib.Date, date2: stdLib.Date): scala.Boolean
  /** Compare two dates and return false if they are equal */
  def neq(date: stdLib.Date, date2: stdLib.Date): scala.Boolean
  /** Subtract specified amount of units from a provided date and return new date as a result */
  def subtract(date: stdLib.Date, num: scala.Double, unit: Unit): stdLib.Date
}

object dateArithmeticStatic {
  @scala.inline
  def apply(
    add: js.Function3[stdLib.Date, scala.Double, Unit, stdLib.Date],
    eq: js.Function2[stdLib.Date, stdLib.Date, scala.Boolean],
    gt: js.Function2[stdLib.Date, stdLib.Date, scala.Boolean],
    gte: js.Function2[stdLib.Date, stdLib.Date, scala.Boolean],
    lt: js.Function2[stdLib.Date, stdLib.Date, scala.Boolean],
    lte: js.Function2[stdLib.Date, stdLib.Date, scala.Boolean],
    neq: js.Function2[stdLib.Date, stdLib.Date, scala.Boolean],
    subtract: js.Function3[stdLib.Date, scala.Double, Unit, stdLib.Date]
  ): dateArithmeticStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(add)
    __obj.updateDynamic("eq")(eq)
    __obj.updateDynamic("gt")(gt)
    __obj.updateDynamic("gte")(gte)
    __obj.updateDynamic("lt")(lt)
    __obj.updateDynamic("lte")(lte)
    __obj.updateDynamic("neq")(neq)
    __obj.updateDynamic("subtract")(subtract)
    __obj.asInstanceOf[dateArithmeticStatic]
  }
}

