package typings.baseui

import org.scalablytyped.runtime.StringDictionary
import typings.baseui.anon.Overrides
import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.styletronReact.mod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeViewMod {
  
  @JSImport("baseui/tree-view", "StatefulTreeView")
  @js.native
  val StatefulTreeView: FC[TreeViewProps] = js.native
  
  @JSImport("baseui/tree-view", "StyledIconContainer")
  @js.native
  val StyledIconContainer: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/tree-view", "StyledItemContent")
  @js.native
  val StyledItemContent: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/tree-view", "StyledTreeItem")
  @js.native
  val StyledTreeItem: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/tree-view", "StyledTreeItemList")
  @js.native
  val StyledTreeItemList: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/tree-view", "TreeLabel")
  @js.native
  val TreeLabel: FC[TreeLabelProps] = js.native
  
  @JSImport("baseui/tree-view", "TreeLabelInteractable")
  @js.native
  val TreeLabelInteractable: FC[Overrides] = js.native
  
  @JSImport("baseui/tree-view", "TreeView")
  @js.native
  val TreeView: FC[TreeViewProps] = js.native
  
  @JSImport("baseui/tree-view", "toggleIsExpanded")
  @js.native
  val toggleIsExpanded: toggleIsExpandedT = js.native
  
  trait StatefulContainerProps
    extends StObject
       with TreeViewProps {
    
    def children(props: TreeViewProps): ReactNode
  }
  object StatefulContainerProps {
    
    inline def apply(children: TreeViewProps => ReactNode, data: js.Array[TreeNode[js.Any]]): StatefulContainerProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatefulContainerProps]
    }
    
    extension [Self <: StatefulContainerProps](x: Self) {
      
      inline def setChildren(value: TreeViewProps => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    }
  }
  
  type TGetId = js.Function1[/* node */ TreeNode[js.Any], String | Double]
  
  trait TreeLabelOverrides extends StObject {
    
    var CollapseIcon: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any
      ] = js.undefined
    
    var ExpandIcon: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any
      ] = js.undefined
    
    var IconContainer: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any
      ] = js.undefined
    
    var LeafIcon: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any
      ] = js.undefined
    
    var LeafIconContainer: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any
      ] = js.undefined
    
    var TreeItemContent: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any
      ] = js.undefined
  }
  object TreeLabelOverrides {
    
    inline def apply(): TreeLabelOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TreeLabelOverrides]
    }
    
    extension [Self <: TreeLabelOverrides](x: Self) {
      
      inline def setCollapseIcon(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any
      ): Self = StObject.set(x, "CollapseIcon", value.asInstanceOf[js.Any])
      
      inline def setCollapseIconUndefined: Self = StObject.set(x, "CollapseIcon", js.undefined)
      
      inline def setExpandIcon(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any
      ): Self = StObject.set(x, "ExpandIcon", value.asInstanceOf[js.Any])
      
      inline def setExpandIconUndefined: Self = StObject.set(x, "ExpandIcon", js.undefined)
      
      inline def setIconContainer(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any
      ): Self = StObject.set(x, "IconContainer", value.asInstanceOf[js.Any])
      
      inline def setIconContainerUndefined: Self = StObject.set(x, "IconContainer", js.undefined)
      
      inline def setLeafIcon(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any
      ): Self = StObject.set(x, "LeafIcon", value.asInstanceOf[js.Any])
      
      inline def setLeafIconContainer(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any
      ): Self = StObject.set(x, "LeafIconContainer", value.asInstanceOf[js.Any])
      
      inline def setLeafIconContainerUndefined: Self = StObject.set(x, "LeafIconContainer", js.undefined)
      
      inline def setLeafIconUndefined: Self = StObject.set(x, "LeafIcon", js.undefined)
      
      inline def setTreeItemContent(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any
      ): Self = StObject.set(x, "TreeItemContent", value.asInstanceOf[js.Any])
      
      inline def setTreeItemContentUndefined: Self = StObject.set(x, "TreeItemContent", js.undefined)
    }
  }
  
  trait TreeLabelProps extends StObject {
    
    var hasChildren: Boolean
    
    var isExpanded: js.UndefOr[Boolean] = js.undefined
    
    var label: (js.Function1[/* node */ TreeNode[js.Any], ReactNode]) | String
    
    var node: TreeNode[js.Any]
    
    var overrides: js.UndefOr[TreeLabelOverrides] = js.undefined
  }
  object TreeLabelProps {
    
    inline def apply(
      hasChildren: Boolean,
      label: (js.Function1[/* node */ TreeNode[js.Any], ReactNode]) | String,
      node: TreeNode[js.Any]
    ): TreeLabelProps = {
      val __obj = js.Dynamic.literal(hasChildren = hasChildren.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeLabelProps]
    }
    
    extension [Self <: TreeLabelProps](x: Self) {
      
      inline def setHasChildren(value: Boolean): Self = StObject.set(x, "hasChildren", value.asInstanceOf[js.Any])
      
      inline def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
      
      inline def setIsExpandedUndefined: Self = StObject.set(x, "isExpanded", js.undefined)
      
      inline def setLabel(value: (js.Function1[/* node */ TreeNode[js.Any], ReactNode]) | String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelFunction1(value: /* node */ TreeNode[js.Any] => ReactNode): Self = StObject.set(x, "label", js.Any.fromFunction1(value))
      
      inline def setNode(value: TreeNode[js.Any]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setOverrides(value: TreeLabelOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    }
  }
  
  trait TreeNode[T]
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var children: js.UndefOr[js.Array[TreeNode[js.Any]]] = js.undefined
    
    var id: js.UndefOr[Double | String] = js.undefined
    
    var info: js.UndefOr[T] = js.undefined
    
    var isExpanded: js.UndefOr[Boolean] = js.undefined
    
    var label: (js.Function1[/* node */ TreeNode[js.Any], ReactNode]) | String
  }
  object TreeNode {
    
    inline def apply[T](label: (js.Function1[/* node */ TreeNode[js.Any], ReactNode]) | String): TreeNode[T] = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeNode[T]]
    }
    
    extension [Self <: TreeNode[?], T](x: Self & TreeNode[T]) {
      
      inline def setChildren(value: js.Array[TreeNode[js.Any]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: TreeNode[js.Any]*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      inline def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInfo(value: T): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      inline def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
      
      inline def setIsExpandedUndefined: Self = StObject.set(x, "isExpanded", js.undefined)
      
      inline def setLabel(value: (js.Function1[/* node */ TreeNode[js.Any], ReactNode]) | String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelFunction1(value: /* node */ TreeNode[js.Any] => ReactNode): Self = StObject.set(x, "label", js.Any.fromFunction1(value))
    }
  }
  
  trait TreeNodeProps extends StObject {
    
    var indentGuides: js.UndefOr[Boolean] = js.undefined
    
    var node: TreeNode[js.Any]
    
    var onToggle: js.UndefOr[js.Function1[/* node */ TreeNode[js.Any], Unit]] = js.undefined
    
    var overrides: js.UndefOr[TreeViewOverrides] = js.undefined
  }
  object TreeNodeProps {
    
    inline def apply(node: TreeNode[js.Any]): TreeNodeProps = {
      val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeNodeProps]
    }
    
    extension [Self <: TreeNodeProps](x: Self) {
      
      inline def setIndentGuides(value: Boolean): Self = StObject.set(x, "indentGuides", value.asInstanceOf[js.Any])
      
      inline def setIndentGuidesUndefined: Self = StObject.set(x, "indentGuides", js.undefined)
      
      inline def setNode(value: TreeNode[js.Any]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setOnToggle(value: /* node */ TreeNode[js.Any] => Unit): Self = StObject.set(x, "onToggle", js.Any.fromFunction1(value))
      
      inline def setOnToggleUndefined: Self = StObject.set(x, "onToggle", js.undefined)
      
      inline def setOverrides(value: TreeViewOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    }
  }
  
  trait TreeViewOverrides
    extends StObject
       with TreeLabelOverrides {
    
    var Root: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any
      ] = js.undefined
    
    var TreeItem: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{  $isLeafNode :boolean | undefined}> */ js.Any
      ] = js.undefined
    
    var TreeItemList: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{  $isChildNode :boolean | undefined}> */ js.Any
      ] = js.undefined
    
    var TreeLabel: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<TreeLabelProps> */ js.Any
      ] = js.undefined
  }
  object TreeViewOverrides {
    
    inline def apply(): TreeViewOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TreeViewOverrides]
    }
    
    extension [Self <: TreeViewOverrides](x: Self) {
      
      inline def setRoot(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any
      ): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
      
      inline def setTreeItem(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{  $isLeafNode :boolean | undefined}> */ js.Any
      ): Self = StObject.set(x, "TreeItem", value.asInstanceOf[js.Any])
      
      inline def setTreeItemList(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{  $isChildNode :boolean | undefined}> */ js.Any
      ): Self = StObject.set(x, "TreeItemList", value.asInstanceOf[js.Any])
      
      inline def setTreeItemListUndefined: Self = StObject.set(x, "TreeItemList", js.undefined)
      
      inline def setTreeItemUndefined: Self = StObject.set(x, "TreeItem", js.undefined)
      
      inline def setTreeLabel(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<TreeLabelProps> */ js.Any
      ): Self = StObject.set(x, "TreeLabel", value.asInstanceOf[js.Any])
      
      inline def setTreeLabelUndefined: Self = StObject.set(x, "TreeLabel", js.undefined)
    }
  }
  
  trait TreeViewProps extends StObject {
    
    var data: js.Array[TreeNode[js.Any]]
    
    var getId: js.UndefOr[js.Function1[/* node */ TreeNode[js.Any], Double | String]] = js.undefined
    
    var indentGuides: js.UndefOr[Boolean] = js.undefined
    
    var onToggle: js.UndefOr[js.Function1[/* node */ TreeNode[js.Any], Unit]] = js.undefined
    
    var overrides: js.UndefOr[TreeViewOverrides] = js.undefined
    
    var renderAll: js.UndefOr[Boolean] = js.undefined
    
    var singleExpanded: js.UndefOr[Boolean] = js.undefined
  }
  object TreeViewProps {
    
    inline def apply(data: js.Array[TreeNode[js.Any]]): TreeViewProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeViewProps]
    }
    
    extension [Self <: TreeViewProps](x: Self) {
      
      inline def setData(value: js.Array[TreeNode[js.Any]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: TreeNode[js.Any]*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      inline def setGetId(value: /* node */ TreeNode[js.Any] => Double | String): Self = StObject.set(x, "getId", js.Any.fromFunction1(value))
      
      inline def setGetIdUndefined: Self = StObject.set(x, "getId", js.undefined)
      
      inline def setIndentGuides(value: Boolean): Self = StObject.set(x, "indentGuides", value.asInstanceOf[js.Any])
      
      inline def setIndentGuidesUndefined: Self = StObject.set(x, "indentGuides", js.undefined)
      
      inline def setOnToggle(value: /* node */ TreeNode[js.Any] => Unit): Self = StObject.set(x, "onToggle", js.Any.fromFunction1(value))
      
      inline def setOnToggleUndefined: Self = StObject.set(x, "onToggle", js.undefined)
      
      inline def setOverrides(value: TreeViewOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setRenderAll(value: Boolean): Self = StObject.set(x, "renderAll", value.asInstanceOf[js.Any])
      
      inline def setRenderAllUndefined: Self = StObject.set(x, "renderAll", js.undefined)
      
      inline def setSingleExpanded(value: Boolean): Self = StObject.set(x, "singleExpanded", value.asInstanceOf[js.Any])
      
      inline def setSingleExpandedUndefined: Self = StObject.set(x, "singleExpanded", js.undefined)
    }
  }
  
  type toggleIsExpandedT = js.Function3[
    /* data */ js.Array[TreeNode[js.Any]], 
    /* toggledNode */ TreeNode[js.Any], 
    /* getId */ js.UndefOr[TGetId], 
    js.Array[TreeNode[js.Any]]
  ]
}
