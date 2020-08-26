package typings.awsSdk.cloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddTagsToResourceRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the AWS CloudHSM resource to tag.
    */
  var ResourceArn: String = js.native
  /**
    * One or more tags.
    */
  var TagList: typings.awsSdk.cloudhsmMod.TagList = js.native
}

object AddTagsToResourceRequest {
  @scala.inline
  def apply(ResourceArn: String, TagList: TagList): AddTagsToResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], TagList = TagList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddTagsToResourceRequest]
  }
  @scala.inline
  implicit class AddTagsToResourceRequestOps[Self <: AddTagsToResourceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setResourceArn(value: String): Self = this.set("ResourceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagListVarargs(value: Tag*): Self = this.set("TagList", js.Array(value :_*))
    @scala.inline
    def setTagList(value: TagList): Self = this.set("TagList", value.asInstanceOf[js.Any])
  }
  
}

