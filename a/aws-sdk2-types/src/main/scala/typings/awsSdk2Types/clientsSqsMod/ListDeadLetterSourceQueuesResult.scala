package typings.awsSdk2Types.clientsSqsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDeadLetterSourceQueuesResult extends StObject {
  
  /**
    * Pagination token to include in the next request. Token value is null if there are no additional results to request, or if you did not set MaxResults in the request.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  
  /**
    * A list of source queue URLs that have the RedrivePolicy queue attribute configured with a dead-letter queue.
    */
  var queueUrls: QueueUrlList
}
object ListDeadLetterSourceQueuesResult {
  
  inline def apply(queueUrls: QueueUrlList): ListDeadLetterSourceQueuesResult = {
    val __obj = js.Dynamic.literal(queueUrls = queueUrls.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDeadLetterSourceQueuesResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListDeadLetterSourceQueuesResult] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setQueueUrls(value: QueueUrlList): Self = StObject.set(x, "queueUrls", value.asInstanceOf[js.Any])
    
    inline def setQueueUrlsVarargs(value: String*): Self = StObject.set(x, "queueUrls", js.Array(value*))
  }
}
