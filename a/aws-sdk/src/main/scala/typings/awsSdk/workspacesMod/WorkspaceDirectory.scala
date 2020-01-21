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
  def apply(
    Alias: Alias = null,
    CustomerUserName: UserName = null,
    DirectoryId: DirectoryId = null,
    DirectoryName: DirectoryName = null,
    DirectoryType: WorkspaceDirectoryType = null,
    DnsIpAddresses: DnsIpAddresses = null,
    IamRoleId: ARN = null,
    RegistrationCode: RegistrationCode = null,
    SelfservicePermissions: SelfservicePermissions = null,
    State: WorkspaceDirectoryState = null,
    SubnetIds: SubnetIds = null,
    Tenancy: Tenancy = null,
    WorkspaceAccessProperties: WorkspaceAccessProperties = null,
    WorkspaceCreationProperties: DefaultWorkspaceCreationProperties = null,
    WorkspaceSecurityGroupId: SecurityGroupId = null,
    ipGroupIds: IpGroupIdList = null
  ): WorkspaceDirectory = {
    val __obj = js.Dynamic.literal()
    if (Alias != null) __obj.updateDynamic("Alias")(Alias.asInstanceOf[js.Any])
    if (CustomerUserName != null) __obj.updateDynamic("CustomerUserName")(CustomerUserName.asInstanceOf[js.Any])
    if (DirectoryId != null) __obj.updateDynamic("DirectoryId")(DirectoryId.asInstanceOf[js.Any])
    if (DirectoryName != null) __obj.updateDynamic("DirectoryName")(DirectoryName.asInstanceOf[js.Any])
    if (DirectoryType != null) __obj.updateDynamic("DirectoryType")(DirectoryType.asInstanceOf[js.Any])
    if (DnsIpAddresses != null) __obj.updateDynamic("DnsIpAddresses")(DnsIpAddresses.asInstanceOf[js.Any])
    if (IamRoleId != null) __obj.updateDynamic("IamRoleId")(IamRoleId.asInstanceOf[js.Any])
    if (RegistrationCode != null) __obj.updateDynamic("RegistrationCode")(RegistrationCode.asInstanceOf[js.Any])
    if (SelfservicePermissions != null) __obj.updateDynamic("SelfservicePermissions")(SelfservicePermissions.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (SubnetIds != null) __obj.updateDynamic("SubnetIds")(SubnetIds.asInstanceOf[js.Any])
    if (Tenancy != null) __obj.updateDynamic("Tenancy")(Tenancy.asInstanceOf[js.Any])
    if (WorkspaceAccessProperties != null) __obj.updateDynamic("WorkspaceAccessProperties")(WorkspaceAccessProperties.asInstanceOf[js.Any])
    if (WorkspaceCreationProperties != null) __obj.updateDynamic("WorkspaceCreationProperties")(WorkspaceCreationProperties.asInstanceOf[js.Any])
    if (WorkspaceSecurityGroupId != null) __obj.updateDynamic("WorkspaceSecurityGroupId")(WorkspaceSecurityGroupId.asInstanceOf[js.Any])
    if (ipGroupIds != null) __obj.updateDynamic("ipGroupIds")(ipGroupIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceDirectory]
  }
}

