package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTransitGatewayRouteTableAnnouncementResult extends StObject {
  
  /**
    * Provides details about the transit gateway route table announcement.
    */
  var TransitGatewayRouteTableAnnouncement: js.UndefOr[typings.awsSdk.ec2Mod.TransitGatewayRouteTableAnnouncement] = js.undefined
}
object CreateTransitGatewayRouteTableAnnouncementResult {
  
  inline def apply(): CreateTransitGatewayRouteTableAnnouncementResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTransitGatewayRouteTableAnnouncementResult]
  }
  
  extension [Self <: CreateTransitGatewayRouteTableAnnouncementResult](x: Self) {
    
    inline def setTransitGatewayRouteTableAnnouncement(value: TransitGatewayRouteTableAnnouncement): Self = StObject.set(x, "TransitGatewayRouteTableAnnouncement", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayRouteTableAnnouncementUndefined: Self = StObject.set(x, "TransitGatewayRouteTableAnnouncement", js.undefined)
  }
}
