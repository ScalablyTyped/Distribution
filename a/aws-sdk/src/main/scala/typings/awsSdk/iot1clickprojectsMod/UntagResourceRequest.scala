package typings.awsSdk.iot1clickprojectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UntagResourceRequest extends js.Object {
  /**
    * The ARN of the resource whose tag you want to remove.
    */
  var resourceArn: ProjectArn = js.native
  /**
    * The keys of those tags which you want to remove.
    */
  var tagKeys: TagKeyList = js.native
}

object UntagResourceRequest {
  @scala.inline
  def apply(resourceArn: ProjectArn, tagKeys: TagKeyList): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], tagKeys = tagKeys.asInstanceOf[js.Any])
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
    def setResourceArn(value: ProjectArn): Self = this.set("resourceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagKeysVarargs(value: TagKey*): Self = this.set("tagKeys", js.Array(value :_*))
    @scala.inline
    def setTagKeys(value: TagKeyList): Self = this.set("tagKeys", value.asInstanceOf[js.Any])
  }
  
}

