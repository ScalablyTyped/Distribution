package typings.awsSdk.dataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UntagResourceRequest extends js.Object {
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies an AWS resource.
    */
  var ResourceArn: string = js.native
  /**
    * The key tags.
    */
  var TagKeys: ListOfString = js.native
}

object UntagResourceRequest {
  @scala.inline
  def apply(ResourceArn: string, TagKeys: ListOfString): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
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
    def setResourceArn(value: string): Self = this.set("ResourceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagKeysVarargs(value: string*): Self = this.set("TagKeys", js.Array(value :_*))
    @scala.inline
    def setTagKeys(value: ListOfString): Self = this.set("TagKeys", value.asInstanceOf[js.Any])
  }
  
}

