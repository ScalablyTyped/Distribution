package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyLaunchTemplateResult extends js.Object {
  /**
    * Information about the launch template.
    */
  var LaunchTemplate: js.UndefOr[typings.awsSdk.ec2Mod.LaunchTemplate] = js.native
}

object ModifyLaunchTemplateResult {
  @scala.inline
  def apply(LaunchTemplate: LaunchTemplate = null): ModifyLaunchTemplateResult = {
    val __obj = js.Dynamic.literal()
    if (LaunchTemplate != null) __obj.updateDynamic("LaunchTemplate")(LaunchTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyLaunchTemplateResult]
  }
}

