package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetSMBGuestPasswordInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the file gateway the SMB file share is associated with.
    */
  var GatewayARN: typings.awsSdk.storagegatewayMod.GatewayARN = js.native
  /**
    * The password that you want to set for your SMB server.
    */
  var Password: SMBGuestPassword = js.native
}

object SetSMBGuestPasswordInput {
  @scala.inline
  def apply(GatewayARN: GatewayARN, Password: SMBGuestPassword): SetSMBGuestPasswordInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetSMBGuestPasswordInput]
  }
  @scala.inline
  implicit class SetSMBGuestPasswordInputOps[Self <: SetSMBGuestPasswordInput] (val x: Self) extends AnyVal {
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
    def setGatewayARN(value: GatewayARN): Self = this.set("GatewayARN", value.asInstanceOf[js.Any])
    @scala.inline
    def setPassword(value: SMBGuestPassword): Self = this.set("Password", value.asInstanceOf[js.Any])
  }
  
}

