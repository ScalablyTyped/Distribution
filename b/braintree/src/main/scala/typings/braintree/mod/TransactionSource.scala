package typings.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.braintree.braintreeStrings.Api
  - typings.braintree.braintreeStrings.ControlPanel
  - typings.braintree.braintreeStrings.Recurring
*/
trait TransactionSource extends js.Object

object TransactionSource {
  @scala.inline
  def Api: typings.braintree.braintreeStrings.Api = this.cast("Api")
  @scala.inline
  def ControlPanel: typings.braintree.braintreeStrings.ControlPanel = this.cast("ControlPanel")
  @scala.inline
  def Recurring: typings.braintree.braintreeStrings.Recurring = this.cast("Recurring")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

