package typings.d3Hierarchy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("d3-hierarchy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cluster[Datum](): ClusterLayout[Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("cluster")().asInstanceOf[ClusterLayout[Datum]]
  
  inline def hierarchy[Datum](data: Datum): HierarchyNode[Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("hierarchy")(data.asInstanceOf[js.Any]).asInstanceOf[HierarchyNode[Datum]]
  inline def hierarchy[Datum](data: Datum, children: js.Function1[/* d */ Datum, js.UndefOr[js.Iterable[Datum] | Null]]): HierarchyNode[Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("hierarchy")(data.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[HierarchyNode[Datum]]
  
  inline def pack[Datum](): PackLayout[Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("pack")().asInstanceOf[PackLayout[Datum]]
  
  inline def packEnclose[Datum /* <: PackCircle */](circles: js.Array[Datum]): PackCircle = ^.asInstanceOf[js.Dynamic].applyDynamic("packEnclose")(circles.asInstanceOf[js.Any]).asInstanceOf[PackCircle]
  
  inline def packSiblings[Datum /* <: PackRadius */](circles: js.Array[Datum]): js.Array[Datum & PackCircle] = ^.asInstanceOf[js.Dynamic].applyDynamic("packSiblings")(circles.asInstanceOf[js.Any]).asInstanceOf[js.Array[Datum & PackCircle]]
  
  inline def partition[Datum](): PartitionLayout[Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("partition")().asInstanceOf[PartitionLayout[Datum]]
  
  inline def stratify[Datum](): StratifyOperator[Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("stratify")().asInstanceOf[StratifyOperator[Datum]]
  
  inline def tree[Datum](): TreeLayout[Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("tree")().asInstanceOf[TreeLayout[Datum]]
  
  inline def treemap[Datum](): TreemapLayout[Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("treemap")().asInstanceOf[TreemapLayout[Datum]]
  
  inline def treemapBinary(node: HierarchyRectangularNode[Any], x0: Double, y0: Double, x1: Double, y1: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("treemapBinary")(node.asInstanceOf[js.Any], x0.asInstanceOf[js.Any], y0.asInstanceOf[js.Any], x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def treemapDice(node: HierarchyRectangularNode[Any], x0: Double, y0: Double, x1: Double, y1: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("treemapDice")(node.asInstanceOf[js.Any], x0.asInstanceOf[js.Any], y0.asInstanceOf[js.Any], x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("d3-hierarchy", "treemapResquarify")
  @js.native
  val treemapResquarify: RatioSquarifyTilingFactory = js.native
  
  inline def treemapSlice(node: HierarchyRectangularNode[Any], x0: Double, y0: Double, x1: Double, y1: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("treemapSlice")(node.asInstanceOf[js.Any], x0.asInstanceOf[js.Any], y0.asInstanceOf[js.Any], x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def treemapSliceDice(node: HierarchyRectangularNode[Any], x0: Double, y0: Double, x1: Double, y1: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("treemapSliceDice")(node.asInstanceOf[js.Any], x0.asInstanceOf[js.Any], y0.asInstanceOf[js.Any], x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("d3-hierarchy", "treemapSquarify")
  @js.native
  val treemapSquarify: RatioSquarifyTilingFactory = js.native
  
  @js.native
  trait ClusterLayout[Datum] extends StObject {
    
    /**
      * Lays out the specified root hierarchy.
      * You may want to call `root.sort` before passing the hierarchy to the cluster layout.
      *
      * @param root The specified root hierarchy.
      */
    def apply(root: HierarchyNode[Datum]): HierarchyPointNode[Datum] = js.native
    
    /**
      * Returns the current node size, which defaults to null. A node size of null indicates that a layout size will be used instead.
      */
    def nodeSize(): (js.Tuple2[Double, Double]) | Null = js.native
    /**
      * Sets this cluster layout’s node size to the specified [width, height] array and returns this cluster layout.
      * When a node size is specified, the root node is always positioned at <0, 0>.
      *
      * @param size The specified two-element size array.
      */
    def nodeSize(size: js.Tuple2[Double, Double]): this.type = js.native
    
    /**
      * Returns the current separation accessor, which defaults to: `(a, b) => a.parent == b.parent ? 1 : 2`.
      */
    def separation(): js.Function2[/* a */ HierarchyPointNode[Datum], /* b */ HierarchyPointNode[Datum], Double] = js.native
    /**
      * Sets the separation accessor to the specified function and returns this cluster layout.
      * The separation accessor is used to separate neighboring leaves.
      *
      * @param separation The separation function is passed two leaves a and b, and must return the desired separation.
      * The nodes are typically siblings, though the nodes may be more distantly related if the layout decides to place such nodes adjacent.
      */
    def separation(
      separation: js.Function2[/* a */ HierarchyPointNode[Datum], /* b */ HierarchyPointNode[Datum], Double]
    ): this.type = js.native
    
    /**
      * Returns the current layout size, which defaults to [1, 1]. A layout size of null indicates that a node size will be used instead.
      */
    def size(): (js.Tuple2[Double, Double]) | Null = js.native
    /**
      * Sets this cluster layout’s size to the specified [width, height] array and returns the cluster layout.
      * The size represent an arbitrary coordinate system; for example, to produce a radial layout,
      * a size of [360, radius] corresponds to a breadth of 360° and a depth of radius.
      *
      * @param size The specified two-element size array.
      */
    def size(size: js.Tuple2[Double, Double]): this.type = js.native
  }
  
  trait HierarchyCircularLink[Datum] extends StObject {
    
    /**
      * The source of the link.
      */
    var source: HierarchyCircularNode[Datum]
    
    /**
      * The target of the link.
      */
    var target: HierarchyCircularNode[Datum]
  }
  object HierarchyCircularLink {
    
    inline def apply[Datum](source: HierarchyCircularNode[Datum], target: HierarchyCircularNode[Datum]): HierarchyCircularLink[Datum] = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[HierarchyCircularLink[Datum]]
    }
    
    extension [Self <: HierarchyCircularLink[?], Datum](x: Self & HierarchyCircularLink[Datum]) {
      
      inline def setSource(value: HierarchyCircularNode[Datum]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: HierarchyCircularNode[Datum]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait HierarchyCircularNode[Datum]
    extends StObject
       with HierarchyNode[Datum] {
    
    /**
      * The radius of the circle.
      */
    var r: Double = js.native
    
    /**
      * The x-coordinate of the circle’s center.
      */
    var x: Double = js.native
    
    /**
      * The y-coordinate of the circle’s center.
      */
    var y: Double = js.native
  }
  
  trait HierarchyLink[Datum] extends StObject {
    
    /**
      * The source of the link.
      */
    var source: HierarchyNode[Datum]
    
    /**
      * The target of the link.
      */
    var target: HierarchyNode[Datum]
  }
  object HierarchyLink {
    
    inline def apply[Datum](source: HierarchyNode[Datum], target: HierarchyNode[Datum]): HierarchyLink[Datum] = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[HierarchyLink[Datum]]
    }
    
    extension [Self <: HierarchyLink[?], Datum](x: Self & HierarchyLink[Datum]) {
      
      inline def setSource(value: HierarchyNode[Datum]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: HierarchyNode[Datum]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait HierarchyNode[Datum] extends StObject {
    
    /**
      * Returns the array of ancestors nodes, starting with this node, then followed by each parent up to the root.
      */
    def ancestors(): js.Array[this.type] = js.native
    
    /**
      * An array of child nodes, if any; undefined for leaf nodes.
      */
    var children: js.UndefOr[js.Array[this.type]] = js.native
    
    /**
      * Return a deep copy of the subtree starting at this node. The returned deep copy shares the same data, however.
      * The returned node is the root of a new tree; the returned node’s parent is always null and its depth is always zero.
      */
    def copy(): this.type = js.native
    
    /**
      * Computes the number of leaves under this node and assigns it to `node.value`, and similarly for every descendant of node.
      * If this node is a leaf, its count is one. Returns this node.
      */
    def count(): this.type = js.native
    
    /**
      * The associated data, as specified to the constructor.
      */
    var data: Datum = js.native
    
    /**
      * Zero for the root node, and increasing by one for each descendant generation.
      */
    val depth: Double = js.native
    
    /**
      * Returns the array of descendant nodes, starting with this node, then followed by each child in topological order.
      */
    def descendants(): js.Array[this.type] = js.native
    
    /**
      * Invokes the specified function for node and each descendant in breadth-first order,
      * such that a given node is only visited if all nodes of lesser depth have already been visited,
      * as well as all preceding nodes of the same depth.
      *
      * @param func The specified function is passed the current descendant, the zero-based traversal index, and this node.
      * @param that If that is specified, it is the this context of the callback.
      */
    def each[T](
      func: js.ThisFunction3[/* this */ T, /* node */ this.type, /* index */ Double, /* thisNode */ this.type, Unit]
    ): this.type = js.native
    def each[T](
      func: js.ThisFunction3[/* this */ T, /* node */ this.type, /* index */ Double, /* thisNode */ this.type, Unit],
      that: T
    ): this.type = js.native
    
    /**
      * Invokes the specified function for node and each descendant in post-order traversal,
      * such that a given node is only visited after all of its descendants have already been visited.
      *
      * @param func The specified function is passed the current descendant, the zero-based traversal index, and this node.
      * @param that If that is specified, it is the this context of the callback.
      *
      */
    def eachAfter[T](
      func: js.ThisFunction3[/* this */ T, /* node */ this.type, /* index */ Double, /* thisNode */ this.type, Unit]
    ): this.type = js.native
    def eachAfter[T](
      func: js.ThisFunction3[/* this */ T, /* node */ this.type, /* index */ Double, /* thisNode */ this.type, Unit],
      that: T
    ): this.type = js.native
    
    /**
      * Invokes the specified function for node and each descendant in pre-order traversal,
      * such that a given node is only visited after all of its ancestors have already been visited.
      *
      * @param func The specified function is passed the current descendant, the zero-based traversal index, and this node.
      * @param that If that is specified, it is the this context of the callback.
      */
    def eachBefore[T](
      func: js.ThisFunction3[/* this */ T, /* node */ this.type, /* index */ Double, /* thisNode */ this.type, Unit]
    ): this.type = js.native
    def eachBefore[T](
      func: js.ThisFunction3[/* this */ T, /* node */ this.type, /* index */ Double, /* thisNode */ this.type, Unit],
      that: T
    ): this.type = js.native
    
    /**
      * Returns the first node in the hierarchy from this node for which the specified filter returns a truthy value. undefined if no such node is found.
      * @param filter Filter.
      */
    def find(filter: js.Function1[/* node */ this.type, Boolean]): js.UndefOr[this.type] = js.native
    
    /**
      * Zero for leaf nodes, and the greatest distance from any descendant leaf for internal nodes.
      */
    val height: Double = js.native
    
    /**
      * Optional node id string set by `StratifyOperator`, if hierarchical data was created from tabular data using stratify().
      */
    val id: js.UndefOr[String] = js.native
    
    /**
      * Returns an iterator over the node’s descendants in breadth-first order.
      */
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[js.Iterator[this.type]] = js.native
    
    /**
      * Returns the array of leaf nodes in traversal order; leaves are nodes with no children.
      */
    def leaves(): js.Array[this.type] = js.native
    
    /**
      * Returns an array of links for this node, where each link is an object that defines source and target properties.
      * The source of each link is the parent node, and the target is a child node.
      */
    def links(): js.Array[HierarchyLink[Datum]] = js.native
    
    /**
      * The parent node, or null for the root node.
      */
    var parent: this.type | Null = js.native
    
    /**
      * Returns the shortest path through the hierarchy from this node to the specified target node.
      * The path starts at this node, ascends to the least common ancestor of this node and the target node, and then descends to the target node.
      *
      * @param target The target node.
      */
    def path(target: this.type): js.Array[this.type] = js.native
    
    /**
      * Sorts the children of this node, if any, and each of this node’s descendants’ children,
      * in pre-order traversal using the specified compare function, and returns this node.
      *
      * @param compare The compare function is passed two nodes a and b to compare.
      * If a should be before b, the function must return a value less than zero;
      * if b should be before a, the function must return a value greater than zero;
      * otherwise, the relative order of a and b are not specified. See `array.sort` for more.
      */
    def sort(compare: js.Function2[/* a */ this.type, /* b */ this.type, Double]): this.type = js.native
    
    /**
      * Evaluates the specified value function for this node and each descendant in post-order traversal, and returns this node.
      * The `node.value` property of each node is set to the numeric value returned by the specified function plus the combined value of all descendants.
      *
      * @param value The value function is passed the node’s data, and must return a non-negative number.
      */
    def sum(value: js.Function1[/* d */ Datum, Double]): this.type = js.native
    
    /**
      * Aggregated numeric value as calculated by `sum(value)` or `count()`, if previously invoked.
      */
    val value: js.UndefOr[Double] = js.native
  }
  
  trait HierarchyPointLink[Datum] extends StObject {
    
    /**
      * The source of the link.
      */
    var source: HierarchyPointNode[Datum]
    
    /**
      * The target of the link.
      */
    var target: HierarchyPointNode[Datum]
  }
  object HierarchyPointLink {
    
    inline def apply[Datum](source: HierarchyPointNode[Datum], target: HierarchyPointNode[Datum]): HierarchyPointLink[Datum] = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[HierarchyPointLink[Datum]]
    }
    
    extension [Self <: HierarchyPointLink[?], Datum](x: Self & HierarchyPointLink[Datum]) {
      
      inline def setSource(value: HierarchyPointNode[Datum]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: HierarchyPointNode[Datum]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait HierarchyPointNode[Datum]
    extends StObject
       with HierarchyNode[Datum] {
    
    /**
      * The x-coordinate of the node.
      */
    var x: Double = js.native
    
    /**
      * The y-coordinate of the node.
      */
    var y: Double = js.native
  }
  
  trait HierarchyRectangularLink[Datum] extends StObject {
    
    /**
      * The source of the link.
      */
    var source: HierarchyRectangularNode[Datum]
    
    /**
      * The target of the link.
      */
    var target: HierarchyRectangularNode[Datum]
  }
  object HierarchyRectangularLink {
    
    inline def apply[Datum](source: HierarchyRectangularNode[Datum], target: HierarchyRectangularNode[Datum]): HierarchyRectangularLink[Datum] = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[HierarchyRectangularLink[Datum]]
    }
    
    extension [Self <: HierarchyRectangularLink[?], Datum](x: Self & HierarchyRectangularLink[Datum]) {
      
      inline def setSource(value: HierarchyRectangularNode[Datum]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: HierarchyRectangularNode[Datum]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait HierarchyRectangularNode[Datum]
    extends StObject
       with HierarchyNode[Datum] {
    
    /**
      * The left edge of the rectangle.
      */
    var x0: Double = js.native
    
    /**
      * The right edge of the rectangle.
      */
    var x1: Double = js.native
    
    /**
      * The top edge of the rectangle
      */
    var y0: Double = js.native
    
    /**
      * The bottom edge of the rectangle.
      */
    var y1: Double = js.native
  }
  
  trait PackCircle extends StObject {
    
    /**
      * The radius of the circle.
      */
    var r: Double
    
    /**
      * The x-coordinate of the circle’s center.
      */
    var x: Double
    
    /**
      * The y-coordinate of the circle’s center.
      */
    var y: Double
  }
  object PackCircle {
    
    inline def apply(r: Double, x: Double, y: Double): PackCircle = {
      val __obj = js.Dynamic.literal(r = r.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[PackCircle]
    }
    
    extension [Self <: PackCircle](x: Self) {
      
      inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PackLayout[Datum] extends StObject {
    
    /**
      * Lays out the specified root hierarchy.
      * You must call `root.sum` before passing the hierarchy to the pack layout.
      * You probably also want to call `root.sort` to order the hierarchy before computing the layout.
      *
      * @param root The specified root hierarchy.
      */
    def apply(root: HierarchyNode[Datum]): HierarchyCircularNode[Datum] = js.native
    
    /**
      * Returns the current padding accessor, which defaults to the constant zero.
      */
    def padding(): js.Function1[/* node */ HierarchyCircularNode[Datum], Double] = js.native
    /**
      * Sets this pack layout’s padding accessor to the specified function and returns this pack layout.
      * Returns the current padding accessor, which defaults to the constant zero.
      *
      * When siblings are packed, tangent siblings will be separated by approximately the specified padding;
      * the enclosing parent circle will also be separated from its children by approximately the specified padding.
      * If an explicit radius is not specified, the padding is approximate because a two-pass algorithm
      * is needed to fit within the layout size: the circles are first packed without padding;
      * a scaling factor is computed and applied to the specified padding; and lastly the circles are re-packed with padding.
      *
      * @param padding The specified padding function.
      */
    def padding(padding: js.Function1[/* node */ HierarchyCircularNode[Datum], Double]): this.type = js.native
    /**
      * Sets this pack layout’s padding accessor to the specified number and returns this pack layout.
      * Returns the current padding accessor, which defaults to the constant zero.
      *
      * When siblings are packed, tangent siblings will be separated by approximately the specified padding;
      * the enclosing parent circle will also be separated from its children by approximately the specified padding.
      * If an explicit radius is not specified, the padding is approximate because a two-pass algorithm
      * is needed to fit within the layout size: the circles are first packed without padding;
      * a scaling factor is computed and applied to the specified padding; and lastly the circles are re-packed with padding.
      *
      * @param padding The specified padding value.
      */
    def padding(padding: Double): this.type = js.native
    
    /**
      * Sets the pack layout’s radius accessor to the specified function and returns this pack layout.
      * If the radius accessor is null, the radius of each leaf circle is derived from the leaf `node.value` (computed by `node.sum`);
      * the radii are then scaled proportionally to fit the layout size.
      * If the radius accessor is not null, the radius of each leaf circle is specified exactly by the function.
      *
      * @param radius The specified radius accessor.
      */
    def radius(): this.type = js.native
    def radius(radius: js.Function1[/* node */ HierarchyCircularNode[Datum], Double]): this.type = js.native
    /**
      * Returns the current radius accessor, which defaults to null.
      */
    @JSName("radius")
    def radius_Union(): Null | (js.Function1[/* node */ HierarchyCircularNode[Datum], Double]) = js.native
    
    /**
      * Returns the current size, which defaults to [1, 1].
      */
    def size(): js.Tuple2[Double, Double] = js.native
    /**
      * Sets this pack layout’s size to the specified [width, height] array and returns this pack layout.
      *
      * @param size The specified two-element size array.
      */
    def size(size: js.Tuple2[Double, Double]): this.type = js.native
  }
  
  trait PackRadius extends StObject {
    
    /**
      * The radius of the circle.
      */
    var r: Double
    
    /**
      * The x-coordinate of the circle’s center.
      */
    var x: js.UndefOr[Double] = js.undefined
    
    /**
      * The y-coordinate of the circle’s center.
      */
    var y: js.UndefOr[Double] = js.undefined
  }
  object PackRadius {
    
    inline def apply(r: Double): PackRadius = {
      val __obj = js.Dynamic.literal(r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[PackRadius]
    }
    
    extension [Self <: PackRadius](x: Self) {
      
      inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  @js.native
  trait PartitionLayout[Datum] extends StObject {
    
    /**
      * Lays out the specified root hierarchy.
      * You must call `root.sum` before passing the hierarchy to the partition layout.
      * You probably also want to call `root.sort` to order the hierarchy before computing the layout.
      *
      * @param root The specified root hierarchy.
      */
    def apply(root: HierarchyNode[Datum]): HierarchyRectangularNode[Datum] = js.native
    
    /**
      * Returns the current padding, which defaults to zero.
      */
    def padding(): Double = js.native
    /**
      * Sets the padding to the specified number and returns this partition layout.
      * The padding is used to separate a node’s adjacent children.
      *
      * @param padding The specified padding value.
      */
    def padding(padding: Double): this.type = js.native
    
    /**
      * Returns the current rounding state, which defaults to false.
      */
    def round(): Boolean = js.native
    /**
      * Enables or disables rounding according to the given boolean and returns this partition layout.
      *
      * @param round The specified boolean flag.
      */
    def round(round: Boolean): this.type = js.native
    
    /**
      * Returns the current size, which defaults to [1, 1].
      */
    def size(): js.Tuple2[Double, Double] = js.native
    /**
      * Sets this partition layout’s size to the specified [width, height] array and returns this partition layout.
      *
      * @param size The specified two-element size array.
      */
    def size(size: js.Tuple2[Double, Double]): this.type = js.native
  }
  
  @js.native
  trait RatioSquarifyTilingFactory extends StObject {
    
    def apply(node: HierarchyRectangularNode[Any], x0: Double, y0: Double, x1: Double, y1: Double): Unit = js.native
    
    /**
      * Specifies the desired aspect ratio of the generated rectangles.
      * Note that the orientation of the generated rectangles (tall or wide) is not implied by the ratio.
      * Furthermore, the rectangles ratio are not guaranteed to have the exact specified aspect ratio.
      * If not specified, the aspect ratio defaults to the golden ratio, φ = (1 + sqrt(5)) / 2, per Kong et al.
      *
      * @param ratio The specified ratio value greater than or equal to one.
      */
    def ratio(ratio: Double): RatioSquarifyTilingFactory = js.native
  }
  
  @js.native
  trait StratifyOperator[Datum] extends StObject {
    
    /**
      * Generates a new hierarchy from the specified tabular data. Each node in the returned object has a shallow copy of the properties
      * from the corresponding data object, excluding the following reserved properties: id, parentId, children.
      *
      * @param data The root specified data.
      * @throws Error on missing id, ambiguous id, cycle, multiple roots or no root.
      */
    def apply(data: js.Array[Datum]): HierarchyNode[Datum] = js.native
    
    /**
      * Returns the current id accessor, which defaults to: `(d) => d.id`.
      */
    def id(): js.Function3[
        /* d */ Datum, 
        /* i */ Double, 
        /* data */ js.Array[Datum], 
        js.UndefOr[String | Null | ""]
      ] = js.native
    /**
      * Sets the id accessor to the given function.
      * The id accessor is invoked for each element in the input data passed to the stratify operator.
      * The returned string is then used to identify the node's relationships in conjunction with the parent id.
      * For leaf nodes, the id may be undefined, null or the empty string; otherwise, the id must be unique.
      *
      * @param id The id accessor.
      */
    @JSName("id")
    @scala.annotation.targetName("id_")
    def id(
      id: js.Function3[
          /* d */ Datum, 
          /* i */ Double, 
          /* data */ js.Array[Datum], 
          js.UndefOr[String | Null | ""]
        ]
    ): this.type = js.native
    
    /**
      * Returns the current parent id accessor, which defaults to: `(d) => d.parentId`.
      */
    def parentId(): js.Function3[
        /* d */ Datum, 
        /* i */ Double, 
        /* data */ js.Array[Datum], 
        js.UndefOr[String | Null | ""]
      ] = js.native
    /**
      * Sets the parent id accessor to the given function.
      * The parent id accessor is invoked for each element in the input data passed to the stratify operator.
      * The returned string is then used to identify the node's relationships in conjunction with the id.
      * For the root node, the parent id should be undefined, null or the empty string.
      * There must be exactly one root node in the input data, and no circular relationships.
      *
      * @param parentId The parent id accessor.
      */
    @JSName("parentId")
    @scala.annotation.targetName("parentId_")
    def parentId(
      parentId: js.Function3[
          /* d */ Datum, 
          /* i */ Double, 
          /* data */ js.Array[Datum], 
          js.UndefOr[String | Null | ""]
        ]
    ): this.type = js.native
    
    /**
      * If path is specified, sets the path accessor to the given function and returns this stratify operator.
      * Otherwise, returns the current path accessor, which defaults to undefined.
      * If a path accessor is set, the id and parentId arguments are ignored,
      * and a unix-like hierarchy is computed on the slash-delimited strings
      * returned by the path accessor, imputing parent nodes and ids as necessary.
      *
      * @param path The path accessor.
      */
    def path(): this.type = js.native
    def path(path: js.Function3[/* d */ Datum, /* i */ Double, /* data */ js.Array[Datum], String]): this.type = js.native
    /**
      * Returns the current path accessor, which defaults to undefined.
      */
    @JSName("path")
    def path_Union(): js.UndefOr[
        (js.Function3[/* d */ Datum, /* i */ Double, /* data */ js.Array[Datum], String]) | Null
      ] = js.native
  }
  
  @js.native
  trait TreeLayout[Datum] extends StObject {
    
    /**
      * Lays out the specified root hierarchy.
      * You may want to call `root.sort` before passing the hierarchy to the tree layout.
      *
      * @param root The specified root hierarchy.
      */
    def apply(root: HierarchyNode[Datum]): HierarchyPointNode[Datum] = js.native
    
    /**
      * Returns the current node size, which defaults to null. A node size of null indicates that a layout size will be used instead.
      */
    def nodeSize(): (js.Tuple2[Double, Double]) | Null = js.native
    /**
      * Sets this tree layout’s node size to the specified [width, height] array and returns this tree layout.
      * When a node size is specified, the root node is always positioned at <0, 0>.
      *
      * @param size The specified two-element size array.
      */
    def nodeSize(size: js.Tuple2[Double, Double]): this.type = js.native
    
    /**
      * Returns the current separation accessor, which defaults to: `(a, b) => a.parent == b.parent ? 1 : 2`.
      */
    def separation(): js.Function2[/* a */ HierarchyPointNode[Datum], /* b */ HierarchyPointNode[Datum], Double] = js.native
    /**
      * Sets the separation accessor to the specified function and returns this tree layout.
      * The separation accessor is used to separate neighboring nodes.
      *
      * @param separation The separation function is passed two nodes a and b, and must return the desired separation.
      * The nodes are typically siblings, though the nodes may be more distantly related if the layout decides to place such nodes adjacent.
      */
    def separation(
      separation: js.Function2[/* a */ HierarchyPointNode[Datum], /* b */ HierarchyPointNode[Datum], Double]
    ): this.type = js.native
    
    /**
      * Returns the current layout size, which defaults to [1, 1]. A layout size of null indicates that a node size will be used instead.
      */
    def size(): (js.Tuple2[Double, Double]) | Null = js.native
    /**
      * Sets this tree layout’s size to the specified [width, height] array and returns the tree layout.
      * The size represent an arbitrary coordinate system; for example, to produce a radial layout,
      * a size of [360, radius] corresponds to a breadth of 360° and a depth of radius.
      *
      * @param size The specified two-element size array.
      */
    def size(size: js.Tuple2[Double, Double]): this.type = js.native
  }
  
  @js.native
  trait TreemapLayout[Datum] extends StObject {
    
    /**
      * Lays out the specified root hierarchy.
      * You must call `root.sum` before passing the hierarchy to the treemap layout.
      * You probably also want to call `root.sort` to order the hierarchy before computing the layout.
      *
      * @param root The specified root hierarchy.
      */
    def apply(root: HierarchyNode[Datum]): HierarchyRectangularNode[Datum] = js.native
    
    /**
      * Returns the current inner padding function.
      */
    def padding(): js.Function1[/* node */ HierarchyRectangularNode[Datum], Double] = js.native
    /**
      * Sets the inner and outer padding to the specified function and returns this treemap layout.
      *
      * @param padding The specified padding function.
      */
    def padding(padding: js.Function1[/* node */ HierarchyRectangularNode[Datum], Double]): this.type = js.native
    /**
      * Sets the inner and outer padding to the specified number and returns this treemap layout.
      *
      * @param padding The specified padding value.
      */
    def padding(padding: Double): this.type = js.native
    
    /**
      * Returns the current bottom padding function, which defaults to the constant zero.
      */
    def paddingBottom(): js.Function1[/* node */ HierarchyRectangularNode[Datum], Double] = js.native
    /**
      * Sets the bottom padding to the specified function and returns this treemap layout.
      * The function is invoked for each node with children, being passed the current node.
      * The bottom padding is used to separate the bottom edge of a node from its children.
      *
      * @param padding The specified bottom padding function.
      */
    def paddingBottom(padding: js.Function1[/* node */ HierarchyRectangularNode[Datum], Double]): this.type = js.native
    /**
      * Sets the bottom padding to the specified number and returns this treemap layout.
      * The bottom padding is used to separate the bottom edge of a node from its children.
      *
      * @param padding The specified bottom padding value.
      */
    def paddingBottom(padding: Double): this.type = js.native
    
    /**
      * Returns the current inner padding function, which defaults to the constant zero.
      */
    def paddingInner(): js.Function1[/* node */ HierarchyRectangularNode[Datum], Double] = js.native
    /**
      * Sets the inner padding to the specified function and returns this treemap layout.
      * The function is invoked for each node with children, being passed the current node.
      * The inner padding is used to separate a node’s adjacent children.
      *
      * @param padding The specified inner padding function.
      */
    def paddingInner(padding: js.Function1[/* node */ HierarchyRectangularNode[Datum], Double]): this.type = js.native
    /**
      * Sets the inner padding to the specified number and returns this treemap layout.
      * The inner padding is used to separate a node’s adjacent children.
      *
      * @param padding The specified inner padding value.
      */
    def paddingInner(padding: Double): this.type = js.native
    
    /**
      * Returns the current left padding function, which defaults to the constant zero.
      */
    def paddingLeft(): js.Function1[/* node */ HierarchyRectangularNode[Datum], Double] = js.native
    /**
      * Sets the left padding to the specified function and returns this treemap layout.
      * The function is invoked for each node with children, being passed the current node.
      * The left padding is used to separate the left edge of a node from its children.
      *
      * @param padding The specified left padding function.
      */
    def paddingLeft(padding: js.Function1[/* node */ HierarchyRectangularNode[Datum], Double]): this.type = js.native
    /**
      * Sets the left padding to the specified number and returns this treemap layout.
      * The left padding is used to separate the left edge of a node from its children.
      *
      * @param padding The specified left padding value.
      */
    def paddingLeft(padding: Double): this.type = js.native
    
    /**
      * Returns the current top padding function.
      */
    def paddingOuter(): js.Function1[/* node */ HierarchyRectangularNode[Datum], Double] = js.native
    /**
      * Sets the top, right, bottom and left padding to the specified function and returns this treemap layout.
      *
      * @param padding The specified padding outer function.
      */
    def paddingOuter(padding: js.Function1[/* node */ HierarchyRectangularNode[Datum], Double]): this.type = js.native
    /**
      * Sets the top, right, bottom and left padding to the specified function and returns this treemap layout.
      *
      * @param padding The specified padding outer value.
      */
    def paddingOuter(padding: Double): this.type = js.native
    
    /**
      * Returns the current right padding function, which defaults to the constant zero.
      */
    def paddingRight(): js.Function1[/* node */ HierarchyRectangularNode[Datum], Double] = js.native
    /**
      * Sets the right padding to the specified function and returns this treemap layout.
      * The function is invoked for each node with children, being passed the current node.
      * The right padding is used to separate the right edge of a node from its children.
      *
      * @param padding The specified right padding function.
      */
    def paddingRight(padding: js.Function1[/* node */ HierarchyRectangularNode[Datum], Double]): this.type = js.native
    /**
      * Sets the right padding to the specified number and returns this treemap layout.
      * The right padding is used to separate the right edge of a node from its children.
      *
      * @param padding The specified right padding value.
      */
    def paddingRight(padding: Double): this.type = js.native
    
    /**
      * Returns the current top padding function, which defaults to the constant zero.
      */
    def paddingTop(): js.Function1[/* node */ HierarchyRectangularNode[Datum], Double] = js.native
    /**
      * Sets the top padding to the specified function and returns this treemap layout.
      * The function is invoked for each node with children, being passed the current node.
      * The top padding is used to separate the top edge of a node from its children.
      *
      * @param padding The specified top padding function.
      */
    def paddingTop(padding: js.Function1[/* node */ HierarchyRectangularNode[Datum], Double]): this.type = js.native
    /**
      * Sets the top padding to the specified number and returns this treemap layout.
      * The top padding is used to separate the top edge of a node from its children.
      *
      * @param padding The specified top padding value.
      */
    def paddingTop(padding: Double): this.type = js.native
    
    /**
      * Returns the current rounding state, which defaults to false.
      */
    def round(): Boolean = js.native
    /**
      * Enables or disables rounding according to the given boolean and returns this treemap layout.
      *
      * @param round The specified boolean flag.
      */
    def round(round: Boolean): this.type = js.native
    
    /**
      * Returns the current size, which defaults to [1, 1].
      */
    def size(): js.Tuple2[Double, Double] = js.native
    /**
      * Sets this treemap layout’s size to the specified [width, height] array and returns this treemap layout.
      *
      * @param size The specified two-element size array.
      */
    def size(size: js.Tuple2[Double, Double]): this.type = js.native
    
    /**
      * Returns the current tiling method, which defaults to `d3.treemapSquarify` with the golden ratio.
      */
    def tile(): js.Function5[
        /* node */ HierarchyRectangularNode[Datum], 
        /* x0 */ Double, 
        /* y0 */ Double, 
        /* x1 */ Double, 
        /* y1 */ Double, 
        Unit
      ] = js.native
    /**
      * Sets the tiling method to the specified function and returns this treemap layout.
      *
      * @param tile The specified tiling function.
      */
    def tile(
      tile: js.Function5[
          /* node */ HierarchyRectangularNode[Datum], 
          /* x0 */ Double, 
          /* y0 */ Double, 
          /* x1 */ Double, 
          /* y1 */ Double, 
          Unit
        ]
    ): this.type = js.native
  }
}
