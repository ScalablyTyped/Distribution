package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectAggregateResourceConfigResponse extends StObject {
  
  /**
    * The nextToken string returned in a previous request that you use to request the next page of results in a paginated response. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.configserviceMod.NextToken] = js.native
  
  var QueryInfo: js.UndefOr[typings.awsSdk.configserviceMod.QueryInfo] = js.native
  
  /**
    * Returns the results for the SQL query.
    */
  var Results: js.UndefOr[typings.awsSdk.configserviceMod.Results] = js.native
}
object SelectAggregateResourceConfigResponse {
  
  @scala.inline
  def apply(): SelectAggregateResourceConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectAggregateResourceConfigResponse]
  }
  
  @scala.inline
  implicit class SelectAggregateResourceConfigResponseMutableBuilder[Self <: SelectAggregateResourceConfigResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setQueryInfo(value: QueryInfo): Self = StObject.set(x, "QueryInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryInfoUndefined: Self = StObject.set(x, "QueryInfo", js.undefined)
    
    @scala.inline
    def setResults(value: Results): Self = StObject.set(x, "Results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsUndefined: Self = StObject.set(x, "Results", js.undefined)
    
    @scala.inline
    def setResultsVarargs(value: String*): Self = StObject.set(x, "Results", js.Array(value :_*))
  }
}
