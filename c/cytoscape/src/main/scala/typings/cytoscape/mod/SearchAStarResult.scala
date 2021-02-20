package typings.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#eles.aStar
  */
@js.native
trait SearchAStarResult extends StObject {
  
  var distance: Double = js.native
  
  var found: Boolean = js.native
  
  var path: CollectionReturnValue = js.native
}
object SearchAStarResult {
  
  @scala.inline
  def apply(distance: Double, found: Boolean, path: CollectionReturnValue): SearchAStarResult = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], found = found.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchAStarResult]
  }
  
  @scala.inline
  implicit class SearchAStarResultMutableBuilder[Self <: SearchAStarResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFound(value: Boolean): Self = StObject.set(x, "found", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: CollectionReturnValue): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
