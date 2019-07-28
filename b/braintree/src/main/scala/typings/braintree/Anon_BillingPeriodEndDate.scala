package typings.braintree

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BillingPeriodEndDate extends js.Object {
  var billingPeriodEndDate: Date
  var billingPeriodStartDate: Date
}

object Anon_BillingPeriodEndDate {
  @scala.inline
  def apply(billingPeriodEndDate: Date, billingPeriodStartDate: Date): Anon_BillingPeriodEndDate = {
    val __obj = js.Dynamic.literal(billingPeriodEndDate = billingPeriodEndDate, billingPeriodStartDate = billingPeriodStartDate)
  
    __obj.asInstanceOf[Anon_BillingPeriodEndDate]
  }
}

