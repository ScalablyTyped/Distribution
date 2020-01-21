package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateFleetError extends js.Object {
  /**
    * The error code that indicates why the instance could not be launched. For more information about error codes, see Error Codes.
    */
  var ErrorCode: js.UndefOr[String] = js.native
  /**
    * The error message that describes why the instance could not be launched. For more information about error messages, see Error Codes.
    */
  var ErrorMessage: js.UndefOr[String] = js.native
  /**
    * The launch templates and overrides that were used for launching the instances. The values that you specify in the Overrides replace the values in the launch template.
    */
  var LaunchTemplateAndOverrides: js.UndefOr[LaunchTemplateAndOverridesResponse] = js.native
  /**
    * Indicates if the instance that could not be launched was a Spot Instance or On-Demand Instance.
    */
  var Lifecycle: js.UndefOr[InstanceLifecycle] = js.native
}

object CreateFleetError {
  @scala.inline
  def apply(
    ErrorCode: String = null,
    ErrorMessage: String = null,
    LaunchTemplateAndOverrides: LaunchTemplateAndOverridesResponse = null,
    Lifecycle: InstanceLifecycle = null
  ): CreateFleetError = {
    val __obj = js.Dynamic.literal()
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode.asInstanceOf[js.Any])
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage.asInstanceOf[js.Any])
    if (LaunchTemplateAndOverrides != null) __obj.updateDynamic("LaunchTemplateAndOverrides")(LaunchTemplateAndOverrides.asInstanceOf[js.Any])
    if (Lifecycle != null) __obj.updateDynamic("Lifecycle")(Lifecycle.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFleetError]
  }
}

