package typings.chromeRemoteInterface.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Target extends StObject {
  
  var description: String
  
  var devtoolsFrontendUrl: String
  
  var id: String
  
  var title: String
  
  var `type`: String
  
  var url: String
  
  var webSocketDebuggerUrl: String
}
object Target {
  
  inline def apply(
    description: String,
    devtoolsFrontendUrl: String,
    id: String,
    title: String,
    `type`: String,
    url: String,
    webSocketDebuggerUrl: String
  ): Target = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], devtoolsFrontendUrl = devtoolsFrontendUrl.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], webSocketDebuggerUrl = webSocketDebuggerUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Target]
  }
  
  extension [Self <: Target](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDevtoolsFrontendUrl(value: String): Self = StObject.set(x, "devtoolsFrontendUrl", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setWebSocketDebuggerUrl(value: String): Self = StObject.set(x, "webSocketDebuggerUrl", value.asInstanceOf[js.Any])
  }
}
