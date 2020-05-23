package typings.braintree.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MakeDefault extends js.Object {
  var failOnDuplicatePaymentMethod: js.UndefOr[Boolean] = js.undefined
  var makeDefault: js.UndefOr[Boolean] = js.undefined
  var verificationAmount: js.UndefOr[String] = js.undefined
  var verificationMerchantAccountId: js.UndefOr[String] = js.undefined
  var verifyCard: js.UndefOr[Boolean] = js.undefined
}

object MakeDefault {
  @scala.inline
  def apply(
    failOnDuplicatePaymentMethod: js.UndefOr[Boolean] = js.undefined,
    makeDefault: js.UndefOr[Boolean] = js.undefined,
    verificationAmount: String = null,
    verificationMerchantAccountId: String = null,
    verifyCard: js.UndefOr[Boolean] = js.undefined
  ): MakeDefault = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(failOnDuplicatePaymentMethod)) __obj.updateDynamic("failOnDuplicatePaymentMethod")(failOnDuplicatePaymentMethod.get.asInstanceOf[js.Any])
    if (!js.isUndefined(makeDefault)) __obj.updateDynamic("makeDefault")(makeDefault.get.asInstanceOf[js.Any])
    if (verificationAmount != null) __obj.updateDynamic("verificationAmount")(verificationAmount.asInstanceOf[js.Any])
    if (verificationMerchantAccountId != null) __obj.updateDynamic("verificationMerchantAccountId")(verificationMerchantAccountId.asInstanceOf[js.Any])
    if (!js.isUndefined(verifyCard)) __obj.updateDynamic("verifyCard")(verifyCard.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MakeDefault]
  }
}

