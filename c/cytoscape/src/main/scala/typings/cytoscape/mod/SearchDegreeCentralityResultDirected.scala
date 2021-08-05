package typings.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchDegreeCentralityResultDirected extends StObject {
  
  /* the indegree centrality of the root node */
  var indegree: Double
  
  /* the outdegree centrality of the root node */
  var outdegree: Double
}
object SearchDegreeCentralityResultDirected {
  
  inline def apply(indegree: Double, outdegree: Double): SearchDegreeCentralityResultDirected = {
    val __obj = js.Dynamic.literal(indegree = indegree.asInstanceOf[js.Any], outdegree = outdegree.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchDegreeCentralityResultDirected]
  }
  
  extension [Self <: SearchDegreeCentralityResultDirected](x: Self) {
    
    inline def setIndegree(value: Double): Self = StObject.set(x, "indegree", value.asInstanceOf[js.Any])
    
    inline def setOutdegree(value: Double): Self = StObject.set(x, "outdegree", value.asInstanceOf[js.Any])
  }
}
