package typings.braintree.anon

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BillingPeriodEndDate extends js.Object {
  
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
  implicit class BillingPeriodEndDateOps[Self <: BillingPeriodEndDate] (val x: Self) extends AnyVal {
    
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
    def setBillingPeriodEndDate(value: Date): Self = this.set("billingPeriodEndDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingPeriodStartDate(value: Date): Self = this.set("billingPeriodStartDate", value.asInstanceOf[js.Any])
  }
}
