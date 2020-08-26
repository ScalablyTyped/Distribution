package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UntagResourceRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource from which to remove the tags.
    */
  var ResourceArn: GlueResourceArn = js.native
  /**
    * Tags to remove from this resource.
    */
  var TagsToRemove: TagKeysList = js.native
}

object UntagResourceRequest {
  @scala.inline
  def apply(ResourceArn: GlueResourceArn, TagsToRemove: TagKeysList): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], TagsToRemove = TagsToRemove.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagResourceRequest]
  }
  @scala.inline
  implicit class UntagResourceRequestOps[Self <: UntagResourceRequest] (val x: Self) extends AnyVal {
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
    def setResourceArn(value: GlueResourceArn): Self = this.set("ResourceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagsToRemoveVarargs(value: TagKey*): Self = this.set("TagsToRemove", js.Array(value :_*))
    @scala.inline
    def setTagsToRemove(value: TagKeysList): Self = this.set("TagsToRemove", value.asInstanceOf[js.Any])
  }
  
}

