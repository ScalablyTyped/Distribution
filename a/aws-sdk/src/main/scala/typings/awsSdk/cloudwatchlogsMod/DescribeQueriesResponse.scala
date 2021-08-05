package typings.awsSdk.cloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeQueriesResponse extends StObject {
  
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The list of queries that match the request.
    */
  var queries: js.UndefOr[QueryInfoList] = js.undefined
}
object DescribeQueriesResponse {
  
  inline def apply(): DescribeQueriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeQueriesResponse]
  }
  
  extension [Self <: DescribeQueriesResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setQueries(value: QueryInfoList): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
    
    inline def setQueriesUndefined: Self = StObject.set(x, "queries", js.undefined)
    
    inline def setQueriesVarargs(value: QueryInfo*): Self = StObject.set(x, "queries", js.Array(value :_*))
  }
}
