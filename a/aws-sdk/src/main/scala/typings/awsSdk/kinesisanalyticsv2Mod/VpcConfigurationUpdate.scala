package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpcConfigurationUpdate extends StObject {
  
  /**
    * Describes updates to the array of SecurityGroup IDs used by the VPC configuration.
    */
  var SecurityGroupIdUpdates: js.UndefOr[SecurityGroupIds] = js.undefined
  
  /**
    * Describes updates to the array of Subnet IDs used by the VPC configuration.
    */
  var SubnetIdUpdates: js.UndefOr[SubnetIds] = js.undefined
  
  /**
    * Describes an update to the ID of the VPC configuration.
    */
  var VpcConfigurationId: Id
}
object VpcConfigurationUpdate {
  
  inline def apply(VpcConfigurationId: Id): VpcConfigurationUpdate = {
    val __obj = js.Dynamic.literal(VpcConfigurationId = VpcConfigurationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcConfigurationUpdate]
  }
  
  extension [Self <: VpcConfigurationUpdate](x: Self) {
    
    inline def setSecurityGroupIdUpdates(value: SecurityGroupIds): Self = StObject.set(x, "SecurityGroupIdUpdates", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdUpdatesUndefined: Self = StObject.set(x, "SecurityGroupIdUpdates", js.undefined)
    
    inline def setSecurityGroupIdUpdatesVarargs(value: SecurityGroupId*): Self = StObject.set(x, "SecurityGroupIdUpdates", js.Array(value :_*))
    
    inline def setSubnetIdUpdates(value: SubnetIds): Self = StObject.set(x, "SubnetIdUpdates", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdUpdatesUndefined: Self = StObject.set(x, "SubnetIdUpdates", js.undefined)
    
    inline def setSubnetIdUpdatesVarargs(value: SubnetId*): Self = StObject.set(x, "SubnetIdUpdates", js.Array(value :_*))
    
    inline def setVpcConfigurationId(value: Id): Self = StObject.set(x, "VpcConfigurationId", value.asInstanceOf[js.Any])
  }
}
