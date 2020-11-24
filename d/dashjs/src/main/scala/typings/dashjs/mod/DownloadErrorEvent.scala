package typings.dashjs.mod

import typings.dashjs.anon.Id
import typings.dashjs.dashjsStrings.download
import typings.dashjs.dashjsStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DownloadErrorEvent
  extends Event
     with ErrorEvent {
  
  var error: download = js.native
  
  var event: Id = js.native
  
  @JSName("type")
  var type_DownloadErrorEvent: error = js.native
}
object DownloadErrorEvent {
  
  @scala.inline
  def apply(error: download, event: Id, `type`: error): DownloadErrorEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadErrorEvent]
  }
  
  @scala.inline
  implicit class DownloadErrorEventOps[Self <: DownloadErrorEvent] (val x: Self) extends AnyVal {
    
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
    def setError(value: download): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: Id): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: error): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
