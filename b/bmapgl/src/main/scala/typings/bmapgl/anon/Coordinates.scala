package typings.bmapgl.anon

import typings.bmapgl.bmapglStrings.LineString
import typings.bmapgl.bmapglStrings.Polygon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Coordinates extends StObject {
  
  var coordinates: js.Array[Any]
  
  var `type`: typings.bmapgl.bmapglStrings.Point | LineString | Polygon
}
object Coordinates {
  
  inline def apply(coordinates: js.Array[Any], `type`: typings.bmapgl.bmapglStrings.Point | LineString | Polygon): Coordinates = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Coordinates]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Coordinates] (val x: Self) extends AnyVal {
    
    inline def setCoordinates(value: js.Array[Any]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    inline def setCoordinatesVarargs(value: Any*): Self = StObject.set(x, "coordinates", js.Array(value*))
    
    inline def setType(value: typings.bmapgl.bmapglStrings.Point | LineString | Polygon): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
