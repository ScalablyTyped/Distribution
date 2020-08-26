package typings.awsSdk.ec2instanceconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendSSHPublicKeyResponse extends js.Object {
  /**
    * The request ID as logged by EC2 Connect. Please provide this when contacting AWS Support.
    */
  var RequestId: js.UndefOr[typings.awsSdk.ec2instanceconnectMod.RequestId] = js.native
  /**
    * Indicates request success.
    */
  var Success: js.UndefOr[typings.awsSdk.ec2instanceconnectMod.Success] = js.native
}

object SendSSHPublicKeyResponse {
  @scala.inline
  def apply(): SendSSHPublicKeyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendSSHPublicKeyResponse]
  }
  @scala.inline
  implicit class SendSSHPublicKeyResponseOps[Self <: SendSSHPublicKeyResponse] (val x: Self) extends AnyVal {
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
    def setRequestId(value: RequestId): Self = this.set("RequestId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestId: Self = this.set("RequestId", js.undefined)
    @scala.inline
    def setSuccess(value: Success): Self = this.set("Success", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuccess: Self = this.set("Success", js.undefined)
  }
  
}

