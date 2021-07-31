package typings.carbonType.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LetterSpacing extends StObject {
  
  var fontSize: String
  
  var letterSpacing: String
  
  var lineHeight: String
}
object LetterSpacing {
  
  @scala.inline
  def apply(fontSize: String, letterSpacing: String, lineHeight: String): LetterSpacing = {
    val __obj = js.Dynamic.literal(fontSize = fontSize.asInstanceOf[js.Any], letterSpacing = letterSpacing.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[LetterSpacing]
  }
  
  @scala.inline
  implicit class LetterSpacingMutableBuilder[Self <: LetterSpacing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFontSize(value: String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLetterSpacing(value: String): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineHeight(value: String): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
  }
}
