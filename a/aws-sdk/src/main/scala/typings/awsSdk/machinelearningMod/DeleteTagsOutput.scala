package typings.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTagsOutput extends js.Object {
  /**
    * The ID of the ML object from which tags were deleted.
    */
  var ResourceId: js.UndefOr[EntityId] = js.native
  /**
    * The type of the ML object from which tags were deleted.
    */
  var ResourceType: js.UndefOr[TaggableResourceType] = js.native
}

object DeleteTagsOutput {
  @scala.inline
  def apply(ResourceId: EntityId = null, ResourceType: TaggableResourceType = null): DeleteTagsOutput = {
    val __obj = js.Dynamic.literal()
    if (ResourceId != null) __obj.updateDynamic("ResourceId")(ResourceId.asInstanceOf[js.Any])
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTagsOutput]
  }
}

