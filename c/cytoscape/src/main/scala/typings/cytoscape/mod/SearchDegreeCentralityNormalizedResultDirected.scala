package typings.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchDegreeCentralityNormalizedResultDirected extends StObject {
  
  /** the normalised indegree centrality of the specified node */
  def indegree(node: NodeSingular): js.Any = js.native
  
  /** the normalised outdegree centrality of the specified node */
  def outdegree(node: NodeSingular): js.Any = js.native
}
object SearchDegreeCentralityNormalizedResultDirected {
  
  @scala.inline
  def apply(indegree: NodeSingular => js.Any, outdegree: NodeSingular => js.Any): SearchDegreeCentralityNormalizedResultDirected = {
    val __obj = js.Dynamic.literal(indegree = js.Any.fromFunction1(indegree), outdegree = js.Any.fromFunction1(outdegree))
    __obj.asInstanceOf[SearchDegreeCentralityNormalizedResultDirected]
  }
  
  @scala.inline
  implicit class SearchDegreeCentralityNormalizedResultDirectedMutableBuilder[Self <: SearchDegreeCentralityNormalizedResultDirected] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndegree(value: NodeSingular => js.Any): Self = StObject.set(x, "indegree", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOutdegree(value: NodeSingular => js.Any): Self = StObject.set(x, "outdegree", js.Any.fromFunction1(value))
  }
}
