package typings.braintreeDashWebDashDropDashIn.braintreeDashWebDashDropDashInMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait googlePayCreateOptions extends js.Object {
  var button: js.UndefOr[js.Any] = js.undefined
  var googlePayVersion: js.UndefOr[String] = js.undefined
  var merchantId: String
  var transactionInfo: js.Any
}

object googlePayCreateOptions {
  @scala.inline
  def apply(
    merchantId: String,
    transactionInfo: js.Any,
    button: js.Any = null,
    googlePayVersion: String = null
  ): googlePayCreateOptions = {
    val __obj = js.Dynamic.literal(merchantId = merchantId, transactionInfo = transactionInfo)
    if (button != null) __obj.updateDynamic("button")(button)
    if (googlePayVersion != null) __obj.updateDynamic("googlePayVersion")(googlePayVersion)
    __obj.asInstanceOf[googlePayCreateOptions]
  }
}

