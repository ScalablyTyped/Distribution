package typings.awsSdk.globalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ByoipCidrEvent extends StObject {
  
  /**
    * A string that contains an Event message describing changes that you make in the status of an IP address range that you bring to Global Accelerator through bring your own IP address (BYOIP).
    */
  var Message: js.UndefOr[GenericString] = js.undefined
  
  /**
    * A timestamp for when you make a status change for an IP address range that you bring to Global Accelerator through bring your own IP address (BYOIP).
    */
  var Timestamp: js.UndefOr[js.Date] = js.undefined
}
object ByoipCidrEvent {
  
  inline def apply(): ByoipCidrEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ByoipCidrEvent]
  }
  
  extension [Self <: ByoipCidrEvent](x: Self) {
    
    inline def setMessage(value: GenericString): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setTimestamp(value: js.Date): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
  }
}
