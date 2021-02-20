package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VpcConfigurationUpdate extends StObject {
  
  /**
    * Describes updates to the array of SecurityGroup IDs used by the VPC configuration.
    */
  var SecurityGroupIdUpdates: js.UndefOr[SecurityGroupIds] = js.native
  
  /**
    * Describes updates to the array of Subnet IDs used by the VPC configuration.
    */
  var SubnetIdUpdates: js.UndefOr[SubnetIds] = js.native
  
  /**
    * Describes an update to the ID of the VPC configuration.
    */
  var VpcConfigurationId: Id = js.native
}
object VpcConfigurationUpdate {
  
  @scala.inline
  def apply(VpcConfigurationId: Id): VpcConfigurationUpdate = {
    val __obj = js.Dynamic.literal(VpcConfigurationId = VpcConfigurationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcConfigurationUpdate]
  }
  
  @scala.inline
  implicit class VpcConfigurationUpdateMutableBuilder[Self <: VpcConfigurationUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSecurityGroupIdUpdates(value: SecurityGroupIds): Self = StObject.set(x, "SecurityGroupIdUpdates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupIdUpdatesUndefined: Self = StObject.set(x, "SecurityGroupIdUpdates", js.undefined)
    
    @scala.inline
    def setSecurityGroupIdUpdatesVarargs(value: SecurityGroupId*): Self = StObject.set(x, "SecurityGroupIdUpdates", js.Array(value :_*))
    
    @scala.inline
    def setSubnetIdUpdates(value: SubnetIds): Self = StObject.set(x, "SubnetIdUpdates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdUpdatesUndefined: Self = StObject.set(x, "SubnetIdUpdates", js.undefined)
    
    @scala.inline
    def setSubnetIdUpdatesVarargs(value: SubnetId*): Self = StObject.set(x, "SubnetIdUpdates", js.Array(value :_*))
    
    @scala.inline
    def setVpcConfigurationId(value: Id): Self = StObject.set(x, "VpcConfigurationId", value.asInstanceOf[js.Any])
  }
}
