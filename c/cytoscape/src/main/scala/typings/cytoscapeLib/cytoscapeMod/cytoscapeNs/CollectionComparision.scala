package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * http://js.cytoscape.org/#collection/comparison
     */
@js.native
trait CollectionComparision extends js.Object {
  /**
           * Determine whether all elements in the collection match a selector.
           * @param selector The selector to match against.
           */
  def allAre(selector: Selector): scala.Boolean = js.native
  /**
           * Determine whether all elements in the specified collection are in the neighbourhood of the calling collection.
           *
           * @param eles The other elements to compare to.
           */
  def allAreNeighbors(eles: CollectionArgument): scala.Boolean = js.native
  /**
           * Determine whether all elements in the specified collection are in the neighbourhood of the calling collection.
           *
           * @param eles The other elements to compare to.
           */
  def allAreNeighbours(eles: CollectionArgument): scala.Boolean = js.native
  /**
           * Determine whether this collection contains any of the same elements as another collection.
           *
           * @param eles The other elements to compare to.
           */
  def anySame(eles: CollectionArgument): scala.Boolean = js.native
  /**
           * Determine whether this collection contains all of the elements of another collection.
           */
  def contains(eles: CollectionArgument): scala.Boolean = js.native
  /**
           * Determine whether all elements in this collection satisfy the specified test function.
           *
           * @param test The test function that returns truthy values for elements that satisfy the test and falsey values for elements that do not satisfy the test.
           * ele - The current element.
           * i - The index of the current element.
           * eles - The collection of elements being tested.
           * @param thisArg [optional] The value for this within the test function.
           */
  def every(
    test: js.Function3[
      /* ele */ CollectionArgument, 
      /* i */ scala.Double, 
      /* eles */ CollectionArgument, 
      scala.Boolean
    ]
  ): scala.Boolean = js.native
  /**
           * Determine whether all elements in this collection satisfy the specified test function.
           *
           * @param test The test function that returns truthy values for elements that satisfy the test and falsey values for elements that do not satisfy the test.
           * ele - The current element.
           * i - The index of the current element.
           * eles - The collection of elements being tested.
           * @param thisArg [optional] The value for this within the test function.
           */
  def every(
    test: js.Function3[
      /* ele */ CollectionArgument, 
      /* i */ scala.Double, 
      /* eles */ CollectionArgument, 
      scala.Boolean
    ],
    thisArg: js.Any
  ): scala.Boolean = js.native
  /**
           * Determine whether this collection contains all of the elements of another collection.
           */
  def has(eles: CollectionArgument): scala.Boolean = js.native
  /**
           * Determine whether any element in this collection matches a selector.
           *
           * @param selector The selector to match against.
           */
  def is(selector: Selector): scala.Boolean = js.native
  // http://js.cytoscape.org/#collection/comparison
  /**
           * Determine whether this collection contains exactly the same elements as another collection.
           *
           * @param eles The other elements to compare to.
           */
  def same(eles: CollectionArgument): scala.Boolean = js.native
  /**
           * Determine whether any element in this collection satisfies the specified test function.
           *
           * @param test The test function that returns truthy values for elements that satisfy the test and falsey values for elements that do not satisfy the test.
           * ele - The current element.
           * i - The index of the current element.
           * eles - The collection of elements being tested.
           * @param thisArg [optional] The value for this within the test function.
           */
  def some(
    test: js.Function3[
      /* ele */ CollectionArgument, 
      /* i */ scala.Double, 
      /* eles */ CollectionArgument, 
      scala.Boolean
    ]
  ): scala.Boolean = js.native
  /**
           * Determine whether any element in this collection satisfies the specified test function.
           *
           * @param test The test function that returns truthy values for elements that satisfy the test and falsey values for elements that do not satisfy the test.
           * ele - The current element.
           * i - The index of the current element.
           * eles - The collection of elements being tested.
           * @param thisArg [optional] The value for this within the test function.
           */
  def some(
    test: js.Function3[
      /* ele */ CollectionArgument, 
      /* i */ scala.Double, 
      /* eles */ CollectionArgument, 
      scala.Boolean
    ],
    thisArg: js.Any
  ): scala.Boolean = js.native
}

