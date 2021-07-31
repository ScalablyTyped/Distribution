package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectDominantLanguageRequest extends StObject {
  
  /**
    * A UTF-8 text string. Each string should contain at least 20 characters and must contain fewer that 5,000 bytes of UTF-8 encoded characters.
    */
  var Text: CustomerInputString
}
object DetectDominantLanguageRequest {
  
  @scala.inline
  def apply(Text: CustomerInputString): DetectDominantLanguageRequest = {
    val __obj = js.Dynamic.literal(Text = Text.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectDominantLanguageRequest]
  }
  
  @scala.inline
  implicit class DetectDominantLanguageRequestMutableBuilder[Self <: DetectDominantLanguageRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setText(value: CustomerInputString): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
  }
}
