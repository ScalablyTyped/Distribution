package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceFleetStateChangeReason extends StObject {
  
  /**
    * A code corresponding to the reason the state change occurred.
    */
  var Code: js.UndefOr[InstanceFleetStateChangeReasonCode] = js.native
  
  /**
    * An explanatory message.
    */
  var Message: js.UndefOr[String] = js.native
}
object InstanceFleetStateChangeReason {
  
  @scala.inline
  def apply(): InstanceFleetStateChangeReason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceFleetStateChangeReason]
  }
  
  @scala.inline
  implicit class InstanceFleetStateChangeReasonMutableBuilder[Self <: InstanceFleetStateChangeReason] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: InstanceFleetStateChangeReasonCode): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
