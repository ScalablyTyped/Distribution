package typings.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UntagResourceRequest extends js.Object {
  /**
    * The keys in the key-value pair in the tag to remove.
    */
  var Keys: TagKeyList = js.native
  /**
    * The Amazon Resource Name (ARN) of the resource to remove the tag from.
    */
  var ResourceArn: TaggableResourceArn = js.native
}

object UntagResourceRequest {
  @scala.inline
  def apply(Keys: TagKeyList, ResourceArn: TaggableResourceArn): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(Keys = Keys.asInstanceOf[js.Any], ResourceArn = ResourceArn.asInstanceOf[js.Any])
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
    def setKeysVarargs(value: TagKey*): Self = this.set("Keys", js.Array(value :_*))
    @scala.inline
    def setKeys(value: TagKeyList): Self = this.set("Keys", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceArn(value: TaggableResourceArn): Self = this.set("ResourceArn", value.asInstanceOf[js.Any])
  }
  
}

