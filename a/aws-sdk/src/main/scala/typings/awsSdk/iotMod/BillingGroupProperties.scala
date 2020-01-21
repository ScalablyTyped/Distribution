package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BillingGroupProperties extends js.Object {
  /**
    * The description of the billing group.
    */
  var billingGroupDescription: js.UndefOr[BillingGroupDescription] = js.native
}

object BillingGroupProperties {
  @scala.inline
  def apply(billingGroupDescription: BillingGroupDescription = null): BillingGroupProperties = {
    val __obj = js.Dynamic.literal()
    if (billingGroupDescription != null) __obj.updateDynamic("billingGroupDescription")(billingGroupDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[BillingGroupProperties]
  }
}

