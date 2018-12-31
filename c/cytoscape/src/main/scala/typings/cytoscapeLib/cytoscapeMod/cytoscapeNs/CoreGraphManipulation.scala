package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * These are the principle functions used to interact with the graph model.
  *
  * http://js.cytoscape.org/#core/graph-manipulation
  */
@js.native
trait CoreGraphManipulation extends js.Object {
  /**
    * Get elements in the graph matching the specified selector.
    * http://js.cytoscape.org/#cy.$
    */
  @JSName("$")
  def $(selector: Selector): CollectionReturnValue = js.native
  /**
    * Get an element from its ID in a very performant way.
    * http://js.cytoscape.org/#cy.getElementById
    */
  @JSName("$id")
  def $id(id: java.lang.String): CollectionReturnValue = js.native
  def add(eles: CollectionArgument): CollectionReturnValue = js.native
  /**
    * Add elements to the graph and return them.
    */
  def add(eles: ElementDefinition): CollectionReturnValue = js.native
  def add(eles: js.Array[ElementDefinition]): CollectionReturnValue = js.native
  /**
    * Allow for manipulation of elements without triggering multiple style calculations or multiple redraws.
    * http://js.cytoscape.org/#cy.batch
    *  A callback within which you can make batch updates to elements.
    */
  def batch(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * Get a collection from elements in the graph matching the specified selector or from an array of elements.
    * If no parameter specified, an empty collection will be returned
    */
  def collection(): CollectionReturnValue = js.native
  def collection(eles: Selector): CollectionReturnValue = js.native
  def collection(eles: js.Array[CollectionArgument]): CollectionReturnValue = js.native
  /**
    * A convenience function to explicitly destroy the Core.
    * http://js.cytoscape.org/#cy.destroy
    */
  def destroy(): scala.Unit = js.native
  /**
    * Get edges in the graph matching the specified selector.
    */
  def edges(): EdgeCollection = js.native
  def edges(selector: Selector): EdgeCollection = js.native
  /**
    * Get elements in the graph matching the specified selector.
    * http://js.cytoscape.org/#cy.$
    */
  def elements(): CollectionReturnValue = js.native
  def elements(selector: Selector): CollectionReturnValue = js.native
  /**
    * Allow for manipulation of elements without triggering multiple style calculations or multiple redraws.
    * http://js.cytoscape.org/#cy.batch
    *
    * Ends batching manually (useful for asynchronous cases).
    */
  def endBatch(): scala.Unit = js.native
  /**
    * Get elements in the graph matching the specified selector or filter function.
    */
  def filter(selector: Selector): CollectionReturnValue = js.native
  def filter(
    selector: js.Function3[
      /* ele */ Singular[SingularElementReturnValue, SingularElementArgument], 
      /* i */ scala.Double, 
      /* eles */ CollectionArgument, 
      scala.Boolean
    ]
  ): CollectionReturnValue = js.native
  /**
    * Get an element from its ID in a very performant way.
    * http://js.cytoscape.org/#cy.getElementById
    */
  def getElementById(id: java.lang.String): CollectionReturnValue = js.native
  /**
    * Get nodes in the graph matching the specified selector.
    */
  def nodes(): NodeCollection = js.native
  def nodes(selector: Selector): NodeCollection = js.native
  /**
    * Remove elements in collecion or match the selector from the graph and return them.
    */
  def remove(eles: CollectionArgument): CollectionReturnValue = js.native
  def remove(eles: Selector): CollectionReturnValue = js.native
  /**
    * Allow for manipulation of elements without triggering multiple style calculations or multiple redraws.
    * http://js.cytoscape.org/#cy.batch
    *
    * Starts batching manually (useful for asynchronous cases).
    */
  def startBatch(): scala.Unit = js.native
}

