package typings.chrome.chrome.cast.media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopRequest extends StObject {
  
  var customData: js.Object
}
object StopRequest {
  
  inline def apply(customData: js.Object): StopRequest = {
    val __obj = js.Dynamic.literal(customData = customData.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopRequest]
  }
  
  extension [Self <: StopRequest](x: Self) {
    
    inline def setCustomData(value: js.Object): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
  }
}
