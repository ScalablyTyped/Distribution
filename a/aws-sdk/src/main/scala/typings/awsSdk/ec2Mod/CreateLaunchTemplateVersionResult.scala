package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLaunchTemplateVersionResult extends js.Object {
  /**
    * Information about the launch template version.
    */
  var LaunchTemplateVersion: js.UndefOr[typings.awsSdk.ec2Mod.LaunchTemplateVersion] = js.native
  /**
    * If the new version of the launch template contains parameters or parameter combinations that are not valid, an error code and an error message are returned for each issue that's found.
    */
  var Warning: js.UndefOr[ValidationWarning] = js.native
}

object CreateLaunchTemplateVersionResult {
  @scala.inline
  def apply(LaunchTemplateVersion: LaunchTemplateVersion = null, Warning: ValidationWarning = null): CreateLaunchTemplateVersionResult = {
    val __obj = js.Dynamic.literal()
    if (LaunchTemplateVersion != null) __obj.updateDynamic("LaunchTemplateVersion")(LaunchTemplateVersion.asInstanceOf[js.Any])
    if (Warning != null) __obj.updateDynamic("Warning")(Warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLaunchTemplateVersionResult]
  }
}

