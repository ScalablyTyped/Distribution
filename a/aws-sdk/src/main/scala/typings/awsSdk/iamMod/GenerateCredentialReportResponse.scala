package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenerateCredentialReportResponse extends js.Object {
  /**
    * Information about the credential report.
    */
  var Description: js.UndefOr[ReportStateDescriptionType] = js.native
  /**
    * Information about the state of the credential report.
    */
  var State: js.UndefOr[ReportStateType] = js.native
}

object GenerateCredentialReportResponse {
  @scala.inline
  def apply(Description: ReportStateDescriptionType = null, State: ReportStateType = null): GenerateCredentialReportResponse = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateCredentialReportResponse]
  }
}

