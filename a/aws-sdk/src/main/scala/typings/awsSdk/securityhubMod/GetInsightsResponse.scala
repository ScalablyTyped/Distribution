package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetInsightsResponse extends StObject {
  
  /**
    * The insights returned by the operation.
    */
  var Insights: InsightList = js.native
  
  /**
    * The pagination token to use to request the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.securityhubMod.NextToken] = js.native
}
object GetInsightsResponse {
  
  @scala.inline
  def apply(Insights: InsightList): GetInsightsResponse = {
    val __obj = js.Dynamic.literal(Insights = Insights.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInsightsResponse]
  }
  
  @scala.inline
  implicit class GetInsightsResponseMutableBuilder[Self <: GetInsightsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInsights(value: InsightList): Self = StObject.set(x, "Insights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsightsVarargs(value: Insight*): Self = StObject.set(x, "Insights", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
