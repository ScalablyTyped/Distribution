package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectoryVpcSettingsDescription extends StObject {
  
  /**
    * The list of Availability Zones that the directory is in.
    */
  var AvailabilityZones: js.UndefOr[typings.awsSdk.directoryserviceMod.AvailabilityZones] = js.undefined
  
  /**
    * The domain controller security group identifier for the directory.
    */
  var SecurityGroupId: js.UndefOr[typings.awsSdk.directoryserviceMod.SecurityGroupId] = js.undefined
  
  /**
    * The identifiers of the subnets for the directory servers.
    */
  var SubnetIds: js.UndefOr[typings.awsSdk.directoryserviceMod.SubnetIds] = js.undefined
  
  /**
    * The identifier of the VPC that the directory is in.
    */
  var VpcId: js.UndefOr[typings.awsSdk.directoryserviceMod.VpcId] = js.undefined
}
object DirectoryVpcSettingsDescription {
  
  @scala.inline
  def apply(): DirectoryVpcSettingsDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectoryVpcSettingsDescription]
  }
  
  @scala.inline
  implicit class DirectoryVpcSettingsDescriptionMutableBuilder[Self <: DirectoryVpcSettingsDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailabilityZones(value: AvailabilityZones): Self = StObject.set(x, "AvailabilityZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZonesUndefined: Self = StObject.set(x, "AvailabilityZones", js.undefined)
    
    @scala.inline
    def setAvailabilityZonesVarargs(value: AvailabilityZone*): Self = StObject.set(x, "AvailabilityZones", js.Array(value :_*))
    
    @scala.inline
    def setSecurityGroupId(value: SecurityGroupId): Self = StObject.set(x, "SecurityGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupIdUndefined: Self = StObject.set(x, "SecurityGroupId", js.undefined)
    
    @scala.inline
    def setSubnetIds(value: SubnetIds): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdsUndefined: Self = StObject.set(x, "SubnetIds", js.undefined)
    
    @scala.inline
    def setSubnetIdsVarargs(value: SubnetId*): Self = StObject.set(x, "SubnetIds", js.Array(value :_*))
    
    @scala.inline
    def setVpcId(value: VpcId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
