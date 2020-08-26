package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchImportFindingsRequest extends js.Object {
  /**
    * A list of findings to import. To successfully import a finding, it must follow the AWS Security Finding Format. Maximum of 100 findings per request.
    */
  var Findings: AwsSecurityFindingList = js.native
}

object BatchImportFindingsRequest {
  @scala.inline
  def apply(Findings: AwsSecurityFindingList): BatchImportFindingsRequest = {
    val __obj = js.Dynamic.literal(Findings = Findings.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchImportFindingsRequest]
  }
  @scala.inline
  implicit class BatchImportFindingsRequestOps[Self <: BatchImportFindingsRequest] (val x: Self) extends AnyVal {
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
    def setFindingsVarargs(value: AwsSecurityFinding*): Self = this.set("Findings", js.Array(value :_*))
    @scala.inline
    def setFindings(value: AwsSecurityFindingList): Self = this.set("Findings", value.asInstanceOf[js.Any])
  }
  
}

