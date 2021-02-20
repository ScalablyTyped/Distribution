package typings.babylonjs.BABYLON

import typings.std.ClipboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClipboardInfo extends StObject {
  
  /**
    * Defines the related dom event
    */
  var event: ClipboardEvent = js.native
  
  /**
    * Defines the type of event (BABYLON.ClipboardEventTypes)
    */
  var `type`: Double = js.native
}
object ClipboardInfo {
  
  @scala.inline
  def apply(event: ClipboardEvent, `type`: Double): ClipboardInfo = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClipboardInfo]
  }
  
  @scala.inline
  implicit class ClipboardInfoMutableBuilder[Self <: ClipboardInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvent(value: ClipboardEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
