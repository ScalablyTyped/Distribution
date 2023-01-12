package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSshPublicKeyRequest extends StObject {
  
  /**
    * A system-assigned unique identifier for a file transfer protocol-enabled server instance that has the user assigned to it.
    */
  var ServerId: typings.awsSdk.clientsTransferMod.ServerId
  
  /**
    * A unique identifier used to reference your user's specific SSH key.
    */
  var SshPublicKeyId: typings.awsSdk.clientsTransferMod.SshPublicKeyId
  
  /**
    * A unique string that identifies a user whose public key is being deleted.
    */
  var UserName: typings.awsSdk.clientsTransferMod.UserName
}
object DeleteSshPublicKeyRequest {
  
  inline def apply(ServerId: ServerId, SshPublicKeyId: SshPublicKeyId, UserName: UserName): DeleteSshPublicKeyRequest = {
    val __obj = js.Dynamic.literal(ServerId = ServerId.asInstanceOf[js.Any], SshPublicKeyId = SshPublicKeyId.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSshPublicKeyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteSshPublicKeyRequest] (val x: Self) extends AnyVal {
    
    inline def setServerId(value: ServerId): Self = StObject.set(x, "ServerId", value.asInstanceOf[js.Any])
    
    inline def setSshPublicKeyId(value: SshPublicKeyId): Self = StObject.set(x, "SshPublicKeyId", value.asInstanceOf[js.Any])
    
    inline def setUserName(value: UserName): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
  }
}
