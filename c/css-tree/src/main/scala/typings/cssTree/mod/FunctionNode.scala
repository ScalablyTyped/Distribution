package typings.cssTree.mod

import typings.cssTree.cssTreeStrings.Function
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionNode
  extends CssNodeCommon
     with CssNode {
  
  var children: List[CssNode] = js.native
  
  var name: String = js.native
  
  @JSName("type")
  var type_FunctionNode: Function = js.native
}
object FunctionNode {
  
  @scala.inline
  def apply(children: List[CssNode], name: String, `type`: Function): FunctionNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionNode]
  }
  
  @scala.inline
  implicit class FunctionNodeMutableBuilder[Self <: FunctionNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: List[CssNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Function): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
