package typings.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EdgeCollectionTraversing extends StObject {
  
  /**
    * Get edges codirected to those in the collection.
    *
    * Two edges are said to be codirected if they connect the same two nodes in the same direction: The edges have the same source and target.
    * That is:
    * - edge1.source().id() === edge2.source().id()
    *   && edge1.target().id() === edge2.target().id()
    *
    * @param selector [optional] An optional selector that is used to filter the resultant collection.
    */
  def codirectedEdges(): EdgeCollection = js.native
  def codirectedEdges(selector: Selector): EdgeCollection = js.native
  
  // http://js.cytoscape.org/#collection/traversing
  /**
    * Get the nodes connected to the edges in the collection
    *
    * @param selector [optional] An optional selector that is used to filter the resultant collection.
    */
  def connectedNodes(): NodeCollection = js.native
  def connectedNodes(selector: Selector): NodeCollection = js.native
  
  /**
    * Get edges parallel to those in the collection.
    *
    * Two edges are said to be parallel if they connect the same two nodes.
    * Any two parallel edges may connect nodes in the same direction, in which case the edges share the same source and target.
    * They may alternatively connect nodes in the opposite direction, in which case the source and target are reversed in the second edge.
    * That is:
    * - edge1.source().id() === edge2.source().id()
    *   && edge1.target().id() === edge2.target().id()
    * OR
    * - edge1.source().id() === edge2.target().id()
    *   && edge1.target().id() === edge2.source().id()
    *
    * @param selector [optional] An optional selector that is used to filter the resultant collection.
    */
  def parallelEdges(): EdgeCollection = js.native
  def parallelEdges(selector: Selector): EdgeCollection = js.native
  
  /**
    * Get source nodes connected to the edges in the collection.
    *
    * @param selector [optional] An optional selector that is used to filter the resultant collection.
    */
  def sources(): NodeCollection = js.native
  def sources(selector: Selector): NodeCollection = js.native
  
  /**
    * Get target nodes connected to the edges in the collection.
    *
    * @param selector [optional] An optional selector that is used to filter the resultant collection.
    */
  def targets(): NodeCollection = js.native
  def targets(selector: Selector): NodeCollection = js.native
}
