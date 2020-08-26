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
  def apply(): CreateFleetError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFleetError]
  }
  @scala.inline
  implicit class CreateFleetErrorOps[Self <: CreateFleetError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setErrorCode(value: String): Self = this.set("ErrorCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorCode: Self = this.set("ErrorCode", js.undefined)
    @scala.inline
    def setErrorMessage(value: String): Self = this.set("ErrorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorMessage: Self = this.set("ErrorMessage", js.undefined)
    @scala.inline
    def setLaunchTemplateAndOverrides(value: LaunchTemplateAndOverridesResponse): Self = this.set("LaunchTemplateAndOverrides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLaunchTemplateAndOverrides: Self = this.set("LaunchTemplateAndOverrides", js.undefined)
    @scala.inline
    def setLifecycle(value: InstanceLifecycle): Self = this.set("Lifecycle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLifecycle: Self = this.set("Lifecycle", js.undefined)
  }
  
}

