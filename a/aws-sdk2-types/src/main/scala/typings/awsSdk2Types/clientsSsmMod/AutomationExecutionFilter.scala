package typings.awsSdk2Types.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutomationExecutionFilter extends StObject {
  
  /**
    * One or more keys to limit the results.
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutomationExecutionFilter] (val x: Self) extends AnyVal {
    
    inline def setKey(value: AutomationExecutionFilterKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setValues(value: AutomationExecutionFilterValueList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: AutomationExecutionFilterValue*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
