package typings.cesium.anon

import typings.cesium.mod.Cartesian3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Minimum extends StObject {
  
  var maximum: Cartesian3
  
  var minimum: Cartesian3
}
object Minimum {
  
  inline def apply(maximum: Cartesian3, minimum: Cartesian3): Minimum = {
    val __obj = js.Dynamic.literal(maximum = maximum.asInstanceOf[js.Any], minimum = minimum.asInstanceOf[js.Any])
    __obj.asInstanceOf[Minimum]
  }
  
  extension [Self <: Minimum](x: Self) {
    
    inline def setMaximum(value: Cartesian3): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
    
    inline def setMinimum(value: Cartesian3): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
  }
}
