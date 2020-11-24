package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSamplingStatisticSummariesResult extends js.Object {
  
  /**
    * Pagination token.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * Information about the number of requests instrumented for each sampling rule.
    */
  var SamplingStatisticSummaries: js.UndefOr[SamplingStatisticSummaryList] = js.native
}
object GetSamplingStatisticSummariesResult {
  
  @scala.inline
  def apply(): GetSamplingStatisticSummariesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSamplingStatisticSummariesResult]
  }
  
  @scala.inline
  implicit class GetSamplingStatisticSummariesResultOps[Self <: GetSamplingStatisticSummariesResult] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setSamplingStatisticSummariesVarargs(value: SamplingStatisticSummary*): Self = this.set("SamplingStatisticSummaries", js.Array(value :_*))
    
    @scala.inline
    def setSamplingStatisticSummaries(value: SamplingStatisticSummaryList): Self = this.set("SamplingStatisticSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSamplingStatisticSummaries: Self = this.set("SamplingStatisticSummaries", js.undefined)
  }
}
