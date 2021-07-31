package typings.braintree.mod

import typings.braintree.anon.Add
import typings.braintree.anon.DoNotInheritAddOnsOrDiscounts
import typings.braintree.anon.Remove
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscriptionRequest extends StObject {
  
  var addOns: js.UndefOr[Add] = js.undefined
  
  var billingDayOfMonth: js.UndefOr[Double] = js.undefined
  
  var descriptor: js.UndefOr[Descriptor] = js.undefined
  
  var discounts: js.UndefOr[Remove] = js.undefined
  
  var firstBillingDate: js.UndefOr[Date] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var merchantAccountId: js.UndefOr[String] = js.undefined
  
  var neverExpires: js.UndefOr[Boolean] = js.undefined
  
  var numberOfBillingCycles: js.UndefOr[Double] = js.undefined
  
  var options: js.UndefOr[DoNotInheritAddOnsOrDiscounts] = js.undefined
  
  var paymentMethodNonce: js.UndefOr[String] = js.undefined
  
  var paymentMethodToken: String
  
  var planId: String
  
  var price: js.UndefOr[String] = js.undefined
  
  var trialDuration: js.UndefOr[Double] = js.undefined
  
  var trialDurationUnit: js.UndefOr[String] = js.undefined
  
  var trialPeriod: js.UndefOr[Boolean] = js.undefined
}
object SubscriptionRequest {
  
  @scala.inline
  def apply(paymentMethodToken: String, planId: String): SubscriptionRequest = {
    val __obj = js.Dynamic.literal(paymentMethodToken = paymentMethodToken.asInstanceOf[js.Any], planId = planId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionRequest]
  }
  
  @scala.inline
  implicit class SubscriptionRequestMutableBuilder[Self <: SubscriptionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddOns(value: Add): Self = StObject.set(x, "addOns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddOnsUndefined: Self = StObject.set(x, "addOns", js.undefined)
    
    @scala.inline
    def setBillingDayOfMonth(value: Double): Self = StObject.set(x, "billingDayOfMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingDayOfMonthUndefined: Self = StObject.set(x, "billingDayOfMonth", js.undefined)
    
    @scala.inline
    def setDescriptor(value: Descriptor): Self = StObject.set(x, "descriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptorUndefined: Self = StObject.set(x, "descriptor", js.undefined)
    
    @scala.inline
    def setDiscounts(value: Remove): Self = StObject.set(x, "discounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscountsUndefined: Self = StObject.set(x, "discounts", js.undefined)
    
    @scala.inline
    def setFirstBillingDate(value: Date): Self = StObject.set(x, "firstBillingDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstBillingDateUndefined: Self = StObject.set(x, "firstBillingDate", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setMerchantAccountId(value: String): Self = StObject.set(x, "merchantAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerchantAccountIdUndefined: Self = StObject.set(x, "merchantAccountId", js.undefined)
    
    @scala.inline
    def setNeverExpires(value: Boolean): Self = StObject.set(x, "neverExpires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeverExpiresUndefined: Self = StObject.set(x, "neverExpires", js.undefined)
    
    @scala.inline
    def setNumberOfBillingCycles(value: Double): Self = StObject.set(x, "numberOfBillingCycles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfBillingCyclesUndefined: Self = StObject.set(x, "numberOfBillingCycles", js.undefined)
    
    @scala.inline
    def setOptions(value: DoNotInheritAddOnsOrDiscounts): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setPaymentMethodNonce(value: String): Self = StObject.set(x, "paymentMethodNonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentMethodNonceUndefined: Self = StObject.set(x, "paymentMethodNonce", js.undefined)
    
    @scala.inline
    def setPaymentMethodToken(value: String): Self = StObject.set(x, "paymentMethodToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlanId(value: String): Self = StObject.set(x, "planId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrice(value: String): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
    
    @scala.inline
    def setTrialDuration(value: Double): Self = StObject.set(x, "trialDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrialDurationUndefined: Self = StObject.set(x, "trialDuration", js.undefined)
    
    @scala.inline
    def setTrialDurationUnit(value: String): Self = StObject.set(x, "trialDurationUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrialDurationUnitUndefined: Self = StObject.set(x, "trialDurationUnit", js.undefined)
    
    @scala.inline
    def setTrialPeriod(value: Boolean): Self = StObject.set(x, "trialPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrialPeriodUndefined: Self = StObject.set(x, "trialPeriod", js.undefined)
  }
}
