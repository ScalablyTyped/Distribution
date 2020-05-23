package typings.braintree.anon

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BillingPeriodEndDate extends js.Object {
  var billingPeriodEndDate: Date
  var billingPeriodStartDate: Date
}

object BillingPeriodEndDate {
  @scala.inline
  def apply(billingPeriodEndDate: Date, billingPeriodStartDate: Date): BillingPeriodEndDate = {
    val __obj = js.Dynamic.literal(billingPeriodEndDate = billingPeriodEndDate.asInstanceOf[js.Any], billingPeriodStartDate = billingPeriodStartDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[BillingPeriodEndDate]
  }
}

