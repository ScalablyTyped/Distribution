package typings.dashjs.mod

import typings.dashjs.dashjsStrings.public_keyStatusesChanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyStatusesChangedEvent
  extends StObject
     with Event {
  
  var data: SessionToken
  
  @JSName("type")
  var type_KeyStatusesChangedEvent: public_keyStatusesChanged
}
object KeyStatusesChangedEvent {
  
  @scala.inline
  def apply(data: SessionToken): KeyStatusesChangedEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("public_keyStatusesChanged")
    __obj.asInstanceOf[KeyStatusesChangedEvent]
  }
  
  @scala.inline
  implicit class KeyStatusesChangedEventMutableBuilder[Self <: KeyStatusesChangedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: SessionToken): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: public_keyStatusesChanged): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
