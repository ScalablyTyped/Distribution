package typings.awsSdk.transferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopServerRequest extends StObject {
  
  /**
    * A system-assigned unique identifier for a server that you stopped.
    */
  var ServerId: typings.awsSdk.transferMod.ServerId
}
object StopServerRequest {
  
  inline def apply(ServerId: ServerId): StopServerRequest = {
    val __obj = js.Dynamic.literal(ServerId = ServerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopServerRequest]
  }
  
  extension [Self <: StopServerRequest](x: Self) {
    
    inline def setServerId(value: ServerId): Self = StObject.set(x, "ServerId", value.asInstanceOf[js.Any])
  }
}
