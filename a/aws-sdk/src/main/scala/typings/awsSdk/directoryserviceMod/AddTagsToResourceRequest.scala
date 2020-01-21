package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddTagsToResourceRequest extends js.Object {
  /**
    * Identifier (ID) for the directory to which to add the tag.
    */
  var ResourceId: typings.awsSdk.directoryserviceMod.ResourceId = js.native
  /**
    * The tags to be assigned to the directory.
    */
  var Tags: typings.awsSdk.directoryserviceMod.Tags = js.native
}

object AddTagsToResourceRequest {
  @scala.inline
  def apply(ResourceId: ResourceId, Tags: Tags): AddTagsToResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AddTagsToResourceRequest]
  }
}

