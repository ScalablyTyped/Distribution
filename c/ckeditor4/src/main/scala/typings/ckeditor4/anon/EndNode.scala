package typings.ckeditor4.anon

import typings.ckeditor4.CKEDITOR.dom.node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndNode extends StObject {
  
  var endNode: node
  
  var startNode: node
}
object EndNode {
  
  inline def apply(endNode: node, startNode: node): EndNode = {
    val __obj = js.Dynamic.literal(endNode = endNode.asInstanceOf[js.Any], startNode = startNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EndNode] (val x: Self) extends AnyVal {
    
    inline def setEndNode(value: node): Self = StObject.set(x, "endNode", value.asInstanceOf[js.Any])
    
    inline def setStartNode(value: node): Self = StObject.set(x, "startNode", value.asInstanceOf[js.Any])
  }
}
