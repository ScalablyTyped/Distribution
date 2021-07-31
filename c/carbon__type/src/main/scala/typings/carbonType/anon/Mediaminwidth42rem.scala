package typings.carbonType.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mediaminwidth42rem extends StObject {
  
  @JSName("@media (min-width: 42rem)")
  var `@media Leftparenthesismin-widthColon 42remRightparenthesis`: FontSize
  
  @JSName("@media (min-width: 66rem)")
  var `@media Leftparenthesismin-widthColon 66remRightparenthesis`: FontSize
  
  @JSName("@media (min-width: 82rem)")
  var `@media Leftparenthesismin-widthColon 82remRightparenthesis`: LineHeight
  
  @JSName("@media (min-width: 99rem)")
  var `@media Leftparenthesismin-widthColon 99remRightparenthesis`: LineHeight
  
  var fontFamily: String
  
  var fontSize: String
  
  var fontWeight: Double
  
  var letterSpacing: Double
  
  var lineHeight: String
}
object Mediaminwidth42rem {
  
  @scala.inline
  def apply(
    `@media Leftparenthesismin-widthColon 42remRightparenthesis`: FontSize,
    `@media Leftparenthesismin-widthColon 66remRightparenthesis`: FontSize,
    `@media Leftparenthesismin-widthColon 82remRightparenthesis`: LineHeight,
    `@media Leftparenthesismin-widthColon 99remRightparenthesis`: LineHeight,
    fontFamily: String,
    fontSize: String,
    fontWeight: Double,
    letterSpacing: Double,
    lineHeight: String
  ): Mediaminwidth42rem = {
    val __obj = js.Dynamic.literal(fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], letterSpacing = letterSpacing.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any])
    __obj.updateDynamic("@media (min-width: 42rem)")((`@media Leftparenthesismin-widthColon 42remRightparenthesis`).asInstanceOf[js.Any])
    __obj.updateDynamic("@media (min-width: 66rem)")((`@media Leftparenthesismin-widthColon 66remRightparenthesis`).asInstanceOf[js.Any])
    __obj.updateDynamic("@media (min-width: 82rem)")((`@media Leftparenthesismin-widthColon 82remRightparenthesis`).asInstanceOf[js.Any])
    __obj.updateDynamic("@media (min-width: 99rem)")((`@media Leftparenthesismin-widthColon 99remRightparenthesis`).asInstanceOf[js.Any])
    __obj.asInstanceOf[Mediaminwidth42rem]
  }
  
  @scala.inline
  implicit class Mediaminwidth42remMutableBuilder[Self <: Mediaminwidth42rem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `set@media Leftparenthesismin-widthColon 42remRightparenthesis`(value: FontSize): Self = StObject.set(x, "@media (min-width: 42rem)", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set@media Leftparenthesismin-widthColon 66remRightparenthesis`(value: FontSize): Self = StObject.set(x, "@media (min-width: 66rem)", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set@media Leftparenthesismin-widthColon 82remRightparenthesis`(value: LineHeight): Self = StObject.set(x, "@media (min-width: 82rem)", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set@media Leftparenthesismin-widthColon 99remRightparenthesis`(value: LineHeight): Self = StObject.set(x, "@media (min-width: 99rem)", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSize(value: String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontWeight(value: Double): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLetterSpacing(value: Double): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineHeight(value: String): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
  }
}
