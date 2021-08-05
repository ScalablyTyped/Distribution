package typings.awsSdk.transferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartServerRequest extends StObject {
  
  /**
    * A system-assigned unique identifier for a server that you start.
    */
  var ServerId: typings.awsSdk.transferMod.ServerId
}
object StartServerRequest {
  
  inline def apply(ServerId: ServerId): StartServerRequest = {
    val __obj = js.Dynamic.literal(ServerId = ServerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartServerRequest]
  }
  
  extension [Self <: StartServerRequest](x: Self) {
    
    inline def setServerId(value: ServerId): Self = StObject.set(x, "ServerId", value.asInstanceOf[js.Any])
  }
}
