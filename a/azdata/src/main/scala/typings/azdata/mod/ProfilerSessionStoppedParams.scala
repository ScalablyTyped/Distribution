package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProfilerSessionStoppedParams extends StObject {
  
  var ownerUri: String
  
  var sessionId: Double
}
object ProfilerSessionStoppedParams {
  
  inline def apply(ownerUri: String, sessionId: Double): ProfilerSessionStoppedParams = {
    val __obj = js.Dynamic.literal(ownerUri = ownerUri.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfilerSessionStoppedParams]
  }
  
  extension [Self <: ProfilerSessionStoppedParams](x: Self) {
    
    inline def setOwnerUri(value: String): Self = StObject.set(x, "ownerUri", value.asInstanceOf[js.Any])
    
    inline def setSessionId(value: Double): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
  }
}
