package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteHostKeyRequest extends StObject {
  
  /**
    * The identifier of the host key that you are deleting.
    */
  var HostKeyId: typings.awsSdk.clientsTransferMod.HostKeyId
  
  /**
    * The identifier of the server that contains the host key that you are deleting.
    */
  var ServerId: typings.awsSdk.clientsTransferMod.ServerId
}
object DeleteHostKeyRequest {
  
  inline def apply(HostKeyId: HostKeyId, ServerId: ServerId): DeleteHostKeyRequest = {
    val __obj = js.Dynamic.literal(HostKeyId = HostKeyId.asInstanceOf[js.Any], ServerId = ServerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteHostKeyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteHostKeyRequest] (val x: Self) extends AnyVal {
    
    inline def setHostKeyId(value: HostKeyId): Self = StObject.set(x, "HostKeyId", value.asInstanceOf[js.Any])
    
    inline def setServerId(value: ServerId): Self = StObject.set(x, "ServerId", value.asInstanceOf[js.Any])
  }
}
