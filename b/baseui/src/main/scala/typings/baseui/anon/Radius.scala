package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Radius extends StObject {
  
  @JSName("$color")
  var $color: String
  
  @JSName("$radius")
  var $radius: Double
}
object Radius {
  
  inline def apply($color: String, $radius: Double): Radius = {
    val __obj = js.Dynamic.literal($color = $color.asInstanceOf[js.Any], $radius = $radius.asInstanceOf[js.Any])
    __obj.asInstanceOf[Radius]
  }
  
  extension [Self <: Radius](x: Self) {
    
    inline def set$color(value: String): Self = StObject.set(x, "$color", value.asInstanceOf[js.Any])
    
    inline def set$radius(value: Double): Self = StObject.set(x, "$radius", value.asInstanceOf[js.Any])
  }
}
