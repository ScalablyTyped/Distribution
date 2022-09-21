package typings.chayns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextBlock extends StObject {
  
  /**
    * A h2 Element
    */
  var headline: js.UndefOr[String] = js.undefined
  
  /**
    * The position of the Element.
    * 0 is above the first dialog item, 1 is above the second dialog item...
    */
  var position: Double
  
  /**
    * A text which could contain html
    */
  var text: js.UndefOr[String] = js.undefined
}
object TextBlock {
  
  inline def apply(position: Double): TextBlock = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextBlock]
  }
  
  extension [Self <: TextBlock](x: Self) {
    
    inline def setHeadline(value: String): Self = StObject.set(x, "headline", value.asInstanceOf[js.Any])
    
    inline def setHeadlineUndefined: Self = StObject.set(x, "headline", js.undefined)
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
