package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClosedDaysRule extends StObject {
  
  /**
    * End Datetime in ISO 8601 format.
    */
  var EndDateTime: js.UndefOr[string] = js.undefined
  
  /**
    * Name of the rule.
    */
  var Name: js.UndefOr[string] = js.undefined
  
  /**
    * Start Datetime in ISO 8601 format.
    */
  var StartDateTime: js.UndefOr[string] = js.undefined
}
object ClosedDaysRule {
  
  inline def apply(): ClosedDaysRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClosedDaysRule]
  }
  
  extension [Self <: ClosedDaysRule](x: Self) {
    
    inline def setEndDateTime(value: string): Self = StObject.set(x, "EndDateTime", value.asInstanceOf[js.Any])
    
    inline def setEndDateTimeUndefined: Self = StObject.set(x, "EndDateTime", js.undefined)
    
    inline def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setStartDateTime(value: string): Self = StObject.set(x, "StartDateTime", value.asInstanceOf[js.Any])
    
    inline def setStartDateTimeUndefined: Self = StObject.set(x, "StartDateTime", js.undefined)
  }
}
