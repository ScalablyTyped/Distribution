package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportSshPublicKeyResponse extends StObject {
  
  /**
    * A system-assigned unique identifier for a server.
    */
  var ServerId: typings.awsSdk.clientsTransferMod.ServerId
  
  /**
    * The name given to a public key by the system that was imported.
    */
  var SshPublicKeyId: typings.awsSdk.clientsTransferMod.SshPublicKeyId
  
  /**
    * A user name assigned to the ServerID value that you specified.
    */
  var UserName: typings.awsSdk.clientsTransferMod.UserName
}
object ImportSshPublicKeyResponse {
  
  inline def apply(ServerId: ServerId, SshPublicKeyId: SshPublicKeyId, UserName: UserName): ImportSshPublicKeyResponse = {
    val __obj = js.Dynamic.literal(ServerId = ServerId.asInstanceOf[js.Any], SshPublicKeyId = SshPublicKeyId.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportSshPublicKeyResponse]
  }
  
  extension [Self <: ImportSshPublicKeyResponse](x: Self) {
    
    inline def setServerId(value: ServerId): Self = StObject.set(x, "ServerId", value.asInstanceOf[js.Any])
    
    inline def setSshPublicKeyId(value: SshPublicKeyId): Self = StObject.set(x, "SshPublicKeyId", value.asInstanceOf[js.Any])
    
    inline def setUserName(value: UserName): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
  }
}
