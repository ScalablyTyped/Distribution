package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateHostKeyRequest extends StObject {
  
  /**
    * An updated description for the host key.
    */
  var Description: HostKeyDescription
  
  /**
    * The identifier of the host key that you are updating.
    */
  var HostKeyId: typings.awsSdk.clientsTransferMod.HostKeyId
  
  /**
    * The identifier of the server that contains the host key that you are updating.
    */
  var ServerId: typings.awsSdk.clientsTransferMod.ServerId
}
object UpdateHostKeyRequest {
  
  inline def apply(Description: HostKeyDescription, HostKeyId: HostKeyId, ServerId: ServerId): UpdateHostKeyRequest = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], HostKeyId = HostKeyId.asInstanceOf[js.Any], ServerId = ServerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateHostKeyRequest]
  }
  
  extension [Self <: UpdateHostKeyRequest](x: Self) {
    
    inline def setDescription(value: HostKeyDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setHostKeyId(value: HostKeyId): Self = StObject.set(x, "HostKeyId", value.asInstanceOf[js.Any])
    
    inline def setServerId(value: ServerId): Self = StObject.set(x, "ServerId", value.asInstanceOf[js.Any])
  }
}
