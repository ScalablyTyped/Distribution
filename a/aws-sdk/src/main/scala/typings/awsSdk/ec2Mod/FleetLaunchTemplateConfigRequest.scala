package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FleetLaunchTemplateConfigRequest extends js.Object {
  /**
    * The launch template to use. You must specify either the launch template ID or launch template name in the request. 
    */
  var LaunchTemplateSpecification: js.UndefOr[FleetLaunchTemplateSpecificationRequest] = js.native
  /**
    * Any parameters that you specify override the same parameters in the launch template.
    */
  var Overrides: js.UndefOr[FleetLaunchTemplateOverridesListRequest] = js.native
}

object FleetLaunchTemplateConfigRequest {
  @scala.inline
  def apply(
    LaunchTemplateSpecification: FleetLaunchTemplateSpecificationRequest = null,
    Overrides: FleetLaunchTemplateOverridesListRequest = null
  ): FleetLaunchTemplateConfigRequest = {
    val __obj = js.Dynamic.literal()
    if (LaunchTemplateSpecification != null) __obj.updateDynamic("LaunchTemplateSpecification")(LaunchTemplateSpecification.asInstanceOf[js.Any])
    if (Overrides != null) __obj.updateDynamic("Overrides")(Overrides.asInstanceOf[js.Any])
    __obj.asInstanceOf[FleetLaunchTemplateConfigRequest]
  }
}

