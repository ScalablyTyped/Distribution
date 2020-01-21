package typings.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#eles.floydWarshall
  */
@js.native
trait SearchFloydWarshallResult extends js.Object {
  def distance(fromNode: CollectionSelection, toNode: NodeSingular): Double = js.native
  def distance(fromNode: CollectionSelection, toNode: Selector): Double = js.native
  /**
    * Returns the distance from the source node to node.
    */
  def distance(fromNode: NodeSingular, toNode: NodeSingular): Double = js.native
  def distance(fromNode: NodeSingular, toNode: Selector): Double = js.native
  def path(fromNode: CollectionSelection, toNode: NodeSingular): CollectionReturnValue = js.native
  def path(fromNode: CollectionSelection, toNode: Selector): CollectionReturnValue = js.native
  /**
    * Returns a collection containing the shortest path from the source node to node.
    * The path starts with the source node and includes the edges
    * between the nodes in the path such that if pathTo(node)[i] is an edge,
    * then pathTo(node)[i-1] is the previous node in the path and pathTo(node)[i+1]
    * is the next node in the path.
    */
  def path(fromNode: NodeSingular, toNode: NodeSingular): CollectionReturnValue = js.native
  def path(fromNode: NodeSingular, toNode: Selector): CollectionReturnValue = js.native
}

