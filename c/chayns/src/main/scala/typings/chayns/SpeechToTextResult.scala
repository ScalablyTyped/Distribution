package typings.chayns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// chayns.setSpeecToText()
@js.native
trait SpeechToTextResult extends StObject {
  
  var languageCode: String = js.native
  
  var text: js.Array[String] = js.native
}
object SpeechToTextResult {
  
  @scala.inline
  def apply(languageCode: String, text: js.Array[String]): SpeechToTextResult = {
    val __obj = js.Dynamic.literal(languageCode = languageCode.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechToTextResult]
  }
  
  @scala.inline
  implicit class SpeechToTextResultMutableBuilder[Self <: SpeechToTextResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: js.Array[String]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextVarargs(value: String*): Self = StObject.set(x, "text", js.Array(value :_*))
  }
}
