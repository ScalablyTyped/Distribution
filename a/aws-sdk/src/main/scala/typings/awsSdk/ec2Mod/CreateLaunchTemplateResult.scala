package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLaunchTemplateResult extends js.Object {
  /**
    * Information about the launch template.
    */
  var LaunchTemplate: js.UndefOr[typings.awsSdk.ec2Mod.LaunchTemplate] = js.native
  /**
    * If the launch template contains parameters or parameter combinations that are not valid, an error code and an error message are returned for each issue that's found.
    */
  var Warning: js.UndefOr[ValidationWarning] = js.native
}

object CreateLaunchTemplateResult {
  @scala.inline
  def apply(LaunchTemplate: LaunchTemplate = null, Warning: ValidationWarning = null): CreateLaunchTemplateResult = {
    val __obj = js.Dynamic.literal()
    if (LaunchTemplate != null) __obj.updateDynamic("LaunchTemplate")(LaunchTemplate.asInstanceOf[js.Any])
    if (Warning != null) __obj.updateDynamic("Warning")(Warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLaunchTemplateResult]
  }
}

