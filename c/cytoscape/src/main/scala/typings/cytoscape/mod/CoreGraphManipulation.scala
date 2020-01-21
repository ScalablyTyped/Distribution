package typings.cytoscape.mod

import typings.std.Element
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
  def $id(id: String): CollectionReturnValue = js.native
  def add(eles: js.Array[ElementDefinition]): CollectionReturnValue = js.native
  def add(eles: CollectionArgument): CollectionReturnValue = js.native
  /**
    * Add elements to the graph and return them.
    */
  def add(eles: ElementDefinition): CollectionReturnValue = js.native
  /**
    * Allow for manipulation of elements without triggering multiple style calculations or multiple redraws.
    * http://js.cytoscape.org/#cy.batch
    *  A callback within which you can make batch updates to elements.
    */
  def batch(callback: js.Function0[Unit]): Unit = js.native
  /**
    * Get a collection from elements in the graph matching the specified selector or from an array of elements.
    * If no parameter specified, an empty collection will be returned
    */
  def collection(): CollectionReturnValue = js.native
  def collection(eles: js.Array[CollectionArgument]): CollectionReturnValue = js.native
  def collection(eles: Selector): CollectionReturnValue = js.native
  /**
    * A convenience function to explicitly destroy the Core.
    * http://js.cytoscape.org/#cy.destroy
    */
  def destroy(): Unit = js.native
  /**
    * Get whether the instance of Cytoscape.js has been destroyed or not.
    * https://js.cytoscape.org/#cy.destroyed
    */
  def destroyed(): Boolean = js.native
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
  def endBatch(): Unit = js.native
  def filter(
    selector: js.Function3[
      /* ele */ Singular[SingularElementReturnValue, SingularElementArgument], 
      /* i */ Double, 
      /* eles */ CollectionArgument, 
      Boolean
    ]
  ): CollectionReturnValue = js.native
  /**
    * Get elements in the graph matching the specified selector or filter function.
    */
  def filter(selector: Selector): CollectionReturnValue = js.native
  /**
    * Get an element from its ID in a very performant way.
    * http://js.cytoscape.org/#cy.getElementById
    */
  def getElementById(id: String): CollectionReturnValue = js.native
  /**
    * Attaches the instance to the specified container for visualisation.
    * http://js.cytoscape.org/#cy.mount
    *
    * If the core instance is headless prior to calling cy.mount(), then
    * the instance will no longer be headless and the visualisation will
    * be shown in the specified container. If the core instance is
    * non-headless prior to calling cy.mount(), then the visualisation
    * is swapped from the prior container to the specified container.
    */
  def mount(element: Element): Unit = js.native
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
  def startBatch(): Unit = js.native
  /**
    * Remove the instance from its current container.
    * http://js.cytoscape.org/#cy.unmount
    *
    * This function sets the instance to be headless after unmounting from
    * the current container.
    */
  def unmount(): Unit = js.native
}

