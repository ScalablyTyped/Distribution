package typings.awsSdk.transferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportSshPublicKeyRequest extends StObject {
  
  /**
    * A system-assigned unique identifier for a server.
    */
  var ServerId: typings.awsSdk.transferMod.ServerId = js.native
  
  /**
    * The public key portion of an SSH key pair.
    */
  var SshPublicKeyBody: typings.awsSdk.transferMod.SshPublicKeyBody = js.native
  
  /**
    * The name of the user account that is assigned to one or more servers.
    */
  var UserName: typings.awsSdk.transferMod.UserName = js.native
}
object ImportSshPublicKeyRequest {
  
  @scala.inline
  def apply(ServerId: ServerId, SshPublicKeyBody: SshPublicKeyBody, UserName: UserName): ImportSshPublicKeyRequest = {
    val __obj = js.Dynamic.literal(ServerId = ServerId.asInstanceOf[js.Any], SshPublicKeyBody = SshPublicKeyBody.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportSshPublicKeyRequest]
  }
  
  @scala.inline
  implicit class ImportSshPublicKeyRequestMutableBuilder[Self <: ImportSshPublicKeyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServerId(value: ServerId): Self = StObject.set(x, "ServerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSshPublicKeyBody(value: SshPublicKeyBody): Self = StObject.set(x, "SshPublicKeyBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserName(value: UserName): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
  }
}
