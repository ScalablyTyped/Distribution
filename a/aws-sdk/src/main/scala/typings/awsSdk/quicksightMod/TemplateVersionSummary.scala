package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateVersionSummary extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the template version.
    */
  var Arn: js.UndefOr[typings.awsSdk.quicksightMod.Arn] = js.native
  /**
    * The time that this template version was created.
    */
  var CreatedTime: js.UndefOr[Timestamp_] = js.native
  /**
    * The description of the template version.
    */
  var Description: js.UndefOr[VersionDescription] = js.native
  /**
    * The status of the template version.
    */
  var Status: js.UndefOr[ResourceStatus] = js.native
  /**
    * The version number of the template version.
    */
  var VersionNumber: js.UndefOr[typings.awsSdk.quicksightMod.VersionNumber] = js.native
}

object TemplateVersionSummary {
  @scala.inline
  def apply(
    Arn: Arn = null,
    CreatedTime: Timestamp_ = null,
    Description: VersionDescription = null,
    Status: ResourceStatus = null,
    VersionNumber: js.UndefOr[VersionNumber] = js.undefined
  ): TemplateVersionSummary = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (CreatedTime != null) __obj.updateDynamic("CreatedTime")(CreatedTime.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (!js.isUndefined(VersionNumber)) __obj.updateDynamic("VersionNumber")(VersionNumber.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateVersionSummary]
  }
}

