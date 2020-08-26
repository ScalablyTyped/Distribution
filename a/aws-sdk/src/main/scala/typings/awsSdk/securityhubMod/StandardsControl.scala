package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StandardsControl extends js.Object {
  /**
    * The identifier of the security standard control.
    */
  var ControlId: js.UndefOr[NonEmptyString] = js.native
  /**
    * The current status of the security standard control. Indicates whether the control is enabled or disabled. Security Hub does not check against disabled controls.
    */
  var ControlStatus: js.UndefOr[typings.awsSdk.securityhubMod.ControlStatus] = js.native
  /**
    * The date and time that the status of the security standard control was most recently updated.
    */
  var ControlStatusUpdatedAt: js.UndefOr[Timestamp] = js.native
  /**
    * The longer description of the security standard control. Provides information about what the control is checking for.
    */
  var Description: js.UndefOr[NonEmptyString] = js.native
  /**
    * The reason provided for the most recent change in status for the control.
    */
  var DisabledReason: js.UndefOr[NonEmptyString] = js.native
  /**
    * The list of requirements that are related to this control.
    */
  var RelatedRequirements: js.UndefOr[RelatedRequirementsList] = js.native
  /**
    * A link to remediation information for the control in the Security Hub user documentation.
    */
  var RemediationUrl: js.UndefOr[NonEmptyString] = js.native
  /**
    * The severity of findings generated from this security standard control. The finding severity is based on an assessment of how easy it would be to compromise AWS resources if the issue is detected.
    */
  var SeverityRating: js.UndefOr[typings.awsSdk.securityhubMod.SeverityRating] = js.native
  /**
    * The ARN of the security standard control.
    */
  var StandardsControlArn: js.UndefOr[NonEmptyString] = js.native
  /**
    * The title of the security standard control.
    */
  var Title: js.UndefOr[NonEmptyString] = js.native
}

object StandardsControl {
  @scala.inline
  def apply(): StandardsControl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StandardsControl]
  }
  @scala.inline
  implicit class StandardsControlOps[Self <: StandardsControl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setControlId(value: NonEmptyString): Self = this.set("ControlId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControlId: Self = this.set("ControlId", js.undefined)
    @scala.inline
    def setControlStatus(value: ControlStatus): Self = this.set("ControlStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControlStatus: Self = this.set("ControlStatus", js.undefined)
    @scala.inline
    def setControlStatusUpdatedAt(value: Timestamp): Self = this.set("ControlStatusUpdatedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControlStatusUpdatedAt: Self = this.set("ControlStatusUpdatedAt", js.undefined)
    @scala.inline
    def setDescription(value: NonEmptyString): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setDisabledReason(value: NonEmptyString): Self = this.set("DisabledReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabledReason: Self = this.set("DisabledReason", js.undefined)
    @scala.inline
    def setRelatedRequirementsVarargs(value: NonEmptyString*): Self = this.set("RelatedRequirements", js.Array(value :_*))
    @scala.inline
    def setRelatedRequirements(value: RelatedRequirementsList): Self = this.set("RelatedRequirements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelatedRequirements: Self = this.set("RelatedRequirements", js.undefined)
    @scala.inline
    def setRemediationUrl(value: NonEmptyString): Self = this.set("RemediationUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemediationUrl: Self = this.set("RemediationUrl", js.undefined)
    @scala.inline
    def setSeverityRating(value: SeverityRating): Self = this.set("SeverityRating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeverityRating: Self = this.set("SeverityRating", js.undefined)
    @scala.inline
    def setStandardsControlArn(value: NonEmptyString): Self = this.set("StandardsControlArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStandardsControlArn: Self = this.set("StandardsControlArn", js.undefined)
    @scala.inline
    def setTitle(value: NonEmptyString): Self = this.set("Title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("Title", js.undefined)
  }
  
}

