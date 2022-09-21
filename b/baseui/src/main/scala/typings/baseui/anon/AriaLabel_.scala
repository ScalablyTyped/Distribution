package typings.baseui.anon

import typings.baseui.baseuiStrings.top
import typings.baseui.baseuiStrings.trailing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AriaLabel_ extends StObject {
  
  var ariaLabel: String
  
  var backgroundPosition: js.UndefOr[String] = js.undefined
  
  var layout: js.UndefOr[top | trailing] = js.undefined
  
  var src: String
}
object AriaLabel_ {
  
  inline def apply(ariaLabel: String, src: String): AriaLabel_ = {
    val __obj = js.Dynamic.literal(ariaLabel = ariaLabel.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[AriaLabel_]
  }
  
  extension [Self <: AriaLabel_](x: Self) {
    
    inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
    
    inline def setBackgroundPosition(value: String): Self = StObject.set(x, "backgroundPosition", value.asInstanceOf[js.Any])
    
    inline def setBackgroundPositionUndefined: Self = StObject.set(x, "backgroundPosition", js.undefined)
    
    inline def setLayout(value: top | trailing): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
  }
}
