package typings.babelTraverse.anon

import typings.babelTraverse.mod.HubInterface
import typings.babelTraverse.mod.NodePath
import typings.babelTypes.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Container[C /* <: Node */, K /* <: /* keyof C */ String */] extends js.Object {
  
  var container: C = js.native
  
  var hub: HubInterface = js.native
  
  var key: K = js.native
  
  var listKey: js.UndefOr[String] = js.native
  
  var parent: Node = js.native
  
  var parentPath: NodePath[Node] | Null = js.native
}
object Container {
  
  @scala.inline
  def apply[C /* <: Node */, K /* <: /* keyof C */ String */](container: C, hub: HubInterface, key: K, parent: Node): Container[C, K] = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], hub = hub.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Container[C, K]]
  }
  
  @scala.inline
  implicit class ContainerOps[Self <: Container[_, _], C /* <: Node */, K /* <: /* keyof C */ String */] (val x: Self with (Container[C, K])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContainer(value: C): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHub(value: HubInterface): Self = this.set("hub", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: K): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: Node): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListKey(value: String): Self = this.set("listKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListKey: Self = this.set("listKey", js.undefined)
    
    @scala.inline
    def setParentPath(value: NodePath[Node]): Self = this.set("parentPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentPathNull: Self = this.set("parentPath", null)
  }
}
