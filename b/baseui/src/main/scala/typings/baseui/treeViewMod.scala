package typings.baseui

import typings.baseui.anon.IndentGuides
import typings.baseui.anon.IsFocusVisibleIsSelected
import typings.baseui.anon.IsLeafNode
import typings.baseui.anon.Overrides
import typings.baseui.baseuiStrings.div
import typings.baseui.baseuiStrings.li_
import typings.baseui.baseuiStrings.ul
import typings.baseui.treeViewTypesMod.TreeLabelProps
import typings.baseui.treeViewTypesMod.TreeNodeData
import typings.baseui.treeViewTypesMod.TreeNodeId
import typings.baseui.treeViewTypesMod.TreeViewProps
import typings.react.mod.ComponentType
import typings.react.mod.global.JSX.Element
import typings.styletronReact.typesMod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeViewMod {
  
  @JSImport("baseui/tree-view", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def StatefulTreeView(props: TreeViewProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("StatefulTreeView")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("baseui/tree-view", "StyledIconContainer")
  @js.native
  val StyledIconContainer: StyletronComponent[div, js.Object] = js.native
  
  @JSImport("baseui/tree-view", "StyledItemContent")
  @js.native
  val StyledItemContent: StyletronComponent[div, IsFocusVisibleIsSelected] = js.native
  
  @JSImport("baseui/tree-view", "StyledTreeItem")
  @js.native
  val StyledTreeItem: StyletronComponent[li_, IsLeafNode] = js.native
  
  @JSImport("baseui/tree-view", "StyledTreeItemList")
  @js.native
  val StyledTreeItemList: StyletronComponent[ul, IndentGuides] = js.native
  
  @JSImport("baseui/tree-view", "TreeLabel")
  @js.native
  val TreeLabel: ComponentType[TreeLabelProps] = js.native
  
  @JSImport("baseui/tree-view", "TreeLabelInteractable")
  @js.native
  val TreeLabelInteractable: ComponentType[Overrides] = js.native
  
  inline def TreeView(props: TreeViewProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("TreeView")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def toggleIsExpanded(arr: js.Array[TreeNodeData[Any]], toggledNode: TreeNodeData[Any]): js.Array[TreeNodeData[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("toggleIsExpanded")(arr.asInstanceOf[js.Any], toggledNode.asInstanceOf[js.Any])).asInstanceOf[js.Array[TreeNodeData[Any]]]
  inline def toggleIsExpanded(
    arr: js.Array[TreeNodeData[Any]],
    toggledNode: TreeNodeData[Any],
    getId: js.Function1[/* node */ TreeNodeData[Any], TreeNodeId]
  ): js.Array[TreeNodeData[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("toggleIsExpanded")(arr.asInstanceOf[js.Any], toggledNode.asInstanceOf[js.Any], getId.asInstanceOf[js.Any])).asInstanceOf[js.Array[TreeNodeData[Any]]]
  
  type TreeNode[T] = TreeNodeData[T]
}
