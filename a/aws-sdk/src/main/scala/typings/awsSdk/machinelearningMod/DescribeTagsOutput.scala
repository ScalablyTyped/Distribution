package typings.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTagsOutput extends js.Object {
  /**
    * The ID of the tagged ML object.
    */
  var ResourceId: js.UndefOr[EntityId] = js.native
  /**
    * The type of the tagged ML object.
    */
  var ResourceType: js.UndefOr[TaggableResourceType] = js.native
  /**
    * A list of tags associated with the ML object.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object DescribeTagsOutput {
  @scala.inline
  def apply(ResourceId: EntityId = null, ResourceType: TaggableResourceType = null, Tags: TagList = null): DescribeTagsOutput = {
    val __obj = js.Dynamic.literal()
    if (ResourceId != null) __obj.updateDynamic("ResourceId")(ResourceId.asInstanceOf[js.Any])
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTagsOutput]
  }
}

