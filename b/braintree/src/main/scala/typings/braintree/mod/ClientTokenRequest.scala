package typings.braintree.mod

import typings.braintree.AnonFailOnDuplicatePaymentMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientTokenRequest extends js.Object {
  var customerId: js.UndefOr[String] = js.undefined
  var merchantAccountId: js.UndefOr[String] = js.undefined
  var options: js.UndefOr[AnonFailOnDuplicatePaymentMethod] = js.undefined
  var version: js.UndefOr[String] = js.undefined
}

object ClientTokenRequest {
  @scala.inline
  def apply(
    customerId: String = null,
    merchantAccountId: String = null,
    options: AnonFailOnDuplicatePaymentMethod = null,
    version: String = null
  ): ClientTokenRequest = {
    val __obj = js.Dynamic.literal()
    if (customerId != null) __obj.updateDynamic("customerId")(customerId.asInstanceOf[js.Any])
    if (merchantAccountId != null) __obj.updateDynamic("merchantAccountId")(merchantAccountId.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientTokenRequest]
  }
}

