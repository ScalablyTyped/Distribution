package typings.dashjs.mod

import typings.dashjs.dashjsStrings.public_keySessionCreated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeySessionEvent extends Event {
  
  var data: SessionToken | Null = js.native
  
  var error: js.UndefOr[String] = js.native
  
  @JSName("type")
  var type_KeySessionEvent: public_keySessionCreated = js.native
}
object KeySessionEvent {
  
  @scala.inline
  def apply(`type`: public_keySessionCreated): KeySessionEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeySessionEvent]
  }
  
  @scala.inline
  implicit class KeySessionEventMutableBuilder[Self <: KeySessionEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: SessionToken): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataNull: Self = StObject.set(x, "data", null)
    
    @scala.inline
    def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setType(value: public_keySessionCreated): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
