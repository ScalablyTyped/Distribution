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
  def apply(): ModifyLaunchTemplateResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyLaunchTemplateResult]
  }
  @scala.inline
  implicit class ModifyLaunchTemplateResultOps[Self <: ModifyLaunchTemplateResult] (val x: Self) extends AnyVal {
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
  }
  
}

