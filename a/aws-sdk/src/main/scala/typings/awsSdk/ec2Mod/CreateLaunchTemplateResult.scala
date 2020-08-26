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
  def apply(): CreateLaunchTemplateResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLaunchTemplateResult]
  }
  @scala.inline
  implicit class CreateLaunchTemplateResultOps[Self <: CreateLaunchTemplateResult] (val x: Self) extends AnyVal {
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
    def setLaunchTemplate(value: LaunchTemplate): Self = this.set("LaunchTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLaunchTemplate: Self = this.set("LaunchTemplate", js.undefined)
    @scala.inline
    def setWarning(value: ValidationWarning): Self = this.set("Warning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarning: Self = this.set("Warning", js.undefined)
  }
  
}

