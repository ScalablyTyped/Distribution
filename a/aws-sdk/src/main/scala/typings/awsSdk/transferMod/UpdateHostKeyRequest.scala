package typings.awsSdk.transferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateHostKeyRequest extends StObject {
  
  /**
    * Provide an updated description for the host key.
    */
  var Description: HostKeyDescription
  
  /**
    * Provide the ID of the host key that you are updating.
    */
  var HostKeyId: typings.awsSdk.transferMod.HostKeyId
  
  /**
    * Provide the ID of the server that contains the host key that you are updating.
    */
  var ServerId: typings.awsSdk.transferMod.ServerId
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
