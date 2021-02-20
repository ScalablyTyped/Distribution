package typings.awsSdk.ivsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListStreamKeysResponse extends StObject {
  
  /**
    * If there are more stream keys than maxResults, use nextToken in the request to get the next set.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * List of stream keys.
    */
  var streamKeys: StreamKeyList = js.native
}
object ListStreamKeysResponse {
  
  @scala.inline
  def apply(streamKeys: StreamKeyList): ListStreamKeysResponse = {
    val __obj = js.Dynamic.literal(streamKeys = streamKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListStreamKeysResponse]
  }
  
  @scala.inline
  implicit class ListStreamKeysResponseMutableBuilder[Self <: ListStreamKeysResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setStreamKeys(value: StreamKeyList): Self = StObject.set(x, "streamKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamKeysVarargs(value: StreamKeySummary*): Self = StObject.set(x, "streamKeys", js.Array(value :_*))
  }
}
