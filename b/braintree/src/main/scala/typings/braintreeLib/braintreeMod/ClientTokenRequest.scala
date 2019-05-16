package typings
package braintreeLib.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientTokenRequest extends js.Object {
  var customerId: js.UndefOr[java.lang.String] = js.undefined
  var merchantAccountId: js.UndefOr[java.lang.String] = js.undefined
  var options: js.UndefOr[braintreeLib.Anon_FailOnDuplicatePaymentMethod] = js.undefined
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object ClientTokenRequest {
  @scala.inline
  def apply(
    customerId: java.lang.String = null,
    merchantAccountId: java.lang.String = null,
    options: braintreeLib.Anon_FailOnDuplicatePaymentMethod = null,
    version: java.lang.String = null
  ): ClientTokenRequest = {
    val __obj = js.Dynamic.literal()
    if (customerId != null) __obj.updateDynamic("customerId")(customerId)
    if (merchantAccountId != null) __obj.updateDynamic("merchantAccountId")(merchantAccountId)
    if (options != null) __obj.updateDynamic("options")(options)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[ClientTokenRequest]
  }
}

