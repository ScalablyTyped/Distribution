package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceTimeline extends StObject {
  
  /**
    * The creation date and time of the instance.
    */
  var CreationDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date and time when the instance was terminated.
    */
  var EndDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date and time when the instance was ready to perform tasks.
    */
  var ReadyDateTime: js.UndefOr[js.Date] = js.undefined
}
object InstanceTimeline {
  
  inline def apply(): InstanceTimeline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceTimeline]
  }
  
  extension [Self <: InstanceTimeline](x: Self) {
    
    inline def setCreationDateTime(value: js.Date): Self = StObject.set(x, "CreationDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreationDateTimeUndefined: Self = StObject.set(x, "CreationDateTime", js.undefined)
    
    inline def setEndDateTime(value: js.Date): Self = StObject.set(x, "EndDateTime", value.asInstanceOf[js.Any])
    
    inline def setEndDateTimeUndefined: Self = StObject.set(x, "EndDateTime", js.undefined)
    
    inline def setReadyDateTime(value: js.Date): Self = StObject.set(x, "ReadyDateTime", value.asInstanceOf[js.Any])
    
    inline def setReadyDateTimeUndefined: Self = StObject.set(x, "ReadyDateTime", js.undefined)
  }
}
