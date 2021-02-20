package typings.baiduApp.swan.ai

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VoiceRecognizeResponse extends StObject {
  
  var result: String = js.native
}
object VoiceRecognizeResponse {
  
  @scala.inline
  def apply(result: String): VoiceRecognizeResponse = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoiceRecognizeResponse]
  }
  
  @scala.inline
  implicit class VoiceRecognizeResponseMutableBuilder[Self <: VoiceRecognizeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
