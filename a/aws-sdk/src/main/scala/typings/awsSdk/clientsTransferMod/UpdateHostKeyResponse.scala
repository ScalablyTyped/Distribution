package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateHostKeyResponse extends StObject {
  
  /**
    * Returns the host key identifier for the updated host key.
    */
  var HostKeyId: typings.awsSdk.clientsTransferMod.HostKeyId
  
  /**
    * Returns the server identifier for the server that contains the updated host key.
    */
  var ServerId: typings.awsSdk.clientsTransferMod.ServerId
}
object UpdateHostKeyResponse {
  
  inline def apply(HostKeyId: HostKeyId, ServerId: ServerId): UpdateHostKeyResponse = {
    val __obj = js.Dynamic.literal(HostKeyId = HostKeyId.asInstanceOf[js.Any], ServerId = ServerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateHostKeyResponse]
  }
  
  extension [Self <: UpdateHostKeyResponse](x: Self) {
    
    inline def setHostKeyId(value: HostKeyId): Self = StObject.set(x, "HostKeyId", value.asInstanceOf[js.Any])
    
    inline def setServerId(value: ServerId): Self = StObject.set(x, "ServerId", value.asInstanceOf[js.Any])
  }
}
