package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplateVersion extends js.Object {
  /**
    * The time the version was created.
    */
  var CreateTime: js.UndefOr[DateTime] = js.native
  /**
    * The principal that created the version.
    */
  var CreatedBy: js.UndefOr[String] = js.native
  /**
    * Indicates whether the version is the default version.
    */
  var DefaultVersion: js.UndefOr[Boolean] = js.native
  /**
    * Information about the launch template.
    */
  var LaunchTemplateData: js.UndefOr[ResponseLaunchTemplateData] = js.native
  /**
    * The ID of the launch template.
    */
  var LaunchTemplateId: js.UndefOr[String] = js.native
  /**
    * The name of the launch template.
    */
  var LaunchTemplateName: js.UndefOr[typings.awsSdk.ec2Mod.LaunchTemplateName] = js.native
  /**
    * The description for the version.
    */
  var VersionDescription: js.UndefOr[typings.awsSdk.ec2Mod.VersionDescription] = js.native
  /**
    * The version number.
    */
  var VersionNumber: js.UndefOr[Long] = js.native
}

object LaunchTemplateVersion {
  @scala.inline
  def apply(
    CreateTime: DateTime = null,
    CreatedBy: String = null,
    DefaultVersion: js.UndefOr[scala.Boolean] = js.undefined,
    LaunchTemplateData: ResponseLaunchTemplateData = null,
    LaunchTemplateId: String = null,
    LaunchTemplateName: LaunchTemplateName = null,
    VersionDescription: VersionDescription = null,
    VersionNumber: Int | scala.Double = null
  ): LaunchTemplateVersion = {
    val __obj = js.Dynamic.literal()
    if (CreateTime != null) __obj.updateDynamic("CreateTime")(CreateTime.asInstanceOf[js.Any])
    if (CreatedBy != null) __obj.updateDynamic("CreatedBy")(CreatedBy.asInstanceOf[js.Any])
    if (!js.isUndefined(DefaultVersion)) __obj.updateDynamic("DefaultVersion")(DefaultVersion.asInstanceOf[js.Any])
    if (LaunchTemplateData != null) __obj.updateDynamic("LaunchTemplateData")(LaunchTemplateData.asInstanceOf[js.Any])
    if (LaunchTemplateId != null) __obj.updateDynamic("LaunchTemplateId")(LaunchTemplateId.asInstanceOf[js.Any])
    if (LaunchTemplateName != null) __obj.updateDynamic("LaunchTemplateName")(LaunchTemplateName.asInstanceOf[js.Any])
    if (VersionDescription != null) __obj.updateDynamic("VersionDescription")(VersionDescription.asInstanceOf[js.Any])
    if (VersionNumber != null) __obj.updateDynamic("VersionNumber")(VersionNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplateVersion]
  }
}

