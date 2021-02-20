package typings.blueprintjsCore

import org.scalablytyped.runtime.Instantiable1
import typings.blueprintjsCore.propsMod.IProps
import typings.blueprintjsCore.propsMod.MaybeElement
import typings.blueprintjsIcons.iconNameMod.IconName
import typings.react.mod.Component
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import typings.std.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeNodeMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/tree/treeNode", "TreeNode")
  @js.native
  class TreeNode[T] protected ()
    extends Component[ITreeNodeProps[T], js.Object, js.Any] {
    def this(props: ITreeNodeProps[T]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ITreeNodeProps[T], context: js.Any) = this()
    
    var handleCaretClick: js.Any = js.native
    
    var handleClick: js.Any = js.native
    
    var handleContentRef: js.Any = js.native
    
    var handleContextMenu: js.Any = js.native
    
    var handleDoubleClick: js.Any = js.native
    
    var handleMouseEnter: js.Any = js.native
    
    var handleMouseLeave: js.Any = js.native
    
    var maybeRenderCaret: js.Any = js.native
    
    var maybeRenderSecondaryLabel: js.Any = js.native
  }
  /* static members */
  object TreeNode {
    
    @JSImport("@blueprintjs/core/lib/esm/components/tree/treeNode", "TreeNode")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/tree/treeNode", "TreeNode.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/tree/treeNode", "TreeNode.ofType")
    @js.native
    def ofType[U](): Instantiable1[/* props */ ITreeNodeProps[U], TreeNode[U]] = js.native
  }
  
  @js.native
  trait ITreeNode[T] extends IProps {
    
    /**
      * Child tree nodes of this node.
      */
    var childNodes: js.UndefOr[js.Array[ITreeNode[T]]] = js.native
    
    /**
      * Whether this tree node is non-interactive. Enabling this prop will ignore
      * mouse event handlers (in particular click, down, enter, leave).
      */
    var disabled: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether the caret to expand/collapse a node should be shown.
      * If not specified, this will be true if the node has children and false otherwise.
      */
    var hasCaret: js.UndefOr[Boolean] = js.native
    
    /**
      * The name of a Blueprint icon (or an icon element) to render next to the node's label.
      */
    var icon: js.UndefOr[IconName | MaybeElement] = js.native
    
    /**
      * A unique identifier for the node.
      */
    var id: String | Double = js.native
    
    /**
      */
    var isExpanded: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether this node is selected.
      * @default false
      */
    var isSelected: js.UndefOr[Boolean] = js.native
    
    /**
      * The main label for the node.
      */
    var label: String | Element = js.native
    
    /**
      * An optional custom user object to associate with the node.
      * This property can then be used in the `onClick`, `onContextMenu` and `onDoubleClick`
      * event handlers for doing custom logic per node.
      */
    var nodeData: js.UndefOr[T] = js.native
    
    /**
      * A secondary label/component that is displayed at the right side of the node.
      */
    var secondaryLabel: js.UndefOr[String | MaybeElement] = js.native
  }
  object ITreeNode {
    
    @scala.inline
    def apply[T](id: String | Double, label: String | Element): ITreeNode[T] = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITreeNode[T]]
    }
    
    @scala.inline
    implicit class ITreeNodeMutableBuilder[Self <: ITreeNode[_], T] (val x: Self with ITreeNode[T]) extends AnyVal {
      
      @scala.inline
      def setChildNodes(value: js.Array[ITreeNode[T]]): Self = StObject.set(x, "childNodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildNodesUndefined: Self = StObject.set(x, "childNodes", js.undefined)
      
      @scala.inline
      def setChildNodesVarargs(value: ITreeNode[T]*): Self = StObject.set(x, "childNodes", js.Array(value :_*))
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setHasCaret(value: Boolean): Self = StObject.set(x, "hasCaret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasCaretUndefined: Self = StObject.set(x, "hasCaret", js.undefined)
      
      @scala.inline
      def setIcon(value: IconName | MaybeElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconNull: Self = StObject.set(x, "icon", null)
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsExpandedUndefined: Self = StObject.set(x, "isExpanded", js.undefined)
      
      @scala.inline
      def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
      
      @scala.inline
      def setLabel(value: String | Element): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeData(value: T): Self = StObject.set(x, "nodeData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeDataUndefined: Self = StObject.set(x, "nodeData", js.undefined)
      
      @scala.inline
      def setSecondaryLabel(value: String | MaybeElement): Self = StObject.set(x, "secondaryLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondaryLabelNull: Self = StObject.set(x, "secondaryLabel", null)
      
      @scala.inline
      def setSecondaryLabelUndefined: Self = StObject.set(x, "secondaryLabel", js.undefined)
    }
  }
  
  @js.native
  trait ITreeNodeProps[T] extends ITreeNode[T] {
    
    var children: js.UndefOr[ReactNode] = js.native
    
    var contentRef: js.UndefOr[js.Function2[/* node */ TreeNode[T], /* element */ HTMLDivElement | Null, Unit]] = js.native
    
    var depth: Double = js.native
    
    var key: js.UndefOr[String | Double] = js.native
    
    var onClick: js.UndefOr[
        js.Function2[/* node */ TreeNode[T], /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], Unit]
      ] = js.native
    
    var onCollapse: js.UndefOr[
        js.Function2[/* node */ TreeNode[T], /* e */ MouseEvent[HTMLSpanElement, NativeMouseEvent], Unit]
      ] = js.native
    
    var onContextMenu: js.UndefOr[
        js.Function2[/* node */ TreeNode[T], /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], Unit]
      ] = js.native
    
    var onDoubleClick: js.UndefOr[
        js.Function2[/* node */ TreeNode[T], /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], Unit]
      ] = js.native
    
    var onExpand: js.UndefOr[
        js.Function2[/* node */ TreeNode[T], /* e */ MouseEvent[HTMLSpanElement, NativeMouseEvent], Unit]
      ] = js.native
    
    var onMouseEnter: js.UndefOr[
        js.Function2[/* node */ TreeNode[T], /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], Unit]
      ] = js.native
    
    var onMouseLeave: js.UndefOr[
        js.Function2[/* node */ TreeNode[T], /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], Unit]
      ] = js.native
    
    var path: js.Array[Double] = js.native
  }
  object ITreeNodeProps {
    
    @scala.inline
    def apply[T](depth: Double, id: String | Double, label: String | Element, path: js.Array[Double]): ITreeNodeProps[T] = {
      val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITreeNodeProps[T]]
    }
    
    @scala.inline
    implicit class ITreeNodePropsMutableBuilder[Self <: ITreeNodeProps[_], T] (val x: Self with ITreeNodeProps[T]) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setContentRef(value: (/* node */ TreeNode[T], /* element */ HTMLDivElement | Null) => Unit): Self = StObject.set(x, "contentRef", js.Any.fromFunction2(value))
      
      @scala.inline
      def setContentRefUndefined: Self = StObject.set(x, "contentRef", js.undefined)
      
      @scala.inline
      def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String | Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setOnClick(value: (/* node */ TreeNode[T], /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnCollapse(value: (/* node */ TreeNode[T], /* e */ MouseEvent[HTMLSpanElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onCollapse", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnCollapseUndefined: Self = StObject.set(x, "onCollapse", js.undefined)
      
      @scala.inline
      def setOnContextMenu(value: (/* node */ TreeNode[T], /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      @scala.inline
      def setOnDoubleClick(value: (/* node */ TreeNode[T], /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
      
      @scala.inline
      def setOnExpand(value: (/* node */ TreeNode[T], /* e */ MouseEvent[HTMLSpanElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onExpand", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnExpandUndefined: Self = StObject.set(x, "onExpand", js.undefined)
      
      @scala.inline
      def setOnMouseEnter(value: (/* node */ TreeNode[T], /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      @scala.inline
      def setOnMouseLeave(value: (/* node */ TreeNode[T], /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      @scala.inline
      def setPath(value: js.Array[Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathVarargs(value: Double*): Self = StObject.set(x, "path", js.Array(value :_*))
    }
  }
}
