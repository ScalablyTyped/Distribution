package typings.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.braintree.braintreeStrings.Yes
  - typings.braintree.braintreeStrings.No
  - typings.braintree.braintreeStrings.Unknown
*/
trait Payroll extends js.Object

object Payroll {
  @scala.inline
  def No: typings.braintree.braintreeStrings.No = this.cast("No")
  @scala.inline
  def Unknown: typings.braintree.braintreeStrings.Unknown = this.cast("Unknown")
  @scala.inline
  def Yes: typings.braintree.braintreeStrings.Yes = this.cast("Yes")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

