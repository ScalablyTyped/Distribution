package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StepTimeline extends StObject {
  
  /**
    * The date and time when the cluster step was created.
    */
  var CreationDateTime: js.UndefOr[Date] = js.native
  
  /**
    * The date and time when the cluster step execution completed or failed.
    */
  var EndDateTime: js.UndefOr[Date] = js.native
  
  /**
    * The date and time when the cluster step execution started.
    */
  var StartDateTime: js.UndefOr[Date] = js.native
}
object StepTimeline {
  
  @scala.inline
  def apply(): StepTimeline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StepTimeline]
  }
  
  @scala.inline
  implicit class StepTimelineMutableBuilder[Self <: StepTimeline] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationDateTime(value: Date): Self = StObject.set(x, "CreationDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateTimeUndefined: Self = StObject.set(x, "CreationDateTime", js.undefined)
    
    @scala.inline
    def setEndDateTime(value: Date): Self = StObject.set(x, "EndDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDateTimeUndefined: Self = StObject.set(x, "EndDateTime", js.undefined)
    
    @scala.inline
    def setStartDateTime(value: Date): Self = StObject.set(x, "StartDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDateTimeUndefined: Self = StObject.set(x, "StartDateTime", js.undefined)
  }
}
