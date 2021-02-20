package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StepExecutionStatusDetail extends StObject {
  
  /**
    * The creation date and time of the step.
    */
  var CreationDateTime: Date = js.native
  
  /**
    * The completion date and time of the step.
    */
  var EndDateTime: js.UndefOr[Date] = js.native
  
  /**
    * A description of the step's current state.
    */
  var LastStateChangeReason: js.UndefOr[XmlString] = js.native
  
  /**
    * The start date and time of the step.
    */
  var StartDateTime: js.UndefOr[Date] = js.native
  
  /**
    * The state of the step.
    */
  var State: StepExecutionState = js.native
}
object StepExecutionStatusDetail {
  
  @scala.inline
  def apply(CreationDateTime: Date, State: StepExecutionState): StepExecutionStatusDetail = {
    val __obj = js.Dynamic.literal(CreationDateTime = CreationDateTime.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepExecutionStatusDetail]
  }
  
  @scala.inline
  implicit class StepExecutionStatusDetailMutableBuilder[Self <: StepExecutionStatusDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationDateTime(value: Date): Self = StObject.set(x, "CreationDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDateTime(value: Date): Self = StObject.set(x, "EndDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDateTimeUndefined: Self = StObject.set(x, "EndDateTime", js.undefined)
    
    @scala.inline
    def setLastStateChangeReason(value: XmlString): Self = StObject.set(x, "LastStateChangeReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastStateChangeReasonUndefined: Self = StObject.set(x, "LastStateChangeReason", js.undefined)
    
    @scala.inline
    def setStartDateTime(value: Date): Self = StObject.set(x, "StartDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDateTimeUndefined: Self = StObject.set(x, "StartDateTime", js.undefined)
    
    @scala.inline
    def setState(value: StepExecutionState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
  }
}
