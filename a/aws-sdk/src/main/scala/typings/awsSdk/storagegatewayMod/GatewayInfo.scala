package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GatewayInfo extends js.Object {
  
  /**
    * The ID of the Amazon EC2 instance that was used to launch the gateway.
    */
  var Ec2InstanceId: js.UndefOr[typings.awsSdk.storagegatewayMod.Ec2InstanceId] = js.native
  
  /**
    * The AWS Region where the Amazon EC2 instance is located.
    */
  var Ec2InstanceRegion: js.UndefOr[typings.awsSdk.storagegatewayMod.Ec2InstanceRegion] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the gateway. Use the ListGateways operation to return a list of gateways for your account and AWS Region.
    */
  var GatewayARN: js.UndefOr[typings.awsSdk.storagegatewayMod.GatewayARN] = js.native
  
  /**
    * The unique identifier assigned to your gateway during activation. This ID becomes part of the gateway Amazon Resource Name (ARN), which you use as input for other operations.
    */
  var GatewayId: js.UndefOr[typings.awsSdk.storagegatewayMod.GatewayId] = js.native
  
  /**
    * The name of the gateway.
    */
  var GatewayName: js.UndefOr[String] = js.native
  
  /**
    * The state of the gateway. Valid Values: DISABLED | ACTIVE 
    */
  var GatewayOperationalState: js.UndefOr[typings.awsSdk.storagegatewayMod.GatewayOperationalState] = js.native
  
  /**
    * The type of the gateway.
    */
  var GatewayType: js.UndefOr[typings.awsSdk.storagegatewayMod.GatewayType] = js.native
}
object GatewayInfo {
  
  @scala.inline
  def apply(): GatewayInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GatewayInfo]
  }
  
  @scala.inline
  implicit class GatewayInfoOps[Self <: GatewayInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEc2InstanceId(value: Ec2InstanceId): Self = this.set("Ec2InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEc2InstanceId: Self = this.set("Ec2InstanceId", js.undefined)
    
    @scala.inline
    def setEc2InstanceRegion(value: Ec2InstanceRegion): Self = this.set("Ec2InstanceRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEc2InstanceRegion: Self = this.set("Ec2InstanceRegion", js.undefined)
    
    @scala.inline
    def setGatewayARN(value: GatewayARN): Self = this.set("GatewayARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGatewayARN: Self = this.set("GatewayARN", js.undefined)
    
    @scala.inline
    def setGatewayId(value: GatewayId): Self = this.set("GatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGatewayId: Self = this.set("GatewayId", js.undefined)
    
    @scala.inline
    def setGatewayName(value: String): Self = this.set("GatewayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGatewayName: Self = this.set("GatewayName", js.undefined)
    
    @scala.inline
    def setGatewayOperationalState(value: GatewayOperationalState): Self = this.set("GatewayOperationalState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGatewayOperationalState: Self = this.set("GatewayOperationalState", js.undefined)
    
    @scala.inline
    def setGatewayType(value: GatewayType): Self = this.set("GatewayType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGatewayType: Self = this.set("GatewayType", js.undefined)
  }
}
