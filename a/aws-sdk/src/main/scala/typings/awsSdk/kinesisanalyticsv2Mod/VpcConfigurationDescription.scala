package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpcConfigurationDescription extends StObject {
  
  /**
    * The array of SecurityGroup IDs used by the VPC configuration.
    */
  var SecurityGroupIds: typings.awsSdk.kinesisanalyticsv2Mod.SecurityGroupIds
  
  /**
    * The array of Subnet IDs used by the VPC configuration.
    */
  var SubnetIds: typings.awsSdk.kinesisanalyticsv2Mod.SubnetIds
  
  /**
    * The ID of the VPC configuration.
    */
  var VpcConfigurationId: Id
  
  /**
    * The ID of the associated VPC.
    */
  var VpcId: typings.awsSdk.kinesisanalyticsv2Mod.VpcId
}
object VpcConfigurationDescription {
  
  inline def apply(SecurityGroupIds: SecurityGroupIds, SubnetIds: SubnetIds, VpcConfigurationId: Id, VpcId: VpcId): VpcConfigurationDescription = {
    val __obj = js.Dynamic.literal(SecurityGroupIds = SecurityGroupIds.asInstanceOf[js.Any], SubnetIds = SubnetIds.asInstanceOf[js.Any], VpcConfigurationId = VpcConfigurationId.asInstanceOf[js.Any], VpcId = VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcConfigurationDescription]
  }
  
  extension [Self <: VpcConfigurationDescription](x: Self) {
    
    inline def setSecurityGroupIds(value: SecurityGroupIds): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value :_*))
    
    inline def setSubnetIds(value: SubnetIds): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdsVarargs(value: SubnetId*): Self = StObject.set(x, "SubnetIds", js.Array(value :_*))
    
    inline def setVpcConfigurationId(value: Id): Self = StObject.set(x, "VpcConfigurationId", value.asInstanceOf[js.Any])
    
    inline def setVpcId(value: VpcId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
  }
}
