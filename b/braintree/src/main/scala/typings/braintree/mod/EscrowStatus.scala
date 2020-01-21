package typings.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.braintree.braintreeStrings.hold_pending
  - typings.braintree.braintreeStrings.held
  - typings.braintree.braintreeStrings.release_pending
  - typings.braintree.braintreeStrings.released
  - typings.braintree.braintreeStrings.refunded
*/
trait EscrowStatus extends js.Object

object EscrowStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def held: typings.braintree.braintreeStrings.held = this.cast("held")
  @scala.inline
  def hold_pending: typings.braintree.braintreeStrings.hold_pending = this.cast("hold_pending")
  @scala.inline
  def refunded: typings.braintree.braintreeStrings.refunded = this.cast("refunded")
  @scala.inline
  def release_pending: typings.braintree.braintreeStrings.release_pending = this.cast("release_pending")
  @scala.inline
  def released: typings.braintree.braintreeStrings.released = this.cast("released")
}

