package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportHostKeyResponse extends StObject {
  
  /**
    * Returns the host key identifier for the imported key.
    */
  var HostKeyId: typings.awsSdk.clientsTransferMod.HostKeyId
  
  /**
    * Returns the server identifier that contains the imported key.
    */
  var ServerId: typings.awsSdk.clientsTransferMod.ServerId
}
object ImportHostKeyResponse {
  
  inline def apply(HostKeyId: HostKeyId, ServerId: ServerId): ImportHostKeyResponse = {
    val __obj = js.Dynamic.literal(HostKeyId = HostKeyId.asInstanceOf[js.Any], ServerId = ServerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportHostKeyResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImportHostKeyResponse] (val x: Self) extends AnyVal {
    
    inline def setHostKeyId(value: HostKeyId): Self = StObject.set(x, "HostKeyId", value.asInstanceOf[js.Any])
    
    inline def setServerId(value: ServerId): Self = StObject.set(x, "ServerId", value.asInstanceOf[js.Any])
  }
}
