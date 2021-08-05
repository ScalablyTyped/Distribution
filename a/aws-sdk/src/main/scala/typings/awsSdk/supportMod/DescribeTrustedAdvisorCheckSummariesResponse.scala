package typings.awsSdk.supportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTrustedAdvisorCheckSummariesResponse extends StObject {
  
  /**
    * The summary information for the requested Trusted Advisor checks.
    */
  var summaries: TrustedAdvisorCheckSummaryList
}
object DescribeTrustedAdvisorCheckSummariesResponse {
  
  inline def apply(summaries: TrustedAdvisorCheckSummaryList): DescribeTrustedAdvisorCheckSummariesResponse = {
    val __obj = js.Dynamic.literal(summaries = summaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTrustedAdvisorCheckSummariesResponse]
  }
  
  extension [Self <: DescribeTrustedAdvisorCheckSummariesResponse](x: Self) {
    
    inline def setSummaries(value: TrustedAdvisorCheckSummaryList): Self = StObject.set(x, "summaries", value.asInstanceOf[js.Any])
    
    inline def setSummariesVarargs(value: TrustedAdvisorCheckSummary*): Self = StObject.set(x, "summaries", js.Array(value :_*))
  }
}
