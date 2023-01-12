package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateServerResponse extends StObject {
  
  /**
    * The service-assigned identifier of the server that is created.
    */
  var ServerId: typings.awsSdk.clientsTransferMod.ServerId
}
object CreateServerResponse {
  
  inline def apply(ServerId: ServerId): CreateServerResponse = {
    val __obj = js.Dynamic.literal(ServerId = ServerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateServerResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateServerResponse] (val x: Self) extends AnyVal {
    
    inline def setServerId(value: ServerId): Self = StObject.set(x, "ServerId", value.asInstanceOf[js.Any])
  }
}
