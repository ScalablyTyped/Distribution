package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLaunchTemplateVersionRequest extends js.Object {
  /**
    * Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more information, see Ensuring Idempotency. Constraint: Maximum 128 ASCII characters.
    */
  var ClientToken: js.UndefOr[String] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The information for the launch template.
    */
  var LaunchTemplateData: RequestLaunchTemplateData = js.native
  /**
    * The ID of the launch template. You must specify either the launch template ID or launch template name in the request.
    */
  var LaunchTemplateId: js.UndefOr[typings.awsSdk.ec2Mod.LaunchTemplateId] = js.native
  /**
    * The name of the launch template. You must specify either the launch template ID or launch template name in the request.
    */
  var LaunchTemplateName: js.UndefOr[typings.awsSdk.ec2Mod.LaunchTemplateName] = js.native
  /**
    * The version number of the launch template version on which to base the new version. The new version inherits the same launch parameters as the source version, except for parameters that you specify in LaunchTemplateData. Snapshots applied to the block device mapping are ignored when creating a new version unless they are explicitly included.
    */
  var SourceVersion: js.UndefOr[String] = js.native
  /**
    * A description for the version of the launch template.
    */
  var VersionDescription: js.UndefOr[typings.awsSdk.ec2Mod.VersionDescription] = js.native
}

object CreateLaunchTemplateVersionRequest {
  @scala.inline
  def apply(
    LaunchTemplateData: RequestLaunchTemplateData,
    ClientToken: String = null,
    DryRun: js.UndefOr[Boolean] = js.undefined,
    LaunchTemplateId: LaunchTemplateId = null,
    LaunchTemplateName: LaunchTemplateName = null,
    SourceVersion: String = null,
    VersionDescription: VersionDescription = null
  ): CreateLaunchTemplateVersionRequest = {
    val __obj = js.Dynamic.literal(LaunchTemplateData = LaunchTemplateData.asInstanceOf[js.Any])
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.get.asInstanceOf[js.Any])
    if (LaunchTemplateId != null) __obj.updateDynamic("LaunchTemplateId")(LaunchTemplateId.asInstanceOf[js.Any])
    if (LaunchTemplateName != null) __obj.updateDynamic("LaunchTemplateName")(LaunchTemplateName.asInstanceOf[js.Any])
    if (SourceVersion != null) __obj.updateDynamic("SourceVersion")(SourceVersion.asInstanceOf[js.Any])
    if (VersionDescription != null) __obj.updateDynamic("VersionDescription")(VersionDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLaunchTemplateVersionRequest]
  }
}

