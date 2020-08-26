package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteResourcePolicyRequest extends js.Object {
  /**
    * The hash value returned when this policy was set.
    */
  var PolicyHashCondition: js.UndefOr[HashString] = js.native
  /**
    * The ARN of the AWS Glue resource for the resource policy to be deleted.
    */
  var ResourceArn: js.UndefOr[GlueResourceArn] = js.native
}

object DeleteResourcePolicyRequest {
  @scala.inline
  def apply(): DeleteResourcePolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteResourcePolicyRequest]
  }
  @scala.inline
  implicit class DeleteResourcePolicyRequestOps[Self <: DeleteResourcePolicyRequest] (val x: Self) extends AnyVal {
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
    def setPolicyHashCondition(value: HashString): Self = this.set("PolicyHashCondition", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicyHashCondition: Self = this.set("PolicyHashCondition", js.undefined)
    @scala.inline
    def setResourceArn(value: GlueResourceArn): Self = this.set("ResourceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceArn: Self = this.set("ResourceArn", js.undefined)
  }
  
}

