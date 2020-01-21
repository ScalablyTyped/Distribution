package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateThingGroupRequest extends js.Object {
  /**
    * The name of the parent thing group.
    */
  var parentGroupName: js.UndefOr[ThingGroupName] = js.native
  /**
    * Metadata which can be used to manage the thing group.
    */
  var tags: js.UndefOr[TagList] = js.native
  /**
    * The thing group name to create.
    */
  var thingGroupName: ThingGroupName = js.native
  /**
    * The thing group properties.
    */
  var thingGroupProperties: js.UndefOr[ThingGroupProperties] = js.native
}

object CreateThingGroupRequest {
  @scala.inline
  def apply(
    thingGroupName: ThingGroupName,
    parentGroupName: ThingGroupName = null,
    tags: TagList = null,
    thingGroupProperties: ThingGroupProperties = null
  ): CreateThingGroupRequest = {
    val __obj = js.Dynamic.literal(thingGroupName = thingGroupName.asInstanceOf[js.Any])
    if (parentGroupName != null) __obj.updateDynamic("parentGroupName")(parentGroupName.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (thingGroupProperties != null) __obj.updateDynamic("thingGroupProperties")(thingGroupProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateThingGroupRequest]
  }
}

