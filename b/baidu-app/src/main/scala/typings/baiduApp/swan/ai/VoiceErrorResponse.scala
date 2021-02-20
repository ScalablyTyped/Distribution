package typings.baiduApp.swan.ai

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VoiceErrorResponse extends StObject {
  
  var result: String = js.native
}
object VoiceErrorResponse {
  
  @scala.inline
  def apply(result: String): VoiceErrorResponse = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoiceErrorResponse]
  }
  
  @scala.inline
  implicit class VoiceErrorResponseMutableBuilder[Self <: VoiceErrorResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
