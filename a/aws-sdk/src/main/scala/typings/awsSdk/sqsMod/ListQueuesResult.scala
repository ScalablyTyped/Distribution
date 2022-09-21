package typings.awsSdk.sqsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListQueuesResult extends StObject {
  
  /**
    * Pagination token to include in the next request. Token value is null if there are no additional results to request, or if you did not set MaxResults in the request.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  
  /**
    * A list of queue URLs, up to 1,000 entries, or the value of MaxResults that you sent in the request.
    */
  var QueueUrls: js.UndefOr[QueueUrlList] = js.undefined
}
object ListQueuesResult {
  
  inline def apply(): ListQueuesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListQueuesResult]
  }
  
  extension [Self <: ListQueuesResult](x: Self) {
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setQueueUrls(value: QueueUrlList): Self = StObject.set(x, "QueueUrls", value.asInstanceOf[js.Any])
    
    inline def setQueueUrlsUndefined: Self = StObject.set(x, "QueueUrls", js.undefined)
    
    inline def setQueueUrlsVarargs(value: String*): Self = StObject.set(x, "QueueUrls", js.Array(value*))
  }
}
