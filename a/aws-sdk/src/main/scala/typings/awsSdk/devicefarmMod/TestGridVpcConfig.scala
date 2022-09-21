package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestGridVpcConfig extends StObject {
  
  /**
    * A list of VPC security group IDs in your Amazon VPC.
    */
  var securityGroupIds: SecurityGroupIds
  
  /**
    * A list of VPC subnet IDs in your Amazon VPC.
    */
  var subnetIds: SubnetIds
  
  /**
    * The ID of the Amazon VPC.
    */
  var vpcId: NonEmptyString
}
object TestGridVpcConfig {
  
  inline def apply(securityGroupIds: SecurityGroupIds, subnetIds: SubnetIds, vpcId: NonEmptyString): TestGridVpcConfig = {
    val __obj = js.Dynamic.literal(securityGroupIds = securityGroupIds.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestGridVpcConfig]
  }
  
  extension [Self <: TestGridVpcConfig](x: Self) {
    
    inline def setSecurityGroupIds(value: SecurityGroupIds): Self = StObject.set(x, "securityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdsVarargs(value: NonEmptyString*): Self = StObject.set(x, "securityGroupIds", js.Array(value*))
    
    inline def setSubnetIds(value: SubnetIds): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdsVarargs(value: NonEmptyString*): Self = StObject.set(x, "subnetIds", js.Array(value*))
    
    inline def setVpcId(value: NonEmptyString): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
  }
}
