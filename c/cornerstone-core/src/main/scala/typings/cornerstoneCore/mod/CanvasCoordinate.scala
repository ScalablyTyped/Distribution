package typings.cornerstoneCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasCoordinate
  extends StObject
     with CoordinateSystem {
  
  var _canvasCoordinateBrand: String
}
object CanvasCoordinate {
  
  inline def apply(_canvasCoordinateBrand: String, x: Double, y: Double): CanvasCoordinate = {
    val __obj = js.Dynamic.literal(_canvasCoordinateBrand = _canvasCoordinateBrand.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasCoordinate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CanvasCoordinate] (val x: Self) extends AnyVal {
    
    inline def set_canvasCoordinateBrand(value: String): Self = StObject.set(x, "_canvasCoordinateBrand", value.asInstanceOf[js.Any])
  }
}
