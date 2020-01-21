package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StandardsControl extends js.Object {
  /**
    * The identifier of the compliance standard control.
    */
  var ControlId: js.UndefOr[NonEmptyString] = js.native
  /**
    * The current status of the compliance standard control. Indicates whether the control is enabled or disabled. Security Hub does not check against disabled controls.
    */
  var ControlStatus: js.UndefOr[typings.awsSdk.securityhubMod.ControlStatus] = js.native
  /**
    * The date and time that the status of the compliance standard control was most recently updated.
    */
  var ControlStatusUpdatedAt: js.UndefOr[Timestamp] = js.native
  /**
    * The longer description of the compliance standard control. Provides information about what the control is checking for.
    */
  var Description: js.UndefOr[NonEmptyString] = js.native
  /**
    * The reason provided for the most recent change in status for the control.
    */
  var DisabledReason: js.UndefOr[NonEmptyString] = js.native
  /**
    * A link to remediation information for the control in the Security Hub user documentation
    */
  var RemediationUrl: js.UndefOr[NonEmptyString] = js.native
  /**
    * The severity of findings generated from this compliance standard control. The finding severity is based on an assessment of how easy it would be to compromise AWS resources if the compliance issue is detected.
    */
  var SeverityRating: js.UndefOr[typings.awsSdk.securityhubMod.SeverityRating] = js.native
  /**
    * The ARN of the compliance standard control.
    */
  var StandardsControlArn: js.UndefOr[NonEmptyString] = js.native
  /**
    * The title of the compliance standard control.
    */
  var Title: js.UndefOr[NonEmptyString] = js.native
}

object StandardsControl {
  @scala.inline
  def apply(
    ControlId: NonEmptyString = null,
    ControlStatus: ControlStatus = null,
    ControlStatusUpdatedAt: Timestamp = null,
    Description: NonEmptyString = null,
    DisabledReason: NonEmptyString = null,
    RemediationUrl: NonEmptyString = null,
    SeverityRating: SeverityRating = null,
    StandardsControlArn: NonEmptyString = null,
    Title: NonEmptyString = null
  ): StandardsControl = {
    val __obj = js.Dynamic.literal()
    if (ControlId != null) __obj.updateDynamic("ControlId")(ControlId.asInstanceOf[js.Any])
    if (ControlStatus != null) __obj.updateDynamic("ControlStatus")(ControlStatus.asInstanceOf[js.Any])
    if (ControlStatusUpdatedAt != null) __obj.updateDynamic("ControlStatusUpdatedAt")(ControlStatusUpdatedAt.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (DisabledReason != null) __obj.updateDynamic("DisabledReason")(DisabledReason.asInstanceOf[js.Any])
    if (RemediationUrl != null) __obj.updateDynamic("RemediationUrl")(RemediationUrl.asInstanceOf[js.Any])
    if (SeverityRating != null) __obj.updateDynamic("SeverityRating")(SeverityRating.asInstanceOf[js.Any])
    if (StandardsControlArn != null) __obj.updateDynamic("StandardsControlArn")(StandardsControlArn.asInstanceOf[js.Any])
    if (Title != null) __obj.updateDynamic("Title")(Title.asInstanceOf[js.Any])
    __obj.asInstanceOf[StandardsControl]
  }
}

