package typings
package braintreeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BillingPeriodEndDate extends js.Object {
  var billingPeriodEndDate: stdLib.Date
  var billingPeriodStartDate: stdLib.Date
}

object Anon_BillingPeriodEndDate {
  @scala.inline
  def apply(billingPeriodEndDate: stdLib.Date, billingPeriodStartDate: stdLib.Date): Anon_BillingPeriodEndDate = {
    val __obj = js.Dynamic.literal(billingPeriodEndDate = billingPeriodEndDate, billingPeriodStartDate = billingPeriodStartDate)
  
    __obj.asInstanceOf[Anon_BillingPeriodEndDate]
  }
}

