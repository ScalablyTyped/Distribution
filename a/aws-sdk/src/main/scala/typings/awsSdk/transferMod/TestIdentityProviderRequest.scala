package typings.awsSdk.transferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestIdentityProviderRequest extends StObject {
  
  /**
    * A system-assigned identifier for a specific server. That server's user authentication method is tested with a user name and password.
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
  implicit class TestIdentityProviderRequestMutableBuilder[Self <: TestIdentityProviderRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServerId(value: ServerId): Self = StObject.set(x, "ServerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerProtocol(value: Protocol): Self = StObject.set(x, "ServerProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerProtocolUndefined: Self = StObject.set(x, "ServerProtocol", js.undefined)
    
    @scala.inline
    def setSourceIp(value: SourceIp): Self = StObject.set(x, "SourceIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceIpUndefined: Self = StObject.set(x, "SourceIp", js.undefined)
    
    @scala.inline
    def setUserName(value: UserName): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPassword(value: UserPassword): Self = StObject.set(x, "UserPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPasswordUndefined: Self = StObject.set(x, "UserPassword", js.undefined)
  }
}
