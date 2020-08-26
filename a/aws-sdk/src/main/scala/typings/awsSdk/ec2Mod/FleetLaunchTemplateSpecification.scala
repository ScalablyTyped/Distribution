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
  def apply(): FleetLaunchTemplateSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FleetLaunchTemplateSpecification]
  }
  @scala.inline
  implicit class FleetLaunchTemplateSpecificationOps[Self <: FleetLaunchTemplateSpecification] (val x: Self) extends AnyVal {
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
    def setLaunchTemplateId(value: String): Self = this.set("LaunchTemplateId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLaunchTemplateId: Self = this.set("LaunchTemplateId", js.undefined)
    @scala.inline
    def setLaunchTemplateName(value: LaunchTemplateName): Self = this.set("LaunchTemplateName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLaunchTemplateName: Self = this.set("LaunchTemplateName", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("Version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("Version", js.undefined)
  }
  
}

