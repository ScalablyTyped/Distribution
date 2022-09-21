package typings.braintree.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BillingPeriodEndDate extends StObject {
  
  var billingPeriodEndDate: js.Date
  
  var billingPeriodStartDate: js.Date
}
object BillingPeriodEndDate {
  
  inline def apply(billingPeriodEndDate: js.Date, billingPeriodStartDate: js.Date): BillingPeriodEndDate = {
    val __obj = js.Dynamic.literal(billingPeriodEndDate = billingPeriodEndDate.asInstanceOf[js.Any], billingPeriodStartDate = billingPeriodStartDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[BillingPeriodEndDate]
  }
  
  extension [Self <: BillingPeriodEndDate](x: Self) {
    
    inline def setBillingPeriodEndDate(value: js.Date): Self = StObject.set(x, "billingPeriodEndDate", value.asInstanceOf[js.Any])
    
    inline def setBillingPeriodStartDate(value: js.Date): Self = StObject.set(x, "billingPeriodStartDate", value.asInstanceOf[js.Any])
  }
}
