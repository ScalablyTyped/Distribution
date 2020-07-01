package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FleetLaunchTemplateSpecification extends js.Object {
  /**
    * The ID of the launch template. If you specify the template ID, you can't specify the template name.
    */
  var LaunchTemplateId: js.UndefOr[String] = js.native
  /**
    * The name of the launch template. If you specify the template name, you can't specify the template ID.
    */
  var LaunchTemplateName: js.UndefOr[typings.awsSdk.ec2Mod.LaunchTemplateName] = js.native
  /**
    * The launch template version number, $Latest, or $Default. You must specify a value, otherwise the request fails. If the value is $Latest, Amazon EC2 uses the latest version of the launch template. If the value is $Default, Amazon EC2 uses the default version of the launch template.
    */
  var Version: js.UndefOr[String] = js.native
}

object FleetLaunchTemplateSpecification {
  @scala.inline
  def apply(
    LaunchTemplateId: String = null,
    LaunchTemplateName: LaunchTemplateName = null,
    Version: String = null
  ): FleetLaunchTemplateSpecification = {
    val __obj = js.Dynamic.literal()
    if (LaunchTemplateId != null) __obj.updateDynamic("LaunchTemplateId")(LaunchTemplateId.asInstanceOf[js.Any])
    if (LaunchTemplateName != null) __obj.updateDynamic("LaunchTemplateName")(LaunchTemplateName.asInstanceOf[js.Any])
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[FleetLaunchTemplateSpecification]
  }
}

