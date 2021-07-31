package typings.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#eles.degreeCentralityNormalized
  */
trait SearchDegreeCentralityNormalizedResultUndirected extends StObject {
  
  /** the normalised degree centrality of the specified node */
  def degree(node: NodeSingular): js.Any
}
object SearchDegreeCentralityNormalizedResultUndirected {
  
  @scala.inline
  def apply(degree: NodeSingular => js.Any): SearchDegreeCentralityNormalizedResultUndirected = {
    val __obj = js.Dynamic.literal(degree = js.Any.fromFunction1(degree))
    __obj.asInstanceOf[SearchDegreeCentralityNormalizedResultUndirected]
  }
  
  @scala.inline
  implicit class SearchDegreeCentralityNormalizedResultUndirectedMutableBuilder[Self <: SearchDegreeCentralityNormalizedResultUndirected] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDegree(value: NodeSingular => js.Any): Self = StObject.set(x, "degree", js.Any.fromFunction1(value))
  }
}
