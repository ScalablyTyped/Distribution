package typings.awsSdk.snowdevicemanagementMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListExecutionsOutput extends StObject {
  
  /**
    * A list of executions. Each execution contains the task ID, the device that the task is executing on, the execution ID, and the status of the execution.
    */
  var executions: js.UndefOr[ExecutionSummaryList] = js.undefined
  
  /**
    * A pagination token to continue to the next page of executions.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListExecutionsOutput {
  
  inline def apply(): ListExecutionsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListExecutionsOutput]
  }
  
  extension [Self <: ListExecutionsOutput](x: Self) {
    
    inline def setExecutions(value: ExecutionSummaryList): Self = StObject.set(x, "executions", value.asInstanceOf[js.Any])
    
    inline def setExecutionsUndefined: Self = StObject.set(x, "executions", js.undefined)
    
    inline def setExecutionsVarargs(value: ExecutionSummary*): Self = StObject.set(x, "executions", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
