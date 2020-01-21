package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateThingGroupResponse extends js.Object {
  /**
    * The thing group ARN.
    */
  var thingGroupArn: js.UndefOr[ThingGroupArn] = js.native
  /**
    * The thing group ID.
    */
  var thingGroupId: js.UndefOr[ThingGroupId] = js.native
  /**
    * The thing group name.
    */
  var thingGroupName: js.UndefOr[ThingGroupName] = js.native
}

object CreateThingGroupResponse {
  @scala.inline
  def apply(
    thingGroupArn: ThingGroupArn = null,
    thingGroupId: ThingGroupId = null,
    thingGroupName: ThingGroupName = null
  ): CreateThingGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (thingGroupArn != null) __obj.updateDynamic("thingGroupArn")(thingGroupArn.asInstanceOf[js.Any])
    if (thingGroupId != null) __obj.updateDynamic("thingGroupId")(thingGroupId.asInstanceOf[js.Any])
    if (thingGroupName != null) __obj.updateDynamic("thingGroupName")(thingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateThingGroupResponse]
  }
}

