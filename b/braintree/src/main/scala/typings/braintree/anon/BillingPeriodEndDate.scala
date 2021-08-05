package typings.braintree.anon

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BillingPeriodEndDate extends StObject {
  
  var billingPeriodEndDate: Date
  
  var billingPeriodStartDate: Date
}
object BillingPeriodEndDate {
  
  inline def apply(billingPeriodEndDate: Date, billingPeriodStartDate: Date): BillingPeriodEndDate = {
    val __obj = js.Dynamic.literal(billingPeriodEndDate = billingPeriodEndDate.asInstanceOf[js.Any], billingPeriodStartDate = billingPeriodStartDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[BillingPeriodEndDate]
  }
  
  extension [Self <: BillingPeriodEndDate](x: Self) {
    
    inline def setBillingPeriodEndDate(value: Date): Self = StObject.set(x, "billingPeriodEndDate", value.asInstanceOf[js.Any])
    
    inline def setBillingPeriodStartDate(value: Date): Self = StObject.set(x, "billingPeriodStartDate", value.asInstanceOf[js.Any])
  }
}
