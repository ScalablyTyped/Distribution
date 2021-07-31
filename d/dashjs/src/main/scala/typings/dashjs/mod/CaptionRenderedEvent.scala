package typings.dashjs.mod

import typings.dashjs.dashjsStrings.captionRendered
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaptionRenderedEvent
  extends StObject
     with Event {
  
  var captionDiv: HTMLDivElement
  
  var currentTrackIdx: Double
  
  @JSName("type")
  var type_CaptionRenderedEvent: captionRendered
}
object CaptionRenderedEvent {
  
  @scala.inline
  def apply(captionDiv: HTMLDivElement, currentTrackIdx: Double): CaptionRenderedEvent = {
    val __obj = js.Dynamic.literal(captionDiv = captionDiv.asInstanceOf[js.Any], currentTrackIdx = currentTrackIdx.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("captionRendered")
    __obj.asInstanceOf[CaptionRenderedEvent]
  }
  
  @scala.inline
  implicit class CaptionRenderedEventMutableBuilder[Self <: CaptionRenderedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaptionDiv(value: HTMLDivElement): Self = StObject.set(x, "captionDiv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentTrackIdx(value: Double): Self = StObject.set(x, "currentTrackIdx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: captionRendered): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
