package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSamplingStatisticSummariesResult extends StObject {
  
  /**
    * Pagination token.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the number of requests instrumented for each sampling rule.
    */
  var SamplingStatisticSummaries: js.UndefOr[SamplingStatisticSummaryList] = js.undefined
}
object GetSamplingStatisticSummariesResult {
  
  inline def apply(): GetSamplingStatisticSummariesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSamplingStatisticSummariesResult]
  }
  
  extension [Self <: GetSamplingStatisticSummariesResult](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSamplingStatisticSummaries(value: SamplingStatisticSummaryList): Self = StObject.set(x, "SamplingStatisticSummaries", value.asInstanceOf[js.Any])
    
    inline def setSamplingStatisticSummariesUndefined: Self = StObject.set(x, "SamplingStatisticSummaries", js.undefined)
    
    inline def setSamplingStatisticSummariesVarargs(value: SamplingStatisticSummary*): Self = StObject.set(x, "SamplingStatisticSummaries", js.Array(value*))
  }
}
