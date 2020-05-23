package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteLaunchTemplateVersionsResponseSuccessItem extends js.Object {
  /**
    * The ID of the launch template.
    */
  var LaunchTemplateId: js.UndefOr[String] = js.native
  /**
    * The name of the launch template.
    */
  var LaunchTemplateName: js.UndefOr[String] = js.native
  /**
    * The version number of the launch template.
    */
  var VersionNumber: js.UndefOr[Long] = js.native
}

object DeleteLaunchTemplateVersionsResponseSuccessItem {
  @scala.inline
  def apply(
    LaunchTemplateId: String = null,
    LaunchTemplateName: String = null,
    VersionNumber: js.UndefOr[Long] = js.undefined
  ): DeleteLaunchTemplateVersionsResponseSuccessItem = {
    val __obj = js.Dynamic.literal()
    if (LaunchTemplateId != null) __obj.updateDynamic("LaunchTemplateId")(LaunchTemplateId.asInstanceOf[js.Any])
    if (LaunchTemplateName != null) __obj.updateDynamic("LaunchTemplateName")(LaunchTemplateName.asInstanceOf[js.Any])
    if (!js.isUndefined(VersionNumber)) __obj.updateDynamic("VersionNumber")(VersionNumber.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLaunchTemplateVersionsResponseSuccessItem]
  }
}

