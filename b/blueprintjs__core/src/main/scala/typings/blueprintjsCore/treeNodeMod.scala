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
    
    /* private */ var handleCaretClick: js.Any = js.native
    
    /* private */ var handleClick: js.Any = js.native
    
    /* private */ var handleContentRef: js.Any = js.native
    
    /* private */ var handleContextMenu: js.Any = js.native
    
    /* private */ var handleDoubleClick: js.Any = js.native
    
    /* private */ var handleMouseEnter: js.Any = js.native
    
    /* private */ var handleMouseLeave: js.Any = js.native
    
    /* private */ var maybeRenderCaret: js.Any = js.native
    
    /* private */ var maybeRenderSecondaryLabel: js.Any = js.native
  }
  /* static members */
  object TreeNode {
    
    @JSImport("@blueprintjs/core/lib/esm/components/tree/treeNode", "TreeNode")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/tree/treeNode", "TreeNode.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    inline def ofType[U](): Instantiable1[/* props */ ITreeNodeProps[U], TreeNode[U]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ofType")().asInstanceOf[Instantiable1[/* props */ ITreeNodeProps[U], TreeNode[U]]]
  }
  
  trait ITreeNode[T]
    extends StObject
       with IProps {
    
    /**
      * Child tree nodes of this node.
      */
    var childNodes: js.UndefOr[js.Array[ITreeNode[T]]] = js.undefined
    
    /**
      * Whether this tree node is non-interactive. Enabling this prop will ignore
      * mouse event handlers (in particular click, down, enter, leave).
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the caret to expand/collapse a node should be shown.
      * If not specified, this will be true if the node has children and false otherwise.
      */
    var hasCaret: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The name of a Blueprint icon (or an icon element) to render next to the node's label.
      */
    var icon: js.UndefOr[IconName | MaybeElement] = js.undefined
    
    /**
      * A unique identifier for the node.
      */
    var id: String | Double
    
    /**
      */
    var isExpanded: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether this node is selected.
      * @default false
      */
    var isSelected: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The main label for the node.
      */
    var label: String | Element
    
    /**
      * An optional custom user object to associate with the node.
      * This property can then be used in the `onClick`, `onContextMenu` and `onDoubleClick`
      * event handlers for doing custom logic per node.
      */
    var nodeData: js.UndefOr[T] = js.undefined
    
    /**
      * A secondary label/component that is displayed at the right side of the node.
      */
    var secondaryLabel: js.UndefOr[String | MaybeElement] = js.undefined
  }
  object ITreeNode {
    
    inline def apply[T](id: String | Double, label: String | Element): ITreeNode[T] = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITreeNode[T]]
    }
    
    extension [Self <: ITreeNode[?], T](x: Self & ITreeNode[T]) {
      
      inline def setChildNodes(value: js.Array[ITreeNode[T]]): Self = StObject.set(x, "childNodes", value.asInstanceOf[js.Any])
      
      inline def setChildNodesUndefined: Self = StObject.set(x, "childNodes", js.undefined)
      
      inline def setChildNodesVarargs(value: ITreeNode[T]*): Self = StObject.set(x, "childNodes", js.Array(value :_*))
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setHasCaret(value: Boolean): Self = StObject.set(x, "hasCaret", value.asInstanceOf[js.Any])
      
      inline def setHasCaretUndefined: Self = StObject.set(x, "hasCaret", js.undefined)
      
      inline def setIcon(value: IconName | MaybeElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconNull: Self = StObject.set(x, "icon", null)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
      
      inline def setIsExpandedUndefined: Self = StObject.set(x, "isExpanded", js.undefined)
      
      inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      inline def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
      
      inline def setLabel(value: String | Element): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setNodeData(value: T): Self = StObject.set(x, "nodeData", value.asInstanceOf[js.Any])
      
      inline def setNodeDataUndefined: Self = StObject.set(x, "nodeData", js.undefined)
      
      inline def setSecondaryLabel(value: String | MaybeElement): Self = StObject.set(x, "secondaryLabel", value.asInstanceOf[js.Any])
      
      inline def setSecondaryLabelNull: Self = StObject.set(x, "secondaryLabel", null)
      
      inline def setSecondaryLabelUndefined: Self = StObject.set(x, "secondaryLabel", js.undefined)
    }
  }
  
  trait ITreeNodeProps[T]
    extends StObject
       with ITreeNode[T] {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var contentRef: js.UndefOr[js.Function2[/* node */ TreeNode[T], /* element */ HTMLDivElement | Null, Unit]] = js.undefined
    
    var depth: Double
    
    var key: js.UndefOr[String | Double] = js.undefined
    
    var onClick: js.UndefOr[
        js.Function2[/* node */ TreeNode[T], /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], Unit]
      ] = js.undefined
    
    var onCollapse: js.UndefOr[
        js.Function2[/* node */ TreeNode[T], /* e */ MouseEvent[HTMLSpanElement, NativeMouseEvent], Unit]
      ] = js.undefined
    
    var onContextMenu: js.UndefOr[
        js.Function2[/* node */ TreeNode[T], /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], Unit]
      ] = js.undefined
    
    var onDoubleClick: js.UndefOr[
        js.Function2[/* node */ TreeNode[T], /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], Unit]
      ] = js.undefined
    
    var onExpand: js.UndefOr[
        js.Function2[/* node */ TreeNode[T], /* e */ MouseEvent[HTMLSpanElement, NativeMouseEvent], Unit]
      ] = js.undefined
    
    var onMouseEnter: js.UndefOr[
        js.Function2[/* node */ TreeNode[T], /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], Unit]
      ] = js.undefined
    
    var onMouseLeave: js.UndefOr[
        js.Function2[/* node */ TreeNode[T], /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], Unit]
      ] = js.undefined
    
    var path: js.Array[Double]
  }
  object ITreeNodeProps {
    
    inline def apply[T](depth: Double, id: String | Double, label: String | Element, path: js.Array[Double]): ITreeNodeProps[T] = {
      val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITreeNodeProps[T]]
    }
    
    extension [Self <: ITreeNodeProps[?], T](x: Self & ITreeNodeProps[T]) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setContentRef(value: (/* node */ TreeNode[T], /* element */ HTMLDivElement | Null) => Unit): Self = StObject.set(x, "contentRef", js.Any.fromFunction2(value))
      
      inline def setContentRefUndefined: Self = StObject.set(x, "contentRef", js.undefined)
      
      inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String | Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setOnClick(value: (/* node */ TreeNode[T], /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnCollapse(value: (/* node */ TreeNode[T], /* e */ MouseEvent[HTMLSpanElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onCollapse", js.Any.fromFunction2(value))
      
      inline def setOnCollapseUndefined: Self = StObject.set(x, "onCollapse", js.undefined)
      
      inline def setOnContextMenu(value: (/* node */ TreeNode[T], /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction2(value))
      
      inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      inline def setOnDoubleClick(value: (/* node */ TreeNode[T], /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction2(value))
      
      inline def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
      
      inline def setOnExpand(value: (/* node */ TreeNode[T], /* e */ MouseEvent[HTMLSpanElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onExpand", js.Any.fromFunction2(value))
      
      inline def setOnExpandUndefined: Self = StObject.set(x, "onExpand", js.undefined)
      
      inline def setOnMouseEnter(value: (/* node */ TreeNode[T], /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction2(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: (/* node */ TreeNode[T], /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction2(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setPath(value: js.Array[Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: Double*): Self = StObject.set(x, "path", js.Array(value :_*))
    }
  }
}
