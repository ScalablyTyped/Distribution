package typings
package braintreeDashWebDashDropDashInLib.braintreeDashWebDashDropDashInMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait googlePayCreateOptions extends js.Object {
  var button: js.UndefOr[js.Any] = js.undefined
  var googlePayVersion: js.UndefOr[java.lang.String] = js.undefined
  var merchantId: java.lang.String
  var transactionInfo: js.Any
}

object googlePayCreateOptions {
  @scala.inline
  def apply(
    merchantId: java.lang.String,
    transactionInfo: js.Any,
    button: js.Any = null,
    googlePayVersion: java.lang.String = null
  ): googlePayCreateOptions = {
    val __obj = js.Dynamic.literal(merchantId = merchantId, transactionInfo = transactionInfo)
    if (button != null) __obj.updateDynamic("button")(button)
    if (googlePayVersion != null) __obj.updateDynamic("googlePayVersion")(googlePayVersion)
    __obj.asInstanceOf[googlePayCreateOptions]
  }
}

