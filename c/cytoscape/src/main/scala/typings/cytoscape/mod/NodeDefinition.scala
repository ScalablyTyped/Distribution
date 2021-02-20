package typings.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeDefinition extends ElementDefinition {
  
  @JSName("data")
  var data_NodeDefinition: NodeDataDefinition = js.native
}
object NodeDefinition {
  
  @scala.inline
  def apply(data: NodeDataDefinition): NodeDefinition = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeDefinition]
  }
  
  @scala.inline
  implicit class NodeDefinitionMutableBuilder[Self <: NodeDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: NodeDataDefinition): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
