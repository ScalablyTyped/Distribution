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
  def held: typings.braintree.braintreeStrings.held = "held".asInstanceOf[typings.braintree.braintreeStrings.held]
  @scala.inline
  def hold_pending: typings.braintree.braintreeStrings.hold_pending = "hold_pending".asInstanceOf[typings.braintree.braintreeStrings.hold_pending]
  @scala.inline
  def refunded: typings.braintree.braintreeStrings.refunded = "refunded".asInstanceOf[typings.braintree.braintreeStrings.refunded]
  @scala.inline
  def release_pending: typings.braintree.braintreeStrings.release_pending = "release_pending".asInstanceOf[typings.braintree.braintreeStrings.release_pending]
  @scala.inline
  def released: typings.braintree.braintreeStrings.released = "released".asInstanceOf[typings.braintree.braintreeStrings.released]
}

