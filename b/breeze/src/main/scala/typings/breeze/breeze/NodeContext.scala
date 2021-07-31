package typings.breeze.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeContext extends StObject {
  
  var nodeType: String
  
  var propertyName: String
}
object NodeContext {
  
  @scala.inline
  def apply(nodeType: String, propertyName: String): NodeContext = {
    val __obj = js.Dynamic.literal(nodeType = nodeType.asInstanceOf[js.Any], propertyName = propertyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeContext]
  }
  
  @scala.inline
  implicit class NodeContextMutableBuilder[Self <: NodeContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodeType(value: String): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
  }
}
