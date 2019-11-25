package typings.braintree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FailOnDuplicatePaymentMethodMakeDefault extends js.Object {
  var failOnDuplicatePaymentMethod: js.UndefOr[Boolean] = js.undefined
  var makeDefault: js.UndefOr[Boolean] = js.undefined
  var verificationAmount: js.UndefOr[String] = js.undefined
  var verificationMerchantAccountId: js.UndefOr[String] = js.undefined
  var verifyCard: js.UndefOr[Boolean] = js.undefined
}

object Anon_FailOnDuplicatePaymentMethodMakeDefault {
  @scala.inline
  def apply(
    failOnDuplicatePaymentMethod: js.UndefOr[Boolean] = js.undefined,
    makeDefault: js.UndefOr[Boolean] = js.undefined,
    verificationAmount: String = null,
    verificationMerchantAccountId: String = null,
    verifyCard: js.UndefOr[Boolean] = js.undefined
  ): Anon_FailOnDuplicatePaymentMethodMakeDefault = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(failOnDuplicatePaymentMethod)) __obj.updateDynamic("failOnDuplicatePaymentMethod")(failOnDuplicatePaymentMethod.asInstanceOf[js.Any])
    if (!js.isUndefined(makeDefault)) __obj.updateDynamic("makeDefault")(makeDefault.asInstanceOf[js.Any])
    if (verificationAmount != null) __obj.updateDynamic("verificationAmount")(verificationAmount.asInstanceOf[js.Any])
    if (verificationMerchantAccountId != null) __obj.updateDynamic("verificationMerchantAccountId")(verificationMerchantAccountId.asInstanceOf[js.Any])
    if (!js.isUndefined(verifyCard)) __obj.updateDynamic("verifyCard")(verifyCard.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FailOnDuplicatePaymentMethodMakeDefault]
  }
}

