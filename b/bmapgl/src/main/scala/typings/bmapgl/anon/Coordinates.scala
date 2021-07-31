package typings.bmapgl.anon

import typings.bmapgl.bmapglStrings.LineString
import typings.bmapgl.bmapglStrings.Polygon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Coordinates extends StObject {
  
  var coordinates: js.Array[js.Any]
  
  var `type`: typings.bmapgl.bmapglStrings.Point | LineString | Polygon
}
object Coordinates {
  
  @scala.inline
  def apply(coordinates: js.Array[js.Any], `type`: typings.bmapgl.bmapglStrings.Point | LineString | Polygon): Coordinates = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Coordinates]
  }
  
  @scala.inline
  implicit class CoordinatesMutableBuilder[Self <: Coordinates] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoordinates(value: js.Array[js.Any]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoordinatesVarargs(value: js.Any*): Self = StObject.set(x, "coordinates", js.Array(value :_*))
    
    @scala.inline
    def setType(value: typings.bmapgl.bmapglStrings.Point | LineString | Polygon): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
