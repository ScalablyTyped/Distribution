package typings.baseui.anon

import typings.baseui.mapMarkerTypesMod.LocationPuckSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorSize extends StObject {
  
  @JSName("$color")
  var $color: String
  
  @JSName("$size")
  var $size: LocationPuckSize
}
object ColorSize {
  
  inline def apply($color: String, $size: LocationPuckSize): ColorSize = {
    val __obj = js.Dynamic.literal($color = $color.asInstanceOf[js.Any], $size = $size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorSize]
  }
  
  extension [Self <: ColorSize](x: Self) {
    
    inline def set$color(value: String): Self = StObject.set(x, "$color", value.asInstanceOf[js.Any])
    
    inline def set$size(value: LocationPuckSize): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
  }
}
