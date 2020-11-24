package typings.awsSdk.supportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeTrustedAdvisorCheckSummariesResponse extends js.Object {
  
  /**
    * The summary information for the requested Trusted Advisor checks.
    */
  var summaries: TrustedAdvisorCheckSummaryList = js.native
}
object DescribeTrustedAdvisorCheckSummariesResponse {
  
  @scala.inline
  def apply(summaries: TrustedAdvisorCheckSummaryList): DescribeTrustedAdvisorCheckSummariesResponse = {
    val __obj = js.Dynamic.literal(summaries = summaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTrustedAdvisorCheckSummariesResponse]
  }
  
  @scala.inline
  implicit class DescribeTrustedAdvisorCheckSummariesResponseOps[Self <: DescribeTrustedAdvisorCheckSummariesResponse] (val x: Self) extends AnyVal {
    
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
    def setSummariesVarargs(value: TrustedAdvisorCheckSummary*): Self = this.set("summaries", js.Array(value :_*))
    
    @scala.inline
    def setSummaries(value: TrustedAdvisorCheckSummaryList): Self = this.set("summaries", value.asInstanceOf[js.Any])
  }
}
