package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * http://js.cytoscape.org/#eles.floydWarshall
     */
@js.native
trait SearchFloydWarshallResult extends js.Object {
  /**
           * Returns the distance from the source node to node.
           */
  def distance(fromNode: CollectionSelection, toNode: NodeSingular): scala.Double = js.native
  /**
           * Returns the distance from the source node to node.
           */
  def distance(fromNode: CollectionSelection, toNode: Selector): scala.Double = js.native
  /**
           * Returns the distance from the source node to node.
           */
  def distance(fromNode: NodeSingular, toNode: NodeSingular): scala.Double = js.native
  /**
           * Returns the distance from the source node to node.
           */
  def distance(fromNode: NodeSingular, toNode: Selector): scala.Double = js.native
  /**
           * Returns a collection containing the shortest path from the source node to node.
           * The path starts with the source node and includes the edges
           * between the nodes in the path such that if pathTo(node)[i] is an edge,
           * then pathTo(node)[i-1] is the previous node in the path and pathTo(node)[i+1]
           * is the next node in the path.
           */
  def path(fromNode: CollectionSelection, toNode: NodeSingular): CollectionReturnValue = js.native
  /**
           * Returns a collection containing the shortest path from the source node to node.
           * The path starts with the source node and includes the edges
           * between the nodes in the path such that if pathTo(node)[i] is an edge,
           * then pathTo(node)[i-1] is the previous node in the path and pathTo(node)[i+1]
           * is the next node in the path.
           */
  def path(fromNode: CollectionSelection, toNode: Selector): CollectionReturnValue = js.native
  /**
           * Returns a collection containing the shortest path from the source node to node.
           * The path starts with the source node and includes the edges
           * between the nodes in the path such that if pathTo(node)[i] is an edge,
           * then pathTo(node)[i-1] is the previous node in the path and pathTo(node)[i+1]
           * is the next node in the path.
           */
  def path(fromNode: NodeSingular, toNode: NodeSingular): CollectionReturnValue = js.native
  /**
           * Returns a collection containing the shortest path from the source node to node.
           * The path starts with the source node and includes the edges
           * between the nodes in the path such that if pathTo(node)[i] is an edge,
           * then pathTo(node)[i-1] is the previous node in the path and pathTo(node)[i+1]
           * is the next node in the path.
           */
  def path(fromNode: NodeSingular, toNode: Selector): CollectionReturnValue = js.native
}

