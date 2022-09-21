package typings.devextremeB5DqTZzf.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsShown extends StObject {
  
  /**
    * Specifies whether a tooltip is visible by default or not.
    */
  var isShown: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the text or HTML markup displayed in the tooltip.
    */
  var text: js.UndefOr[String] = js.undefined
}
object IsShown {
  
  inline def apply(): IsShown = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsShown]
  }
  
  extension [Self <: IsShown](x: Self) {
    
    inline def setIsShown(value: Boolean): Self = StObject.set(x, "isShown", value.asInstanceOf[js.Any])
    
    inline def setIsShownUndefined: Self = StObject.set(x, "isShown", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
