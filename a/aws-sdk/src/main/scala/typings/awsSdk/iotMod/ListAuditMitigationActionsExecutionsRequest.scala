package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAuditMitigationActionsExecutionsRequest extends StObject {
  
  /**
    * Specify this filter to limit results to those with a specific status.
    */
  var actionStatus: js.UndefOr[AuditMitigationActionsExecutionStatus] = js.undefined
  
  /**
    * Specify this filter to limit results to those that were applied to a specific audit finding.
    */
  var findingId: FindingId
  
  /**
    * The maximum number of results to return at one time. The default is 25.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The token for the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * Specify this filter to limit results to actions for a specific audit mitigation actions task.
    */
  var taskId: AuditMitigationActionsTaskId
}
object ListAuditMitigationActionsExecutionsRequest {
  
  @scala.inline
  def apply(findingId: FindingId, taskId: AuditMitigationActionsTaskId): ListAuditMitigationActionsExecutionsRequest = {
    val __obj = js.Dynamic.literal(findingId = findingId.asInstanceOf[js.Any], taskId = taskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAuditMitigationActionsExecutionsRequest]
  }
  
  @scala.inline
  implicit class ListAuditMitigationActionsExecutionsRequestMutableBuilder[Self <: ListAuditMitigationActionsExecutionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionStatus(value: AuditMitigationActionsExecutionStatus): Self = StObject.set(x, "actionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionStatusUndefined: Self = StObject.set(x, "actionStatus", js.undefined)
    
    @scala.inline
    def setFindingId(value: FindingId): Self = StObject.set(x, "findingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setTaskId(value: AuditMitigationActionsTaskId): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
  }
}
