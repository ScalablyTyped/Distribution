package typings.babelTraverse.anon

import typings.babelTraverse.mod.HubInterface
import typings.babelTraverse.mod.NodeKeyOfArrays
import typings.babelTraverse.mod.NodePath
import typings.babelTypes.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hub[C /* <: Node */, L /* <: NodeKeyOfArrays[C] */] extends StObject {
  
  var container: C
  
  var hub: js.UndefOr[HubInterface] = js.undefined
  
  var key: Double
  
  var listKey: L
  
  var parent: Node
  
  var parentPath: NodePath[Node] | Null
}
object Hub {
  
  inline def apply[C /* <: Node */, L /* <: NodeKeyOfArrays[C] */](container: C, key: Double, listKey: L, parent: Node): Hub[C, L] = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], listKey = listKey.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], parentPath = null)
    __obj.asInstanceOf[Hub[C, L]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Hub[?, ?], C /* <: Node */, L /* <: NodeKeyOfArrays[C] */] (val x: Self & (Hub[C, L])) extends AnyVal {
    
    inline def setContainer(value: C): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setHub(value: HubInterface): Self = StObject.set(x, "hub", value.asInstanceOf[js.Any])
    
    inline def setHubUndefined: Self = StObject.set(x, "hub", js.undefined)
    
    inline def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setListKey(value: L): Self = StObject.set(x, "listKey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Node): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentPath(value: NodePath[Node]): Self = StObject.set(x, "parentPath", value.asInstanceOf[js.Any])
    
    inline def setParentPathNull: Self = StObject.set(x, "parentPath", null)
  }
}
