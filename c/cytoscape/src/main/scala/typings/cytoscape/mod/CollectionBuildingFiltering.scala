package typings.cytoscape.mod

import typings.cytoscape.anon.Both
import typings.cytoscape.anon.Ele
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#collection/building--filtering
  */
@js.native
trait CollectionBuildingFiltering[TIn, TOut] extends StObject {
  
  def apply(eles: CollectionArgument): CollectionReturnValue = js.native
  def apply(eles: Selector): CollectionReturnValue = js.native
  
  /**
    * Get an element in the collection from its ID in a very performant way.
    * @param id The ID of the element to get.
    */
  @JSName("$id")
  def $id(id: String): TOut = js.native
  
  @JSName("&")
  def Ampersand(eles: CollectionArgument): CollectionReturnValue = js.native
  @JSName("&")
  def Ampersand(eles: Selector): CollectionReturnValue = js.native
  @JSName("&")
  var Ampersand_Original: CollectionBuildingIntersectionFunc = js.native
  
  @JSName("\\")
  def Backslash(eles: CollectionArgument): CollectionReturnValue = js.native
  @JSName("\\")
  def Backslash(eles: Selector): CollectionReturnValue = js.native
  @JSName("\\")
  var Backslash_Original: CollectionBuildingDifferenceFunc = js.native
  
  @JSName(".")
  def Dot(eles: CollectionArgument): CollectionReturnValue = js.native
  @JSName(".")
  def Dot(eles: Selector): CollectionReturnValue = js.native
  @JSName(".")
  var Dot_Original: CollectionBuildingIntersectionFunc = js.native
  
  @JSName("!")
  def Exclamationmark(eles: CollectionArgument): CollectionReturnValue = js.native
  @JSName("!")
  def Exclamationmark(eles: Selector): CollectionReturnValue = js.native
  @JSName("!")
  var Exclamationmark_Original: CollectionBuildingDifferenceFunc = js.native
  
  @JSName("(-)")
  def `Leftparenthesis-Rightparenthesis`(eles: CollectionArgument): CollectionReturnValue = js.native
  @JSName("(-)")
  def `Leftparenthesis-Rightparenthesis`(eles: Selector): CollectionReturnValue = js.native
  @JSName("(-)")
  var `Leftparenthesis-Rightparenthesis_Original`: CollectionSymmetricDifferenceFunc = js.native
  
  @JSName("(+)")
  def LeftparenthesisPlussignRightparenthesis(eles: CollectionArgument): CollectionReturnValue = js.native
  @JSName("(+)")
  def LeftparenthesisPlussignRightparenthesis(eles: Selector): CollectionReturnValue = js.native
  @JSName("(+)")
  var LeftparenthesisPlussignRightparenthesis_Original: CollectionSymmetricDifferenceFunc = js.native
  
  @JSName("+")
  def Plussign(eles: js.Array[CollectionArgument]): CollectionReturnValue = js.native
  @JSName("+")
  def Plussign(eles: CollectionArgument): CollectionReturnValue = js.native
  @JSName("+")
  def Plussign(eles: Selector): CollectionReturnValue = js.native
  @JSName("+")
  var Plussign_Original: CollectionBuildingUnionFunc = js.native
  
  @JSName("|")
  def Verticalline(eles: js.Array[CollectionArgument]): CollectionReturnValue = js.native
  @JSName("|")
  def Verticalline(eles: CollectionArgument): CollectionReturnValue = js.native
  @JSName("|")
  def Verticalline(eles: Selector): CollectionReturnValue = js.native
  @JSName("|")
  var Verticalline_Original: CollectionBuildingUnionFunc = js.native
  
  @JSName("-")
  def _dash(eles: CollectionArgument): CollectionReturnValue = js.native
  @JSName("-")
  def _dash(eles: Selector): CollectionReturnValue = js.native
  @JSName("-")
  var _dash_Original: CollectionBuildingDifferenceFunc = js.native
  
  def abscomp(): CollectionReturnValue = js.native
  
  /**
    * Get all elements in the graph that are not in the calling collection.
    * http://js.cytoscape.org/#eles.absoluteComplement
    */
  def absoluteComplement(): CollectionReturnValue = js.native
  
