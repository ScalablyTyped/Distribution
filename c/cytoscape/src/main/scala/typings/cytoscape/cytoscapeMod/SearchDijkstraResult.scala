package typings.cytoscape.cytoscapeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#eles.dijkstra
  */
trait SearchDijkstraResult extends js.Object {
  /**
    * Returns the distance from the source node to node.
    */
  def distanceTo(node: NodeSingular): Double
  /**
    * Returns a collection containing the shortest path from the source node to node.
    * The path starts with the source node and includes the edges between the nodes in the path such that if pathTo(node)[i] is an edge,
    * then pathTo(node)[i-1] is the previous node in the path and pathTo(node)[i+1] is the next node in the path.
    */
  def pathTo(node: NodeSingular): CollectionReturnValue
}

object SearchDijkstraResult {
  @scala.inline
  def apply(distanceTo: NodeSingular => Double, pathTo: NodeSingular => CollectionReturnValue): SearchDijkstraResult = {
    val __obj = js.Dynamic.literal(distanceTo = js.Any.fromFunction1(distanceTo), pathTo = js.Any.fromFunction1(pathTo))
  
    __obj.asInstanceOf[SearchDijkstraResult]
  }
}

