package typings.dashjs.mod

import typings.dashjs.anon.Id
import typings.dashjs.dashjsStrings.download
import typings.dashjs.dashjsStrings.error
import org.scalablytyped.runtime.StObject
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
  implicit class DownloadErrorEventMutableBuilder[Self <: DownloadErrorEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: download): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: Id): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: error): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
