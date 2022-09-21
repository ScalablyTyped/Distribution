package typings.chromeRemoteInterface.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VersionResult extends StObject {
  
  var Browser: String
  
  var `Protocol-Version`: String
  
  var `User-Agent`: String
  
  var `V8-Version`: String
  
  var `Webkit-Version`: String
  
  var webSocketDebuggerUrl: String
}
object VersionResult {
  
  inline def apply(
    Browser: String,
    `Protocol-Version`: String,
    `User-Agent`: String,
    `V8-Version`: String,
    `Webkit-Version`: String,
    webSocketDebuggerUrl: String
  ): VersionResult = {
    val __obj = js.Dynamic.literal(Browser = Browser.asInstanceOf[js.Any], webSocketDebuggerUrl = webSocketDebuggerUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("Protocol-Version")(`Protocol-Version`.asInstanceOf[js.Any])
    __obj.updateDynamic("User-Agent")(`User-Agent`.asInstanceOf[js.Any])
    __obj.updateDynamic("V8-Version")(`V8-Version`.asInstanceOf[js.Any])
    __obj.updateDynamic("Webkit-Version")(`Webkit-Version`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VersionResult]
  }
  
  extension [Self <: VersionResult](x: Self) {
    
    inline def setBrowser(value: String): Self = StObject.set(x, "Browser", value.asInstanceOf[js.Any])
    
    inline def `setProtocol-Version`(value: String): Self = StObject.set(x, "Protocol-Version", value.asInstanceOf[js.Any])
    
    inline def `setUser-Agent`(value: String): Self = StObject.set(x, "User-Agent", value.asInstanceOf[js.Any])
    
    inline def `setV8-Version`(value: String): Self = StObject.set(x, "V8-Version", value.asInstanceOf[js.Any])
    
    inline def setWebSocketDebuggerUrl(value: String): Self = StObject.set(x, "webSocketDebuggerUrl", value.asInstanceOf[js.Any])
    
    inline def `setWebkit-Version`(value: String): Self = StObject.set(x, "Webkit-Version", value.asInstanceOf[js.Any])
  }
}
