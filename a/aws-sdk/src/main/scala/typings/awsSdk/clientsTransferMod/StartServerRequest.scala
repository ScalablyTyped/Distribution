package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartServerRequest extends StObject {
  
  /**
    * A system-assigned unique identifier for a server that you start.
    */
  var ServerId: typings.awsSdk.clientsTransferMod.ServerId
}
object StartServerRequest {
  
  inline def apply(ServerId: ServerId): StartServerRequest = {
    val __obj = js.Dynamic.literal(ServerId = ServerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartServerRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartServerRequest] (val x: Self) extends AnyVal {
    
    inline def setServerId(value: ServerId): Self = StObject.set(x, "ServerId", value.asInstanceOf[js.Any])
  }
}
