package typings.babelTraverse.anon

import typings.babelTraverse.mod.HubInterface
import typings.babelTraverse.mod.NodePath
import typings.babelTypes.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Container[C /* <: Node */, K /* <: /* keyof C */ String */] extends StObject {
  
  var container: C
  
  var hub: HubInterface
  
  var key: K
  
  var listKey: js.UndefOr[String] = js.undefined
  
  var parent: Node
  
  var parentPath: NodePath[Node] | Null
}
object Container {
  
  inline def apply[C /* <: Node */, K /* <: /* keyof C */ String */](container: C, hub: HubInterface, key: K, parent: Node): Container[C, K] = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], hub = hub.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], parentPath = null)
    __obj.asInstanceOf[Container[C, K]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Container[?, ?], C /* <: Node */, K /* <: /* keyof C */ String */] (val x: Self & (Container[C, K])) extends AnyVal {
    
    inline def setContainer(value: C): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setHub(value: HubInterface): Self = StObject.set(x, "hub", value.asInstanceOf[js.Any])
    
    inline def setKey(value: K): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setListKey(value: String): Self = StObject.set(x, "listKey", value.asInstanceOf[js.Any])
    
    inline def setListKeyUndefined: Self = StObject.set(x, "listKey", js.undefined)
    
    inline def setParent(value: Node): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentPath(value: NodePath[Node]): Self = StObject.set(x, "parentPath", value.asInstanceOf[js.Any])
    
    inline def setParentPathNull: Self = StObject.set(x, "parentPath", null)
  }
}
