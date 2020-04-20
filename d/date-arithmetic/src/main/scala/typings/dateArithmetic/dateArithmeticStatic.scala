package typings.dateArithmetic

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** dateArithmetic Public Instance Methods */
trait dateArithmeticStatic extends js.Object {
  /** Add specified amount of units to a provided date and return new date as a result */
  def add(date: Date, num: Double, unit: Unit): Date
  /** Compare two dates and return true if they are equal */
  def eq(date: Date, date2: Date): Boolean
  /** Compare two dates and return true if date is greater than date2 */
  def gt(date: Date, date2: Date): Boolean
  /** Compare two dates and return true if date is greater or equal than date2 */
  def gte(date: Date, date2: Date): Boolean
  /** Compare two dates and return true if date is less than date2 */
  def lt(date: Date, date2: Date): Boolean
  /** Compare two dates and return true if date is less or equal than date2 */
  def lte(date: Date, date2: Date): Boolean
  /** Compare two dates and return false if they are equal */
  def neq(date: Date, date2: Date): Boolean
  /** Subtract specified amount of units from a provided date and return new date as a result */
  def subtract(date: Date, num: Double, unit: Unit): Date
}

object dateArithmeticStatic {
  @scala.inline
  def apply(
    add: (Date, Double, Unit) => Date,
    eq: (Date, Date) => Boolean,
    gt: (Date, Date) => Boolean,
    gte: (Date, Date) => Boolean,
    lt: (Date, Date) => Boolean,
    lte: (Date, Date) => Boolean,
    neq: (Date, Date) => Boolean,
    subtract: (Date, Double, Unit) => Date
  ): dateArithmeticStatic = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction3(add), eq = js.Any.fromFunction2(eq), gt = js.Any.fromFunction2(gt), gte = js.Any.fromFunction2(gte), lt = js.Any.fromFunction2(lt), lte = js.Any.fromFunction2(lte), neq = js.Any.fromFunction2(neq), subtract = js.Any.fromFunction3(subtract))
    __obj.asInstanceOf[dateArithmeticStatic]
  }
}

