package typings.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTagsInput extends js.Object {
  /**
    * The ID of the ML object. For example, exampleModelId. 
    */
  var ResourceId: EntityId = js.native
  /**
    * The type of the ML object.
    */
  var ResourceType: TaggableResourceType = js.native
}

object DescribeTagsInput {
  @scala.inline
  def apply(ResourceId: EntityId, ResourceType: TaggableResourceType): DescribeTagsInput = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeTagsInput]
  }
}

