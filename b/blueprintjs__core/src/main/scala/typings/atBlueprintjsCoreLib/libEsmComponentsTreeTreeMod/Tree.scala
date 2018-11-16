package typings
package atBlueprintjsCoreLib.libEsmComponentsTreeTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components/tree/tree", "Tree")
@js.native
class Tree[T] ()
  extends reactLib.reactMod.Component[ITreeProps[T], js.Object, js.Any] {
  var handleContentRef: js.Any = js.native
  var handleNodeClick: js.Any = js.native
  var handleNodeCollapse: js.Any = js.native
  var handleNodeContextMenu: js.Any = js.native
  var handleNodeDoubleClick: js.Any = js.native
  var handleNodeExpand: js.Any = js.native
  var nodeRefs: js.Any = js.native
  /**
       * Returns the underlying HTML element of the `Tree` node with an id of `nodeId`.
       * This element does not contain the children of the node, only its label and controls.
       * If the node is not currently mounted, `undefined` is returned.
       */
  def getNodeContentElement(nodeId: java.lang.String): js.UndefOr[reactLib.HTMLElement] = js.native
  /**
       * Returns the underlying HTML element of the `Tree` node with an id of `nodeId`.
       * This element does not contain the children of the node, only its label and controls.
       * If the node is not currently mounted, `undefined` is returned.
       */
  def getNodeContentElement(nodeId: scala.Double): js.UndefOr[reactLib.HTMLElement] = js.native
  /* private */ def handlerHelper(handlerFromProps: js.Any, node: js.Any, e: js.Any): js.Any = js.native
  /* private */ def renderNodes(treeNodes: js.Any): js.Any = js.native
  /* private */ def renderNodes(treeNodes: js.Any, currentPath: js.Any): js.Any = js.native
  /* private */ def renderNodes(treeNodes: js.Any, currentPath: js.Any, className: js.Any): js.Any = js.native
}

@JSImport("@blueprintjs/core/lib/esm/components/tree/tree", "Tree")
@js.native
object Tree extends js.Object {
  var displayName: java.lang.String = js.native
  def nodeFromPath(
    path: js.Array[scala.Double],
    treeNodes: js.Array[atBlueprintjsCoreLib.libEsmComponentsTreeTreeNodeMod.ITreeNode[js.Object]]
  ): atBlueprintjsCoreLib.libEsmComponentsTreeTreeNodeMod.ITreeNode[js.Object] = js.native
  def ofType[T](): ScalablyTyped.runtime.Instantiable1[
    /* props */ atBlueprintjsCoreLib.libEsmComponentsTreeTreeMod.ITreeProps[T], 
    atBlueprintjsCoreLib.libEsmComponentsTreeTreeMod.Tree[T]
  ] = js.native
}

