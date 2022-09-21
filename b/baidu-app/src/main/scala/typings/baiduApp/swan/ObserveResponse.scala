package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObserveResponse extends StObject {
  
  // 相交区域占目标节点的布局区域的比例
  var boundingClientRect: RectArea
  
  var dataset: Any
  
  var id: String
  
  var intersectionRatio: Double
  
  var intersectionRect: RectArea
  
  var relativeRect: RectArea
  
  var time: Double
}
object ObserveResponse {
  
  inline def apply(
    boundingClientRect: RectArea,
    dataset: Any,
    id: String,
    intersectionRatio: Double,
    intersectionRect: RectArea,
    relativeRect: RectArea,
    time: Double
  ): ObserveResponse = {
    val __obj = js.Dynamic.literal(boundingClientRect = boundingClientRect.asInstanceOf[js.Any], dataset = dataset.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], intersectionRatio = intersectionRatio.asInstanceOf[js.Any], intersectionRect = intersectionRect.asInstanceOf[js.Any], relativeRect = relativeRect.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObserveResponse]
  }
  
  extension [Self <: ObserveResponse](x: Self) {
    
    inline def setBoundingClientRect(value: RectArea): Self = StObject.set(x, "boundingClientRect", value.asInstanceOf[js.Any])
    
    inline def setDataset(value: Any): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIntersectionRatio(value: Double): Self = StObject.set(x, "intersectionRatio", value.asInstanceOf[js.Any])
    
    inline def setIntersectionRect(value: RectArea): Self = StObject.set(x, "intersectionRect", value.asInstanceOf[js.Any])
    
    inline def setRelativeRect(value: RectArea): Self = StObject.set(x, "relativeRect", value.asInstanceOf[js.Any])
    
    inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}
