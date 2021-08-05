package typings.baiduApp.swan.ai

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VoiceRecognizeResponse extends StObject {
  
  var result: String
}
object VoiceRecognizeResponse {
  
  inline def apply(result: String): VoiceRecognizeResponse = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoiceRecognizeResponse]
  }
  
  extension [Self <: VoiceRecognizeResponse](x: Self) {
    
    inline def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
