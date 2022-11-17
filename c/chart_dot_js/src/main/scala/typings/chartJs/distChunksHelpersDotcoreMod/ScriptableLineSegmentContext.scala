package typings.chartJs.distChunksHelpersDotcoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScriptableLineSegmentContext extends StObject {
  
  var datasetIndex: Double
  
  var p0: PointElement
  
  var p0DataIndex: Double
  
  var p1: PointElement
  
  var p1DataIndex: Double
  
  var `type`: "segment"
}
object ScriptableLineSegmentContext {
  
  inline def apply(datasetIndex: Double, p0: PointElement, p0DataIndex: Double, p1: PointElement, p1DataIndex: Double): ScriptableLineSegmentContext = {
    val __obj = js.Dynamic.literal(datasetIndex = datasetIndex.asInstanceOf[js.Any], p0 = p0.asInstanceOf[js.Any], p0DataIndex = p0DataIndex.asInstanceOf[js.Any], p1 = p1.asInstanceOf[js.Any], p1DataIndex = p1DataIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("segment")
    __obj.asInstanceOf[ScriptableLineSegmentContext]
  }
  
  extension [Self <: ScriptableLineSegmentContext](x: Self) {
    
    inline def setDatasetIndex(value: Double): Self = StObject.set(x, "datasetIndex", value.asInstanceOf[js.Any])
    
    inline def setP0(value: PointElement): Self = StObject.set(x, "p0", value.asInstanceOf[js.Any])
    
    inline def setP0DataIndex(value: Double): Self = StObject.set(x, "p0DataIndex", value.asInstanceOf[js.Any])
    
    inline def setP1(value: PointElement): Self = StObject.set(x, "p1", value.asInstanceOf[js.Any])
    
    inline def setP1DataIndex(value: Double): Self = StObject.set(x, "p1DataIndex", value.asInstanceOf[js.Any])
    
    inline def setType(value: "segment"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
