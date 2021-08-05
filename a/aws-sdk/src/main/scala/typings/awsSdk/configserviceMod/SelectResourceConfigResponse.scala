package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectResourceConfigResponse extends StObject {
  
  /**
    * The nextToken string returned in a previous request that you use to request the next page of results in a paginated response. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.configserviceMod.NextToken] = js.undefined
  
  /**
    * Returns the QueryInfo object.
    */
  var QueryInfo: js.UndefOr[typings.awsSdk.configserviceMod.QueryInfo] = js.undefined
  
  /**
    * Returns the results for the SQL query.
    */
  var Results: js.UndefOr[typings.awsSdk.configserviceMod.Results] = js.undefined
}
object SelectResourceConfigResponse {
  
  inline def apply(): SelectResourceConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectResourceConfigResponse]
  }
  
  extension [Self <: SelectResourceConfigResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setQueryInfo(value: QueryInfo): Self = StObject.set(x, "QueryInfo", value.asInstanceOf[js.Any])
    
    inline def setQueryInfoUndefined: Self = StObject.set(x, "QueryInfo", js.undefined)
    
    inline def setResults(value: Results): Self = StObject.set(x, "Results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "Results", js.undefined)
    
    inline def setResultsVarargs(value: String*): Self = StObject.set(x, "Results", js.Array(value :_*))
  }
}
