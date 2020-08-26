package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTagsRequest extends js.Object {
  /**
    * The identifier of the WorkSpaces resource. The supported resource types are WorkSpaces, registered directories, images, custom bundles, and IP access control groups.
    */
  var ResourceId: NonEmptyString = js.native
  /**
    * The tag keys.
    */
  var TagKeys: TagKeyList = js.native
}

object DeleteTagsRequest {
  @scala.inline
  def apply(ResourceId: NonEmptyString, TagKeys: TagKeyList): DeleteTagsRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTagsRequest]
  }
  @scala.inline
  implicit class DeleteTagsRequestOps[Self <: DeleteTagsRequest] (val x: Self) extends AnyVal {
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
    def setTagKeysVarargs(value: NonEmptyString*): Self = this.set("TagKeys", js.Array(value :_*))
    @scala.inline
    def setTagKeys(value: TagKeyList): Self = this.set("TagKeys", value.asInstanceOf[js.Any])
  }
  
}

