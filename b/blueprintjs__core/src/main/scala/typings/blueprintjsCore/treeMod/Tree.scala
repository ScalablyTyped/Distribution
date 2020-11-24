package typings.blueprintjsCore.treeMod

import org.scalablytyped.runtime.Instantiable1
import typings.blueprintjsCore.treeNodeMod.ITreeNode
import typings.react.mod.Component
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core/lib/esm/components/tree/tree", "Tree")
@js.native
class Tree[T] ()
  extends Component[ITreeProps[T], js.Object, js.Any] {
  
  /**
    * Returns the underlying HTML element of the `Tree` node with an id of `nodeId`.
    * This element does not contain the children of the node, only its label and controls.
    * If the node is not currently mounted, `undefined` is returned.
    */
  def getNodeContentElement(nodeId: String): js.UndefOr[HTMLElement] = js.native
  def getNodeContentElement(nodeId: Double): js.UndefOr[HTMLElement] = js.native
  
  var handleContentRef: js.Any = js.native
  
  var handleNodeClick: js.Any = js.native
  
  var handleNodeCollapse: js.Any = js.native
  
  var handleNodeContextMenu: js.Any = js.native
  
  var handleNodeDoubleClick: js.Any = js.native
  
  var handleNodeExpand: js.Any = js.native
  
  var handleNodeMouseEnter: js.Any = js.native
  
  var handleNodeMouseLeave: js.Any = js.native
  
  var handlerHelper: js.Any = js.native
  
  var nodeRefs: js.Any = js.native
  
  var renderNodes: js.Any = js.native
}
/* static members */
@JSImport("@blueprintjs/core/lib/esm/components/tree/tree", "Tree")
@js.native
object Tree extends js.Object {
  
  var displayName: String = js.native
  
  def nodeFromPath[U](path: js.Array[Double]): ITreeNode[U] = js.native
  def nodeFromPath[U](path: js.Array[Double], treeNodes: js.Array[ITreeNode[U]]): ITreeNode[U] = js.native
  
  def ofType[U](): Instantiable1[/* props */ ITreeProps[U], Tree[U]] = js.native
}
