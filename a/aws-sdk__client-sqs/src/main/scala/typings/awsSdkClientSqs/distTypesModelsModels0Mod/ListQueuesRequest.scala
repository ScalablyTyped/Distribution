package typings.awsSdkClientSqs.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListQueuesRequest extends StObject {
  
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
    * <p>A string to use for filtering the list results. Only those queues whose name begins with the specified string are returned.</p>
    *          <p>Queue URLs and names are case-sensitive.</p>
    */
  var QueueNamePrefix: js.UndefOr[String] = js.undefined
}
object ListQueuesRequest {
  
  inline def apply(): ListQueuesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListQueuesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListQueuesRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setQueueNamePrefix(value: String): Self = StObject.set(x, "QueueNamePrefix", value.asInstanceOf[js.Any])
    
    inline def setQueueNamePrefixUndefined: Self = StObject.set(x, "QueueNamePrefix", js.undefined)
  }
}
