package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Background extends StObject {
  
  @JSName("$background")
  var $background: String
  
  @JSName("$width")
  var $width: Double
}
object Background {
  
  inline def apply($background: String, $width: Double): Background = {
    val __obj = js.Dynamic.literal($background = $background.asInstanceOf[js.Any], $width = $width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Background]
  }
  
  extension [Self <: Background](x: Self) {
    
    inline def set$background(value: String): Self = StObject.set(x, "$background", value.asInstanceOf[js.Any])
    
    inline def set$width(value: Double): Self = StObject.set(x, "$width", value.asInstanceOf[js.Any])
  }
}
