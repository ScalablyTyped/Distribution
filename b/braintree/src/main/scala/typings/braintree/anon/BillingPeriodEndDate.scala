package typings.braintree.anon

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BillingPeriodEndDate extends StObject {
  
  var billingPeriodEndDate: Date = js.native
  
  var billingPeriodStartDate: Date = js.native
}
object BillingPeriodEndDate {
  
  @scala.inline
  def apply(billingPeriodEndDate: Date, billingPeriodStartDate: Date): BillingPeriodEndDate = {
    val __obj = js.Dynamic.literal(billingPeriodEndDate = billingPeriodEndDate.asInstanceOf[js.Any], billingPeriodStartDate = billingPeriodStartDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[BillingPeriodEndDate]
  }
  
  @scala.inline
  implicit class BillingPeriodEndDateMutableBuilder[Self <: BillingPeriodEndDate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBillingPeriodEndDate(value: Date): Self = StObject.set(x, "billingPeriodEndDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingPeriodStartDate(value: Date): Self = StObject.set(x, "billingPeriodStartDate", value.asInstanceOf[js.Any])
  }
}
