package typings.d3Flextree

import typings.d3Hierarchy.mod.HierarchyNode
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object flextree {
    
    /**
      * Creates a new *layout* with the specified accessors. Any subset of
      * `children`, `nodeSize`, and `spacing` can be specified in the
      * argument object.
      */
    inline def apply[Datum](options: Partial[FlextreeOptions[Datum]]): FlextreeLayout[Datum] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[FlextreeLayout[Datum]]
    
    @JSImport("d3-flextree", "flextree")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Outputs the version of the library.
      */
    @JSImport("d3-flextree", "flextree.version")
    @js.native
    val version: String = js.native
  }
  
  /* Inlined parent d3-flextree.d3-flextree.FlextreeOptionsGetSet<Datum, d3-flextree.d3-flextree.FlextreeLayout<Datum>> */
  @js.native
  trait FlextreeLayout[Datum] extends StObject {
    
    /**
      * Computes the layout of a *hierarchy* and turns every node into a `FlextreeNode<Datum>`.
      * Although the layout is defined in terms of *x* and *y*, these represent an
      * arbitrary coordinate system. For example, you can treat *x* as a radius
      * and *y* as an angle to produce a radial rather than Cartesian layout.
      */
    def apply(tree: HierarchyNode[Datum]): FlextreeNode[Datum] = js.native
    
    def children(): js.Function1[/* data */ HierarchyNode[Datum], js.UndefOr[js.Array[FlextreeNode[Datum]]]] = js.native
    def children(value: js.Function1[/* data */ HierarchyNode[Datum], js.UndefOr[js.Array[FlextreeNode[Datum]]]]): FlextreeLayout[Datum] = js.native
    @JSName("children")
    var children_Original: js.Function0[
        js.Function1[/* data */ HierarchyNode[Datum], js.UndefOr[js.Array[FlextreeNode[Datum]]]]
      ] = js.native
    
    def dump(tree: HierarchyNode[Datum]): String = js.native
    
    /**
      * Creates a new *hierarchy* from the data, using the `children` accessors
      * in effect when called. This is an enhanced version of the
      * [`d3.hierarchy`](https://github.com/d3/d3-hierarchy#hierarchy)
      * function, and produces a tree of instances of a class derived from
      * `d3.hierarchy`.
      */
    def hierarchy(treeData: Datum): FlextreeNode[Datum] = js.native
    def hierarchy(treeData: Datum, children: js.Function1[/* d */ Datum, js.UndefOr[js.Iterable[Datum] | Null]]): FlextreeNode[Datum] = js.native
    
    def nodeSize(): (js.Tuple2[Double, Double]) | (js.Function1[/* node */ HierarchyNode[Datum], js.Tuple2[Double, Double]]) = js.native
    def nodeSize(value: js.Function1[/* node */ HierarchyNode[Datum], js.Tuple2[Double, Double]]): FlextreeLayout[Datum] = js.native
    def nodeSize(value: js.Tuple2[Double, Double]): FlextreeLayout[Datum] = js.native
    @JSName("nodeSize")
    var nodeSize_Original: js.Function0[
        (js.Tuple2[Double, Double]) | (js.Function1[/* node */ HierarchyNode[Datum], js.Tuple2[Double, Double]])
      ] = js.native
    
    def spacing(): Double | (js.Function2[/* node */ HierarchyNode[Datum], /* oNode */ HierarchyNode[Datum], Double]) = js.native
    def spacing(value: js.Function2[/* node */ HierarchyNode[Datum], /* oNode */ HierarchyNode[Datum], Double]): FlextreeLayout[Datum] = js.native
    def spacing(value: Double): FlextreeLayout[Datum] = js.native
    @JSName("spacing")
    var spacing_Original: js.Function0[
        Double | (js.Function2[/* node */ HierarchyNode[Datum], /* oNode */ HierarchyNode[Datum], Double])
      ] = js.native
  }
  
  @js.native
  trait FlextreeNode[Datum]
    extends StObject
       with HierarchyNode[Datum] {
    
    def bottom: Double = js.native
    
    /**
      * The minimum `top` and `left`, and the maximum `bottom` and
      * `right` values for all of the nodes in this subtree
      */
    def extents: NodeExtents = js.native
    
    def firstChild: js.UndefOr[this.type | Null] = js.native
    
    /** Whether this node has any children. */
    def hasChildren: Boolean = js.native
    
    def lastChild: js.UndefOr[this.type | Null] = js.native
    
    def left: Double = js.native
    
    /** Whether this node has no children. */
    def noChildren: Boolean = js.native
    
    def nodeExtents: NodeExtents = js.native
    
    /** All of the nodes in this subtree (same as `descendants()`). */
    def nodes: js.Array[this.type] = js.native
    
    /** Number of children of this node. */
    def numChildren: Double = js.native
    
    def right: Double = js.native
    
    def root: js.UndefOr[this.type | Null] = js.native
    
    /** Size of this node (the values fetched by the `nodeSize` accessor) as a two-element array. */
    def size: js.Tuple2[Double, Double] = js.native
    
    def spacing(oNode: this.type): Double = js.native
    
    def top: Double = js.native
    
    /** The computed *x*-coordinate of the node position. */
    def x: Double = js.native
    
    def xSize: Double = js.native
    
    /** The computed *y*-coordinate of the node position. */
    def y: Double = js.native
    
    def ySize: Double = js.native
  }
  
  trait FlextreeOptions[Datum] extends StObject {
    
    /**
      * The way to access the children of a data node.
      *
      * The default when not specified is:
      * ```javascript
      * data => data.children
      * ```
      * Note that unlike the other accessors, this takes a *data* node
      * as an argument. This is used only in the creation of a hierarchy,
      * prior to computing the layout, by the `layout.hierarchy` method.
      */
    def children(data: HierarchyNode[Datum]): js.UndefOr[js.Array[FlextreeNode[Datum]]]
    
    /**
      * A way to calculate the size of a node.
      * It can be specified as:
      * - a **two-element array** `[xSize, ySize]` which is applied as the fixed size for every node.
      * - a **function** which takes the hierarchy node as an argument, and returns a two-element array.
      *
      * The default when not specified is:
      * ```javascript
      * node => node.data.size
      * ```
      */
    var nodeSize: (js.Tuple2[Double, Double]) | (js.Function1[/* node */ HierarchyNode[Datum], js.Tuple2[Double, Double]])
    
    /**
      * A way to calculate the size of a node.
      * It can be specified as:
      * - a **constant number** which is applied as the fixed spacing between every adjacent node.
      * - a **function** which takes two nodes, and returns the minimum allowable spacing between them.
      *
      * The default when not specified is `0`.
      */
    var spacing: Double | (js.Function2[/* node */ HierarchyNode[Datum], /* oNode */ HierarchyNode[Datum], Double])
  }
  object FlextreeOptions {
    
    inline def apply[Datum](
      children: HierarchyNode[Datum] => js.UndefOr[js.Array[FlextreeNode[Datum]]],
      nodeSize: (js.Tuple2[Double, Double]) | (js.Function1[/* node */ HierarchyNode[Datum], js.Tuple2[Double, Double]]),
      spacing: Double | (js.Function2[/* node */ HierarchyNode[Datum], /* oNode */ HierarchyNode[Datum], Double])
    ): FlextreeOptions[Datum] = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), nodeSize = nodeSize.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any])
      __obj.asInstanceOf[FlextreeOptions[Datum]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FlextreeOptions[?], Datum] (val x: Self & FlextreeOptions[Datum]) extends AnyVal {
      
      inline def setChildren(value: HierarchyNode[Datum] => js.UndefOr[js.Array[FlextreeNode[Datum]]]): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setNodeSize(
        value: (js.Tuple2[Double, Double]) | (js.Function1[/* node */ HierarchyNode[Datum], js.Tuple2[Double, Double]])
      ): Self = StObject.set(x, "nodeSize", value.asInstanceOf[js.Any])
      
      inline def setNodeSizeFunction1(value: /* node */ HierarchyNode[Datum] => js.Tuple2[Double, Double]): Self = StObject.set(x, "nodeSize", js.Any.fromFunction1(value))
      
      inline def setSpacing(
        value: Double | (js.Function2[/* node */ HierarchyNode[Datum], /* oNode */ HierarchyNode[Datum], Double])
      ): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      
      inline def setSpacingFunction2(value: (/* node */ HierarchyNode[Datum], /* oNode */ HierarchyNode[Datum]) => Double): Self = StObject.set(x, "spacing", js.Any.fromFunction2(value))
    }
  }
  
  /* Inlined {[ Property in keyof d3-flextree.d3-flextree.FlextreeOptions<Datum> ]: (): d3-flextree.d3-flextree.FlextreeOptions<Datum>[Property]} & {[ Property in keyof d3-flextree.d3-flextree.FlextreeOptions<Datum> ]: (value : d3-flextree.d3-flextree.FlextreeOptions<Datum>[Property]): TSelf} */
  trait FlextreeOptionsGetSet[Datum, TSelf] extends StObject {
    
    def children(): js.Function1[/* data */ HierarchyNode[Datum], js.UndefOr[js.Array[FlextreeNode[Datum]]]]
    def children(value: js.Function1[/* data */ HierarchyNode[Datum], js.UndefOr[js.Array[FlextreeNode[Datum]]]]): TSelf
    @JSName("children")
    var children_Original: js.Function0[
        js.Function1[/* data */ HierarchyNode[Datum], js.UndefOr[js.Array[FlextreeNode[Datum]]]]
      ]
    
    def nodeSize(): (js.Tuple2[Double, Double]) | (js.Function1[/* node */ HierarchyNode[Datum], js.Tuple2[Double, Double]])
    def nodeSize(value: js.Function1[/* node */ HierarchyNode[Datum], js.Tuple2[Double, Double]]): TSelf
    def nodeSize(value: js.Tuple2[Double, Double]): TSelf
    @JSName("nodeSize")
    var nodeSize_Original: js.Function0[
        (js.Tuple2[Double, Double]) | (js.Function1[/* node */ HierarchyNode[Datum], js.Tuple2[Double, Double]])
      ]
    
    def spacing(): Double | (js.Function2[/* node */ HierarchyNode[Datum], /* oNode */ HierarchyNode[Datum], Double])
    def spacing(value: js.Function2[/* node */ HierarchyNode[Datum], /* oNode */ HierarchyNode[Datum], Double]): TSelf
    def spacing(value: Double): TSelf
    @JSName("spacing")
    var spacing_Original: js.Function0[
        Double | (js.Function2[/* node */ HierarchyNode[Datum], /* oNode */ HierarchyNode[Datum], Double])
      ]
  }
  object FlextreeOptionsGetSet {
    
    inline def apply[Datum, TSelf](
      children: () => js.Function1[/* data */ HierarchyNode[Datum], js.UndefOr[js.Array[FlextreeNode[Datum]]]],
      nodeSize: () => (js.Tuple2[Double, Double]) | (js.Function1[/* node */ HierarchyNode[Datum], js.Tuple2[Double, Double]]),
      spacing: () => Double | (js.Function2[/* node */ HierarchyNode[Datum], /* oNode */ HierarchyNode[Datum], Double])
    ): FlextreeOptionsGetSet[Datum, TSelf] = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction0(children), nodeSize = js.Any.fromFunction0(nodeSize), spacing = js.Any.fromFunction0(spacing))
      __obj.asInstanceOf[FlextreeOptionsGetSet[Datum, TSelf]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FlextreeOptionsGetSet[?, ?], Datum, TSelf] (val x: Self & (FlextreeOptionsGetSet[Datum, TSelf])) extends AnyVal {
      
      inline def setChildren(
        value: () => js.Function1[/* data */ HierarchyNode[Datum], js.UndefOr[js.Array[FlextreeNode[Datum]]]]
      ): Self = StObject.set(x, "children", js.Any.fromFunction0(value))
      
      inline def setNodeSize(
        value: () => (js.Tuple2[Double, Double]) | (js.Function1[/* node */ HierarchyNode[Datum], js.Tuple2[Double, Double]])
      ): Self = StObject.set(x, "nodeSize", js.Any.fromFunction0(value))
      
      inline def setSpacing(
        value: () => Double | (js.Function2[/* node */ HierarchyNode[Datum], /* oNode */ HierarchyNode[Datum], Double])
      ): Self = StObject.set(x, "spacing", js.Any.fromFunction0(value))
    }
  }
  
  trait NodeExtents extends StObject {
    
    var bottom: Double
    
    var left: Double
    
    var right: Double
    
    var top: Double
  }
  object NodeExtents {
    
    inline def apply(bottom: Double, left: Double, right: Double, top: Double): NodeExtents = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeExtents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NodeExtents] (val x: Self) extends AnyVal {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
}
