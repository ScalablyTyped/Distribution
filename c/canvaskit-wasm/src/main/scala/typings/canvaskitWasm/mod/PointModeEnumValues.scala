package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointModeEnumValues
  extends StObject
     with EmbindEnum {
  
  var Lines: PointMode
  
  var Points: PointMode
  
  var Polygon: PointMode
}
object PointModeEnumValues {
  
  inline def apply(Lines: PointMode, Points: PointMode, Polygon: PointMode, values: js.Array[Double]): PointModeEnumValues = {
    val __obj = js.Dynamic.literal(Lines = Lines.asInstanceOf[js.Any], Points = Points.asInstanceOf[js.Any], Polygon = Polygon.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointModeEnumValues]
  }
  
  extension [Self <: PointModeEnumValues](x: Self) {
    
    inline def setLines(value: PointMode): Self = StObject.set(x, "Lines", value.asInstanceOf[js.Any])
    
    inline def setPoints(value: PointMode): Self = StObject.set(x, "Points", value.asInstanceOf[js.Any])
    
    inline def setPolygon(value: PointMode): Self = StObject.set(x, "Polygon", value.asInstanceOf[js.Any])
  }
}
