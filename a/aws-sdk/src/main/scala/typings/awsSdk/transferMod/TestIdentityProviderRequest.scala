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
  def apply(
    ServerId: ServerId,
    UserName: UserName,
    ServerProtocol: Protocol = null,
    UserPassword: UserPassword = null
  ): TestIdentityProviderRequest = {
    val __obj = js.Dynamic.literal(ServerId = ServerId.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    if (ServerProtocol != null) __obj.updateDynamic("ServerProtocol")(ServerProtocol.asInstanceOf[js.Any])
    if (UserPassword != null) __obj.updateDynamic("UserPassword")(UserPassword.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestIdentityProviderRequest]
  }
}

