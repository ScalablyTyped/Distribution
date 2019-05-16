package typings
package braintreeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddBillingAddressToPaymentMethod extends js.Object {
  var addBillingAddressToPaymentMethod: js.UndefOr[scala.Boolean] = js.undefined
  var holdInEscrow: js.UndefOr[scala.Boolean] = js.undefined
  var paypal: js.UndefOr[Anon_CustomField] = js.undefined
  var skipAdvancedFraudChecking: js.UndefOr[scala.Boolean] = js.undefined
  var skipAvs: js.UndefOr[scala.Boolean] = js.undefined
  var skipCvv: js.UndefOr[scala.Boolean] = js.undefined
  var storeInVault: js.UndefOr[scala.Boolean] = js.undefined
  var storeInVaultOnSuccess: js.UndefOr[scala.Boolean] = js.undefined
  var storeShippingAddressInVault: js.UndefOr[scala.Boolean] = js.undefined
  var submitForSettlement: js.UndefOr[scala.Boolean] = js.undefined
  var threeDSecure: js.UndefOr[Anon_Required] = js.undefined
  var venmo: js.UndefOr[Anon_ProfileId] = js.undefined
}

object Anon_AddBillingAddressToPaymentMethod {
  @scala.inline
  def apply(
    addBillingAddressToPaymentMethod: js.UndefOr[scala.Boolean] = js.undefined,
    holdInEscrow: js.UndefOr[scala.Boolean] = js.undefined,
    paypal: Anon_CustomField = null,
    skipAdvancedFraudChecking: js.UndefOr[scala.Boolean] = js.undefined,
    skipAvs: js.UndefOr[scala.Boolean] = js.undefined,
    skipCvv: js.UndefOr[scala.Boolean] = js.undefined,
    storeInVault: js.UndefOr[scala.Boolean] = js.undefined,
    storeInVaultOnSuccess: js.UndefOr[scala.Boolean] = js.undefined,
    storeShippingAddressInVault: js.UndefOr[scala.Boolean] = js.undefined,
    submitForSettlement: js.UndefOr[scala.Boolean] = js.undefined,
    threeDSecure: Anon_Required = null,
    venmo: Anon_ProfileId = null
  ): Anon_AddBillingAddressToPaymentMethod = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addBillingAddressToPaymentMethod)) __obj.updateDynamic("addBillingAddressToPaymentMethod")(addBillingAddressToPaymentMethod)
    if (!js.isUndefined(holdInEscrow)) __obj.updateDynamic("holdInEscrow")(holdInEscrow)
    if (paypal != null) __obj.updateDynamic("paypal")(paypal)
    if (!js.isUndefined(skipAdvancedFraudChecking)) __obj.updateDynamic("skipAdvancedFraudChecking")(skipAdvancedFraudChecking)
    if (!js.isUndefined(skipAvs)) __obj.updateDynamic("skipAvs")(skipAvs)
    if (!js.isUndefined(skipCvv)) __obj.updateDynamic("skipCvv")(skipCvv)
    if (!js.isUndefined(storeInVault)) __obj.updateDynamic("storeInVault")(storeInVault)
    if (!js.isUndefined(storeInVaultOnSuccess)) __obj.updateDynamic("storeInVaultOnSuccess")(storeInVaultOnSuccess)
    if (!js.isUndefined(storeShippingAddressInVault)) __obj.updateDynamic("storeShippingAddressInVault")(storeShippingAddressInVault)
    if (!js.isUndefined(submitForSettlement)) __obj.updateDynamic("submitForSettlement")(submitForSettlement)
    if (threeDSecure != null) __obj.updateDynamic("threeDSecure")(threeDSecure)
    if (venmo != null) __obj.updateDynamic("venmo")(venmo)
    __obj.asInstanceOf[Anon_AddBillingAddressToPaymentMethod]
  }
}

