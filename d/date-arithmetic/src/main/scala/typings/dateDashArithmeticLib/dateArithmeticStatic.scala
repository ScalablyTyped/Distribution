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
    add: (stdLib.Date, scala.Double, Unit) => stdLib.Date,
    eq: (stdLib.Date, stdLib.Date) => scala.Boolean,
    gt: (stdLib.Date, stdLib.Date) => scala.Boolean,
    gte: (stdLib.Date, stdLib.Date) => scala.Boolean,
    lt: (stdLib.Date, stdLib.Date) => scala.Boolean,
    lte: (stdLib.Date, stdLib.Date) => scala.Boolean,
    neq: (stdLib.Date, stdLib.Date) => scala.Boolean,
    subtract: (stdLib.Date, scala.Double, Unit) => stdLib.Date
  ): dateArithmeticStatic = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction3(add), eq = js.Any.fromFunction2(eq), gt = js.Any.fromFunction2(gt), gte = js.Any.fromFunction2(gte), lt = js.Any.fromFunction2(lt), lte = js.Any.fromFunction2(lte), neq = js.Any.fromFunction2(neq), subtract = js.Any.fromFunction3(subtract))
  
    __obj.asInstanceOf[dateArithmeticStatic]
  }
}

