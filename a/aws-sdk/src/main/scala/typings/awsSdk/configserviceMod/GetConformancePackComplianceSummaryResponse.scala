package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetConformancePackComplianceSummaryResponse extends js.Object {
  /**
    * A list of ConformancePackComplianceSummary objects. 
    */
  var ConformancePackComplianceSummaryList: js.UndefOr[typings.awsSdk.configserviceMod.ConformancePackComplianceSummaryList] = js.native
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typings.awsSdk.configserviceMod.NextToken] = js.native
}

object GetConformancePackComplianceSummaryResponse {
  @scala.inline
  def apply(): GetConformancePackComplianceSummaryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetConformancePackComplianceSummaryResponse]
  }
  @scala.inline
  implicit class GetConformancePackComplianceSummaryResponseOps[Self <: GetConformancePackComplianceSummaryResponse] (val x: Self) extends AnyVal {
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
    def setConformancePackComplianceSummaryListVarargs(value: ConformancePackComplianceSummary*): Self = this.set("ConformancePackComplianceSummaryList", js.Array(value :_*))
    @scala.inline
    def setConformancePackComplianceSummaryList(value: ConformancePackComplianceSummaryList): Self = this.set("ConformancePackComplianceSummaryList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConformancePackComplianceSummaryList: Self = this.set("ConformancePackComplianceSummaryList", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

