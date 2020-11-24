package typings.dashjs.mod

import typings.dashjs.dashjsStrings.captionRendered
import typings.std.HTMLDivElement
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
  implicit class CaptionRenderedEventOps[Self <: CaptionRenderedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCaptionDiv(value: HTMLDivElement): Self = this.set("captionDiv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentTrackIdx(value: Double): Self = this.set("currentTrackIdx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: captionRendered): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
