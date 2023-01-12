package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopServerRequest extends StObject {
  
  /**
    * A system-assigned unique identifier for a server that you stopped.
    */
  var ServerId: typings.awsSdk.clientsTransferMod.ServerId
}
object StopServerRequest {
  
  inline def apply(ServerId: ServerId): StopServerRequest = {
    val __obj = js.Dynamic.literal(ServerId = ServerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopServerRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopServerRequest] (val x: Self) extends AnyVal {
    
    inline def setServerId(value: ServerId): Self = StObject.set(x, "ServerId", value.asInstanceOf[js.Any])
  }
}
