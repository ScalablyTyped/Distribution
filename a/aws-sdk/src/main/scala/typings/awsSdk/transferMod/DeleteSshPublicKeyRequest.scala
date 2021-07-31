package typings.awsSdk.transferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSshPublicKeyRequest extends StObject {
  
  /**
    * A system-assigned unique identifier for a file transfer protocol-enabled server instance that has the user assigned to it.
    */
  var ServerId: typings.awsSdk.transferMod.ServerId
  
  /**
    * A unique identifier used to reference your user's specific SSH key.
    */
  var SshPublicKeyId: typings.awsSdk.transferMod.SshPublicKeyId
  
  /**
    * A unique string that identifies a user whose public key is being deleted.
    */
  var UserName: typings.awsSdk.transferMod.UserName
}
object DeleteSshPublicKeyRequest {
  
  @scala.inline
  def apply(ServerId: ServerId, SshPublicKeyId: SshPublicKeyId, UserName: UserName): DeleteSshPublicKeyRequest = {
    val __obj = js.Dynamic.literal(ServerId = ServerId.asInstanceOf[js.Any], SshPublicKeyId = SshPublicKeyId.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSshPublicKeyRequest]
  }
  
  @scala.inline
  implicit class DeleteSshPublicKeyRequestMutableBuilder[Self <: DeleteSshPublicKeyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServerId(value: ServerId): Self = StObject.set(x, "ServerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSshPublicKeyId(value: SshPublicKeyId): Self = StObject.set(x, "SshPublicKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserName(value: UserName): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
  }
}
