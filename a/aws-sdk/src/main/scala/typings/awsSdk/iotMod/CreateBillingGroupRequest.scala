package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateBillingGroupRequest extends js.Object {
  /**
    * The name you wish to give to the billing group.
    */
  var billingGroupName: BillingGroupName = js.native
  /**
    * The properties of the billing group.
    */
  var billingGroupProperties: js.UndefOr[BillingGroupProperties] = js.native
  /**
    * Metadata which can be used to manage the billing group.
    */
  var tags: js.UndefOr[TagList] = js.native
}

object CreateBillingGroupRequest {
  @scala.inline
  def apply(
    billingGroupName: BillingGroupName,
    billingGroupProperties: BillingGroupProperties = null,
    tags: TagList = null
  ): CreateBillingGroupRequest = {
    val __obj = js.Dynamic.literal(billingGroupName = billingGroupName.asInstanceOf[js.Any])
    if (billingGroupProperties != null) __obj.updateDynamic("billingGroupProperties")(billingGroupProperties.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBillingGroupRequest]
  }
}

