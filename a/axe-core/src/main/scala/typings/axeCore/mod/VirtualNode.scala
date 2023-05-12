package typings.axeCore.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualNode extends StObject {
  
  var actualNode: js.UndefOr[Node] = js.undefined
  
  def attr(attr: String): String | Null
  
  var children: js.UndefOr[js.Array[VirtualNode]] = js.undefined
  
  def hasAttr(attr: String): Boolean
  
  var parent: js.UndefOr[VirtualNode] = js.undefined
  
  var props: StringDictionary[Any]
  
  var shadowId: js.UndefOr[String] = js.undefined
}
object VirtualNode {
  
  inline def apply(attr: String => String | Null, hasAttr: String => Boolean, props: StringDictionary[Any]): VirtualNode = {
    val __obj = js.Dynamic.literal(attr = js.Any.fromFunction1(attr), hasAttr = js.Any.fromFunction1(hasAttr), props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VirtualNode] (val x: Self) extends AnyVal {
    
    inline def setActualNode(value: Node): Self = StObject.set(x, "actualNode", value.asInstanceOf[js.Any])
    
    inline def setActualNodeUndefined: Self = StObject.set(x, "actualNode", js.undefined)
    
    inline def setAttr(value: String => String | Null): Self = StObject.set(x, "attr", js.Any.fromFunction1(value))
    
    inline def setChildren(value: js.Array[VirtualNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: VirtualNode*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setHasAttr(value: String => Boolean): Self = StObject.set(x, "hasAttr", js.Any.fromFunction1(value))
    
    inline def setParent(value: VirtualNode): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setProps(value: StringDictionary[Any]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setShadowId(value: String): Self = StObject.set(x, "shadowId", value.asInstanceOf[js.Any])
    
    inline def setShadowIdUndefined: Self = StObject.set(x, "shadowId", js.undefined)
  }
}
