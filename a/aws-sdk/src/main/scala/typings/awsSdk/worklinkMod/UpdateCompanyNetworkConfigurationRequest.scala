package typings.awsSdk.worklinkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCompanyNetworkConfigurationRequest extends StObject {
  
  /**
    * The ARN of the fleet.
    */
  var FleetArn: typings.awsSdk.worklinkMod.FleetArn
  
  /**
    * The security groups associated with access to the provided subnets.
    */
  var SecurityGroupIds: typings.awsSdk.worklinkMod.SecurityGroupIds
  
  /**
    * The subnets used for X-ENI connections from Amazon WorkLink rendering containers.
    */
  var SubnetIds: typings.awsSdk.worklinkMod.SubnetIds
  
  /**
    * The VPC with connectivity to associated websites.
    */
  var VpcId: typings.awsSdk.worklinkMod.VpcId
}
object UpdateCompanyNetworkConfigurationRequest {
  
  @scala.inline
  def apply(FleetArn: FleetArn, SecurityGroupIds: SecurityGroupIds, SubnetIds: SubnetIds, VpcId: VpcId): UpdateCompanyNetworkConfigurationRequest = {
    val __obj = js.Dynamic.literal(FleetArn = FleetArn.asInstanceOf[js.Any], SecurityGroupIds = SecurityGroupIds.asInstanceOf[js.Any], SubnetIds = SubnetIds.asInstanceOf[js.Any], VpcId = VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCompanyNetworkConfigurationRequest]
  }
  
  @scala.inline
  implicit class UpdateCompanyNetworkConfigurationRequestMutableBuilder[Self <: UpdateCompanyNetworkConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFleetArn(value: FleetArn): Self = StObject.set(x, "FleetArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupIds(value: SecurityGroupIds): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupIdsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setSubnetIds(value: SubnetIds): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdsVarargs(value: SubnetId*): Self = StObject.set(x, "SubnetIds", js.Array(value :_*))
    
    @scala.inline
    def setVpcId(value: VpcId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
  }
}
