package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetConformancePackComplianceDetailsRequest extends js.Object {
  /**
    * Name of the conformance pack.
    */
  var ConformancePackName: typings.awsSdk.configserviceMod.ConformancePackName = js.native
  /**
    * A ConformancePackEvaluationFilters object.
    */
  var Filters: js.UndefOr[ConformancePackEvaluationFilters] = js.native
  /**
    * The maximum number of evaluation results returned on each page. If you do no specify a number, AWS Config uses the default. The default is 100.
    */
  var Limit: js.UndefOr[GetConformancePackComplianceDetailsLimit] = js.native
  /**
    * The nextToken string returned in a previous request that you use to request the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typings.awsSdk.configserviceMod.NextToken] = js.native
}

object GetConformancePackComplianceDetailsRequest {
  @scala.inline
  def apply(ConformancePackName: ConformancePackName): GetConformancePackComplianceDetailsRequest = {
    val __obj = js.Dynamic.literal(ConformancePackName = ConformancePackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConformancePackComplianceDetailsRequest]
  }
  @scala.inline
  implicit class GetConformancePackComplianceDetailsRequestOps[Self <: GetConformancePackComplianceDetailsRequest] (val x: Self) extends AnyVal {
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
    def setConformancePackName(value: ConformancePackName): Self = this.set("ConformancePackName", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilters(value: ConformancePackEvaluationFilters): Self = this.set("Filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("Filters", js.undefined)
    @scala.inline
    def setLimit(value: GetConformancePackComplianceDetailsLimit): Self = this.set("Limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("Limit", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

