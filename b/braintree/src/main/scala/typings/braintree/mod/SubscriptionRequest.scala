package typings.braintree.mod

import typings.braintree.anon.Add
import typings.braintree.anon.DoNotInheritAddOnsOrDiscounts
import typings.braintree.anon.Remove
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubscriptionRequest extends js.Object {
  
  var addOns: js.UndefOr[Add] = js.native
  
  var billingDayOfMonth: js.UndefOr[Double] = js.native
  
  var descriptor: js.UndefOr[Descriptor] = js.native
  
  var discounts: js.UndefOr[Remove] = js.native
  
  var firstBillingDate: js.UndefOr[Date] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var merchantAccountId: js.UndefOr[String] = js.native
  
  var neverExpires: js.UndefOr[Boolean] = js.native
  
  var numberOfBillingCycles: js.UndefOr[Double] = js.native
  
  var options: js.UndefOr[DoNotInheritAddOnsOrDiscounts] = js.native
  
  var paymentMethodNonce: js.UndefOr[String] = js.native
  
  var paymentMethodToken: String = js.native
  
  var planId: String = js.native
  
  var price: js.UndefOr[String] = js.native
  
  var trialDuration: js.UndefOr[Double] = js.native
  
  var trialDurationUnit: js.UndefOr[String] = js.native
  
  var trialPeriod: js.UndefOr[Boolean] = js.native
}
object SubscriptionRequest {
  
  @scala.inline
  def apply(paymentMethodToken: String, planId: String): SubscriptionRequest = {
    val __obj = js.Dynamic.literal(paymentMethodToken = paymentMethodToken.asInstanceOf[js.Any], planId = planId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionRequest]
  }
  
  @scala.inline
  implicit class SubscriptionRequestOps[Self <: SubscriptionRequest] (val x: Self) extends AnyVal {
    
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
    def setPaymentMethodToken(value: String): Self = this.set("paymentMethodToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlanId(value: String): Self = this.set("planId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddOns(value: Add): Self = this.set("addOns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddOns: Self = this.set("addOns", js.undefined)
    
    @scala.inline
    def setBillingDayOfMonth(value: Double): Self = this.set("billingDayOfMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBillingDayOfMonth: Self = this.set("billingDayOfMonth", js.undefined)
    
    @scala.inline
    def setDescriptor(value: Descriptor): Self = this.set("descriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescriptor: Self = this.set("descriptor", js.undefined)
    
    @scala.inline
    def setDiscounts(value: Remove): Self = this.set("discounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiscounts: Self = this.set("discounts", js.undefined)
    
    @scala.inline
    def setFirstBillingDate(value: Date): Self = this.set("firstBillingDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstBillingDate: Self = this.set("firstBillingDate", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setMerchantAccountId(value: String): Self = this.set("merchantAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMerchantAccountId: Self = this.set("merchantAccountId", js.undefined)
    
    @scala.inline
    def setNeverExpires(value: Boolean): Self = this.set("neverExpires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNeverExpires: Self = this.set("neverExpires", js.undefined)
    
    @scala.inline
    def setNumberOfBillingCycles(value: Double): Self = this.set("numberOfBillingCycles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfBillingCycles: Self = this.set("numberOfBillingCycles", js.undefined)
    
    @scala.inline
    def setOptions(value: DoNotInheritAddOnsOrDiscounts): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setPaymentMethodNonce(value: String): Self = this.set("paymentMethodNonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaymentMethodNonce: Self = this.set("paymentMethodNonce", js.undefined)
    
    @scala.inline
    def setPrice(value: String): Self = this.set("price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrice: Self = this.set("price", js.undefined)
    
    @scala.inline
    def setTrialDuration(value: Double): Self = this.set("trialDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrialDuration: Self = this.set("trialDuration", js.undefined)
    
    @scala.inline
    def setTrialDurationUnit(value: String): Self = this.set("trialDurationUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrialDurationUnit: Self = this.set("trialDurationUnit", js.undefined)
    
    @scala.inline
    def setTrialPeriod(value: Boolean): Self = this.set("trialPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrialPeriod: Self = this.set("trialPeriod", js.undefined)
  }
}
