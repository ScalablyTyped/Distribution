package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportInstanceLaunchSpecification extends StObject {
  
  /**
    * Reserved.
    */
  var AdditionalInfo: js.UndefOr[String] = js.native
  
  /**
    * The architecture of the instance.
    */
  var Architecture: js.UndefOr[ArchitectureValues] = js.native
  
  /**
    * The security group IDs.
    */
  var GroupIds: js.UndefOr[SecurityGroupIdStringList] = js.native
  
  /**
    * The security group names.
    */
  var GroupNames: js.UndefOr[SecurityGroupStringList] = js.native
  
  /**
    * Indicates whether an instance stops or terminates when you initiate shutdown from the instance (using the operating system command for system shutdown).
    */
  var InstanceInitiatedShutdownBehavior: js.UndefOr[ShutdownBehavior] = js.native
  
  /**
    * The instance type. For more information about the instance types that you can import, see Instance Types in the VM Import/Export User Guide.
    */
  var InstanceType: js.UndefOr[typings.awsSdk.ec2Mod.InstanceType] = js.native
  
  /**
    * Indicates whether monitoring is enabled.
    */
  var Monitoring: js.UndefOr[Boolean] = js.native
  
  /**
    * The placement information for the instance.
    */
  var Placement: js.UndefOr[typings.awsSdk.ec2Mod.Placement] = js.native
  
  /**
    * [EC2-VPC] An available IP address from the IP address range of the subnet.
    */
  var PrivateIpAddress: js.UndefOr[String] = js.native
  
  /**
    * [EC2-VPC] The ID of the subnet in which to launch the instance.
    */
  var SubnetId: js.UndefOr[typings.awsSdk.ec2Mod.SubnetId] = js.native
  
  /**
    * The Base64-encoded user data to make available to the instance.
    */
  var UserData: js.UndefOr[typings.awsSdk.ec2Mod.UserData] = js.native
}
object ImportInstanceLaunchSpecification {
  
  @scala.inline
  def apply(): ImportInstanceLaunchSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportInstanceLaunchSpecification]
  }
  
  @scala.inline
  implicit class ImportInstanceLaunchSpecificationMutableBuilder[Self <: ImportInstanceLaunchSpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalInfo(value: String): Self = StObject.set(x, "AdditionalInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalInfoUndefined: Self = StObject.set(x, "AdditionalInfo", js.undefined)
    
    @scala.inline
    def setArchitecture(value: ArchitectureValues): Self = StObject.set(x, "Architecture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArchitectureUndefined: Self = StObject.set(x, "Architecture", js.undefined)
    
    @scala.inline
    def setGroupIds(value: SecurityGroupIdStringList): Self = StObject.set(x, "GroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupIdsUndefined: Self = StObject.set(x, "GroupIds", js.undefined)
    
    @scala.inline
    def setGroupIdsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "GroupIds", js.Array(value :_*))
    
    @scala.inline
    def setGroupNames(value: SecurityGroupStringList): Self = StObject.set(x, "GroupNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupNamesUndefined: Self = StObject.set(x, "GroupNames", js.undefined)
    
    @scala.inline
    def setGroupNamesVarargs(value: SecurityGroupName*): Self = StObject.set(x, "GroupNames", js.Array(value :_*))
    
    @scala.inline
    def setInstanceInitiatedShutdownBehavior(value: ShutdownBehavior): Self = StObject.set(x, "InstanceInitiatedShutdownBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceInitiatedShutdownBehaviorUndefined: Self = StObject.set(x, "InstanceInitiatedShutdownBehavior", js.undefined)
    
    @scala.inline
    def setInstanceType(value: InstanceType): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    @scala.inline
    def setMonitoring(value: Boolean): Self = StObject.set(x, "Monitoring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitoringUndefined: Self = StObject.set(x, "Monitoring", js.undefined)
    
    @scala.inline
    def setPlacement(value: Placement): Self = StObject.set(x, "Placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementUndefined: Self = StObject.set(x, "Placement", js.undefined)
    
    @scala.inline
    def setPrivateIpAddress(value: String): Self = StObject.set(x, "PrivateIpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateIpAddressUndefined: Self = StObject.set(x, "PrivateIpAddress", js.undefined)
    
    @scala.inline
    def setSubnetId(value: SubnetId): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdUndefined: Self = StObject.set(x, "SubnetId", js.undefined)
    
    @scala.inline
    def setUserData(value: UserData): Self = StObject.set(x, "UserData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserDataUndefined: Self = StObject.set(x, "UserData", js.undefined)
  }
}
