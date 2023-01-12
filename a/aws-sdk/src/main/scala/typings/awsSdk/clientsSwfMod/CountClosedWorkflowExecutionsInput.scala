package typings.awsSdk.clientsSwfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CountClosedWorkflowExecutionsInput extends StObject {
  
  /**
    * If specified, only workflow executions that match this close status are counted. This filter has an affect only if executionStatus is specified as CLOSED.   closeStatusFilter, executionFilter, typeFilter and tagFilter are mutually exclusive. You can specify at most one of these in a request. 
    */
  var closeStatusFilter: js.UndefOr[CloseStatusFilter] = js.undefined
  
  /**
    * If specified, only workflow executions that meet the close time criteria of the filter are counted.   startTimeFilter and closeTimeFilter are mutually exclusive. You must specify one of these in a request but not both. 
    */
  var closeTimeFilter: js.UndefOr[ExecutionTimeFilter] = js.undefined
  
  /**
    * The name of the domain containing the workflow executions to count.
    */
  var domain: DomainName
  
  /**
    * If specified, only workflow executions matching the WorkflowId in the filter are counted.   closeStatusFilter, executionFilter, typeFilter and tagFilter are mutually exclusive. You can specify at most one of these in a request. 
    */
  var executionFilter: js.UndefOr[WorkflowExecutionFilter] = js.undefined
  
  /**
    * If specified, only workflow executions that meet the start time criteria of the filter are counted.   startTimeFilter and closeTimeFilter are mutually exclusive. You must specify one of these in a request but not both. 
    */
  var startTimeFilter: js.UndefOr[ExecutionTimeFilter] = js.undefined
  
  /**
    * If specified, only executions that have a tag that matches the filter are counted.   closeStatusFilter, executionFilter, typeFilter and tagFilter are mutually exclusive. You can specify at most one of these in a request. 
    */
  var tagFilter: js.UndefOr[TagFilter] = js.undefined
  
  /**
    * If specified, indicates the type of the workflow executions to be counted.   closeStatusFilter, executionFilter, typeFilter and tagFilter are mutually exclusive. You can specify at most one of these in a request. 
    */
  var typeFilter: js.UndefOr[WorkflowTypeFilter] = js.undefined
}
object CountClosedWorkflowExecutionsInput {
  
  inline def apply(domain: DomainName): CountClosedWorkflowExecutionsInput = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[CountClosedWorkflowExecutionsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CountClosedWorkflowExecutionsInput] (val x: Self) extends AnyVal {
    
    inline def setCloseStatusFilter(value: CloseStatusFilter): Self = StObject.set(x, "closeStatusFilter", value.asInstanceOf[js.Any])
    
    inline def setCloseStatusFilterUndefined: Self = StObject.set(x, "closeStatusFilter", js.undefined)
    
    inline def setCloseTimeFilter(value: ExecutionTimeFilter): Self = StObject.set(x, "closeTimeFilter", value.asInstanceOf[js.Any])
    
    inline def setCloseTimeFilterUndefined: Self = StObject.set(x, "closeTimeFilter", js.undefined)
    
    inline def setDomain(value: DomainName): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setExecutionFilter(value: WorkflowExecutionFilter): Self = StObject.set(x, "executionFilter", value.asInstanceOf[js.Any])
    
    inline def setExecutionFilterUndefined: Self = StObject.set(x, "executionFilter", js.undefined)
    
    inline def setStartTimeFilter(value: ExecutionTimeFilter): Self = StObject.set(x, "startTimeFilter", value.asInstanceOf[js.Any])
    
    inline def setStartTimeFilterUndefined: Self = StObject.set(x, "startTimeFilter", js.undefined)
    
    inline def setTagFilter(value: TagFilter): Self = StObject.set(x, "tagFilter", value.asInstanceOf[js.Any])
    
    inline def setTagFilterUndefined: Self = StObject.set(x, "tagFilter", js.undefined)
    
    inline def setTypeFilter(value: WorkflowTypeFilter): Self = StObject.set(x, "typeFilter", value.asInstanceOf[js.Any])
    
    inline def setTypeFilterUndefined: Self = StObject.set(x, "typeFilter", js.undefined)
  }
}
