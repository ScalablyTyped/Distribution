package typings.awsSdk.transferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestIdentityProviderRequest extends js.Object {
  /**
    * A system-assigned identifier for a specific file transfer protocol-enabled server. That server's user authentication method is tested with a user name and password.
    */
  var ServerId: typings.awsSdk.transferMod.ServerId = js.native
  /**
    * The type of file transfer protocol to be tested. The available protocols are:   Secure Shell (SSH) File Transfer Protocol (SFTP)   File Transfer Protocol Secure (FTPS)   File Transfer Protocol (FTP)  
    */
  var ServerProtocol: js.UndefOr[Protocol] = js.native
  /**
    * The source IP address of the user account to be tested.
    */
  var SourceIp: js.UndefOr[typings.awsSdk.transferMod.SourceIp] = js.native
  /**
    * The name of the user account to be tested.
    */
  var UserName: typings.awsSdk.transferMod.UserName = js.native
  /**
    * The password of the user account to be tested.
    */
  var UserPassword: js.UndefOr[typings.awsSdk.transferMod.UserPassword] = js.native
}

object TestIdentityProviderRequest {
  @scala.inline
  def apply(ServerId: ServerId, UserName: UserName): TestIdentityProviderRequest = {
    val __obj = js.Dynamic.literal(ServerId = ServerId.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestIdentityProviderRequest]
  }
  @scala.inline
  implicit class TestIdentityProviderRequestOps[Self <: TestIdentityProviderRequest] (val x: Self) extends AnyVal {
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
    def setServerId(value: ServerId): Self = this.set("ServerId", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserName(value: UserName): Self = this.set("UserName", value.asInstanceOf[js.Any])
    @scala.inline
    def setServerProtocol(value: Protocol): Self = this.set("ServerProtocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerProtocol: Self = this.set("ServerProtocol", js.undefined)
    @scala.inline
    def setSourceIp(value: SourceIp): Self = this.set("SourceIp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceIp: Self = this.set("SourceIp", js.undefined)
    @scala.inline
    def setUserPassword(value: UserPassword): Self = this.set("UserPassword", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserPassword: Self = this.set("UserPassword", js.undefined)
  }
  
}

