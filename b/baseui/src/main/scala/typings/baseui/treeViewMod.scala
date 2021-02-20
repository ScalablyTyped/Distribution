package typings.baseui

import org.scalablytyped.runtime.StringDictionary
import typings.baseui.anon.Overrides
import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.styletronReact.mod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  /* Inlined baseui.baseui/tree-view.TreeViewProps & {children (props : baseui.baseui/tree-view.TreeViewProps): react.react.ReactNode} */
  @js.native
  trait StatefulContainerProps extends StObject {
    
    def children(props: TreeViewProps): ReactNode = js.native
    
    var data: js.Array[TreeNode[_]] = js.native
    
    var getId: js.UndefOr[js.Function1[/* node */ TreeNode[_], Double | String]] = js.native
    
    var indentGuides: js.UndefOr[Boolean] = js.native
    
    var onToggle: js.UndefOr[js.Function1[/* node */ TreeNode[_], Unit]] = js.native
    
    var overrides: js.UndefOr[TreeViewOverrides] = js.native
    
    var renderAll: js.UndefOr[Boolean] = js.native
    
    var singleExpanded: js.UndefOr[Boolean] = js.native
  }
  object StatefulContainerProps {
    
    @scala.inline
    def apply(children: TreeViewProps => ReactNode, data: js.Array[TreeNode[_]]): StatefulContainerProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatefulContainerProps]
    }
    
    @scala.inline
    implicit class StatefulContainerPropsMutableBuilder[Self <: StatefulContainerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: TreeViewProps => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setData(value: js.Array[TreeNode[_]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataVarargs(value: TreeNode[js.Any]*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setGetId(value: /* node */ TreeNode[_] => Double | String): Self = StObject.set(x, "getId", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetIdUndefined: Self = StObject.set(x, "getId", js.undefined)
      
      @scala.inline
      def setIndentGuides(value: Boolean): Self = StObject.set(x, "indentGuides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndentGuidesUndefined: Self = StObject.set(x, "indentGuides", js.undefined)
      
      @scala.inline
      def setOnToggle(value: /* node */ TreeNode[_] => Unit): Self = StObject.set(x, "onToggle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnToggleUndefined: Self = StObject.set(x, "onToggle", js.undefined)
      
      @scala.inline
      def setOverrides(value: TreeViewOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      @scala.inline
      def setRenderAll(value: Boolean): Self = StObject.set(x, "renderAll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderAllUndefined: Self = StObject.set(x, "renderAll", js.undefined)
      
      @scala.inline
      def setSingleExpanded(value: Boolean): Self = StObject.set(x, "singleExpanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSingleExpandedUndefined: Self = StObject.set(x, "singleExpanded", js.undefined)
    }
  }
  
  type TGetId = js.Function1[/* node */ TreeNode[js.Any], String | Double]
  
  @js.native
  trait TreeLabelOverrides extends StObject {
    
    var CollapseIcon: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any
      ] = js.native
    
    var ExpandIcon: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any
      ] = js.native
    
    var IconContainer: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any
      ] = js.native
    
    var LeafIcon: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any
      ] = js.native
    
    var LeafIconContainer: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any
      ] = js.native
    
    var TreeItemContent: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any
      ] = js.native
  }
  object TreeLabelOverrides {
    
    @scala.inline
    def apply(): TreeLabelOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TreeLabelOverrides]
    }
    
    @scala.inline
    implicit class TreeLabelOverridesMutableBuilder[Self <: TreeLabelOverrides] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCollapseIcon(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any
      ): Self = StObject.set(x, "CollapseIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapseIconUndefined: Self = StObject.set(x, "CollapseIcon", js.undefined)
      
      @scala.inline
      def setExpandIcon(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any
      ): Self = StObject.set(x, "ExpandIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandIconUndefined: Self = StObject.set(x, "ExpandIcon", js.undefined)
      
      @scala.inline
      def setIconContainer(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any
      ): Self = StObject.set(x, "IconContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconContainerUndefined: Self = StObject.set(x, "IconContainer", js.undefined)
      
      @scala.inline
      def setLeafIcon(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any
      ): Self = StObject.set(x, "LeafIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeafIconContainer(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any
      ): Self = StObject.set(x, "LeafIconContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeafIconContainerUndefined: Self = StObject.set(x, "LeafIconContainer", js.undefined)
      
      @scala.inline
      def setLeafIconUndefined: Self = StObject.set(x, "LeafIcon", js.undefined)
      
      @scala.inline
      def setTreeItemContent(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any
      ): Self = StObject.set(x, "TreeItemContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeItemContentUndefined: Self = StObject.set(x, "TreeItemContent", js.undefined)
    }
  }
  
  @js.native
  trait TreeLabelProps extends StObject {
    
    var hasChildren: Boolean = js.native
    
    var isExpanded: js.UndefOr[Boolean] = js.native
    
    var label: (js.Function1[/* node */ TreeNode[_], ReactNode]) | String = js.native
    
    var node: TreeNode[_] = js.native
    
    var overrides: js.UndefOr[TreeLabelOverrides] = js.native
  }
  object TreeLabelProps {
    
    @scala.inline
    def apply(
      hasChildren: Boolean,
      label: (js.Function1[/* node */ TreeNode[_], ReactNode]) | String,
      node: TreeNode[_]
    ): TreeLabelProps = {
      val __obj = js.Dynamic.literal(hasChildren = hasChildren.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeLabelProps]
    }
    
    @scala.inline
    implicit class TreeLabelPropsMutableBuilder[Self <: TreeLabelProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHasChildren(value: Boolean): Self = StObject.set(x, "hasChildren", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsExpandedUndefined: Self = StObject.set(x, "isExpanded", js.undefined)
      
      @scala.inline
      def setLabel(value: (js.Function1[/* node */ TreeNode[_], ReactNode]) | String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFunction1(value: /* node */ TreeNode[_] => ReactNode): Self = StObject.set(x, "label", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNode(value: TreeNode[_]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverrides(value: TreeLabelOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    }
  }
  
  @js.native
  trait TreeNode[T]
    extends /* key */ StringDictionary[js.Any] {
    
    var children: js.UndefOr[js.Array[TreeNode[_]]] = js.native
    
    var id: js.UndefOr[Double | String] = js.native
    
    var info: js.UndefOr[T] = js.native
    
    var isExpanded: js.UndefOr[Boolean] = js.native
    
    var label: (js.Function1[/* node */ TreeNode[_], ReactNode]) | String = js.native
  }
  object TreeNode {
    
    @scala.inline
    def apply[T](label: (js.Function1[/* node */ TreeNode[_], ReactNode]) | String): TreeNode[T] = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeNode[T]]
    }
    
    @scala.inline
    implicit class TreeNodeMutableBuilder[Self <: TreeNode[_], T] (val x: Self with TreeNode[T]) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[TreeNode[_]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: TreeNode[js.Any]*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setInfo(value: T): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      @scala.inline
      def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsExpandedUndefined: Self = StObject.set(x, "isExpanded", js.undefined)
      
      @scala.inline
      def setLabel(value: (js.Function1[/* node */ TreeNode[_], ReactNode]) | String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFunction1(value: /* node */ TreeNode[_] => ReactNode): Self = StObject.set(x, "label", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait TreeNodeProps extends StObject {
    
    var indentGuides: js.UndefOr[Boolean] = js.native
    
    var node: TreeNode[_] = js.native
    
    var onToggle: js.UndefOr[js.Function1[/* node */ TreeNode[_], Unit]] = js.native
    
    var overrides: js.UndefOr[TreeViewOverrides] = js.native
  }
  object TreeNodeProps {
    
    @scala.inline
    def apply(node: TreeNode[_]): TreeNodeProps = {
      val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeNodeProps]
    }
    
    @scala.inline
    implicit class TreeNodePropsMutableBuilder[Self <: TreeNodeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndentGuides(value: Boolean): Self = StObject.set(x, "indentGuides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndentGuidesUndefined: Self = StObject.set(x, "indentGuides", js.undefined)
      
      @scala.inline
      def setNode(value: TreeNode[_]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnToggle(value: /* node */ TreeNode[_] => Unit): Self = StObject.set(x, "onToggle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnToggleUndefined: Self = StObject.set(x, "onToggle", js.undefined)
      
      @scala.inline
      def setOverrides(value: TreeViewOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    }
  }
  
  @js.native
  trait TreeViewOverrides extends TreeLabelOverrides {
    
    var Root: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any
      ] = js.native
    
    var TreeItem: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{  $isLeafNode :boolean | undefined}> */ js.Any
      ] = js.native
    
    var TreeItemList: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{  $isChildNode :boolean | undefined}> */ js.Any
      ] = js.native
    
    var TreeLabel: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<TreeLabelProps> */ js.Any
      ] = js.native
  }
  object TreeViewOverrides {
    
    @scala.inline
    def apply(): TreeViewOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TreeViewOverrides]
    }
    
    @scala.inline
    implicit class TreeViewOverridesMutableBuilder[Self <: TreeViewOverrides] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRoot(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any
      ): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
      
      @scala.inline
      def setTreeItem(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{  $isLeafNode :boolean | undefined}> */ js.Any
      ): Self = StObject.set(x, "TreeItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeItemList(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{  $isChildNode :boolean | undefined}> */ js.Any
      ): Self = StObject.set(x, "TreeItemList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeItemListUndefined: Self = StObject.set(x, "TreeItemList", js.undefined)
      
      @scala.inline
      def setTreeItemUndefined: Self = StObject.set(x, "TreeItem", js.undefined)
      
      @scala.inline
      def setTreeLabel(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<TreeLabelProps> */ js.Any
      ): Self = StObject.set(x, "TreeLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeLabelUndefined: Self = StObject.set(x, "TreeLabel", js.undefined)
    }
  }
  
  @js.native
  trait TreeViewProps extends StObject {
    
    var data: js.Array[TreeNode[_]] = js.native
    
    var getId: js.UndefOr[js.Function1[/* node */ TreeNode[_], Double | String]] = js.native
    
    var indentGuides: js.UndefOr[Boolean] = js.native
    
    var onToggle: js.UndefOr[js.Function1[/* node */ TreeNode[_], Unit]] = js.native
    
    var overrides: js.UndefOr[TreeViewOverrides] = js.native
    
    var renderAll: js.UndefOr[Boolean] = js.native
    
    var singleExpanded: js.UndefOr[Boolean] = js.native
  }
  object TreeViewProps {
    
    @scala.inline
    def apply(data: js.Array[TreeNode[_]]): TreeViewProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeViewProps]
    }
    
    @scala.inline
    implicit class TreeViewPropsMutableBuilder[Self <: TreeViewProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Array[TreeNode[_]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataVarargs(value: TreeNode[js.Any]*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setGetId(value: /* node */ TreeNode[_] => Double | String): Self = StObject.set(x, "getId", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetIdUndefined: Self = StObject.set(x, "getId", js.undefined)
      
      @scala.inline
      def setIndentGuides(value: Boolean): Self = StObject.set(x, "indentGuides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndentGuidesUndefined: Self = StObject.set(x, "indentGuides", js.undefined)
      
      @scala.inline
      def setOnToggle(value: /* node */ TreeNode[_] => Unit): Self = StObject.set(x, "onToggle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnToggleUndefined: Self = StObject.set(x, "onToggle", js.undefined)
      
      @scala.inline
      def setOverrides(value: TreeViewOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      @scala.inline
      def setRenderAll(value: Boolean): Self = StObject.set(x, "renderAll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderAllUndefined: Self = StObject.set(x, "renderAll", js.undefined)
      
      @scala.inline
      def setSingleExpanded(value: Boolean): Self = StObject.set(x, "singleExpanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSingleExpandedUndefined: Self = StObject.set(x, "singleExpanded", js.undefined)
    }
  }
  
  type toggleIsExpandedT = js.Function3[
    /* data */ js.Array[TreeNode[js.Any]], 
    /* toggledNode */ TreeNode[js.Any], 
    /* getId */ js.UndefOr[TGetId], 
    js.Array[TreeNode[js.Any]]
  ]
}
