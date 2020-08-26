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
  @scala.inline
  implicit class AddTagsToResourceRequestOps[Self <: AddTagsToResourceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setResourceId(value: ResourceId): Self = this.set("ResourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: Tags): Self = this.set("Tags", value.asInstanceOf[js.Any])
  }
  
}

