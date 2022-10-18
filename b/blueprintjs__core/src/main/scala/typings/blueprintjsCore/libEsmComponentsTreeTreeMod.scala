package typings.blueprintjsCore

import org.scalablytyped.runtime.Instantiable1
import typings.blueprintjsCore.libEsmCommonPropsMod.IProps
import typings.blueprintjsCore.libEsmComponentsTreeTreeNodeMod.TreeNodeInfo
import typings.react.mod.Component
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmComponentsTreeTreeMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/tree/tree", "Tree")
  @js.native
  open class Tree[T] protected ()
    extends Component[TreeProps[T], js.Object, Any] {
    def this(props: TreeProps[T]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TreeProps[T], context: Any) = this()
    
    /**
      * Returns the underlying HTML element of the `Tree` node with an id of `nodeId`.
      * This element does not contain the children of the node, only its label and controls.
      * If the node is not currently mounted, `undefined` is returned.
      */
    def getNodeContentElement(nodeId: String): js.UndefOr[HTMLElement] = js.native
    def getNodeContentElement(nodeId: Double): js.UndefOr[HTMLElement] = js.native
    
    /* private */ var handleContentRef: Any = js.native
    
    /* private */ var handleNodeClick: Any = js.native
    
    /* private */ var handleNodeCollapse: Any = js.native
    
    /* private */ var handleNodeContextMenu: Any = js.native
    
    /* private */ var handleNodeDoubleClick: Any = js.native
    
    /* private */ var handleNodeExpand: Any = js.native
    
    /* private */ var handleNodeMouseEnter: Any = js.native
    
    /* private */ var handleNodeMouseLeave: Any = js.native
    
    /* private */ var handlerHelper: Any = js.native
    
    /* private */ var nodeRefs: Any = js.native
    
    /* private */ var renderNodes: Any = js.native
  }
  /* static members */
  object Tree {
    
    @JSImport("@blueprintjs/core/lib/esm/components/tree/tree", "Tree")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/tree/tree", "Tree.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    inline def nodeFromPath[U](path: js.Array[Double]): TreeNodeInfo[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeFromPath")(path.asInstanceOf[js.Any]).asInstanceOf[TreeNodeInfo[U]]
    inline def nodeFromPath[U](path: js.Array[Double], treeNodes: js.Array[TreeNodeInfo[U]]): TreeNodeInfo[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("nodeFromPath")(path.asInstanceOf[js.Any], treeNodes.asInstanceOf[js.Any])).asInstanceOf[TreeNodeInfo[U]]
    
    inline def ofType[U](): Instantiable1[/* props */ TreeProps[U], Tree[U]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ofType")().asInstanceOf[Instantiable1[/* props */ TreeProps[U], Tree[U]]]
  }
  
  trait ITreeProps[T]
    extends StObject
       with IProps {
    
    /**
      * The data specifying the contents and appearance of the tree.
      */
    var contents: js.Array[TreeNodeInfo[T]]
    
    /**
      * Invoked when a node is clicked anywhere other than the caret for expanding/collapsing the node.
      */
    var onNodeClick: js.UndefOr[TreeEventHandler[T]] = js.undefined
    
    /**
      * Invoked when caret of an expanded node is clicked.
      */
    var onNodeCollapse: js.UndefOr[TreeEventHandler[T]] = js.undefined
    
    /**
      * Invoked when a node is right-clicked or the context menu button is pressed on a focused node.
      */
    var onNodeContextMenu: js.UndefOr[TreeEventHandler[T]] = js.undefined
    
    /**
      * Invoked when a node is double-clicked. Be careful when using this in combination with
      * an `onNodeClick` (single-click) handler, as the way this behaves can vary between browsers.
      * See http://stackoverflow.com/q/5497073/3124288
      */
    var onNodeDoubleClick: js.UndefOr[TreeEventHandler[T]] = js.undefined
    
    /**
      * Invoked when the caret of a collapsed node is clicked.
      */
    var onNodeExpand: js.UndefOr[TreeEventHandler[T]] = js.undefined
    
    /**
      * Invoked when the mouse is moved over a node.
      */
    var onNodeMouseEnter: js.UndefOr[TreeEventHandler[T]] = js.undefined
    
    /**
      * Invoked when the mouse is moved out of a node.
      */
    var onNodeMouseLeave: js.UndefOr[TreeEventHandler[T]] = js.undefined
  }
  object ITreeProps {
    
    inline def apply[T](contents: js.Array[TreeNodeInfo[T]]): ITreeProps[T] = {
      val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITreeProps[T]]
    }
    
    extension [Self <: ITreeProps[?], T](x: Self & ITreeProps[T]) {
      
      inline def setContents(value: js.Array[TreeNodeInfo[T]]): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
      
      inline def setContentsVarargs(value: TreeNodeInfo[T]*): Self = StObject.set(x, "contents", js.Array(value*))
      
      inline def setOnNodeClick(
        value: (/* node */ TreeNodeInfo[T], /* nodePath */ js.Array[Double], /* e */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onNodeClick", js.Any.fromFunction3(value))
      
      inline def setOnNodeClickUndefined: Self = StObject.set(x, "onNodeClick", js.undefined)
      
      inline def setOnNodeCollapse(
        value: (/* node */ TreeNodeInfo[T], /* nodePath */ js.Array[Double], /* e */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onNodeCollapse", js.Any.fromFunction3(value))
      
      inline def setOnNodeCollapseUndefined: Self = StObject.set(x, "onNodeCollapse", js.undefined)
      
      inline def setOnNodeContextMenu(
        value: (/* node */ TreeNodeInfo[T], /* nodePath */ js.Array[Double], /* e */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onNodeContextMenu", js.Any.fromFunction3(value))
      
      inline def setOnNodeContextMenuUndefined: Self = StObject.set(x, "onNodeContextMenu", js.undefined)
      
      inline def setOnNodeDoubleClick(
        value: (/* node */ TreeNodeInfo[T], /* nodePath */ js.Array[Double], /* e */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onNodeDoubleClick", js.Any.fromFunction3(value))
      
      inline def setOnNodeDoubleClickUndefined: Self = StObject.set(x, "onNodeDoubleClick", js.undefined)
      
      inline def setOnNodeExpand(
        value: (/* node */ TreeNodeInfo[T], /* nodePath */ js.Array[Double], /* e */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onNodeExpand", js.Any.fromFunction3(value))
      
      inline def setOnNodeExpandUndefined: Self = StObject.set(x, "onNodeExpand", js.undefined)
      
      inline def setOnNodeMouseEnter(
        value: (/* node */ TreeNodeInfo[T], /* nodePath */ js.Array[Double], /* e */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onNodeMouseEnter", js.Any.fromFunction3(value))
      
      inline def setOnNodeMouseEnterUndefined: Self = StObject.set(x, "onNodeMouseEnter", js.undefined)
      
      inline def setOnNodeMouseLeave(
        value: (/* node */ TreeNodeInfo[T], /* nodePath */ js.Array[Double], /* e */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onNodeMouseLeave", js.Any.fromFunction3(value))
      
      inline def setOnNodeMouseLeaveUndefined: Self = StObject.set(x, "onNodeMouseLeave", js.undefined)
    }
  }
  
  type TreeEventHandler[T] = js.Function3[
    /* node */ TreeNodeInfo[T], 
    /* nodePath */ js.Array[Double], 
    /* e */ MouseEvent[HTMLElement, NativeMouseEvent], 
    Unit
  ]
  
  type TreeProps[T] = ITreeProps[T]
}
