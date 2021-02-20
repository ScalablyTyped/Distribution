package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StepExecutionFilter extends StObject {
  
  /**
    * One or more keys to limit the results. Valid filter keys include the following: StepName, Action, StepExecutionId, StepExecutionStatus, StartTimeBefore, StartTimeAfter.
    */
  var Key: StepExecutionFilterKey = js.native
  
  /**
    * The values of the filter key.
    */
  var Values: StepExecutionFilterValueList = js.native
}
object StepExecutionFilter {
  
  @scala.inline
  def apply(Key: StepExecutionFilterKey, Values: StepExecutionFilterValueList): StepExecutionFilter = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepExecutionFilter]
  }
  
  @scala.inline
  implicit class StepExecutionFilterMutableBuilder[Self <: StepExecutionFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: StepExecutionFilterKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: StepExecutionFilterValueList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: StepExecutionFilterValue*): Self = StObject.set(x, "Values", js.Array(value :_*))
  }
}
