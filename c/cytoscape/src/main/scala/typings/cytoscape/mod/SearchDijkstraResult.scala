package typings.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#eles.dijkstra
  */
trait SearchDijkstraResult extends StObject {
  
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
  
  @scala.inline
  implicit class SearchDijkstraResultMutableBuilder[Self <: SearchDijkstraResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDistanceTo(value: NodeSingular => Double): Self = StObject.set(x, "distanceTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPathTo(value: NodeSingular => CollectionReturnValue): Self = StObject.set(x, "pathTo", js.Any.fromFunction1(value))
  }
}
