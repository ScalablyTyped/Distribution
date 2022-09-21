package typings.awsSdk.detectiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListGraphsResponse extends StObject {
  
  /**
    * A list of behavior graphs that the account is an administrator account for.
    */
  var GraphList: js.UndefOr[typings.awsSdk.detectiveMod.GraphList] = js.undefined
  
  /**
    * If there are more behavior graphs remaining in the results, then this is the pagination token to use to request the next page of behavior graphs.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListGraphsResponse {
  
  inline def apply(): ListGraphsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGraphsResponse]
  }
  
  extension [Self <: ListGraphsResponse](x: Self) {
    
    inline def setGraphList(value: GraphList): Self = StObject.set(x, "GraphList", value.asInstanceOf[js.Any])
    
    inline def setGraphListUndefined: Self = StObject.set(x, "GraphList", js.undefined)
    
    inline def setGraphListVarargs(value: Graph*): Self = StObject.set(x, "GraphList", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
