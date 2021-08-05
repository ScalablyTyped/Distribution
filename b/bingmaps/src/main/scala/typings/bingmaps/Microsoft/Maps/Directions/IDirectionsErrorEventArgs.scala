package typings.bingmaps.Microsoft.Maps.Directions

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDirectionsErrorEventArgs extends StObject {
  
  /** The error message. */
  var message: String
  
  /** The code which identifies the error that occurred. */
  var responseCode: RouteResponseCode
}
object IDirectionsErrorEventArgs {
  
  inline def apply(message: String, responseCode: RouteResponseCode): IDirectionsErrorEventArgs = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], responseCode = responseCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDirectionsErrorEventArgs]
  }
  
  extension [Self <: IDirectionsErrorEventArgs](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setResponseCode(value: RouteResponseCode): Self = StObject.set(x, "responseCode", value.asInstanceOf[js.Any])
  }
}
