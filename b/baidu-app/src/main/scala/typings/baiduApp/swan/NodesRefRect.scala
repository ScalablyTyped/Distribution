package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesRefRect
  extends StObject
     with RectArea {
  
  /** 节点的dataset */
  var dataset: js.Any
  
  /** 节点的ID */
  var id: String
}
object NodesRefRect {
  
  inline def apply(
    bottom: Double,
    dataset: js.Any,
    height: Double,
    id: String,
    left: Double,
    right: Double,
    top: Double,
    width: Double
  ): NodesRefRect = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], dataset = dataset.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesRefRect]
  }
  
  extension [Self <: NodesRefRect](x: Self) {
    
    inline def setDataset(value: js.Any): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
