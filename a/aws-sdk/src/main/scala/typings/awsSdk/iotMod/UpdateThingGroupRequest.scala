package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateThingGroupRequest extends js.Object {
  /**
    * The expected version of the thing group. If this does not match the version of the thing group being updated, the update will fail.
    */
  var expectedVersion: js.UndefOr[OptionalVersion] = js.native
  /**
    * The thing group to update.
    */
  var thingGroupName: ThingGroupName = js.native
  /**
    * The thing group properties.
    */
  var thingGroupProperties: ThingGroupProperties = js.native
}

object UpdateThingGroupRequest {
  @scala.inline
  def apply(
    thingGroupName: ThingGroupName,
    thingGroupProperties: ThingGroupProperties,
    expectedVersion: js.UndefOr[OptionalVersion] = js.undefined
  ): UpdateThingGroupRequest = {
    val __obj = js.Dynamic.literal(thingGroupName = thingGroupName.asInstanceOf[js.Any], thingGroupProperties = thingGroupProperties.asInstanceOf[js.Any])
    if (!js.isUndefined(expectedVersion)) __obj.updateDynamic("expectedVersion")(expectedVersion.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateThingGroupRequest]
  }
}

