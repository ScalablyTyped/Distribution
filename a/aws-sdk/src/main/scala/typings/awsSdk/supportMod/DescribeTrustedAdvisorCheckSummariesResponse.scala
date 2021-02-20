package typings.awsSdk.supportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeTrustedAdvisorCheckSummariesResponse extends StObject {
  
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
  implicit class DescribeTrustedAdvisorCheckSummariesResponseMutableBuilder[Self <: DescribeTrustedAdvisorCheckSummariesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSummaries(value: TrustedAdvisorCheckSummaryList): Self = StObject.set(x, "summaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummariesVarargs(value: TrustedAdvisorCheckSummary*): Self = StObject.set(x, "summaries", js.Array(value :_*))
  }
}
