package typings.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#eles.dijkstra
  */
@js.native
trait SearchDijkstraResult extends js.Object {
  /**
    * Returns the distance from the source node to node.
    */
  def distanceTo(node: NodeSingular): Double = js.native
  /**
    * Returns a collection containing the shortest path from the source node to node.
    * The path starts with the source node and includes the edges between the nodes in the path such that if pathTo(node)[i] is an edge,
    * then pathTo(node)[i-1] is the previous node in the path and pathTo(node)[i+1] is the next node in the path.
    */
  def pathTo(node: NodeSingular): CollectionReturnValue = js.native
}

object SearchDijkstraResult {
  @scala.inline
  def apply(distanceTo: NodeSingular => Double, pathTo: NodeSingular => CollectionReturnValue): SearchDijkstraResult = {
    val __obj = js.Dynamic.literal(distanceTo = js.Any.fromFunction1(distanceTo), pathTo = js.Any.fromFunction1(pathTo))
    __obj.asInstanceOf[SearchDijkstraResult]
  }
  @scala.inline
  implicit class SearchDijkstraResultOps[Self <: SearchDijkstraResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDistanceTo(value: NodeSingular => Double): Self = this.set("distanceTo", js.Any.fromFunction1(value))
    @scala.inline
    def setPathTo(value: NodeSingular => CollectionReturnValue): Self = this.set("pathTo", js.Any.fromFunction1(value))
  }
  
}

