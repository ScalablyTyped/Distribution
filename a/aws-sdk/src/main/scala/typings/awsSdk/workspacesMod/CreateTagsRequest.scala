package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTagsRequest extends js.Object {
  /**
    * The identifier of the WorkSpaces resource. The supported resource types are WorkSpaces, registered directories, images, custom bundles, and IP access control groups.
    */
  var ResourceId: NonEmptyString = js.native
  /**
    * The tags. Each WorkSpaces resource can have a maximum of 50 tags. If you want to add new tags to a set of existing tags, you must submit all of the existing tags along with the new ones.
    */
  var Tags: TagList = js.native
}

object CreateTagsRequest {
  @scala.inline
  def apply(ResourceId: NonEmptyString, Tags: TagList): CreateTagsRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTagsRequest]
  }
  @scala.inline
  implicit class CreateTagsRequestOps[Self <: CreateTagsRequest] (val x: Self) extends AnyVal {
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
    def setResourceId(value: NonEmptyString): Self = this.set("ResourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
  }
  
}

