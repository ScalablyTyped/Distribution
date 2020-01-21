package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDynamicThingGroupRequest extends js.Object {
  /**
    * The expected version of the dynamic thing group to delete.
    */
  var expectedVersion: js.UndefOr[OptionalVersion] = js.native
  /**
    * The name of the dynamic thing group to delete.
    */
  var thingGroupName: ThingGroupName = js.native
}

object DeleteDynamicThingGroupRequest {
  @scala.inline
  def apply(thingGroupName: ThingGroupName, expectedVersion: Int | Double = null): DeleteDynamicThingGroupRequest = {
    val __obj = js.Dynamic.literal(thingGroupName = thingGroupName.asInstanceOf[js.Any])
    if (expectedVersion != null) __obj.updateDynamic("expectedVersion")(expectedVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDynamicThingGroupRequest]
  }
}

