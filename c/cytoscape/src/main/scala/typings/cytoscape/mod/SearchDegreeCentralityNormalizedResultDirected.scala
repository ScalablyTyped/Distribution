package typings.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchDegreeCentralityNormalizedResultDirected extends StObject {
  
  /** the normalised indegree centrality of the specified node */
  def indegree(node: NodeSingular): Any
  
  /** the normalised outdegree centrality of the specified node */
  def outdegree(node: NodeSingular): Any
}
object SearchDegreeCentralityNormalizedResultDirected {
  
  inline def apply(indegree: NodeSingular => Any, outdegree: NodeSingular => Any): SearchDegreeCentralityNormalizedResultDirected = {
    val __obj = js.Dynamic.literal(indegree = js.Any.fromFunction1(indegree), outdegree = js.Any.fromFunction1(outdegree))
    __obj.asInstanceOf[SearchDegreeCentralityNormalizedResultDirected]
  }
  
  extension [Self <: SearchDegreeCentralityNormalizedResultDirected](x: Self) {
    
    inline def setIndegree(value: NodeSingular => Any): Self = StObject.set(x, "indegree", js.Any.fromFunction1(value))
    
    inline def setOutdegree(value: NodeSingular => Any): Self = StObject.set(x, "outdegree", js.Any.fromFunction1(value))
  }
}
