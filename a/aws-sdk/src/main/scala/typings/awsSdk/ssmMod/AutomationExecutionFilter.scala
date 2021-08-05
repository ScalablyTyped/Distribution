package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutomationExecutionFilter extends StObject {
  
  /**
    * One or more keys to limit the results. Valid filter keys include the following: DocumentNamePrefix, ExecutionStatus, ExecutionId, ParentExecutionId, CurrentAction, StartTimeBefore, StartTimeAfter, TargetResourceGroup.
    */
  var Key: AutomationExecutionFilterKey
  
  /**
    * The values used to limit the execution information associated with the filter's key.
    */
  var Values: AutomationExecutionFilterValueList
}
object AutomationExecutionFilter {
  
  inline def apply(Key: AutomationExecutionFilterKey, Values: AutomationExecutionFilterValueList): AutomationExecutionFilter = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutomationExecutionFilter]
  }
  
  extension [Self <: AutomationExecutionFilter](x: Self) {
    
    inline def setKey(value: AutomationExecutionFilterKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setValues(value: AutomationExecutionFilterValueList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: AutomationExecutionFilterValue*): Self = StObject.set(x, "Values", js.Array(value :_*))
  }
}
