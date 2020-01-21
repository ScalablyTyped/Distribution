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
  def apply(
    Arn: Arn = null,
    CreatedTime: Timestamp_ = null,
    LastUpdatedTime: Timestamp_ = null,
    Name: TemplateName = null,
    TemplateId: RestrictiveResourceId = null,
    Version: TemplateVersion = null
  ): Template = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (CreatedTime != null) __obj.updateDynamic("CreatedTime")(CreatedTime.asInstanceOf[js.Any])
    if (LastUpdatedTime != null) __obj.updateDynamic("LastUpdatedTime")(LastUpdatedTime.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (TemplateId != null) __obj.updateDynamic("TemplateId")(TemplateId.asInstanceOf[js.Any])
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Template]
  }
}

