package typings.chrome.chrome.cast

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionRequest extends StObject {
  
  var appId: String
  
  var capabilities: js.Array[Capability]
  
  var language: String | Null
  
  var requestSessionTimeout: Double
}
object SessionRequest {
  
  inline def apply(appId: String, capabilities: js.Array[Capability], requestSessionTimeout: Double): SessionRequest = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], capabilities = capabilities.asInstanceOf[js.Any], requestSessionTimeout = requestSessionTimeout.asInstanceOf[js.Any], language = null)
    __obj.asInstanceOf[SessionRequest]
  }
  
  extension [Self <: SessionRequest](x: Self) {
    
    inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setCapabilities(value: js.Array[Capability]): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    inline def setCapabilitiesVarargs(value: Capability*): Self = StObject.set(x, "capabilities", js.Array(value :_*))
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageNull: Self = StObject.set(x, "language", null)
    
    inline def setRequestSessionTimeout(value: Double): Self = StObject.set(x, "requestSessionTimeout", value.asInstanceOf[js.Any])
  }
}
