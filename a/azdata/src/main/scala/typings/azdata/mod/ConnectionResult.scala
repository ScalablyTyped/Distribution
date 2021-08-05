package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionResult extends StObject {
  
  var connected: Boolean
  
  var connectionId: String
  
  var errorCode: Double
  
  var errorMessage: String
}
object ConnectionResult {
  
  inline def apply(connected: Boolean, connectionId: String, errorCode: Double, errorMessage: String): ConnectionResult = {
    val __obj = js.Dynamic.literal(connected = connected.asInstanceOf[js.Any], connectionId = connectionId.asInstanceOf[js.Any], errorCode = errorCode.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionResult]
  }
  
  extension [Self <: ConnectionResult](x: Self) {
    
    inline def setConnected(value: Boolean): Self = StObject.set(x, "connected", value.asInstanceOf[js.Any])
    
    inline def setConnectionId(value: String): Self = StObject.set(x, "connectionId", value.asInstanceOf[js.Any])
    
    inline def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
  }
}
