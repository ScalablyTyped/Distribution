package typings.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#eles.degreeCentrality
  */
trait SearchDegreeCentralityResultUndirected extends StObject {
  
  /** the degree centrality of the root node */
  var degree: Double
}
object SearchDegreeCentralityResultUndirected {
  
  inline def apply(degree: Double): SearchDegreeCentralityResultUndirected = {
    val __obj = js.Dynamic.literal(degree = degree.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchDegreeCentralityResultUndirected]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchDegreeCentralityResultUndirected] (val x: Self) extends AnyVal {
    
    inline def setDegree(value: Double): Self = StObject.set(x, "degree", value.asInstanceOf[js.Any])
  }
}
