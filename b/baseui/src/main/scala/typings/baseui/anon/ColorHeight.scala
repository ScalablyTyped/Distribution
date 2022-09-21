package typings.baseui.anon

import typings.baseui.mapMarkerTypesMod.PinHeadSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorHeight extends StObject {
  
  @JSName("$color")
  var $color: String
  
  @JSName("$height")
  var $height: Double
  
  @JSName("$size")
  var $size: PinHeadSize
}
object ColorHeight {
  
  inline def apply($color: String, $height: Double, $size: PinHeadSize): ColorHeight = {
    val __obj = js.Dynamic.literal($color = $color.asInstanceOf[js.Any], $height = $height.asInstanceOf[js.Any], $size = $size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorHeight]
  }
  
  extension [Self <: ColorHeight](x: Self) {
    
    inline def set$color(value: String): Self = StObject.set(x, "$color", value.asInstanceOf[js.Any])
    
    inline def set$height(value: Double): Self = StObject.set(x, "$height", value.asInstanceOf[js.Any])
    
    inline def set$size(value: PinHeadSize): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
  }
}
