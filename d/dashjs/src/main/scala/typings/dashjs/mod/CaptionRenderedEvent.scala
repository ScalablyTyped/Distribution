package typings.dashjs.mod

import typings.dashjs.dashjsStrings.captionRendered
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CaptionRenderedEvent extends Event {
  
  var captionDiv: HTMLDivElement = js.native
  
  var currentTrackIdx: Double = js.native
  
  @JSName("type")
  var type_CaptionRenderedEvent: captionRendered = js.native
}
object CaptionRenderedEvent {
  
  @scala.inline
  def apply(captionDiv: HTMLDivElement, currentTrackIdx: Double, `type`: captionRendered): CaptionRenderedEvent = {
    val __obj = js.Dynamic.literal(captionDiv = captionDiv.asInstanceOf[js.Any], currentTrackIdx = currentTrackIdx.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
