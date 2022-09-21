package typings.awsSdk.ivsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStreamKeysResponse extends StObject {
  
  /**
    * If there are more stream keys than maxResults, use nextToken in the request to get the next set.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * List of stream keys.
    */
  var streamKeys: StreamKeyList
}
object ListStreamKeysResponse {
  
  inline def apply(streamKeys: StreamKeyList): ListStreamKeysResponse = {
    val __obj = js.Dynamic.literal(streamKeys = streamKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListStreamKeysResponse]
  }
  
  extension [Self <: ListStreamKeysResponse](x: Self) {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setStreamKeys(value: StreamKeyList): Self = StObject.set(x, "streamKeys", value.asInstanceOf[js.Any])
    
    inline def setStreamKeysVarargs(value: StreamKeySummary*): Self = StObject.set(x, "streamKeys", js.Array(value*))
  }
}
