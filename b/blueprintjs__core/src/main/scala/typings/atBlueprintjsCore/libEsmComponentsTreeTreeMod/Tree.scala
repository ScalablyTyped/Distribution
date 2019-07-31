package typings.atBlueprintjsCore.libEsmComponentsTreeTreeMod

import org.scalablytyped.runtime.Instantiable1
import typings.atBlueprintjsCore.libEsmComponentsTreeTreeNodeMod.ITreeNode
import typings.react.reactMod.Component
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components/tree/tree", "Tree")
@js.native
class Tree[T] ()
  extends Component[ITreeProps[T], js.Object, js.Any] {
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
  /**
    * Returns the underlying HTML element of the `Tree` node with an id of `nodeId`.
    * This element does not contain the children of the node, only its label and controls.
    * If the node is not currently mounted, `undefined` is returned.
    */
  def getNodeContentElement(nodeId: String): js.UndefOr[HTMLElement] = js.native
  def getNodeContentElement(nodeId: Double): js.UndefOr[HTMLElement] = js.native
}

/* static members */
@JSImport("@blueprintjs/core/lib/esm/components/tree/tree", "Tree")
@js.native
object Tree extends js.Object {
  var displayName: String = js.native
  def nodeFromPath(path: js.Array[Double], treeNodes: js.Array[ITreeNode[js.Object]]): ITreeNode[js.Object] = js.native
  def ofType[T](): Instantiable1[/* props */ ITreeProps[T], Tree[T]] = js.native
}

