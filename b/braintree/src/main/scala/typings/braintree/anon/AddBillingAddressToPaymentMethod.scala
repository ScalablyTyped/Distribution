package typings.braintree.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddBillingAddressToPaymentMethod extends js.Object {
  var addBillingAddressToPaymentMethod: js.UndefOr[Boolean] = js.native
  var holdInEscrow: js.UndefOr[Boolean] = js.native
  var paypal: js.UndefOr[CustomField] = js.native
  var skipAdvancedFraudChecking: js.UndefOr[Boolean] = js.native
  var skipAvs: js.UndefOr[Boolean] = js.native
  var skipCvv: js.UndefOr[Boolean] = js.native
  var storeInVault: js.UndefOr[Boolean] = js.native
  var storeInVaultOnSuccess: js.UndefOr[Boolean] = js.native
  var storeShippingAddressInVault: js.UndefOr[Boolean] = js.native
  var submitForSettlement: js.UndefOr[Boolean] = js.native
  var threeDSecure: js.UndefOr[Required] = js.native
  var venmo: js.UndefOr[ProfileId] = js.native
}

object AddBillingAddressToPaymentMethod {
  @scala.inline
  def apply(): AddBillingAddressToPaymentMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddBillingAddressToPaymentMethod]
  }
  @scala.inline
  implicit class AddBillingAddressToPaymentMethodOps[Self <: AddBillingAddressToPaymentMethod] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddBillingAddressToPaymentMethod(value: Boolean): Self = this.set("addBillingAddressToPaymentMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddBillingAddressToPaymentMethod: Self = this.set("addBillingAddressToPaymentMethod", js.undefined)
    @scala.inline
    def setHoldInEscrow(value: Boolean): Self = this.set("holdInEscrow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoldInEscrow: Self = this.set("holdInEscrow", js.undefined)
    @scala.inline
    def setPaypal(value: CustomField): Self = this.set("paypal", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaypal: Self = this.set("paypal", js.undefined)
    @scala.inline
    def setSkipAdvancedFraudChecking(value: Boolean): Self = this.set("skipAdvancedFraudChecking", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipAdvancedFraudChecking: Self = this.set("skipAdvancedFraudChecking", js.undefined)
    @scala.inline
    def setSkipAvs(value: Boolean): Self = this.set("skipAvs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipAvs: Self = this.set("skipAvs", js.undefined)
    @scala.inline
    def setSkipCvv(value: Boolean): Self = this.set("skipCvv", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipCvv: Self = this.set("skipCvv", js.undefined)
    @scala.inline
    def setStoreInVault(value: Boolean): Self = this.set("storeInVault", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStoreInVault: Self = this.set("storeInVault", js.undefined)
    @scala.inline
    def setStoreInVaultOnSuccess(value: Boolean): Self = this.set("storeInVaultOnSuccess", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStoreInVaultOnSuccess: Self = this.set("storeInVaultOnSuccess", js.undefined)
    @scala.inline
    def setStoreShippingAddressInVault(value: Boolean): Self = this.set("storeShippingAddressInVault", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStoreShippingAddressInVault: Self = this.set("storeShippingAddressInVault", js.undefined)
    @scala.inline
    def setSubmitForSettlement(value: Boolean): Self = this.set("submitForSettlement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubmitForSettlement: Self = this.set("submitForSettlement", js.undefined)
    @scala.inline
    def setThreeDSecure(value: Required): Self = this.set("threeDSecure", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThreeDSecure: Self = this.set("threeDSecure", js.undefined)
    @scala.inline
    def setVenmo(value: ProfileId): Self = this.set("venmo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVenmo: Self = this.set("venmo", js.undefined)
  }
  
}

