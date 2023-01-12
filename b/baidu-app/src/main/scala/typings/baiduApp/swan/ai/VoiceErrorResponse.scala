package typings.baiduApp.swan.ai

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VoiceErrorResponse extends StObject {
  
  var result: String
}
object VoiceErrorResponse {
  
  inline def apply(result: String): VoiceErrorResponse = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoiceErrorResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VoiceErrorResponse] (val x: Self) extends AnyVal {
    
    inline def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
