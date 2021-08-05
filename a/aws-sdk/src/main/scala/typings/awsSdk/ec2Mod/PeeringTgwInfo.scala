package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PeeringTgwInfo extends StObject {
  
  /**
    * The AWS account ID of the owner of the transit gateway.
    */
  var OwnerId: js.UndefOr[String] = js.undefined
  
  /**
    * The Region of the transit gateway.
    */
  var Region: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the transit gateway.
    */
  var TransitGatewayId: js.UndefOr[String] = js.undefined
}
object PeeringTgwInfo {
  
  inline def apply(): PeeringTgwInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PeeringTgwInfo]
  }
  
  extension [Self <: PeeringTgwInfo](x: Self) {
    
    inline def setOwnerId(value: String): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    inline def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "Region", js.undefined)
    
    inline def setTransitGatewayId(value: String): Self = StObject.set(x, "TransitGatewayId", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayIdUndefined: Self = StObject.set(x, "TransitGatewayId", js.undefined)
  }
}
