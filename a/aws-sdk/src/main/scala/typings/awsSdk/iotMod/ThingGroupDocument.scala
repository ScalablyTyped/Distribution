package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThingGroupDocument extends js.Object {
  /**
    * The thing group attributes.
    */
  var attributes: js.UndefOr[Attributes] = js.native
  /**
    * Parent group names.
    */
  var parentGroupNames: js.UndefOr[ThingGroupNameList] = js.native
  /**
    * The thing group description.
    */
  var thingGroupDescription: js.UndefOr[ThingGroupDescription] = js.native
  /**
    * The thing group ID.
    */
  var thingGroupId: js.UndefOr[ThingGroupId] = js.native
  /**
    * The thing group name.
    */
  var thingGroupName: js.UndefOr[ThingGroupName] = js.native
}

object ThingGroupDocument {
  @scala.inline
  def apply(
    attributes: Attributes = null,
    parentGroupNames: ThingGroupNameList = null,
    thingGroupDescription: ThingGroupDescription = null,
    thingGroupId: ThingGroupId = null,
    thingGroupName: ThingGroupName = null
  ): ThingGroupDocument = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (parentGroupNames != null) __obj.updateDynamic("parentGroupNames")(parentGroupNames.asInstanceOf[js.Any])
    if (thingGroupDescription != null) __obj.updateDynamic("thingGroupDescription")(thingGroupDescription.asInstanceOf[js.Any])
    if (thingGroupId != null) __obj.updateDynamic("thingGroupId")(thingGroupId.asInstanceOf[js.Any])
    if (thingGroupName != null) __obj.updateDynamic("thingGroupName")(thingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThingGroupDocument]
  }
}

