package typings.d3Hierarchy.mod

import typings.std.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HierarchyNode[Datum] extends js.Object {
  
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
  var iterator: js.Function0[Iterator[this.type, _, js.UndefOr[scala.Nothing]]] = js.native
  
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
