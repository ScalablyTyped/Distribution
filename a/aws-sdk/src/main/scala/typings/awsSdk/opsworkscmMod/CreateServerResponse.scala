package typings.awsSdk.opsworkscmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateServerResponse extends StObject {
  
  /**
    * The server that is created by the request. 
    */
  var Server: js.UndefOr[typings.awsSdk.opsworkscmMod.Server] = js.undefined
}
object CreateServerResponse {
  
  inline def apply(): CreateServerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateServerResponse]
  }
  
  extension [Self <: CreateServerResponse](x: Self) {
    
    inline def setServer(value: Server): Self = StObject.set(x, "Server", value.asInstanceOf[js.Any])
    
    inline def setServerUndefined: Self = StObject.set(x, "Server", js.undefined)
  }
}
