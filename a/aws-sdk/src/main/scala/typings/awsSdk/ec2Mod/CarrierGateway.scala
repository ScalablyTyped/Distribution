package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CarrierGateway extends js.Object {
  
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
  implicit class CarrierGatewayOps[Self <: CarrierGateway] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCarrierGatewayId(value: CarrierGatewayId): Self = this.set("CarrierGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCarrierGatewayId: Self = this.set("CarrierGatewayId", js.undefined)
    
    @scala.inline
    def setOwnerId(value: String): Self = this.set("OwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerId: Self = this.set("OwnerId", js.undefined)
    
    @scala.inline
    def setState(value: CarrierGatewayState): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    
    @scala.inline
    def setVpcId(value: VpcId): Self = this.set("VpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcId: Self = this.set("VpcId", js.undefined)
  }
}
