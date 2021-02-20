package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetConformancePackComplianceSummaryResponse extends StObject {
  
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
  implicit class GetConformancePackComplianceSummaryResponseMutableBuilder[Self <: GetConformancePackComplianceSummaryResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConformancePackComplianceSummaryList(value: ConformancePackComplianceSummaryList): Self = StObject.set(x, "ConformancePackComplianceSummaryList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConformancePackComplianceSummaryListUndefined: Self = StObject.set(x, "ConformancePackComplianceSummaryList", js.undefined)
    
    @scala.inline
    def setConformancePackComplianceSummaryListVarargs(value: ConformancePackComplianceSummary*): Self = StObject.set(x, "ConformancePackComplianceSummaryList", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
