package typings.baseui

import org.scalablytyped.runtime.StringDictionary
import typings.baseui.helpersOverridesMod.Override
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import typings.std.HTMLLIElement
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeViewTypesMod {
  
  trait SharedStyleProps extends StObject {
    
    @JSName("$hasChildren")
    var $hasChildren: Boolean
    
    @JSName("$isExpanded")
    var $isExpanded: Boolean
    
    @JSName("$isFocusVisible")
    var $isFocusVisible: Boolean
    
    @JSName("$isSelected")
    var $isSelected: Boolean
  }
  object SharedStyleProps {
    
    inline def apply($hasChildren: Boolean, $isExpanded: Boolean, $isFocusVisible: Boolean, $isSelected: Boolean): SharedStyleProps = {
      val __obj = js.Dynamic.literal($hasChildren = $hasChildren.asInstanceOf[js.Any], $isExpanded = $isExpanded.asInstanceOf[js.Any], $isFocusVisible = $isFocusVisible.asInstanceOf[js.Any], $isSelected = $isSelected.asInstanceOf[js.Any])
      __obj.asInstanceOf[SharedStyleProps]
    }
    
    extension [Self <: SharedStyleProps](x: Self) {
      
      inline def set$hasChildren(value: Boolean): Self = StObject.set(x, "$hasChildren", value.asInstanceOf[js.Any])
      
      inline def set$isExpanded(value: Boolean): Self = StObject.set(x, "$isExpanded", value.asInstanceOf[js.Any])
      
      inline def set$isFocusVisible(value: Boolean): Self = StObject.set(x, "$isFocusVisible", value.asInstanceOf[js.Any])
      
      inline def set$isSelected(value: Boolean): Self = StObject.set(x, "$isSelected", value.asInstanceOf[js.Any])
    }
  }
  
  trait StatefulContainerProps
    extends StObject
       with TreeViewProps {
    
    def children(props: TreeViewProps): ReactNode
  }
  object StatefulContainerProps {
    
    inline def apply(children: TreeViewProps => ReactNode, data: js.Array[TreeNodeData[Any]]): StatefulContainerProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatefulContainerProps]
    }
    
    extension [Self <: StatefulContainerProps](x: Self) {
      
      inline def setChildren(value: TreeViewProps => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    }
  }
  
  trait TreeLabelOverrides extends StObject {
    
    var CollapseIcon: js.UndefOr[Override[Any]] = js.undefined
    
    var ExpandIcon: js.UndefOr[Override[Any]] = js.undefined
    
    var IconContainer: js.UndefOr[Override[Any]] = js.undefined
    
    var LeafIcon: js.UndefOr[Override[Any]] = js.undefined
    
    var LeafIconContainer: js.UndefOr[Override[Any]] = js.undefined
    
    var TreeItemContent: js.UndefOr[Override[Any]] = js.undefined
  }
  object TreeLabelOverrides {
    
    inline def apply(): TreeLabelOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TreeLabelOverrides]
    }
    
    extension [Self <: TreeLabelOverrides](x: Self) {
      
      inline def setCollapseIcon(value: Override[Any]): Self = StObject.set(x, "CollapseIcon", value.asInstanceOf[js.Any])
      
      inline def setCollapseIconUndefined: Self = StObject.set(x, "CollapseIcon", js.undefined)
      
      inline def setExpandIcon(value: Override[Any]): Self = StObject.set(x, "ExpandIcon", value.asInstanceOf[js.Any])
      
      inline def setExpandIconUndefined: Self = StObject.set(x, "ExpandIcon", js.undefined)
      
      inline def setIconContainer(value: Override[Any]): Self = StObject.set(x, "IconContainer", value.asInstanceOf[js.Any])
      
      inline def setIconContainerUndefined: Self = StObject.set(x, "IconContainer", js.undefined)
      
      inline def setLeafIcon(value: Override[Any]): Self = StObject.set(x, "LeafIcon", value.asInstanceOf[js.Any])
      
      inline def setLeafIconContainer(value: Override[Any]): Self = StObject.set(x, "LeafIconContainer", value.asInstanceOf[js.Any])
      
      inline def setLeafIconContainerUndefined: Self = StObject.set(x, "LeafIconContainer", js.undefined)
      
      inline def setLeafIconUndefined: Self = StObject.set(x, "LeafIcon", js.undefined)
      
      inline def setTreeItemContent(value: Override[Any]): Self = StObject.set(x, "TreeItemContent", value.asInstanceOf[js.Any])
      
      inline def setTreeItemContentUndefined: Self = StObject.set(x, "TreeItemContent", js.undefined)
    }
  }
  
  trait TreeLabelProps extends StObject {
    
    var hasChildren: Boolean
    
    var isExpanded: js.UndefOr[Boolean] = js.undefined
    
    var isFocusVisible: js.UndefOr[Boolean] = js.undefined
    
    var isSelected: js.UndefOr[Boolean] = js.undefined
    
    var label: (js.Function1[/* node */ TreeNodeData[Any], ReactNode]) | String
    
    var node: TreeNodeData[Any]
    
    var overrides: js.UndefOr[TreeLabelOverrides] = js.undefined
  }
  object TreeLabelProps {
    
    inline def apply(
      hasChildren: Boolean,
      label: (js.Function1[/* node */ TreeNodeData[Any], ReactNode]) | String,
      node: TreeNodeData[Any]
    ): TreeLabelProps = {
      val __obj = js.Dynamic.literal(hasChildren = hasChildren.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeLabelProps]
    }
    
    extension [Self <: TreeLabelProps](x: Self) {
      
      inline def setHasChildren(value: Boolean): Self = StObject.set(x, "hasChildren", value.asInstanceOf[js.Any])
      
      inline def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
      
      inline def setIsExpandedUndefined: Self = StObject.set(x, "isExpanded", js.undefined)
      
      inline def setIsFocusVisible(value: Boolean): Self = StObject.set(x, "isFocusVisible", value.asInstanceOf[js.Any])
      
      inline def setIsFocusVisibleUndefined: Self = StObject.set(x, "isFocusVisible", js.undefined)
      
      inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      inline def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
      
      inline def setLabel(value: (js.Function1[/* node */ TreeNodeData[Any], ReactNode]) | String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelFunction1(value: /* node */ TreeNodeData[Any] => ReactNode): Self = StObject.set(x, "label", js.Any.fromFunction1(value))
      
      inline def setNode(value: TreeNodeData[Any]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setOverrides(value: TreeLabelOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    }
  }
  
  trait TreeNodeData[T]
    extends StObject
       with /* x */ StringDictionary[Any] {
    
    var children: js.UndefOr[js.Array[TreeNodeData[Any]]] = js.undefined
    
    var id: js.UndefOr[TreeNodeId] = js.undefined
    
    var info: js.UndefOr[T] = js.undefined
    
    var isExpanded: js.UndefOr[Boolean] = js.undefined
    
    var label: (js.Function1[/* node */ TreeNodeData[Any], ReactNode]) | String
  }
  object TreeNodeData {
    
    inline def apply[T](label: (js.Function1[/* node */ TreeNodeData[Any], ReactNode]) | String): TreeNodeData[T] = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeNodeData[T]]
    }
    
    extension [Self <: TreeNodeData[?], T](x: Self & TreeNodeData[T]) {
      
      inline def setChildren(value: js.Array[TreeNodeData[Any]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: TreeNodeData[Any]*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setId(value: TreeNodeId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInfo(value: T): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      inline def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
      
      inline def setIsExpandedUndefined: Self = StObject.set(x, "isExpanded", js.undefined)
      
      inline def setLabel(value: (js.Function1[/* node */ TreeNodeData[Any], ReactNode]) | String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelFunction1(value: /* node */ TreeNodeData[Any] => ReactNode): Self = StObject.set(x, "label", js.Any.fromFunction1(value))
    }
  }
  
  type TreeNodeId = Double | String
  
  trait TreeNodeProps extends StObject {
    
    def addRef(id: TreeNodeId, ref: Ref[HTMLLIElement]): Any
    
    def getId(node: TreeNodeData[Any]): TreeNodeId
    
    var indentGuides: js.UndefOr[Boolean] = js.undefined
    
    var isFocusVisible: js.UndefOr[Boolean] = js.undefined
    
    var node: TreeNodeData[Any]
    
    var onBlur: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Element, Event], Any]] = js.undefined
    
    var onFocus: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Element, Event], Any]] = js.undefined
    
    var onKeyDown: js.UndefOr[js.Function2[/* e */ KeyboardEvent, /* node */ TreeNodeData[Any], Any]] = js.undefined
    
    var onToggle: js.UndefOr[js.Function1[/* node */ TreeNodeData[Any], Unit]] = js.undefined
    
    var overrides: js.UndefOr[TreeViewOverrides] = js.undefined
    
    def removeRef(id: TreeNodeId): Any
    
    var renderAll: js.UndefOr[Boolean] = js.undefined
    
    var selectedNodeId: js.UndefOr[TreeNodeId] = js.undefined
  }
  object TreeNodeProps {
    
    inline def apply(
      addRef: (TreeNodeId, Ref[HTMLLIElement]) => Any,
      getId: TreeNodeData[Any] => TreeNodeId,
      node: TreeNodeData[Any],
      removeRef: TreeNodeId => Any
    ): TreeNodeProps = {
      val __obj = js.Dynamic.literal(addRef = js.Any.fromFunction2(addRef), getId = js.Any.fromFunction1(getId), node = node.asInstanceOf[js.Any], removeRef = js.Any.fromFunction1(removeRef))
      __obj.asInstanceOf[TreeNodeProps]
    }
    
    extension [Self <: TreeNodeProps](x: Self) {
      
      inline def setAddRef(value: (TreeNodeId, Ref[HTMLLIElement]) => Any): Self = StObject.set(x, "addRef", js.Any.fromFunction2(value))
      
      inline def setGetId(value: TreeNodeData[Any] => TreeNodeId): Self = StObject.set(x, "getId", js.Any.fromFunction1(value))
      
      inline def setIndentGuides(value: Boolean): Self = StObject.set(x, "indentGuides", value.asInstanceOf[js.Any])
      
      inline def setIndentGuidesUndefined: Self = StObject.set(x, "indentGuides", js.undefined)
      
      inline def setIsFocusVisible(value: Boolean): Self = StObject.set(x, "isFocusVisible", value.asInstanceOf[js.Any])
      
      inline def setIsFocusVisibleUndefined: Self = StObject.set(x, "isFocusVisible", js.undefined)
      
      inline def setNode(value: TreeNodeData[Any]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setOnBlur(value: /* event */ SyntheticEvent[Element, Event] => Any): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnFocus(value: /* event */ SyntheticEvent[Element, Event] => Any): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnKeyDown(value: (/* e */ KeyboardEvent, /* node */ TreeNodeData[Any]) => Any): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction2(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnToggle(value: /* node */ TreeNodeData[Any] => Unit): Self = StObject.set(x, "onToggle", js.Any.fromFunction1(value))
      
      inline def setOnToggleUndefined: Self = StObject.set(x, "onToggle", js.undefined)
      
      inline def setOverrides(value: TreeViewOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setRemoveRef(value: TreeNodeId => Any): Self = StObject.set(x, "removeRef", js.Any.fromFunction1(value))
      
      inline def setRenderAll(value: Boolean): Self = StObject.set(x, "renderAll", value.asInstanceOf[js.Any])
      
      inline def setRenderAllUndefined: Self = StObject.set(x, "renderAll", js.undefined)
      
      inline def setSelectedNodeId(value: TreeNodeId): Self = StObject.set(x, "selectedNodeId", value.asInstanceOf[js.Any])
      
      inline def setSelectedNodeIdUndefined: Self = StObject.set(x, "selectedNodeId", js.undefined)
    }
  }
  
  trait TreeViewOverrides
    extends StObject
       with TreeLabelOverrides {
    
    var Root: js.UndefOr[Override[Any]] = js.undefined
    
    var TreeItem: js.UndefOr[Override[Any]] = js.undefined
    
    var TreeItemList: js.UndefOr[Override[Any]] = js.undefined
    
    var TreeLabel: js.UndefOr[Override[Any]] = js.undefined
  }
  object TreeViewOverrides {
    
    inline def apply(): TreeViewOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TreeViewOverrides]
    }
    
    extension [Self <: TreeViewOverrides](x: Self) {
      
      inline def setRoot(value: Override[Any]): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
      
      inline def setTreeItem(value: Override[Any]): Self = StObject.set(x, "TreeItem", value.asInstanceOf[js.Any])
      
      inline def setTreeItemList(value: Override[Any]): Self = StObject.set(x, "TreeItemList", value.asInstanceOf[js.Any])
      
      inline def setTreeItemListUndefined: Self = StObject.set(x, "TreeItemList", js.undefined)
      
      inline def setTreeItemUndefined: Self = StObject.set(x, "TreeItem", js.undefined)
      
      inline def setTreeLabel(value: Override[Any]): Self = StObject.set(x, "TreeLabel", value.asInstanceOf[js.Any])
      
      inline def setTreeLabelUndefined: Self = StObject.set(x, "TreeLabel", js.undefined)
    }
  }
  
  trait TreeViewProps extends StObject {
    
    var data: js.Array[TreeNodeData[Any]]
    
    var getId: js.UndefOr[js.Function1[/* node */ TreeNodeData[Any], TreeNodeId]] = js.undefined
    
    var indentGuides: js.UndefOr[Boolean] = js.undefined
    
    var onToggle: js.UndefOr[js.Function1[/* node */ TreeNodeData[Any], Unit]] = js.undefined
    
    var overrides: js.UndefOr[TreeViewOverrides] = js.undefined
    
    var renderAll: js.UndefOr[Boolean] = js.undefined
    
    var singleExpanded: js.UndefOr[Boolean] = js.undefined
  }
  object TreeViewProps {
    
    inline def apply(data: js.Array[TreeNodeData[Any]]): TreeViewProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeViewProps]
    }
    
    extension [Self <: TreeViewProps](x: Self) {
      
      inline def setData(value: js.Array[TreeNodeData[Any]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: TreeNodeData[Any]*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setGetId(value: /* node */ TreeNodeData[Any] => TreeNodeId): Self = StObject.set(x, "getId", js.Any.fromFunction1(value))
      
      inline def setGetIdUndefined: Self = StObject.set(x, "getId", js.undefined)
      
      inline def setIndentGuides(value: Boolean): Self = StObject.set(x, "indentGuides", value.asInstanceOf[js.Any])
      
      inline def setIndentGuidesUndefined: Self = StObject.set(x, "indentGuides", js.undefined)
      
      inline def setOnToggle(value: /* node */ TreeNodeData[Any] => Unit): Self = StObject.set(x, "onToggle", js.Any.fromFunction1(value))
      
      inline def setOnToggleUndefined: Self = StObject.set(x, "onToggle", js.undefined)
      
      inline def setOverrides(value: TreeViewOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setRenderAll(value: Boolean): Self = StObject.set(x, "renderAll", value.asInstanceOf[js.Any])
      
      inline def setRenderAllUndefined: Self = StObject.set(x, "renderAll", js.undefined)
      
      inline def setSingleExpanded(value: Boolean): Self = StObject.set(x, "singleExpanded", value.asInstanceOf[js.Any])
      
      inline def setSingleExpandedUndefined: Self = StObject.set(x, "singleExpanded", js.undefined)
    }
  }
}
