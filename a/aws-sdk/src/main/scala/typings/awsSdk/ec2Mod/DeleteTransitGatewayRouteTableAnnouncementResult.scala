package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTransitGatewayRouteTableAnnouncementResult extends StObject {
  
  /**
    * Provides details about a deleted transit gateway route table.
    */
  var TransitGatewayRouteTableAnnouncement: js.UndefOr[typings.awsSdk.ec2Mod.TransitGatewayRouteTableAnnouncement] = js.undefined
}
object DeleteTransitGatewayRouteTableAnnouncementResult {
  
  inline def apply(): DeleteTransitGatewayRouteTableAnnouncementResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTransitGatewayRouteTableAnnouncementResult]
  }
  
  extension [Self <: DeleteTransitGatewayRouteTableAnnouncementResult](x: Self) {
    
    inline def setTransitGatewayRouteTableAnnouncement(value: TransitGatewayRouteTableAnnouncement): Self = StObject.set(x, "TransitGatewayRouteTableAnnouncement", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayRouteTableAnnouncementUndefined: Self = StObject.set(x, "TransitGatewayRouteTableAnnouncement", js.undefined)
  }
}
