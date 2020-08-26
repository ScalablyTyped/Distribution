package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagResourceRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var ResourceArn: string = js.native
  var TagsModel: typings.awsSdk.pinpointMod.TagsModel = js.native
}

object TagResourceRequest {
  @scala.inline
  def apply(ResourceArn: string, TagsModel: TagsModel): TagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], TagsModel = TagsModel.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagResourceRequest]
  }
  @scala.inline
  implicit class TagResourceRequestOps[Self <: TagResourceRequest] (val x: Self) extends AnyVal {
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
    def setResourceArn(value: string): Self = this.set("ResourceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagsModel(value: TagsModel): Self = this.set("TagsModel", value.asInstanceOf[js.Any])
  }
  
}

