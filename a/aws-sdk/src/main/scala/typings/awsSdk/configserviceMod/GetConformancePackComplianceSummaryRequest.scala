package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetConformancePackComplianceSummaryRequest extends StObject {
  
  /**
    * Names of conformance packs.
    */
  var ConformancePackNames: ConformancePackNamesToSummarizeList
  
  /**
    * The maximum number of conformance packs returned on each page.
    */
  var Limit: js.UndefOr[PageSizeLimit] = js.undefined
  
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typings.awsSdk.configserviceMod.NextToken] = js.undefined
}
object GetConformancePackComplianceSummaryRequest {
  
  @scala.inline
  def apply(ConformancePackNames: ConformancePackNamesToSummarizeList): GetConformancePackComplianceSummaryRequest = {
    val __obj = js.Dynamic.literal(ConformancePackNames = ConformancePackNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConformancePackComplianceSummaryRequest]
  }
  
  @scala.inline
  implicit class GetConformancePackComplianceSummaryRequestMutableBuilder[Self <: GetConformancePackComplianceSummaryRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConformancePackNames(value: ConformancePackNamesToSummarizeList): Self = StObject.set(x, "ConformancePackNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConformancePackNamesVarargs(value: ConformancePackName*): Self = StObject.set(x, "ConformancePackNames", js.Array(value :_*))
    
    @scala.inline
    def setLimit(value: PageSizeLimit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
