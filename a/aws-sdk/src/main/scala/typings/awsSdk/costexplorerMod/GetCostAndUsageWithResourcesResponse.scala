package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCostAndUsageWithResourcesResponse extends StObject {
  
  /**
    * The groups that are specified by the Filter or GroupBy parameters in the request.
    */
  var GroupDefinitions: js.UndefOr[typings.awsSdk.costexplorerMod.GroupDefinitions] = js.undefined
  
  /**
    * The token for the next set of retrievable results. AWS provides the token when the response from a previous call has more results than the maximum page size.
    */
  var NextPageToken: js.UndefOr[typings.awsSdk.costexplorerMod.NextPageToken] = js.undefined
  
  /**
    * The time period that is covered by the results in the response.
    */
  var ResultsByTime: js.UndefOr[typings.awsSdk.costexplorerMod.ResultsByTime] = js.undefined
}
object GetCostAndUsageWithResourcesResponse {
  
  @scala.inline
  def apply(): GetCostAndUsageWithResourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCostAndUsageWithResourcesResponse]
  }
  
  @scala.inline
  implicit class GetCostAndUsageWithResourcesResponseMutableBuilder[Self <: GetCostAndUsageWithResourcesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupDefinitions(value: GroupDefinitions): Self = StObject.set(x, "GroupDefinitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupDefinitionsUndefined: Self = StObject.set(x, "GroupDefinitions", js.undefined)
    
    @scala.inline
    def setGroupDefinitionsVarargs(value: GroupDefinition*): Self = StObject.set(x, "GroupDefinitions", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: NextPageToken): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "NextPageToken", js.undefined)
    
    @scala.inline
    def setResultsByTime(value: ResultsByTime): Self = StObject.set(x, "ResultsByTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsByTimeUndefined: Self = StObject.set(x, "ResultsByTime", js.undefined)
    
    @scala.inline
    def setResultsByTimeVarargs(value: ResultByTime*): Self = StObject.set(x, "ResultsByTime", js.Array(value :_*))
  }
}
