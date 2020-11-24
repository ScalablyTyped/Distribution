package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportInstanceLaunchSpecification extends js.Object {
  
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
  implicit class ImportInstanceLaunchSpecificationOps[Self <: ImportInstanceLaunchSpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdditionalInfo(value: String): Self = this.set("AdditionalInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalInfo: Self = this.set("AdditionalInfo", js.undefined)
    
    @scala.inline
    def setArchitecture(value: ArchitectureValues): Self = this.set("Architecture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArchitecture: Self = this.set("Architecture", js.undefined)
    
    @scala.inline
    def setGroupIdsVarargs(value: SecurityGroupId*): Self = this.set("GroupIds", js.Array(value :_*))
    
    @scala.inline
    def setGroupIds(value: SecurityGroupIdStringList): Self = this.set("GroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupIds: Self = this.set("GroupIds", js.undefined)
    
    @scala.inline
    def setGroupNamesVarargs(value: SecurityGroupName*): Self = this.set("GroupNames", js.Array(value :_*))
    
    @scala.inline
    def setGroupNames(value: SecurityGroupStringList): Self = this.set("GroupNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupNames: Self = this.set("GroupNames", js.undefined)
    
    @scala.inline
    def setInstanceInitiatedShutdownBehavior(value: ShutdownBehavior): Self = this.set("InstanceInitiatedShutdownBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceInitiatedShutdownBehavior: Self = this.set("InstanceInitiatedShutdownBehavior", js.undefined)
    
    @scala.inline
    def setInstanceType(value: InstanceType): Self = this.set("InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceType: Self = this.set("InstanceType", js.undefined)
    
    @scala.inline
    def setMonitoring(value: Boolean): Self = this.set("Monitoring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonitoring: Self = this.set("Monitoring", js.undefined)
    
    @scala.inline
    def setPlacement(value: Placement): Self = this.set("Placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlacement: Self = this.set("Placement", js.undefined)
    
    @scala.inline
    def setPrivateIpAddress(value: String): Self = this.set("PrivateIpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateIpAddress: Self = this.set("PrivateIpAddress", js.undefined)
    
    @scala.inline
    def setSubnetId(value: SubnetId): Self = this.set("SubnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnetId: Self = this.set("SubnetId", js.undefined)
    
    @scala.inline
    def setUserData(value: UserData): Self = this.set("UserData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserData: Self = this.set("UserData", js.undefined)
  }
}
