package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceFleetStateChangeReason extends StObject {
  
  /**
    * A code corresponding to the reason the state change occurred.
    */
  var Code: js.UndefOr[InstanceFleetStateChangeReasonCode] = js.undefined
  
  /**
    * An explanatory message.
    */
  var Message: js.UndefOr[String] = js.undefined
}
object InstanceFleetStateChangeReason {
  
  inline def apply(): InstanceFleetStateChangeReason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceFleetStateChangeReason]
  }
  
  extension [Self <: InstanceFleetStateChangeReason](x: Self) {
    
    inline def setCode(value: InstanceFleetStateChangeReasonCode): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
