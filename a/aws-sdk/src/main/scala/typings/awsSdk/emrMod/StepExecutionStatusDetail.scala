package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StepExecutionStatusDetail extends StObject {
  
  /**
    * The creation date and time of the step.
    */
  var CreationDateTime: js.Date
  
  /**
    * The completion date and time of the step.
    */
  var EndDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A description of the step's current state.
    */
  var LastStateChangeReason: js.UndefOr[XmlString] = js.undefined
  
  /**
    * The start date and time of the step.
    */
  var StartDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The state of the step.
    */
  var State: StepExecutionState
}
object StepExecutionStatusDetail {
  
  inline def apply(CreationDateTime: js.Date, State: StepExecutionState): StepExecutionStatusDetail = {
    val __obj = js.Dynamic.literal(CreationDateTime = CreationDateTime.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepExecutionStatusDetail]
  }
  
  extension [Self <: StepExecutionStatusDetail](x: Self) {
    
    inline def setCreationDateTime(value: js.Date): Self = StObject.set(x, "CreationDateTime", value.asInstanceOf[js.Any])
    
    inline def setEndDateTime(value: js.Date): Self = StObject.set(x, "EndDateTime", value.asInstanceOf[js.Any])
    
    inline def setEndDateTimeUndefined: Self = StObject.set(x, "EndDateTime", js.undefined)
    
    inline def setLastStateChangeReason(value: XmlString): Self = StObject.set(x, "LastStateChangeReason", value.asInstanceOf[js.Any])
    
    inline def setLastStateChangeReasonUndefined: Self = StObject.set(x, "LastStateChangeReason", js.undefined)
    
    inline def setStartDateTime(value: js.Date): Self = StObject.set(x, "StartDateTime", value.asInstanceOf[js.Any])
    
    inline def setStartDateTimeUndefined: Self = StObject.set(x, "StartDateTime", js.undefined)
    
    inline def setState(value: StepExecutionState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
  }
}
