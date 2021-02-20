package typings.awsSdk.sqsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListQueuesRequest extends StObject {
  
  /**
    * Maximum number of results to include in the response. Value range is 1 to 1000. You must set MaxResults to receive a value for NextToken in the response.
    */
  var MaxResults: js.UndefOr[BoxedInteger] = js.native
  
  /**
    * Pagination token to request the next set of results.
    */
  var NextToken: js.UndefOr[Token] = js.native
  
  /**
    * A string to use for filtering the list results. Only those queues whose name begins with the specified string are returned. Queue URLs and names are case-sensitive.
    */
  var QueueNamePrefix: js.UndefOr[String] = js.native
}
object ListQueuesRequest {
  
  @scala.inline
  def apply(): ListQueuesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListQueuesRequest]
  }
  
  @scala.inline
  implicit class ListQueuesRequestMutableBuilder[Self <: ListQueuesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: BoxedInteger): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setQueueNamePrefix(value: String): Self = StObject.set(x, "QueueNamePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueNamePrefixUndefined: Self = StObject.set(x, "QueueNamePrefix", js.undefined)
  }
}
