package typings.ckeditorCkeditor5Engine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextData extends StObject {
  
  var _textData: js.UndefOr[String] = js.undefined
  
  var document: String
}
object TextData {
  
  inline def apply(document: String): TextData = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextData]
  }
  
  extension [Self <: TextData](x: Self) {
    
    inline def setDocument(value: String): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def set_textData(value: String): Self = StObject.set(x, "_textData", value.asInstanceOf[js.Any])
    
    inline def set_textDataUndefined: Self = StObject.set(x, "_textData", js.undefined)
  }
}
