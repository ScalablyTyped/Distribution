package typings.cesium.anon

import typings.cesium.mod.Cartesian3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Direction extends StObject {
  
  var direction: Cartesian3
  
  var up: Cartesian3
}
object Direction {
  
  @scala.inline
  def apply(direction: Cartesian3, up: Cartesian3): Direction = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], up = up.asInstanceOf[js.Any])
    __obj.asInstanceOf[Direction]
  }
  
  @scala.inline
  implicit class DirectionMutableBuilder[Self <: Direction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirection(value: Cartesian3): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUp(value: Cartesian3): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
  }
}
