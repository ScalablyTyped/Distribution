package typings.braintree.braintreeMod

import typings.braintree.braintreeStrings.api_
import typings.braintree.braintreeStrings.recurring_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.braintree.braintreeStrings.api_
  - typings.braintree.braintreeStrings.control_panel
  - typings.braintree.braintreeStrings.recurring_
*/
trait SubscriptionSource extends js.Object

object SubscriptionSource {
  @scala.inline
  def api: api_ = this.cast("api")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def control_panel: typings.braintree.braintreeStrings.control_panel = this.cast("control_panel")
  @scala.inline
  def recurring: recurring_ = this.cast("recurring")
}

