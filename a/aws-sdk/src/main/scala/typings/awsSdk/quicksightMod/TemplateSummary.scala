package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateSummary extends js.Object {
  /**
    * A summary of a template.
    */
  var Arn: js.UndefOr[typings.awsSdk.quicksightMod.Arn] = js.native
  /**
    * The last time that this template was created.
    */
  var CreatedTime: js.UndefOr[Timestamp_] = js.native
  /**
    * The last time that this template was updated.
    */
  var LastUpdatedTime: js.UndefOr[Timestamp_] = js.native
  /**
    * A structure containing a list of version numbers for the template summary.
    */
  var LatestVersionNumber: js.UndefOr[VersionNumber] = js.native
  /**
    * A display name for the template.
    */
  var Name: js.UndefOr[TemplateName] = js.native
  /**
    * The ID of the template. This ID is unique per AWS Region for each AWS account.
    */
  var TemplateId: js.UndefOr[RestrictiveResourceId] = js.native
}

object TemplateSummary {
  @scala.inline
  def apply(
    Arn: Arn = null,
    CreatedTime: Timestamp_ = null,
    LastUpdatedTime: Timestamp_ = null,
    LatestVersionNumber: Int | scala.Double = null,
    Name: TemplateName = null,
    TemplateId: RestrictiveResourceId = null
  ): TemplateSummary = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (CreatedTime != null) __obj.updateDynamic("CreatedTime")(CreatedTime.asInstanceOf[js.Any])
    if (LastUpdatedTime != null) __obj.updateDynamic("LastUpdatedTime")(LastUpdatedTime.asInstanceOf[js.Any])
    if (LatestVersionNumber != null) __obj.updateDynamic("LatestVersionNumber")(LatestVersionNumber.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (TemplateId != null) __obj.updateDynamic("TemplateId")(TemplateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateSummary]
  }
}

