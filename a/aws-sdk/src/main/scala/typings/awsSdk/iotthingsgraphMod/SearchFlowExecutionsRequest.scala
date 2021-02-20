package typings.awsSdk.iotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchFlowExecutionsRequest extends StObject {
  
  /**
    * The date and time of the latest flow execution to return.
    */
  var endTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The ID of a flow execution.
    */
  var flowExecutionId: js.UndefOr[FlowExecutionId] = js.native
  
  /**
    * The maximum number of results to return in the response.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  
  /**
    * The string that specifies the next page of results. Use this when you're paginating results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * The date and time of the earliest flow execution to return.
    */
  var startTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The ID of the system instance that contains the flow.
    */
  var systemInstanceId: Urn = js.native
}
object SearchFlowExecutionsRequest {
  
  @scala.inline
  def apply(systemInstanceId: Urn): SearchFlowExecutionsRequest = {
    val __obj = js.Dynamic.literal(systemInstanceId = systemInstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchFlowExecutionsRequest]
  }
  
  @scala.inline
  implicit class SearchFlowExecutionsRequestMutableBuilder[Self <: SearchFlowExecutionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndTime(value: Timestamp): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setFlowExecutionId(value: FlowExecutionId): Self = StObject.set(x, "flowExecutionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowExecutionIdUndefined: Self = StObject.set(x, "flowExecutionId", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setStartTime(value: Timestamp): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    @scala.inline
    def setSystemInstanceId(value: Urn): Self = StObject.set(x, "systemInstanceId", value.asInstanceOf[js.Any])
  }
}
