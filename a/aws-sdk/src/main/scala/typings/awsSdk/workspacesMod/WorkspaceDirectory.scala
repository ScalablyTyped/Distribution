package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkspaceDirectory extends js.Object {
  /**
    * The directory alias.
    */
  var Alias: js.UndefOr[typings.awsSdk.workspacesMod.Alias] = js.native
  /**
    * The user name for the service account.
    */
  var CustomerUserName: js.UndefOr[UserName] = js.native
  /**
    * The directory identifier.
    */
  var DirectoryId: js.UndefOr[typings.awsSdk.workspacesMod.DirectoryId] = js.native
  /**
    * The name of the directory.
    */
  var DirectoryName: js.UndefOr[typings.awsSdk.workspacesMod.DirectoryName] = js.native
  /**
    * The directory type.
    */
  var DirectoryType: js.UndefOr[WorkspaceDirectoryType] = js.native
  /**
    * The IP addresses of the DNS servers for the directory.
    */
  var DnsIpAddresses: js.UndefOr[typings.awsSdk.workspacesMod.DnsIpAddresses] = js.native
  /**
    * The identifier of the IAM role. This is the role that allows Amazon WorkSpaces to make calls to other services, such as Amazon EC2, on your behalf.
    */
  var IamRoleId: js.UndefOr[ARN] = js.native
  /**
    * The registration code for the directory. This is the code that users enter in their Amazon WorkSpaces client application to connect to the directory.
    */
  var RegistrationCode: js.UndefOr[typings.awsSdk.workspacesMod.RegistrationCode] = js.native
  /**
    * The default self-service permissions for WorkSpaces in the directory.
    */
  var SelfservicePermissions: js.UndefOr[typings.awsSdk.workspacesMod.SelfservicePermissions] = js.native
  /**
    * The state of the directory's registration with Amazon WorkSpaces.
    */
  var State: js.UndefOr[WorkspaceDirectoryState] = js.native
  /**
    * The identifiers of the subnets used with the directory.
    */
  var SubnetIds: js.UndefOr[typings.awsSdk.workspacesMod.SubnetIds] = js.native
  /**
    * Specifies whether the directory is dedicated or shared. To use Bring Your Own License (BYOL), this value must be set to DEDICATED. For more information, see Bring Your Own Windows Desktop Images.
    */
  var Tenancy: js.UndefOr[typings.awsSdk.workspacesMod.Tenancy] = js.native
  /**
    * The devices and operating systems that users can use to access WorkSpaces.
    */
  var WorkspaceAccessProperties: js.UndefOr[typings.awsSdk.workspacesMod.WorkspaceAccessProperties] = js.native
  /**
    * The default creation properties for all WorkSpaces in the directory.
    */
  var WorkspaceCreationProperties: js.UndefOr[DefaultWorkspaceCreationProperties] = js.native
  /**
    * The identifier of the security group that is assigned to new WorkSpaces.
    */
  var WorkspaceSecurityGroupId: js.UndefOr[SecurityGroupId] = js.native
  /**
    * The identifiers of the IP access control groups associated with the directory.
    */
  var ipGroupIds: js.UndefOr[IpGroupIdList] = js.native
}

object WorkspaceDirectory {
  @scala.inline
  def apply(): WorkspaceDirectory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceDirectory]
  }
  @scala.inline
  implicit class WorkspaceDirectoryOps[Self <: WorkspaceDirectory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlias(value: Alias): Self = this.set("Alias", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlias: Self = this.set("Alias", js.undefined)
    @scala.inline
    def setCustomerUserName(value: UserName): Self = this.set("CustomerUserName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomerUserName: Self = this.set("CustomerUserName", js.undefined)
    @scala.inline
    def setDirectoryId(value: DirectoryId): Self = this.set("DirectoryId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectoryId: Self = this.set("DirectoryId", js.undefined)
    @scala.inline
    def setDirectoryName(value: DirectoryName): Self = this.set("DirectoryName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectoryName: Self = this.set("DirectoryName", js.undefined)
    @scala.inline
    def setDirectoryType(value: WorkspaceDirectoryType): Self = this.set("DirectoryType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectoryType: Self = this.set("DirectoryType", js.undefined)
    @scala.inline
    def setDnsIpAddressesVarargs(value: IpAddress*): Self = this.set("DnsIpAddresses", js.Array(value :_*))
    @scala.inline
    def setDnsIpAddresses(value: DnsIpAddresses): Self = this.set("DnsIpAddresses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDnsIpAddresses: Self = this.set("DnsIpAddresses", js.undefined)
    @scala.inline
    def setIamRoleId(value: ARN): Self = this.set("IamRoleId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIamRoleId: Self = this.set("IamRoleId", js.undefined)
    @scala.inline
    def setRegistrationCode(value: RegistrationCode): Self = this.set("RegistrationCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegistrationCode: Self = this.set("RegistrationCode", js.undefined)
    @scala.inline
    def setSelfservicePermissions(value: SelfservicePermissions): Self = this.set("SelfservicePermissions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfservicePermissions: Self = this.set("SelfservicePermissions", js.undefined)
    @scala.inline
    def setState(value: WorkspaceDirectoryState): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    @scala.inline
    def setSubnetIdsVarargs(value: SubnetId*): Self = this.set("SubnetIds", js.Array(value :_*))
    @scala.inline
    def setSubnetIds(value: SubnetIds): Self = this.set("SubnetIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubnetIds: Self = this.set("SubnetIds", js.undefined)
    @scala.inline
    def setTenancy(value: Tenancy): Self = this.set("Tenancy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTenancy: Self = this.set("Tenancy", js.undefined)
    @scala.inline
    def setWorkspaceAccessProperties(value: WorkspaceAccessProperties): Self = this.set("WorkspaceAccessProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkspaceAccessProperties: Self = this.set("WorkspaceAccessProperties", js.undefined)
    @scala.inline
    def setWorkspaceCreationProperties(value: DefaultWorkspaceCreationProperties): Self = this.set("WorkspaceCreationProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkspaceCreationProperties: Self = this.set("WorkspaceCreationProperties", js.undefined)
    @scala.inline
    def setWorkspaceSecurityGroupId(value: SecurityGroupId): Self = this.set("WorkspaceSecurityGroupId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkspaceSecurityGroupId: Self = this.set("WorkspaceSecurityGroupId", js.undefined)
    @scala.inline
    def setIpGroupIdsVarargs(value: IpGroupId*): Self = this.set("ipGroupIds", js.Array(value :_*))
    @scala.inline
    def setIpGroupIds(value: IpGroupIdList): Self = this.set("ipGroupIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpGroupIds: Self = this.set("ipGroupIds", js.undefined)
  }
  
}

