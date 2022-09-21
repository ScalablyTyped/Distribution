package typings.awsSdk.iottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListWorkspacesRequest extends StObject {
  
  /**
    * The maximum number of results to display.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The string that specifies the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListWorkspacesRequest {
  
  inline def apply(): ListWorkspacesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWorkspacesRequest]
  }
  
  extension [Self <: ListWorkspacesRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
