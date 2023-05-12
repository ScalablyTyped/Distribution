package typings.awsSdkClientSqs.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDeadLetterSourceQueuesResult extends StObject {
  
  /**
    * <p>Pagination token to include in the next request. Token value is <code>null</code> if there are no additional
    *           results to request, or if you did not set <code>MaxResults</code> in the request.</p>
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * <p>A list of source queue URLs that have the <code>RedrivePolicy</code> queue attribute configured with a dead-letter queue.</p>
    */
  var queueUrls: js.UndefOr[js.Array[String]] = js.undefined
}
object ListDeadLetterSourceQueuesResult {
  
  inline def apply(): ListDeadLetterSourceQueuesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDeadLetterSourceQueuesResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListDeadLetterSourceQueuesResult] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setQueueUrls(value: js.Array[String]): Self = StObject.set(x, "queueUrls", value.asInstanceOf[js.Any])
    
    inline def setQueueUrlsUndefined: Self = StObject.set(x, "queueUrls", js.undefined)
    
    inline def setQueueUrlsVarargs(value: String*): Self = StObject.set(x, "queueUrls", js.Array(value*))
  }
}
