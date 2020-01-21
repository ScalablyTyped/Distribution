package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FleetLaunchTemplateSpecificationRequest extends js.Object {
  /**
    * The ID of the launch template.
    */
  var LaunchTemplateId: js.UndefOr[String] = js.native
  /**
    * The name of the launch template.
    */
  var LaunchTemplateName: js.UndefOr[typings.awsSdk.ec2Mod.LaunchTemplateName] = js.native
  /**
    * The version number of the launch template. Note: This is a required parameter and will be updated soon. 
    */
  var Version: js.UndefOr[String] = js.native
}

object FleetLaunchTemplateSpecificationRequest {
  @scala.inline
  def apply(
    LaunchTemplateId: String = null,
    LaunchTemplateName: LaunchTemplateName = null,
    Version: String = null
  ): FleetLaunchTemplateSpecificationRequest = {
    val __obj = js.Dynamic.literal()
    if (LaunchTemplateId != null) __obj.updateDynamic("LaunchTemplateId")(LaunchTemplateId.asInstanceOf[js.Any])
    if (LaunchTemplateName != null) __obj.updateDynamic("LaunchTemplateName")(LaunchTemplateName.asInstanceOf[js.Any])
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[FleetLaunchTemplateSpecificationRequest]
  }
}

