package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobFlowExecutionStatusDetail extends StObject {
  
  /**
    * The creation date and time of the job flow.
    */
  var CreationDateTime: Date = js.native
  
  /**
    * The completion date and time of the job flow.
    */
  var EndDateTime: js.UndefOr[Date] = js.native
  
  /**
    * Description of the job flow last changed state.
    */
  var LastStateChangeReason: js.UndefOr[XmlString] = js.native
  
  /**
    * The date and time when the job flow was ready to start running bootstrap actions.
    */
  var ReadyDateTime: js.UndefOr[Date] = js.native
  
  /**
    * The start date and time of the job flow.
    */
  var StartDateTime: js.UndefOr[Date] = js.native
  
  /**
    * The state of the job flow.
    */
  var State: JobFlowExecutionState = js.native
}
object JobFlowExecutionStatusDetail {
  
  @scala.inline
  def apply(CreationDateTime: Date, State: JobFlowExecutionState): JobFlowExecutionStatusDetail = {
    val __obj = js.Dynamic.literal(CreationDateTime = CreationDateTime.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobFlowExecutionStatusDetail]
  }
  
  @scala.inline
  implicit class JobFlowExecutionStatusDetailMutableBuilder[Self <: JobFlowExecutionStatusDetail] (val x: Self) extends AnyVal {
    
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
    def setReadyDateTime(value: Date): Self = StObject.set(x, "ReadyDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadyDateTimeUndefined: Self = StObject.set(x, "ReadyDateTime", js.undefined)
    
    @scala.inline
    def setStartDateTime(value: Date): Self = StObject.set(x, "StartDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDateTimeUndefined: Self = StObject.set(x, "StartDateTime", js.undefined)
    
    @scala.inline
    def setState(value: JobFlowExecutionState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
  }
}
