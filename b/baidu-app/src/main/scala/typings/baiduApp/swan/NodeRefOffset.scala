package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeRefOffset extends StObject {
  
  /** 节点的dataset */
  var dataset: Any
  
  /** 节点的ID */
  var id: String
  
  /** 节点的水平滚动位置 */
  var scrollLeft: Double
  
  /** 节点的竖直滚动位置 */
  var scrollTop: Double
}
object NodeRefOffset {
  
  inline def apply(dataset: Any, id: String, scrollLeft: Double, scrollTop: Double): NodeRefOffset = {
    val __obj = js.Dynamic.literal(dataset = dataset.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], scrollLeft = scrollLeft.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeRefOffset]
  }
  
  extension [Self <: NodeRefOffset](x: Self) {
    
    inline def setDataset(value: Any): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setScrollLeft(value: Double): Self = StObject.set(x, "scrollLeft", value.asInstanceOf[js.Any])
    
    inline def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
  }
}
