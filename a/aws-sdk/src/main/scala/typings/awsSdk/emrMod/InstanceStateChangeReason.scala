package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceStateChangeReason extends StObject {
  
  /**
    * The programmable code for the state change reason.
    */
  var Code: js.UndefOr[InstanceStateChangeReasonCode] = js.undefined
  
  /**
    * The status change reason description.
    */
  var Message: js.UndefOr[String] = js.undefined
}
object InstanceStateChangeReason {
  
  inline def apply(): InstanceStateChangeReason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceStateChangeReason]
  }
  
  extension [Self <: InstanceStateChangeReason](x: Self) {
    
    inline def setCode(value: InstanceStateChangeReasonCode): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
