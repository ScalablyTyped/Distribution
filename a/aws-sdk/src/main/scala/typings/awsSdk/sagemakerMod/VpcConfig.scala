package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpcConfig extends StObject {
  
  /**
    * The VPC security group IDs, in the form sg-xxxxxxxx. Specify the security groups for the VPC that is specified in the Subnets field.
    */
  var SecurityGroupIds: VpcSecurityGroupIds
  
  /**
    * The ID of the subnets in the VPC to which you want to connect your training job or model. For information about the availability of specific instance types, see Supported Instance Types and Availability Zones.
    */
  var Subnets: typings.awsSdk.sagemakerMod.Subnets
}
object VpcConfig {
  
  @scala.inline
  def apply(SecurityGroupIds: VpcSecurityGroupIds, Subnets: Subnets): VpcConfig = {
    val __obj = js.Dynamic.literal(SecurityGroupIds = SecurityGroupIds.asInstanceOf[js.Any], Subnets = Subnets.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcConfig]
  }
  
  @scala.inline
  implicit class VpcConfigMutableBuilder[Self <: VpcConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSecurityGroupIds(value: VpcSecurityGroupIds): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupIdsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setSubnets(value: Subnets): Self = StObject.set(x, "Subnets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetsVarargs(value: SubnetId*): Self = StObject.set(x, "Subnets", js.Array(value :_*))
  }
}
