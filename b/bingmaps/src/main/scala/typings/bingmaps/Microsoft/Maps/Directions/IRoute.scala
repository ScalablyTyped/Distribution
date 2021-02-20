package typings.bingmaps.Microsoft.Maps.Directions

import typings.bingmaps.Microsoft.Maps.Location
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRoute extends StObject {
  
  /** The legs of the route. Each route leg represents the route between two waypoints. */
  var routeLegs: js.Array[IRouteLeg] = js.native
  
  /** An array of locations that makes up the path of the route. */
  var routePath: js.Array[Location] = js.native
}
object IRoute {
  
  @scala.inline
  def apply(routeLegs: js.Array[IRouteLeg], routePath: js.Array[Location]): IRoute = {
    val __obj = js.Dynamic.literal(routeLegs = routeLegs.asInstanceOf[js.Any], routePath = routePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRoute]
  }
  
  @scala.inline
  implicit class IRouteMutableBuilder[Self <: IRoute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRouteLegs(value: js.Array[IRouteLeg]): Self = StObject.set(x, "routeLegs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteLegsVarargs(value: IRouteLeg*): Self = StObject.set(x, "routeLegs", js.Array(value :_*))
    
    @scala.inline
    def setRoutePath(value: js.Array[Location]): Self = StObject.set(x, "routePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutePathVarargs(value: Location*): Self = StObject.set(x, "routePath", js.Array(value :_*))
  }
}
