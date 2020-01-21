package typings.braintree

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBillingPeriodEndDate extends js.Object {
  var billingPeriodEndDate: Date
  var billingPeriodStartDate: Date
}

object AnonBillingPeriodEndDate {
  @scala.inline
  def apply(billingPeriodEndDate: Date, billingPeriodStartDate: Date): AnonBillingPeriodEndDate = {
    val __obj = js.Dynamic.literal(billingPeriodEndDate = billingPeriodEndDate.asInstanceOf[js.Any], billingPeriodStartDate = billingPeriodStartDate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBillingPeriodEndDate]
  }
}

