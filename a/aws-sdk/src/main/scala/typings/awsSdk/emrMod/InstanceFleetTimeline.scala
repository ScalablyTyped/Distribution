package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceFleetTimeline extends StObject {
  
  /**
    * The time and date the instance fleet was created.
    */
  var CreationDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time and date the instance fleet terminated.
    */
  var EndDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time and date the instance fleet was ready to run jobs.
    */
  var ReadyDateTime: js.UndefOr[js.Date] = js.undefined
}
object InstanceFleetTimeline {
  
  inline def apply(): InstanceFleetTimeline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceFleetTimeline]
  }
  
  extension [Self <: InstanceFleetTimeline](x: Self) {
    
    inline def setCreationDateTime(value: js.Date): Self = StObject.set(x, "CreationDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreationDateTimeUndefined: Self = StObject.set(x, "CreationDateTime", js.undefined)
    
    inline def setEndDateTime(value: js.Date): Self = StObject.set(x, "EndDateTime", value.asInstanceOf[js.Any])
    
    inline def setEndDateTimeUndefined: Self = StObject.set(x, "EndDateTime", js.undefined)
    
    inline def setReadyDateTime(value: js.Date): Self = StObject.set(x, "ReadyDateTime", value.asInstanceOf[js.Any])
    
    inline def setReadyDateTimeUndefined: Self = StObject.set(x, "ReadyDateTime", js.undefined)
  }
}
