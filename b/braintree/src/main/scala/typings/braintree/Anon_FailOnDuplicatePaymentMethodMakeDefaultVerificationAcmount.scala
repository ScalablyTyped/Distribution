package typings.braintree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FailOnDuplicatePaymentMethodMakeDefaultVerificationAcmount extends js.Object {
  var failOnDuplicatePaymentMethod: js.UndefOr[Boolean] = js.undefined
  var makeDefault: js.UndefOr[Boolean] = js.undefined
  var verificationAcmount: js.UndefOr[String] = js.undefined
  var verificationMerchantAccountId: js.UndefOr[String] = js.undefined
  var verifyCard: js.UndefOr[Boolean] = js.undefined
}

object Anon_FailOnDuplicatePaymentMethodMakeDefaultVerificationAcmount {
  @scala.inline
  def apply(
    failOnDuplicatePaymentMethod: js.UndefOr[Boolean] = js.undefined,
    makeDefault: js.UndefOr[Boolean] = js.undefined,
    verificationAcmount: String = null,
    verificationMerchantAccountId: String = null,
    verifyCard: js.UndefOr[Boolean] = js.undefined
  ): Anon_FailOnDuplicatePaymentMethodMakeDefaultVerificationAcmount = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(failOnDuplicatePaymentMethod)) __obj.updateDynamic("failOnDuplicatePaymentMethod")(failOnDuplicatePaymentMethod)
    if (!js.isUndefined(makeDefault)) __obj.updateDynamic("makeDefault")(makeDefault)
    if (verificationAcmount != null) __obj.updateDynamic("verificationAcmount")(verificationAcmount)
    if (verificationMerchantAccountId != null) __obj.updateDynamic("verificationMerchantAccountId")(verificationMerchantAccountId)
    if (!js.isUndefined(verifyCard)) __obj.updateDynamic("verifyCard")(verifyCard)
    __obj.asInstanceOf[Anon_FailOnDuplicatePaymentMethodMakeDefaultVerificationAcmount]
  }
}

