package typings.braintree.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.braintree.braintreeStrings.approved
  - typings.braintree.braintreeStrings.soft_declined
  - typings.braintree.braintreeStrings.hard_declined
*/
trait TransactionProcessorResponseType extends js.Object

object TransactionProcessorResponseType {
  @scala.inline
  def approved: typings.braintree.braintreeStrings.approved = this.cast("approved")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hard_declined: typings.braintree.braintreeStrings.hard_declined = this.cast("hard_declined")
  @scala.inline
  def soft_declined: typings.braintree.braintreeStrings.soft_declined = this.cast("soft_declined")
}

