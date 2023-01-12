package typings.braintree.mod

import typings.braintree.anon.DoNotInheritAddOnsOrDiscounts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscriptionCreateRequest
  extends StObject
     with SubscriptionRequest {
  
  var billingDayOfMonth: js.UndefOr[Double] = js.undefined
  
  var options: js.UndefOr[DoNotInheritAddOnsOrDiscounts] = js.undefined
  
  var trialDuration: js.UndefOr[Double] = js.undefined
  
  var trialDurationUnit: js.UndefOr[String] = js.undefined
  
  var trialPeriod: js.UndefOr[Boolean] = js.undefined
}
object SubscriptionCreateRequest {
  
  inline def apply(planId: String): SubscriptionCreateRequest = {
    val __obj = js.Dynamic.literal(planId = planId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionCreateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubscriptionCreateRequest] (val x: Self) extends AnyVal {
    
    inline def setBillingDayOfMonth(value: Double): Self = StObject.set(x, "billingDayOfMonth", value.asInstanceOf[js.Any])
    
    inline def setBillingDayOfMonthUndefined: Self = StObject.set(x, "billingDayOfMonth", js.undefined)
    
    inline def setOptions(value: DoNotInheritAddOnsOrDiscounts): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setTrialDuration(value: Double): Self = StObject.set(x, "trialDuration", value.asInstanceOf[js.Any])
    
    inline def setTrialDurationUndefined: Self = StObject.set(x, "trialDuration", js.undefined)
    
    inline def setTrialDurationUnit(value: String): Self = StObject.set(x, "trialDurationUnit", value.asInstanceOf[js.Any])
    
    inline def setTrialDurationUnitUndefined: Self = StObject.set(x, "trialDurationUnit", js.undefined)
    
    inline def setTrialPeriod(value: Boolean): Self = StObject.set(x, "trialPeriod", value.asInstanceOf[js.Any])
    
    inline def setTrialPeriodUndefined: Self = StObject.set(x, "trialPeriod", js.undefined)
  }
}
