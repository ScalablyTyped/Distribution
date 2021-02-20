package typings.dashjs.mod

import typings.dashjs.dashjsStrings.captionContainerResize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CaptionContainerResizeEvent extends Event {
  
  @JSName("type")
  var type_CaptionContainerResizeEvent: captionContainerResize = js.native
}
object CaptionContainerResizeEvent {
  
  @scala.inline
  def apply(`type`: captionContainerResize): CaptionContainerResizeEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptionContainerResizeEvent]
  }
  
  @scala.inline
  implicit class CaptionContainerResizeEventMutableBuilder[Self <: CaptionContainerResizeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: captionContainerResize): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
