package typings.awsSdk.transferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndpointDetails extends StObject {
  
  /**
    * A list of address allocation IDs that are required to attach an Elastic IP address to your server's endpoint.  This property can only be set when EndpointType is set to VPC and it is only valid in the UpdateServer API. 
    */
  var AddressAllocationIds: js.UndefOr[typings.awsSdk.transferMod.AddressAllocationIds] = js.undefined
  
  /**
    * A list of security groups IDs that are available to attach to your server's endpoint.  This property can only be set when EndpointType is set to VPC. You can only edit the SecurityGroupIds property in the UpdateServer API and only if you are changing the EndpointType from PUBLIC or VPC_ENDPOINT to VPC. 
    */
  var SecurityGroupIds: js.UndefOr[typings.awsSdk.transferMod.SecurityGroupIds] = js.undefined
  
  /**
    * A list of subnet IDs that are required to host your server endpoint in your VPC.  This property can only be set when EndpointType is set to VPC. 
    */
  var SubnetIds: js.UndefOr[typings.awsSdk.transferMod.SubnetIds] = js.undefined
  
  /**
    * The ID of the VPC endpoint.  This property can only be set when EndpointType is set to VPC_ENDPOINT. 
    */
  var VpcEndpointId: js.UndefOr[typings.awsSdk.transferMod.VpcEndpointId] = js.undefined
  
  /**
    * The VPC ID of the VPC in which a server's endpoint will be hosted.  This property can only be set when EndpointType is set to VPC. 
    */
  var VpcId: js.UndefOr[typings.awsSdk.transferMod.VpcId] = js.undefined
}
object EndpointDetails {
  
  inline def apply(): EndpointDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointDetails]
  }
  
  extension [Self <: EndpointDetails](x: Self) {
    
    inline def setAddressAllocationIds(value: AddressAllocationIds): Self = StObject.set(x, "AddressAllocationIds", value.asInstanceOf[js.Any])
    
    inline def setAddressAllocationIdsUndefined: Self = StObject.set(x, "AddressAllocationIds", js.undefined)
    
    inline def setAddressAllocationIdsVarargs(value: AddressAllocationId*): Self = StObject.set(x, "AddressAllocationIds", js.Array(value :_*))
    
    inline def setSecurityGroupIds(value: SecurityGroupIds): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdsUndefined: Self = StObject.set(x, "SecurityGroupIds", js.undefined)
    
    inline def setSecurityGroupIdsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value :_*))
    
    inline def setSubnetIds(value: SubnetIds): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdsUndefined: Self = StObject.set(x, "SubnetIds", js.undefined)
    
    inline def setSubnetIdsVarargs(value: SubnetId*): Self = StObject.set(x, "SubnetIds", js.Array(value :_*))
    
    inline def setVpcEndpointId(value: VpcEndpointId): Self = StObject.set(x, "VpcEndpointId", value.asInstanceOf[js.Any])
    
    inline def setVpcEndpointIdUndefined: Self = StObject.set(x, "VpcEndpointId", js.undefined)
    
    inline def setVpcId(value: VpcId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
