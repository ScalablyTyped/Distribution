package typings.awsSdk.transferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndpointDetails extends js.Object {
  
  /**
    * A list of address allocation IDs that are required to attach an Elastic IP address to your server's endpoint.  This property can only be set when EndpointType is set to VPC and it is only valid in the UpdateServer API. 
    */
  var AddressAllocationIds: js.UndefOr[typings.awsSdk.transferMod.AddressAllocationIds] = js.native
  
  /**
    * A list of security groups IDs that are available to attach to your server's endpoint.  This property can only be set when EndpointType is set to VPC. You can only edit the SecurityGroupIds property in the UpdateServer API and only if you are changing the EndpointType from PUBLIC or VPC_ENDPOINT to VPC. 
    */
  var SecurityGroupIds: js.UndefOr[typings.awsSdk.transferMod.SecurityGroupIds] = js.native
  
  /**
    * A list of subnet IDs that are required to host your server endpoint in your VPC.  This property can only be set when EndpointType is set to VPC. 
    */
  var SubnetIds: js.UndefOr[typings.awsSdk.transferMod.SubnetIds] = js.native
  
  /**
    * The ID of the VPC endpoint.  This property can only be set when EndpointType is set to VPC_ENDPOINT. 
    */
  var VpcEndpointId: js.UndefOr[typings.awsSdk.transferMod.VpcEndpointId] = js.native
  
  /**
    * The VPC ID of the VPC in which a server's endpoint will be hosted.  This property can only be set when EndpointType is set to VPC. 
    */
  var VpcId: js.UndefOr[typings.awsSdk.transferMod.VpcId] = js.native
}
object EndpointDetails {
  
  @scala.inline
  def apply(): EndpointDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointDetails]
  }
  
  @scala.inline
  implicit class EndpointDetailsOps[Self <: EndpointDetails] (val x: Self) extends AnyVal {
    
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
    def setAddressAllocationIdsVarargs(value: AddressAllocationId*): Self = this.set("AddressAllocationIds", js.Array(value :_*))
    
    @scala.inline
    def setAddressAllocationIds(value: AddressAllocationIds): Self = this.set("AddressAllocationIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddressAllocationIds: Self = this.set("AddressAllocationIds", js.undefined)
    
    @scala.inline
    def setSecurityGroupIdsVarargs(value: SecurityGroupId*): Self = this.set("SecurityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setSecurityGroupIds(value: SecurityGroupIds): Self = this.set("SecurityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityGroupIds: Self = this.set("SecurityGroupIds", js.undefined)
    
    @scala.inline
    def setSubnetIdsVarargs(value: SubnetId*): Self = this.set("SubnetIds", js.Array(value :_*))
    
    @scala.inline
    def setSubnetIds(value: SubnetIds): Self = this.set("SubnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnetIds: Self = this.set("SubnetIds", js.undefined)
    
    @scala.inline
    def setVpcEndpointId(value: VpcEndpointId): Self = this.set("VpcEndpointId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcEndpointId: Self = this.set("VpcEndpointId", js.undefined)
    
    @scala.inline
    def setVpcId(value: VpcId): Self = this.set("VpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcId: Self = this.set("VpcId", js.undefined)
  }
}
