package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PeeringTgwInfo extends StObject {
  
  /**
    * The AWS account ID of the owner of the transit gateway.
    */
  var OwnerId: js.UndefOr[String] = js.native
  
  /**
    * The Region of the transit gateway.
    */
  var Region: js.UndefOr[String] = js.native
  
  /**
    * The ID of the transit gateway.
    */
  var TransitGatewayId: js.UndefOr[String] = js.native
}
object PeeringTgwInfo {
  
  @scala.inline
  def apply(): PeeringTgwInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PeeringTgwInfo]
  }
  
  @scala.inline
  implicit class PeeringTgwInfoMutableBuilder[Self <: PeeringTgwInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwnerId(value: String): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "Region", js.undefined)
    
    @scala.inline
    def setTransitGatewayId(value: String): Self = StObject.set(x, "TransitGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitGatewayIdUndefined: Self = StObject.set(x, "TransitGatewayId", js.undefined)
  }
}
