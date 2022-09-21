package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAuditMitigationActionsTasksResponse extends StObject {
  
  /**
    * The token for the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The collection of audit mitigation tasks that matched the filter criteria.
    */
  var tasks: js.UndefOr[AuditMitigationActionsTaskMetadataList] = js.undefined
}
object ListAuditMitigationActionsTasksResponse {
  
  inline def apply(): ListAuditMitigationActionsTasksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAuditMitigationActionsTasksResponse]
  }
  
  extension [Self <: ListAuditMitigationActionsTasksResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setTasks(value: AuditMitigationActionsTaskMetadataList): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
    
    inline def setTasksUndefined: Self = StObject.set(x, "tasks", js.undefined)
    
    inline def setTasksVarargs(value: AuditMitigationActionsTaskMetadata*): Self = StObject.set(x, "tasks", js.Array(value*))
  }
}
