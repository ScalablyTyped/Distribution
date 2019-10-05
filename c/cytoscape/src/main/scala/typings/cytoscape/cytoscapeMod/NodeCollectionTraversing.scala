package typings.cytoscape.cytoscapeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeCollectionTraversing extends js.Object {
  /**
    * Get the edges connected to the nodes in the collection.
    *
    * @param selector [optional] An optional selector that is used to filter the resultant collection.
    */
  def connectedEdges(): EdgeCollection = js.native
  def connectedEdges(selector: Selector): EdgeCollection = js.native
  /**
    * Get the edges coming from the collection (i.e. the source) going to another collection (i.e. the target).
    *
    * @param eles The other collection.
    * @param selector The other collection, specified as a selector which is matched against all elements in the graph.
    */
  def edgesTo(eles: CollectionArgument): EdgeCollection = js.native
  def edgesTo(eles: Selector): EdgeCollection = js.native
  // http://js.cytoscape.org/#collection/traversing
  /**
    * Get the edges connecting the collection to another collection. Direction of the edges does not matter.
    *
    * @param eles The other collection.
    * @param selector The other collection, specified as a selector which is matched against all elements in the graph.
    */
  def edgesWith(eles: CollectionArgument): EdgeCollection = js.native
  def edgesWith(eles: Selector): EdgeCollection = js.native
  /**
    * Get edges (and their sources) coming into the nodes in the collection.
    *
    * @param selector [optional] An optional selector that is used to filter the resultant collection.
    */
  def incomers(): CollectionReturnValue = js.native
  def incomers(selector: Selector): CollectionReturnValue = js.native
  /**
    * From the set of calling nodes, get the nodes which are leaves (i.e. no outgoing edges, as in a directed acyclic graph).
    *
    * @param selector [optional] An optional selector that is used to filter the resultant collection.
    */
  def leaves(): NodeCollection = js.native
  def leaves(selector: Selector): NodeCollection = js.native
  /**
    * Get edges (and their targets) coming out of the nodes in the collection.
    *
    * @param selector [optional] An optional selector that is used to filter the resultant collection.
    */
  def outgoers(): CollectionReturnValue = js.native
  def outgoers(selector: Selector): CollectionReturnValue = js.native
  /**
    * Recursively get edges (and their sources) coming into the nodes in the collection (i.e. the incomers, the incomers' incomers, ...).
    *
    * @param selector [optional] An optional selector that is used to filter the resultant collection.
    */
  def predecessors(): CollectionReturnValue = js.native
  def predecessors(selector: Selector): CollectionReturnValue = js.native
  /**
    * From the set of calling nodes, get the nodes which are roots (i.e. no incoming edges, as in a directed acyclic graph).
    *
    * @param selector [optional] An optional selector that is used to filter the resultant collection.
    */
  def roots(): NodeCollection = js.native
  def roots(selector: Selector): NodeCollection = js.native
  /**
    * Recursively get edges (and their targets) coming out of the nodes in the collection (i.e. the outgoers, the outgoers' outgoers, ...).
    *
    * @param selector [optional] An optional selector that is used to filter the resultant collection.
    */
  def successors(): CollectionReturnValue = js.native
  def successors(selector: Selector): CollectionReturnValue = js.native
}

