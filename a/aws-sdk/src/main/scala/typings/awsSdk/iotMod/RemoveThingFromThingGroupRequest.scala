package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveThingFromThingGroupRequest extends js.Object {
  /**
    * The ARN of the thing to remove from the group.
    */
  var thingArn: js.UndefOr[ThingArn] = js.native
  /**
    * The group ARN.
    */
  var thingGroupArn: js.UndefOr[ThingGroupArn] = js.native
  /**
    * The group name.
    */
  var thingGroupName: js.UndefOr[ThingGroupName] = js.native
  /**
    * The name of the thing to remove from the group.
    */
  var thingName: js.UndefOr[ThingName] = js.native
}

object RemoveThingFromThingGroupRequest {
  @scala.inline
  def apply(
    thingArn: ThingArn = null,
    thingGroupArn: ThingGroupArn = null,
    thingGroupName: ThingGroupName = null,
    thingName: ThingName = null
  ): RemoveThingFromThingGroupRequest = {
    val __obj = js.Dynamic.literal()
    if (thingArn != null) __obj.updateDynamic("thingArn")(thingArn.asInstanceOf[js.Any])
    if (thingGroupArn != null) __obj.updateDynamic("thingGroupArn")(thingGroupArn.asInstanceOf[js.Any])
    if (thingGroupName != null) __obj.updateDynamic("thingGroupName")(thingGroupName.asInstanceOf[js.Any])
    if (thingName != null) __obj.updateDynamic("thingName")(thingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveThingFromThingGroupRequest]
  }
}

