package typings.braintree.mod

import typings.braintree.anon.FailOnDuplicatePaymentMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientTokenRequest extends js.Object {
  var customerId: js.UndefOr[String] = js.undefined
  var merchantAccountId: js.UndefOr[String] = js.undefined
  var options: js.UndefOr[FailOnDuplicatePaymentMethod] = js.undefined
  var version: js.UndefOr[String] = js.undefined
}

object ClientTokenRequest {
  @scala.inline
  def apply(
    customerId: String = null,
    merchantAccountId: String = null,
    options: FailOnDuplicatePaymentMethod = null,
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

