package typings.chartJs.distTypesIndexMod

import typings.chartJs.chartJsStrings.segment
import typings.chartJs.distElementsElementDotpointMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScriptableLineSegmentContext extends StObject {
  
  var datasetIndex: Double
  
  var p0: default
  
  var p0DataIndex: Double
  
  var p1: default
  
  var p1DataIndex: Double
  
  var `type`: segment
}
object ScriptableLineSegmentContext {
  
  inline def apply(datasetIndex: Double, p0: default, p0DataIndex: Double, p1: default, p1DataIndex: Double): ScriptableLineSegmentContext = {
    val __obj = js.Dynamic.literal(datasetIndex = datasetIndex.asInstanceOf[js.Any], p0 = p0.asInstanceOf[js.Any], p0DataIndex = p0DataIndex.asInstanceOf[js.Any], p1 = p1.asInstanceOf[js.Any], p1DataIndex = p1DataIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("segment")
    __obj.asInstanceOf[ScriptableLineSegmentContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScriptableLineSegmentContext] (val x: Self) extends AnyVal {
    
    inline def setDatasetIndex(value: Double): Self = StObject.set(x, "datasetIndex", value.asInstanceOf[js.Any])
    
    inline def setP0(value: default): Self = StObject.set(x, "p0", value.asInstanceOf[js.Any])
    
    inline def setP0DataIndex(value: Double): Self = StObject.set(x, "p0DataIndex", value.asInstanceOf[js.Any])
    
    inline def setP1(value: default): Self = StObject.set(x, "p1", value.asInstanceOf[js.Any])
    
    inline def setP1DataIndex(value: Double): Self = StObject.set(x, "p1DataIndex", value.asInstanceOf[js.Any])
    
    inline def setType(value: segment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
