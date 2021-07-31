package typings.dashjs.mod

import typings.dashjs.dashjsStrings.captionContainerResize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaptionContainerResizeEvent
  extends StObject
     with Event {
  
  @JSName("type")
  var type_CaptionContainerResizeEvent: captionContainerResize
}
object CaptionContainerResizeEvent {
  
  @scala.inline
  def apply(): CaptionContainerResizeEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("captionContainerResize")
    __obj.asInstanceOf[CaptionContainerResizeEvent]
  }
  
  @scala.inline
  implicit class CaptionContainerResizeEventMutableBuilder[Self <: CaptionContainerResizeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: captionContainerResize): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
