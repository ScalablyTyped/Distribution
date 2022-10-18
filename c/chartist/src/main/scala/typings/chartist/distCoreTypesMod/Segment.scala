package typings.chartist.distCoreTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Segment extends StObject {
  
  var pathCoordinates: js.Array[Double]
  
  var valueData: js.Array[SegmentData]
}
object Segment {
  
  inline def apply(pathCoordinates: js.Array[Double], valueData: js.Array[SegmentData]): Segment = {
    val __obj = js.Dynamic.literal(pathCoordinates = pathCoordinates.asInstanceOf[js.Any], valueData = valueData.asInstanceOf[js.Any])
    __obj.asInstanceOf[Segment]
  }
  
  extension [Self <: Segment](x: Self) {
    
    inline def setPathCoordinates(value: js.Array[Double]): Self = StObject.set(x, "pathCoordinates", value.asInstanceOf[js.Any])
    
    inline def setPathCoordinatesVarargs(value: Double*): Self = StObject.set(x, "pathCoordinates", js.Array(value*))
    
    inline def setValueData(value: js.Array[SegmentData]): Self = StObject.set(x, "valueData", value.asInstanceOf[js.Any])
    
    inline def setValueDataVarargs(value: SegmentData*): Self = StObject.set(x, "valueData", js.Array(value*))
  }
}
