package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFindingsResponse extends js.Object {
  /**
    * The findings that matched the filters specified in the request.
    */
  var Findings: AwsSecurityFindingList = js.native
  /**
    * The pagination token to use to request the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.securityhubMod.NextToken] = js.native
}

object GetFindingsResponse {
  @scala.inline
  def apply(Findings: AwsSecurityFindingList): GetFindingsResponse = {
    val __obj = js.Dynamic.literal(Findings = Findings.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFindingsResponse]
  }
  @scala.inline
  implicit class GetFindingsResponseOps[Self <: GetFindingsResponse] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

