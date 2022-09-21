package typings.awsSdk.supportappMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSlackWorkspaceConfigurationsRequest extends StObject {
  
  /**
    * If the results of a search are large, the API only returns a portion of the results and includes a nextToken pagination token in the response. To retrieve the next batch of results, reissue the search request and include the returned token. When the API returns the last set of results, the response doesn't include a pagination token value.
    */
  var nextToken: js.UndefOr[paginationToken] = js.undefined
}
object ListSlackWorkspaceConfigurationsRequest {
  
  inline def apply(): ListSlackWorkspaceConfigurationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSlackWorkspaceConfigurationsRequest]
  }
  
  extension [Self <: ListSlackWorkspaceConfigurationsRequest](x: Self) {
    
    inline def setNextToken(value: paginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
