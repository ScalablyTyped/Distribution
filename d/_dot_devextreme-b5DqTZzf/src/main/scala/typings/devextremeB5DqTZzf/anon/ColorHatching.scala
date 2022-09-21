package typings.devextremeB5DqTZzf.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorHatching extends StObject {
  
  /**
    * Configures the appearance a node&apos;s border changes to when the node is hovered over or pressed.
    */
  var border: js.UndefOr[ColorVisible] = js.undefined
  
  /**
    * Specifies the color a node changes to when it is hovered over or pressed.
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * Applies hatching to a node when it is hovered over or pressed.
    */
  var hatching: js.UndefOr[Direction] = js.undefined
  
  /**
    * Specifies the transparency a node changes to when it is hovered over or pressed.
    */
  var opacity: js.UndefOr[Double] = js.undefined
}
object ColorHatching {
  
  inline def apply(): ColorHatching = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorHatching]
  }
  
  extension [Self <: ColorHatching](x: Self) {
    
    inline def setBorder(value: ColorVisible): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setHatching(value: Direction): Self = StObject.set(x, "hatching", value.asInstanceOf[js.Any])
    
    inline def setHatchingUndefined: Self = StObject.set(x, "hatching", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
  }
}
