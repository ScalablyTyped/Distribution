package typings.bingmaps.Microsoft.Maps.Directions

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDirectionsEventArgs extends StObject {
  
  /** The calculated route (or routes, if the route mode is transit). */
  var route: js.Array[IRoute]
  
  /** The route summary (or summaries) of the route(s) defined in the route property. */
  var routeSummary: js.Array[IRouteSummary]
}
object IDirectionsEventArgs {
  
  inline def apply(route: js.Array[IRoute], routeSummary: js.Array[IRouteSummary]): IDirectionsEventArgs = {
    val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any], routeSummary = routeSummary.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDirectionsEventArgs]
  }
  
  extension [Self <: IDirectionsEventArgs](x: Self) {
    
    inline def setRoute(value: js.Array[IRoute]): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    
    inline def setRouteSummary(value: js.Array[IRouteSummary]): Self = StObject.set(x, "routeSummary", value.asInstanceOf[js.Any])
    
    inline def setRouteSummaryVarargs(value: IRouteSummary*): Self = StObject.set(x, "routeSummary", js.Array(value :_*))
    
    inline def setRouteVarargs(value: IRoute*): Self = StObject.set(x, "route", js.Array(value :_*))
  }
}
