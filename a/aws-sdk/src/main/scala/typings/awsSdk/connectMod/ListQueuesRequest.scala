package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListQueuesRequest extends StObject {
  
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typings.awsSdk.connectMod.InstanceId = js.native
  
  /**
    * The maximimum number of results to return per page.
    */
  var MaxResults: js.UndefOr[MaxResult1000] = js.native
  
  /**
    * The token for the next set of results. Use the value returned in the previous response in the next request to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.connectMod.NextToken] = js.native
  
  /**
    * The type of queue.
    */
  var QueueTypes: js.UndefOr[typings.awsSdk.connectMod.QueueTypes] = js.native
}
object ListQueuesRequest {
  
  @scala.inline
  def apply(InstanceId: InstanceId): ListQueuesRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListQueuesRequest]
  }
  
  @scala.inline
  implicit class ListQueuesRequestMutableBuilder[Self <: ListQueuesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: MaxResult1000): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setQueueTypes(value: QueueTypes): Self = StObject.set(x, "QueueTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueTypesUndefined: Self = StObject.set(x, "QueueTypes", js.undefined)
    
    @scala.inline
    def setQueueTypesVarargs(value: QueueType*): Self = StObject.set(x, "QueueTypes", js.Array(value :_*))
  }
}
