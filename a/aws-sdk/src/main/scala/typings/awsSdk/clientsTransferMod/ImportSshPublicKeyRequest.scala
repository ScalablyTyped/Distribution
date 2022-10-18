package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportSshPublicKeyRequest extends StObject {
  
  /**
    * A system-assigned unique identifier for a server.
    */
  var ServerId: typings.awsSdk.clientsTransferMod.ServerId
  
  /**
    * The public key portion of an SSH key pair. Transfer Family accepts RSA, ECDSA, and ED25519 keys.
    */
  var SshPublicKeyBody: typings.awsSdk.clientsTransferMod.SshPublicKeyBody
  
  /**
    * The name of the user account that is assigned to one or more servers.
    */
  var UserName: typings.awsSdk.clientsTransferMod.UserName
}
object ImportSshPublicKeyRequest {
  
  inline def apply(ServerId: ServerId, SshPublicKeyBody: SshPublicKeyBody, UserName: UserName): ImportSshPublicKeyRequest = {
    val __obj = js.Dynamic.literal(ServerId = ServerId.asInstanceOf[js.Any], SshPublicKeyBody = SshPublicKeyBody.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportSshPublicKeyRequest]
  }
  
  extension [Self <: ImportSshPublicKeyRequest](x: Self) {
    
    inline def setServerId(value: ServerId): Self = StObject.set(x, "ServerId", value.asInstanceOf[js.Any])
    
    inline def setSshPublicKeyBody(value: SshPublicKeyBody): Self = StObject.set(x, "SshPublicKeyBody", value.asInstanceOf[js.Any])
    
    inline def setUserName(value: UserName): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
  }
}