  def add(eles: js.Array[CollectionArgument]): CollectionReturnValue = js.native
  def add(eles: CollectionArgument): CollectionReturnValue = js.native
  def add(eles: Selector): CollectionReturnValue = js.native
  @JSName("add")
  var add_Original: CollectionBuildingUnionFunc = js.native
  
  def and(eles: CollectionArgument): CollectionReturnValue = js.native
  def and(eles: Selector): CollectionReturnValue = js.native
  @JSName("and")
  var and_Original: CollectionBuildingIntersectionFunc = js.native
  
  def complement(): CollectionReturnValue = js.native
  
  def diff(selector: CollectionArgument): Both = js.native
  /**
    * Perform a traditional left/right diff on the two collections.
    *
    * @param selector
    *    A selector representing the elements on the right side of the diff. All elements in the graph matching the selector are used as the passed collection.
    *    The elements on the right side of the diff.
    * @return This function returns a plain object of the form { left, right, both } where
    * left - is the set of elements only in the calling (i.e. left) collection,
    * right - is the set of elements only in the passed (i.e. right) collection, and
    * both - is the set of elements in both collections.
    * http://js.cytoscape.org/#eles.diff
    */
  def diff(selector: Selector): Both = js.native
  
  /**
    * Get a new collection, resulting from the collection without some specified elements.
    * http://js.cytoscape.org/#eles.difference
    */
  def difference(eles: CollectionArgument): CollectionReturnValue = js.native
  def difference(eles: Selector): CollectionReturnValue = js.native
  /**
    * Get a new collection, resulting from the collection without some specified elements.
    * http://js.cytoscape.org/#eles.difference
    */
  @JSName("difference")
  var difference_Original: CollectionBuildingDifferenceFunc = js.native
  
  /**
    * Get the edges that match the specified selector.
    *
    * @param selector The selector to match against.
    * http://js.cytoscape.org/#eles.filter
    */
  def edges(): EdgeCollection = js.native
  def edges(selector: Selector): EdgeCollection = js.native
  
  def filter(selector: js.Function3[/* ele */ TIn, /* i */ Double, /* eles */ CollectionArgument, Boolean]): CollectionReturnValue = js.native
  /**
    * Get a new collection containing elements that are accepted by the specified filter.
    *
    * @param selector The selector to match against.
    * @param filter selector The filter function that returns true for elements to include.
    * i - The index of the current element being considered.
    * ele - The element being considered.
    * http://js.cytoscape.org/#eles.filter
    */
  def filter(selector: Selector): CollectionReturnValue = js.native
  
  /**
    * Get an element in the collection from its ID in a very performant way.
    * @param id The ID of the element to get.
    */
  def getElementById(id: String): TOut = js.native
  
  def intersect(eles: CollectionArgument): CollectionReturnValue = js.native
  def intersect(eles: Selector): CollectionReturnValue = js.native
  @JSName("intersect")
  var intersect_Original: CollectionBuildingIntersectionFunc = js.native
  
  /**
    * Get the elements in both this collection and another specified collection.
    * http://js.cytoscape.org/#eles.intersection
    */
  def intersection(eles: CollectionArgument): CollectionReturnValue = js.native
  def intersection(eles: Selector): CollectionReturnValue = js.native
  /**
    * Get the elements in both this collection and another specified collection.
    * http://js.cytoscape.org/#eles.intersection
    */
  @JSName("intersection")
  var intersection_Original: CollectionBuildingIntersectionFunc = js.native
  
  /**
    * Get an array containing values mapped from the collection.
    *
    * @param fn The function that returns the mapped value for each element.
    * ele - The current element.
    * i - The index of the current element.
    * eles - The collection of elements being mapped.
    * @param thisArg [optional] The value for this within the iterating function.
    *
    * http://js.cytoscape.org/#eles.map
    */
  def map[T](fn: js.Function3[/* ele */ TIn, /* i */ Double, /* eles */ CollectionArgument, T]): js.Array[T] = js.native
  def map[T](fn: js.Function3[/* ele */ TIn, /* i */ Double, /* eles */ CollectionArgument, T], thisArg: Any): js.Array[T] = js.native
  
