package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteServerRequest extends StObject {
  
  /**
    * A unique system-assigned identifier for a server instance.
    */
  var ServerId: typings.awsSdk.clientsTransferMod.ServerId
}
object DeleteServerRequest {
  
  inline def apply(ServerId: ServerId): DeleteServerRequest = {
    val __obj = js.Dynamic.literal(ServerId = ServerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteServerRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteServerRequest] (val x: Self) extends AnyVal {
    
    inline def setServerId(value: ServerId): Self = StObject.set(x, "ServerId", value.asInstanceOf[js.Any])
  }
}
