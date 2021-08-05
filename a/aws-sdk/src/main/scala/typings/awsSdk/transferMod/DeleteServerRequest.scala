package typings.awsSdk.transferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteServerRequest extends StObject {
  
  /**
    * A unique system-assigned identifier for a server instance.
    */
  var ServerId: typings.awsSdk.transferMod.ServerId
}
object DeleteServerRequest {
  
  inline def apply(ServerId: ServerId): DeleteServerRequest = {
    val __obj = js.Dynamic.literal(ServerId = ServerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteServerRequest]
  }
  
  extension [Self <: DeleteServerRequest](x: Self) {
    
    inline def setServerId(value: ServerId): Self = StObject.set(x, "ServerId", value.asInstanceOf[js.Any])
  }
}
