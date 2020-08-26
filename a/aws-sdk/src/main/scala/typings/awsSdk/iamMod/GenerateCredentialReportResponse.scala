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
  def apply(): GenerateCredentialReportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateCredentialReportResponse]
  }
  @scala.inline
  implicit class GenerateCredentialReportResponseOps[Self <: GenerateCredentialReportResponse] (val x: Self) extends AnyVal {
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
    def setDescription(value: ReportStateDescriptionType): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setState(value: ReportStateType): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
  }
  
}

