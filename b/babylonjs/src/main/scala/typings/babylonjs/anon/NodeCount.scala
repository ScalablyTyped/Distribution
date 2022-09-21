package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeCount extends StObject {
  
  var nodeCount: Double
  
  var pipelineCount: Double
}
object NodeCount {
  
  inline def apply(nodeCount: Double, pipelineCount: Double): NodeCount = {
    val __obj = js.Dynamic.literal(nodeCount = nodeCount.asInstanceOf[js.Any], pipelineCount = pipelineCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeCount]
  }
  
  extension [Self <: NodeCount](x: Self) {
    
    inline def setNodeCount(value: Double): Self = StObject.set(x, "nodeCount", value.asInstanceOf[js.Any])
    
    inline def setPipelineCount(value: Double): Self = StObject.set(x, "pipelineCount", value.asInstanceOf[js.Any])
  }
}
