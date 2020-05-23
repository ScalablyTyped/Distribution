package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddThingToThingGroupRequest extends js.Object {
  /**
    * Override dynamic thing groups with static thing groups when 10-group limit is reached. If a thing belongs to 10 thing groups, and one or more of those groups are dynamic thing groups, adding a thing to a static group removes the thing from the last dynamic group.
    */
  var overrideDynamicGroups: js.UndefOr[OverrideDynamicGroups] = js.native
  /**
    * The ARN of the thing to add to a group.
    */
  var thingArn: js.UndefOr[ThingArn] = js.native
  /**
    * The ARN of the group to which you are adding a thing.
    */
  var thingGroupArn: js.UndefOr[ThingGroupArn] = js.native
  /**
    * The name of the group to which you are adding a thing.
    */
  var thingGroupName: js.UndefOr[ThingGroupName] = js.native
  /**
    * The name of the thing to add to a group.
    */
  var thingName: js.UndefOr[ThingName] = js.native
}

object AddThingToThingGroupRequest {
  @scala.inline
  def apply(
    overrideDynamicGroups: js.UndefOr[OverrideDynamicGroups] = js.undefined,
    thingArn: ThingArn = null,
    thingGroupArn: ThingGroupArn = null,
    thingGroupName: ThingGroupName = null,
    thingName: ThingName = null
  ): AddThingToThingGroupRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(overrideDynamicGroups)) __obj.updateDynamic("overrideDynamicGroups")(overrideDynamicGroups.get.asInstanceOf[js.Any])
    if (thingArn != null) __obj.updateDynamic("thingArn")(thingArn.asInstanceOf[js.Any])
    if (thingGroupArn != null) __obj.updateDynamic("thingGroupArn")(thingGroupArn.asInstanceOf[js.Any])
    if (thingGroupName != null) __obj.updateDynamic("thingGroupName")(thingGroupName.asInstanceOf[js.Any])
    if (thingName != null) __obj.updateDynamic("thingName")(thingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddThingToThingGroupRequest]
  }
}

