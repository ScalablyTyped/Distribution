package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveThingFromBillingGroupRequest extends js.Object {
  /**
    * The ARN of the billing group.
    */
  var billingGroupArn: js.UndefOr[BillingGroupArn] = js.native
  /**
    * The name of the billing group.
    */
  var billingGroupName: js.UndefOr[BillingGroupName] = js.native
  /**
    * The ARN of the thing to be removed from the billing group.
    */
  var thingArn: js.UndefOr[ThingArn] = js.native
  /**
    * The name of the thing to be removed from the billing group.
    */
  var thingName: js.UndefOr[ThingName] = js.native
}

object RemoveThingFromBillingGroupRequest {
  @scala.inline
  def apply(
    billingGroupArn: BillingGroupArn = null,
    billingGroupName: BillingGroupName = null,
    thingArn: ThingArn = null,
    thingName: ThingName = null
  ): RemoveThingFromBillingGroupRequest = {
    val __obj = js.Dynamic.literal()
    if (billingGroupArn != null) __obj.updateDynamic("billingGroupArn")(billingGroupArn.asInstanceOf[js.Any])
    if (billingGroupName != null) __obj.updateDynamic("billingGroupName")(billingGroupName.asInstanceOf[js.Any])
    if (thingArn != null) __obj.updateDynamic("thingArn")(thingArn.asInstanceOf[js.Any])
    if (thingName != null) __obj.updateDynamic("thingName")(thingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveThingFromBillingGroupRequest]
  }
}

