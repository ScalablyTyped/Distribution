package typings.d3Hierarchy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreemapLayout[Datum] extends js.Object {
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

