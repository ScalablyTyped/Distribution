package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchTransitGatewayRoutesResult extends StObject {
  
  /**
    * Indicates whether there are additional routes available.
    */
  var AdditionalRoutesAvailable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Information about the routes.
    */
  var Routes: js.UndefOr[TransitGatewayRouteList] = js.undefined
}
object SearchTransitGatewayRoutesResult {
  
  @scala.inline
  def apply(): SearchTransitGatewayRoutesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchTransitGatewayRoutesResult]
  }
  
  @scala.inline
  implicit class SearchTransitGatewayRoutesResultMutableBuilder[Self <: SearchTransitGatewayRoutesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalRoutesAvailable(value: Boolean): Self = StObject.set(x, "AdditionalRoutesAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalRoutesAvailableUndefined: Self = StObject.set(x, "AdditionalRoutesAvailable", js.undefined)
    
    @scala.inline
    def setRoutes(value: TransitGatewayRouteList): Self = StObject.set(x, "Routes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutesUndefined: Self = StObject.set(x, "Routes", js.undefined)
    
    @scala.inline
    def setRoutesVarargs(value: TransitGatewayRoute*): Self = StObject.set(x, "Routes", js.Array(value :_*))
  }
}
