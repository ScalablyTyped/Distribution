package typings.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#eles.aStar
  */
trait SearchAStarResult extends StObject {
  
  var distance: Double
  
  var found: Boolean
  
  var path: CollectionReturnValue
}
object SearchAStarResult {
  
  inline def apply(distance: Double, found: Boolean, path: CollectionReturnValue): SearchAStarResult = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], found = found.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchAStarResult]
  }
  
  extension [Self <: SearchAStarResult](x: Self) {
    
    inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setFound(value: Boolean): Self = StObject.set(x, "found", value.asInstanceOf[js.Any])
    
    inline def setPath(value: CollectionReturnValue): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