  /**
    * Find a maximum value and the corresponding element.
    *
    * @param fn The function that returns the value to compare for each element.
    * ele - The current element.
    * i - The index of the current element.
    * eles - The collection of elements being mapped.
    * @param thisArg [optional] The value for this within the iterating function.
    *
    * http://js.cytoscape.org/#eles.max
    */
  def max[T](fn: js.Function3[/* ele */ TIn, /* i */ Double, /* eles */ CollectionArgument, T]): Ele[T] = js.native
  def max[T](fn: js.Function3[/* ele */ TIn, /* i */ Double, /* eles */ CollectionArgument, T], thisArg: Any): Ele[T] = js.native
  
  /**
    * Perform a in-place merge of the given elements into the calling collection.
    * @param eles The elements to merge in-place or a selector representing the elements to merge.
    * All elements in the graph matching the selector are used as the passed collection.
    *
    * This function modifies the calling collection instead of returning a new one.
    * Use of this function should be considered for performance in some cases, but otherwise should be avoided. Consider using eles.union() instead.
    * Use this function only on new collections that you create yourself, using cy.collection().
    * This ensures that you do not unintentionally modify another collection.
    *
    * Examples
    * With a collection:
    * @example
    * var col = cy.collection(); // new, empty collection
    * var j = cy.$('#j');
    * var e = cy.$('#e');
    * col.merge( j ).merge( e );
    *
    * With a selector:
    * @example
    * var col = cy.collection(); // new, empty collection
    * col.merge('#j').merge('#e');
    */
  def merge(eles: CollectionArgument): this.type = js.native
  def merge(eles: Selector): this.type = js.native
  
  /**
    * Find a minimum value in a collection.
    *
    * @param fn The function that returns the value to compare for each element.
    * ele - The current element.
    * i - The index of the current element.
    * eles - The collection of elements being mapped.
    * @param thisArg [optional] The value for this within the iterating function.
    *
    * http://js.cytoscape.org/#eles.min
    */
  def min[T](fn: js.Function3[/* ele */ TIn, /* i */ Double, /* eles */ CollectionArgument, T]): Ele[T] = js.native
  def min[T](fn: js.Function3[/* ele */ TIn, /* i */ Double, /* eles */ CollectionArgument, T], thisArg: Any): Ele[T] = js.native
  
  def n(eles: CollectionArgument): CollectionReturnValue = js.native
  def n(eles: Selector): CollectionReturnValue = js.native
  @JSName("n")
  var n_Original: CollectionBuildingIntersectionFunc = js.native
  
  /**
    * Get the nodes that match the specified selector.
    *
    * @param selector The selector to match against.
    * http://js.cytoscape.org/#eles.filter
    */
  def nodes(): NodeCollection = js.native
  def nodes(selector: Selector): NodeCollection = js.native
  
  def not(eles: CollectionArgument): CollectionReturnValue = js.native
  def not(eles: Selector): CollectionReturnValue = js.native
  @JSName("not")
  var not_Original: CollectionBuildingDifferenceFunc = js.native
  
  def or(eles: js.Array[CollectionArgument]): CollectionReturnValue = js.native
  def or(eles: CollectionArgument): CollectionReturnValue = js.native
  def or(eles: Selector): CollectionReturnValue = js.native
  @JSName("or")
  var or_Original: CollectionBuildingUnionFunc = js.native
  
  /**
    * Reduce a single value by applying a
    * function against an accumulator and each value of the collection.
    *
    * @param fn The function that returns the accumulated value
    * given the previous value and the current element.
    * prevVal The value accumulated from previous elements.
    * ele The current element.
    * i The index of the current element.
    * eles The collection of elements being reduced.
    * @param initialValue The initial value for reducing
    * It is used also for type inference of output, but the type can be
    * also stated explicitly as generic
    * http://js.cytoscape.org/#eles.reduce
    */
  def reduce[T](
    fn: js.Function4[/* prevVal */ T, /* ele */ TIn, /* i */ Double, /* eles */ CollectionArgument, T],
    initialValue: T
  ): T = js.native
  
