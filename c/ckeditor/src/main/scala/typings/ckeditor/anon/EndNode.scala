package typings.ckeditor.anon

import typings.ckeditor.CKEDITOR.dom.node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndNode extends StObject {
  
  var endNode: node
  
  var startNode: node
}
object EndNode {
  
  @scala.inline
  def apply(endNode: node, startNode: node): EndNode = {
    val __obj = js.Dynamic.literal(endNode = endNode.asInstanceOf[js.Any], startNode = startNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndNode]
  }
  
  @scala.inline
  implicit class EndNodeMutableBuilder[Self <: EndNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndNode(value: node): Self = StObject.set(x, "endNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartNode(value: node): Self = StObject.set(x, "startNode", value.asInstanceOf[js.Any])
  }
}
