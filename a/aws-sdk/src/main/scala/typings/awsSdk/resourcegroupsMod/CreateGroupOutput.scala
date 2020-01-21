package typings.awsSdk.resourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateGroupOutput extends js.Object {
  /**
    * A full description of the resource group after it is created.
    */
  var Group: js.UndefOr[typings.awsSdk.resourcegroupsMod.Group] = js.native
  /**
    * The resource query associated with the group.
    */
  var ResourceQuery: js.UndefOr[typings.awsSdk.resourcegroupsMod.ResourceQuery] = js.native
  /**
    * The tags associated with the group.
    */
  var Tags: js.UndefOr[typings.awsSdk.resourcegroupsMod.Tags] = js.native
}

object CreateGroupOutput {
  @scala.inline
  def apply(Group: Group = null, ResourceQuery: ResourceQuery = null, Tags: Tags = null): CreateGroupOutput = {
    val __obj = js.Dynamic.literal()
    if (Group != null) __obj.updateDynamic("Group")(Group.asInstanceOf[js.Any])
    if (ResourceQuery != null) __obj.updateDynamic("ResourceQuery")(ResourceQuery.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGroupOutput]
  }
}

