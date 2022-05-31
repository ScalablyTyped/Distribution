package typings.cesium.anon

import typings.cesium.mod.Cartesian3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Up extends StObject {
  
  var direction: Cartesian3
  
  var up: Cartesian3
}
object Up {
  
  inline def apply(direction: Cartesian3, up: Cartesian3): Up = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], up = up.asInstanceOf[js.Any])
    __obj.asInstanceOf[Up]
  }
  
  extension [Self <: Up](x: Self) {
    
    inline def setDirection(value: Cartesian3): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setUp(value: Cartesian3): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
  }
}
