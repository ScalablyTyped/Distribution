package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartRouteAnalysisResponse extends StObject {
  
  /**
    * The route analysis.
    */
  var RouteAnalysis: js.UndefOr[typings.awsSdk.networkmanagerMod.RouteAnalysis] = js.undefined
}
object StartRouteAnalysisResponse {
  
  inline def apply(): StartRouteAnalysisResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartRouteAnalysisResponse]
  }
  
  extension [Self <: StartRouteAnalysisResponse](x: Self) {
    
    inline def setRouteAnalysis(value: RouteAnalysis): Self = StObject.set(x, "RouteAnalysis", value.asInstanceOf[js.Any])
    
    inline def setRouteAnalysisUndefined: Self = StObject.set(x, "RouteAnalysis", js.undefined)
  }
}
