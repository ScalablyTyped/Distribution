package typings.awsSdk.cloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeQueriesResponse extends StObject {
  
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * The list of queries that match the request.
    */
  var queries: js.UndefOr[QueryInfoList] = js.native
}
object DescribeQueriesResponse {
  
  @scala.inline
  def apply(): DescribeQueriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeQueriesResponse]
  }
  
  @scala.inline
  implicit class DescribeQueriesResponseMutableBuilder[Self <: DescribeQueriesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setQueries(value: QueryInfoList): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueriesUndefined: Self = StObject.set(x, "queries", js.undefined)
    
    @scala.inline
    def setQueriesVarargs(value: QueryInfo*): Self = StObject.set(x, "queries", js.Array(value :_*))
  }
}
