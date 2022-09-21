package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobFlowExecutionStatusDetail extends StObject {
  
  /**
    * The creation date and time of the job flow.
    */
  var CreationDateTime: js.Date
  
  /**
    * The completion date and time of the job flow.
    */
  var EndDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Description of the job flow last changed state.
    */
  var LastStateChangeReason: js.UndefOr[XmlString] = js.undefined
  
  /**
    * The date and time when the job flow was ready to start running bootstrap actions.
    */
  var ReadyDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The start date and time of the job flow.
    */
  var StartDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The state of the job flow.
    */
  var State: JobFlowExecutionState
}
object JobFlowExecutionStatusDetail {
  
  inline def apply(CreationDateTime: js.Date, State: JobFlowExecutionState): JobFlowExecutionStatusDetail = {
    val __obj = js.Dynamic.literal(CreationDateTime = CreationDateTime.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobFlowExecutionStatusDetail]
  }
  
  extension [Self <: JobFlowExecutionStatusDetail](x: Self) {
    
    inline def setCreationDateTime(value: js.Date): Self = StObject.set(x, "CreationDateTime", value.asInstanceOf[js.Any])
    
    inline def setEndDateTime(value: js.Date): Self = StObject.set(x, "EndDateTime", value.asInstanceOf[js.Any])
    
    inline def setEndDateTimeUndefined: Self = StObject.set(x, "EndDateTime", js.undefined)
    
    inline def setLastStateChangeReason(value: XmlString): Self = StObject.set(x, "LastStateChangeReason", value.asInstanceOf[js.Any])
    
    inline def setLastStateChangeReasonUndefined: Self = StObject.set(x, "LastStateChangeReason", js.undefined)
    
    inline def setReadyDateTime(value: js.Date): Self = StObject.set(x, "ReadyDateTime", value.asInstanceOf[js.Any])
    
    inline def setReadyDateTimeUndefined: Self = StObject.set(x, "ReadyDateTime", js.undefined)
    
    inline def setStartDateTime(value: js.Date): Self = StObject.set(x, "StartDateTime", value.asInstanceOf[js.Any])
    
    inline def setStartDateTimeUndefined: Self = StObject.set(x, "StartDateTime", js.undefined)
    
    inline def setState(value: JobFlowExecutionState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
  }
}
