package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Template extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the template.
    */
  var Arn: js.UndefOr[typings.awsSdk.quicksightMod.Arn] = js.native
  /**
    * Time when this was created.
    */
  var CreatedTime: js.UndefOr[Timestamp_] = js.native
  /**
    * Time when this was last updated.
    */
  var LastUpdatedTime: js.UndefOr[Timestamp_] = js.native
  /**
    * The display name of the template.
    */
  var Name: js.UndefOr[TemplateName] = js.native
  /**
    * The ID for the template. This is unique per AWS Region for each AWS account.
    */
  var TemplateId: js.UndefOr[RestrictiveResourceId] = js.native
  /**
    * A structure describing the versions of the template.
    */
  var Version: js.UndefOr[TemplateVersion] = js.native
}

object Template {
  @scala.inline
  def apply(): Template = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Template]
  }
  @scala.inline
  implicit class TemplateOps[Self <: Template] (val x: Self) extends AnyVal {
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
    def setArn(value: Arn): Self = this.set("Arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    @scala.inline
    def setCreatedTime(value: Timestamp_): Self = this.set("CreatedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedTime: Self = this.set("CreatedTime", js.undefined)
    @scala.inline
    def setLastUpdatedTime(value: Timestamp_): Self = this.set("LastUpdatedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdatedTime: Self = this.set("LastUpdatedTime", js.undefined)
    @scala.inline
    def setName(value: TemplateName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setTemplateId(value: RestrictiveResourceId): Self = this.set("TemplateId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateId: Self = this.set("TemplateId", js.undefined)
    @scala.inline
    def setVersion(value: TemplateVersion): Self = this.set("Version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("Version", js.undefined)
  }
  
}

