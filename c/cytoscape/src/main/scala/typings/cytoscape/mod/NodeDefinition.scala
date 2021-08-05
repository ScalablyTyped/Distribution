package typings.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeDefinition
  extends StObject
     with ElementDefinition {
  
  @JSName("data")
  var data_NodeDefinition: NodeDataDefinition
}
object NodeDefinition {
  
  inline def apply(data: NodeDataDefinition): NodeDefinition = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeDefinition]
  }
  
  extension [Self <: NodeDefinition](x: Self) {
    
    inline def setData(value: NodeDataDefinition): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
