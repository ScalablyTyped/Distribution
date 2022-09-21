package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStoredQueriesResponse extends StObject {
  
  /**
    * If the previous paginated request didn't return all of the remaining results, the response object's NextToken parameter value is set to a token. To retrieve the next set of results, call this action again and assign that token to the request object's NextToken parameter. If there are no remaining results, the previous response object's NextToken parameter is set to null. 
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * A list of StoredQueryMetadata objects.
    */
  var StoredQueryMetadata: js.UndefOr[StoredQueryMetadataList] = js.undefined
}
object ListStoredQueriesResponse {
  
  inline def apply(): ListStoredQueriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStoredQueriesResponse]
  }
  
  extension [Self <: ListStoredQueriesResponse](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStoredQueryMetadata(value: StoredQueryMetadataList): Self = StObject.set(x, "StoredQueryMetadata", value.asInstanceOf[js.Any])
    
    inline def setStoredQueryMetadataUndefined: Self = StObject.set(x, "StoredQueryMetadata", js.undefined)
    
    inline def setStoredQueryMetadataVarargs(value: StoredQueryMetadata*): Self = StObject.set(x, "StoredQueryMetadata", js.Array(value*))
  }
}
