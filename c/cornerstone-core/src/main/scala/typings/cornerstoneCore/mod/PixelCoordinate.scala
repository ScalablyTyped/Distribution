package typings.cornerstoneCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PixelCoordinate
  extends StObject
     with CoordinateSystem {
  
  var _pixelCoordinateBrand: String
}
object PixelCoordinate {
  
  inline def apply(_pixelCoordinateBrand: String, x: Double, y: Double): PixelCoordinate = {
    val __obj = js.Dynamic.literal(_pixelCoordinateBrand = _pixelCoordinateBrand.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[PixelCoordinate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PixelCoordinate] (val x: Self) extends AnyVal {
    
    inline def set_pixelCoordinateBrand(value: String): Self = StObject.set(x, "_pixelCoordinateBrand", value.asInstanceOf[js.Any])
  }
}
