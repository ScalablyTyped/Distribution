package typings.babylonjs.BABYLON

import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyboardInfo extends StObject {
  
  /**
    * Defines the related dom event
    */
  var event: KeyboardEvent = js.native
  
  /**
    * Defines the type of event (KeyboardEventTypes)
    */
  var `type`: Double = js.native
}
object KeyboardInfo {
  
  @scala.inline
  def apply(event: KeyboardEvent, `type`: Double): KeyboardInfo = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardInfo]
  }
  
  @scala.inline
  implicit class KeyboardInfoMutableBuilder[Self <: KeyboardInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvent(value: KeyboardEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