  def relativeComplement(eles: CollectionArgument): CollectionReturnValue = js.native
  def relativeComplement(eles: Selector): CollectionReturnValue = js.native
  @JSName("relativeComplement")
  var relativeComplement_Original: CollectionBuildingDifferenceFunc = js.native
  
  /**
    * Get a new collection containing the elements sorted by the
    * specified comparison function.
    *
    * @param sort The sorting comparison function that returns a negative number
    * for ele1 before ele2, 0 for ele1 same as ele2,
    * or a positive number for ele1 after ele2.
    *
    * http://js.cytoscape.org/#eles.sort
    */
  def sort(sort: js.Function2[/* ele1 */ TIn, /* ele2 */ TIn, Double]): CollectionReturnValue = js.native
  
  def subtract(eles: CollectionArgument): CollectionReturnValue = js.native
  def subtract(eles: Selector): CollectionReturnValue = js.native
  @JSName("subtract")
  var subtract_Original: CollectionBuildingDifferenceFunc = js.native
  
  def symdiff(eles: CollectionArgument): CollectionReturnValue = js.native
  def symdiff(eles: Selector): CollectionReturnValue = js.native
  @JSName("symdiff")
  var symdiff_Original: CollectionSymmetricDifferenceFunc = js.native
  
  /**
    * Get the elements that are in the calling collection
    * or the passed collection but not in both.
    * http://js.cytoscape.org/#eles.symmetricDifference
    */
  def symmetricDifference(eles: CollectionArgument): CollectionReturnValue = js.native
  def symmetricDifference(eles: Selector): CollectionReturnValue = js.native
  /**
    * Get the elements that are in the calling collection
    * or the passed collection but not in both.
    * http://js.cytoscape.org/#eles.symmetricDifference
    */
  @JSName("symmetricDifference")
  var symmetricDifference_Original: CollectionSymmetricDifferenceFunc = js.native
  
  def u(eles: js.Array[CollectionArgument]): CollectionReturnValue = js.native
  def u(eles: CollectionArgument): CollectionReturnValue = js.native
  def u(eles: Selector): CollectionReturnValue = js.native
  @JSName("u")
  var u_Original: CollectionBuildingUnionFunc = js.native
  
  def union(eles: js.Array[CollectionArgument]): CollectionReturnValue = js.native
  /**
    * Get a new collection, resulting from adding the collection with another one
    * http://js.cytoscape.org/#eles.union
    */
  def union(eles: CollectionArgument): CollectionReturnValue = js.native
  def union(eles: Selector): CollectionReturnValue = js.native
  /**
    * Get a new collection, resulting from adding the collection with another one
    * http://js.cytoscape.org/#eles.union
    */
  @JSName("union")
  var union_Original: CollectionBuildingUnionFunc = js.native
  
  /**
    * Perform an in-place operation on the calling collection to remove the given elements.
    * @param eles The elements to remove  in-place or a selector representing the elements to remove .
    * All elements in the graph matching the selector are used as the passed collection.
    *
    * This function modifies the calling collection instead of returning a new one.
    * Use of this function should be considered for performance in some cases, but otherwise should be avoided. Consider using eles.filter() or eles.remove() instead.
    * Use this function only on new collections that you create yourself, using cy.collection().
    * This ensures that you do not unintentionally modify another collection.
    *
    * Examples
    * With a collection:
    * @example
    * var col = cy.collection(); // new, empty collection
    * var e = cy.$('#e');
    * col.merge( cy.nodes() );
    * col.unmerge( e );
    *
    * With a selector:
    * @example
    * var col = cy.collection(); // new, empty collection
    * col.merge( cy.nodes() );
    * col.unmerge('#e');
    */
  def unmerge(eles: CollectionArgument): this.type = js.native
  def unmerge(eles: Selector): this.type = js.native
  
  def xor(eles: CollectionArgument): CollectionReturnValue = js.native
  def xor(eles: Selector): CollectionReturnValue = js.native
  @JSName("xor")
  var xor_Original: CollectionSymmetricDifferenceFunc = js.native
}
