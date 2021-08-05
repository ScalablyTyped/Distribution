package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAutomationStepExecutionsRequest extends StObject {
  
  /**
    * The Automation execution ID for which you want step execution descriptions.
    */
  var AutomationExecutionId: typings.awsSdk.ssmMod.AutomationExecutionId
  
  /**
    * One or more filters to limit the number of step executions returned by the request.
    */
  var Filters: js.UndefOr[StepExecutionFilterList] = js.undefined
  
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.ssmMod.MaxResults] = js.undefined
  
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.undefined
  
  /**
    * A boolean that indicates whether to list step executions in reverse order by start time. The default value is false.
    */
  var ReverseOrder: js.UndefOr[Boolean] = js.undefined
}
object DescribeAutomationStepExecutionsRequest {
  
  inline def apply(AutomationExecutionId: AutomationExecutionId): DescribeAutomationStepExecutionsRequest = {
    val __obj = js.Dynamic.literal(AutomationExecutionId = AutomationExecutionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAutomationStepExecutionsRequest]
  }
  
  extension [Self <: DescribeAutomationStepExecutionsRequest](x: Self) {
    
    inline def setAutomationExecutionId(value: AutomationExecutionId): Self = StObject.set(x, "AutomationExecutionId", value.asInstanceOf[js.Any])
    
    inline def setFilters(value: StepExecutionFilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: StepExecutionFilter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setReverseOrder(value: Boolean): Self = StObject.set(x, "ReverseOrder", value.asInstanceOf[js.Any])
    
    inline def setReverseOrderUndefined: Self = StObject.set(x, "ReverseOrder", js.undefined)
  }
}
