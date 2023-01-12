package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectionUp extends StObject {
  
  var direction: Cartesian3
  
  var up: Cartesian3
}
object DirectionUp {
  
  inline def apply(direction: Cartesian3, up: Cartesian3): DirectionUp = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], up = up.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionUp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DirectionUp] (val x: Self) extends AnyVal {
    
    inline def setDirection(value: Cartesian3): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setUp(value: Cartesian3): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
  }
}
