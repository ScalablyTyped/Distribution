package typings.awsSdk.globalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ByoipCidrEvent extends StObject {
  
  /**
    * A string that contains an Event message describing changes that you make in the status of an IP address range that you bring to AWS Global Accelerator through bring your own IP address (BYOIP).
    */
  var Message: js.UndefOr[GenericString] = js.undefined
  
  /**
    * A timestamp when you make a status change for an IP address range that you bring to AWS Global Accelerator through bring your own IP address (BYOIP).
    */
  var Timestamp: js.UndefOr[typings.awsSdk.globalacceleratorMod.Timestamp] = js.undefined
}
object ByoipCidrEvent {
  
  @scala.inline
  def apply(): ByoipCidrEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ByoipCidrEvent]
  }
  
  @scala.inline
  implicit class ByoipCidrEventMutableBuilder[Self <: ByoipCidrEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: GenericString): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    @scala.inline
    def setTimestamp(value: Timestamp): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
  }
}
