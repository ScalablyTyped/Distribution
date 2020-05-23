package typings.braintree.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerificationAcmount extends js.Object {
  var makeDefault: js.UndefOr[Boolean] = js.undefined
  var verificationAcmount: js.UndefOr[String] = js.undefined
  var verificationMerchantAccountId: js.UndefOr[String] = js.undefined
  var verifyCard: js.UndefOr[Boolean] = js.undefined
}

object VerificationAcmount {
  @scala.inline
  def apply(
    makeDefault: js.UndefOr[Boolean] = js.undefined,
    verificationAcmount: String = null,
    verificationMerchantAccountId: String = null,
    verifyCard: js.UndefOr[Boolean] = js.undefined
  ): VerificationAcmount = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(makeDefault)) __obj.updateDynamic("makeDefault")(makeDefault.get.asInstanceOf[js.Any])
    if (verificationAcmount != null) __obj.updateDynamic("verificationAcmount")(verificationAcmount.asInstanceOf[js.Any])
    if (verificationMerchantAccountId != null) __obj.updateDynamic("verificationMerchantAccountId")(verificationMerchantAccountId.asInstanceOf[js.Any])
    if (!js.isUndefined(verifyCard)) __obj.updateDynamic("verifyCard")(verifyCard.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerificationAcmount]
  }
}

