package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CarrierGateway extends StObject {
  
  /**
    * The ID of the carrier gateway.
    */
  var CarrierGatewayId: js.UndefOr[typings.awsSdk.ec2Mod.CarrierGatewayId] = js.native
  
  /**
    * The AWS account ID of the owner of the carrier gateway.
    */
  var OwnerId: js.UndefOr[String] = js.native
  
  /**
    * The state of the carrier gateway.
    */
  var State: js.UndefOr[CarrierGatewayState] = js.native
  
  /**
    * The tags assigned to the carrier gateway.
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * The ID of the VPC associated with the carrier gateway.
    */
  var VpcId: js.UndefOr[typings.awsSdk.ec2Mod.VpcId] = js.native
}
object CarrierGateway {
  
  @scala.inline
  def apply(): CarrierGateway = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CarrierGateway]
  }
  
  @scala.inline
  implicit class CarrierGatewayMutableBuilder[Self <: CarrierGateway] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCarrierGatewayId(value: CarrierGatewayId): Self = StObject.set(x, "CarrierGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCarrierGatewayIdUndefined: Self = StObject.set(x, "CarrierGatewayId", js.undefined)
    
    @scala.inline
    def setOwnerId(value: String): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    @scala.inline
    def setState(value: CarrierGatewayState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setVpcId(value: VpcId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
