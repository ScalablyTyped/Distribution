package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StepTimeline extends StObject {
  
  /**
    * The date and time when the cluster step was created.
    */
  var CreationDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date and time when the cluster step execution completed or failed.
    */
  var EndDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date and time when the cluster step execution started.
    */
  var StartDateTime: js.UndefOr[js.Date] = js.undefined
}
object StepTimeline {
  
  inline def apply(): StepTimeline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StepTimeline]
  }
  
  extension [Self <: StepTimeline](x: Self) {
    
    inline def setCreationDateTime(value: js.Date): Self = StObject.set(x, "CreationDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreationDateTimeUndefined: Self = StObject.set(x, "CreationDateTime", js.undefined)
    
    inline def setEndDateTime(value: js.Date): Self = StObject.set(x, "EndDateTime", value.asInstanceOf[js.Any])
    
    inline def setEndDateTimeUndefined: Self = StObject.set(x, "EndDateTime", js.undefined)
    
    inline def setStartDateTime(value: js.Date): Self = StObject.set(x, "StartDateTime", value.asInstanceOf[js.Any])
    
    inline def setStartDateTimeUndefined: Self = StObject.set(x, "StartDateTime", js.undefined)
  }
}
