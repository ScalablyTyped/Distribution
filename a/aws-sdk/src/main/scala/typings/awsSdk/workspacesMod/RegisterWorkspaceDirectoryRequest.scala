package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterWorkspaceDirectoryRequest extends js.Object {
  /**
    * The identifier of the directory. You cannot register a directory if it does not have a status of Active. If the directory does not have a status of Active, you will receive an InvalidResourceStateException error. If you have already registered the maximum number of directories that you can register with Amazon WorkSpaces, you will receive a ResourceLimitExceededException error. Deregister directories that you are not using for WorkSpaces, and try again.
    */
  var DirectoryId: typings.awsSdk.workspacesMod.DirectoryId = js.native
  /**
    * Indicates whether self-service capabilities are enabled or disabled.
    */
  var EnableSelfService: js.UndefOr[BooleanObject] = js.native
  /**
    * Indicates whether Amazon WorkDocs is enabled or disabled. If you have enabled this parameter and WorkDocs is not available in the Region, you will receive an OperationNotSupportedException error. Set EnableWorkDocs to disabled, and try again.
    */
  var EnableWorkDocs: BooleanObject = js.native
  /**
    * The identifiers of the subnets for your virtual private cloud (VPC). Make sure that the subnets are in supported Availability Zones. The subnets must also be in separate Availability Zones. If these conditions are not met, you will receive an OperationNotSupportedException error.
    */
  var SubnetIds: js.UndefOr[typings.awsSdk.workspacesMod.SubnetIds] = js.native
  /**
    * The tags associated with the directory.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * Indicates whether your WorkSpace directory is dedicated or shared. To use Bring Your Own License (BYOL) images, this value must be set to DEDICATED and your AWS account must be enabled for BYOL. If your account has not been enabled for BYOL, you will receive an InvalidParameterValuesException error. For more information about BYOL images, see Bring Your Own Windows Desktop Images.
    */
  var Tenancy: js.UndefOr[typings.awsSdk.workspacesMod.Tenancy] = js.native
}

object RegisterWorkspaceDirectoryRequest {
  @scala.inline
  def apply(
    DirectoryId: DirectoryId,
    EnableWorkDocs: BooleanObject,
    EnableSelfService: js.UndefOr[Boolean] = js.undefined,
    SubnetIds: SubnetIds = null,
    Tags: TagList = null,
    Tenancy: Tenancy = null
  ): RegisterWorkspaceDirectoryRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any], EnableWorkDocs = EnableWorkDocs.asInstanceOf[js.Any])
    if (!js.isUndefined(EnableSelfService)) __obj.updateDynamic("EnableSelfService")(EnableSelfService.asInstanceOf[js.Any])
    if (SubnetIds != null) __obj.updateDynamic("SubnetIds")(SubnetIds.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (Tenancy != null) __obj.updateDynamic("Tenancy")(Tenancy.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterWorkspaceDirectoryRequest]
  }
}

