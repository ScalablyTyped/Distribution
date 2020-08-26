package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagResourceRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the user pool to assign the tags to.
    */
  var ResourceArn: ArnType = js.native
  /**
    * The tags to assign to the user pool.
    */
  var Tags: UserPoolTagsType = js.native
}

object TagResourceRequest {
  @scala.inline
  def apply(ResourceArn: ArnType, Tags: UserPoolTagsType): TagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
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
    def setResourceArn(value: ArnType): Self = this.set("ResourceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setTags(value: UserPoolTagsType): Self = this.set("Tags", value.asInstanceOf[js.Any])
  }
  
}

