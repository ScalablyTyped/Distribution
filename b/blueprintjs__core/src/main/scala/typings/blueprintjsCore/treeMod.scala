package typings.blueprintjsCore

import org.scalablytyped.runtime.Instantiable1
import typings.blueprintjsCore.propsMod.IProps
import typings.blueprintjsCore.treeNodeMod.ITreeNode
import typings.react.mod.Component
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/tree/tree", "Tree")
  @js.native
  class Tree[T] protected ()
    extends Component[ITreeProps[T], js.Object, js.Any] {
    def this(props: ITreeProps[T]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ITreeProps[T], context: js.Any) = this()
    
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
  object Tree {
    
    @JSImport("@blueprintjs/core/lib/esm/components/tree/tree", "Tree")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/tree/tree", "Tree.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def nodeFromPath[U](path: js.Array[Double]): ITreeNode[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeFromPath")(path.asInstanceOf[js.Any]).asInstanceOf[ITreeNode[U]]
    @scala.inline
    def nodeFromPath[U](path: js.Array[Double], treeNodes: js.Array[ITreeNode[U]]): ITreeNode[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("nodeFromPath")(path.asInstanceOf[js.Any], treeNodes.asInstanceOf[js.Any])).asInstanceOf[ITreeNode[U]]
    
    @scala.inline
    def ofType[U](): Instantiable1[/* props */ ITreeProps[U], Tree[U]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ofType")().asInstanceOf[Instantiable1[/* props */ ITreeProps[U], Tree[U]]]
  }
  
  trait ITreeProps[T]
    extends StObject
       with IProps {
    
    /**
      * The data specifying the contents and appearance of the tree.
      */
    var contents: js.Array[ITreeNode[T]]
    
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
    
    @scala.inline
    def apply[T](contents: js.Array[ITreeNode[T]]): ITreeProps[T] = {
      val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITreeProps[T]]
    }
    
    @scala.inline
    implicit class ITreePropsMutableBuilder[Self <: ITreeProps[?], T] (val x: Self & ITreeProps[T]) extends AnyVal {
      
      @scala.inline
      def setContents(value: js.Array[ITreeNode[T]]): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentsVarargs(value: ITreeNode[T]*): Self = StObject.set(x, "contents", js.Array(value :_*))
      
      @scala.inline
      def setOnNodeClick(
        value: (/* node */ ITreeNode[T], /* nodePath */ js.Array[Double], /* e */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onNodeClick", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnNodeClickUndefined: Self = StObject.set(x, "onNodeClick", js.undefined)
      
      @scala.inline
      def setOnNodeCollapse(
        value: (/* node */ ITreeNode[T], /* nodePath */ js.Array[Double], /* e */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onNodeCollapse", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnNodeCollapseUndefined: Self = StObject.set(x, "onNodeCollapse", js.undefined)
      
      @scala.inline
      def setOnNodeContextMenu(
        value: (/* node */ ITreeNode[T], /* nodePath */ js.Array[Double], /* e */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onNodeContextMenu", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnNodeContextMenuUndefined: Self = StObject.set(x, "onNodeContextMenu", js.undefined)
      
      @scala.inline
      def setOnNodeDoubleClick(
        value: (/* node */ ITreeNode[T], /* nodePath */ js.Array[Double], /* e */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onNodeDoubleClick", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnNodeDoubleClickUndefined: Self = StObject.set(x, "onNodeDoubleClick", js.undefined)
      
      @scala.inline
      def setOnNodeExpand(
        value: (/* node */ ITreeNode[T], /* nodePath */ js.Array[Double], /* e */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onNodeExpand", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnNodeExpandUndefined: Self = StObject.set(x, "onNodeExpand", js.undefined)
      
      @scala.inline
      def setOnNodeMouseEnter(
        value: (/* node */ ITreeNode[T], /* nodePath */ js.Array[Double], /* e */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onNodeMouseEnter", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnNodeMouseEnterUndefined: Self = StObject.set(x, "onNodeMouseEnter", js.undefined)
      
      @scala.inline
      def setOnNodeMouseLeave(
        value: (/* node */ ITreeNode[T], /* nodePath */ js.Array[Double], /* e */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onNodeMouseLeave", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnNodeMouseLeaveUndefined: Self = StObject.set(x, "onNodeMouseLeave", js.undefined)
    }
  }
  
  type TreeEventHandler[T] = js.Function3[
    /* node */ ITreeNode[T], 
    /* nodePath */ js.Array[Double], 
    /* e */ MouseEvent[HTMLElement, NativeMouseEvent], 
    Unit
  ]
}
