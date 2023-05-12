package typings.awsSdkClientSqs.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDeadLetterSourceQueuesRequest extends StObject {
  
  /**
    * <p>Maximum number of results to include in the response. Value range is 1 to 1000.
    *           You must set <code>MaxResults</code> to receive a value for <code>NextToken</code> in the response.</p>
    */
  var MaxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * <p>Pagination token to request the next set of results.</p>
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The URL of a dead-letter queue.</p>
    *          <p>Queue URLs and names are case-sensitive.</p>
    */
  var QueueUrl: js.UndefOr[String] = js.undefined
}
object ListDeadLetterSourceQueuesRequest {
  
  inline def apply(): ListDeadLetterSourceQueuesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDeadLetterSourceQueuesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListDeadLetterSourceQueuesRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setQueueUrl(value: String): Self = StObject.set(x, "QueueUrl", value.asInstanceOf[js.Any])
    
    inline def setQueueUrlUndefined: Self = StObject.set(x, "QueueUrl", js.undefined)
  }
}
