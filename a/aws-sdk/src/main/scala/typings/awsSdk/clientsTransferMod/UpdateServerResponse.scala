package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateServerResponse extends StObject {
  
  /**
    * A system-assigned unique identifier for a server that the user account is assigned to.
    */
  var ServerId: typings.awsSdk.clientsTransferMod.ServerId
}
object UpdateServerResponse {
  
  inline def apply(ServerId: ServerId): UpdateServerResponse = {
    val __obj = js.Dynamic.literal(ServerId = ServerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateServerResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateServerResponse] (val x: Self) extends AnyVal {
    
    inline def setServerId(value: ServerId): Self = StObject.set(x, "ServerId", value.asInstanceOf[js.Any])
  }
}
