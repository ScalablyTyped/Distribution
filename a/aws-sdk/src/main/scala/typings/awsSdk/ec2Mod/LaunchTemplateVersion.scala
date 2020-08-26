package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplateVersion extends js.Object {
  /**
    * The time the version was created.
    */
  var CreateTime: js.UndefOr[DateTime] = js.native
  /**
    * The principal that created the version.
    */
  var CreatedBy: js.UndefOr[String] = js.native
  /**
    * Indicates whether the version is the default version.
    */
  var DefaultVersion: js.UndefOr[Boolean] = js.native
  /**
    * Information about the launch template.
    */
  var LaunchTemplateData: js.UndefOr[ResponseLaunchTemplateData] = js.native
  /**
    * The ID of the launch template.
    */
  var LaunchTemplateId: js.UndefOr[String] = js.native
  /**
    * The name of the launch template.
    */
  var LaunchTemplateName: js.UndefOr[typings.awsSdk.ec2Mod.LaunchTemplateName] = js.native
  /**
    * The description for the version.
    */
  var VersionDescription: js.UndefOr[typings.awsSdk.ec2Mod.VersionDescription] = js.native
  /**
    * The version number.
    */
  var VersionNumber: js.UndefOr[Long] = js.native
}

object LaunchTemplateVersion {
  @scala.inline
  def apply(): LaunchTemplateVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateVersion]
  }
  @scala.inline
  implicit class LaunchTemplateVersionOps[Self <: LaunchTemplateVersion] (val x: Self) extends AnyVal {
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
    def setCreateTime(value: DateTime): Self = this.set("CreateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateTime: Self = this.set("CreateTime", js.undefined)
    @scala.inline
    def setCreatedBy(value: String): Self = this.set("CreatedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedBy: Self = this.set("CreatedBy", js.undefined)
    @scala.inline
    def setDefaultVersion(value: Boolean): Self = this.set("DefaultVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultVersion: Self = this.set("DefaultVersion", js.undefined)
    @scala.inline
    def setLaunchTemplateData(value: ResponseLaunchTemplateData): Self = this.set("LaunchTemplateData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLaunchTemplateData: Self = this.set("LaunchTemplateData", js.undefined)
    @scala.inline
    def setLaunchTemplateId(value: String): Self = this.set("LaunchTemplateId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLaunchTemplateId: Self = this.set("LaunchTemplateId", js.undefined)
    @scala.inline
    def setLaunchTemplateName(value: LaunchTemplateName): Self = this.set("LaunchTemplateName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLaunchTemplateName: Self = this.set("LaunchTemplateName", js.undefined)
    @scala.inline
    def setVersionDescription(value: VersionDescription): Self = this.set("VersionDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersionDescription: Self = this.set("VersionDescription", js.undefined)
    @scala.inline
    def setVersionNumber(value: Long): Self = this.set("VersionNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersionNumber: Self = this.set("VersionNumber", js.undefined)
  }
  
}

