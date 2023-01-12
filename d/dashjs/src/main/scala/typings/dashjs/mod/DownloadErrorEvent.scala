package typings.dashjs.mod

import typings.dashjs.anon.Id
import typings.dashjs.dashjsStrings.download
import typings.dashjs.dashjsStrings.error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DownloadErrorEvent
  extends StObject
     with Event
     with ErrorEvent {
  
  var error: download
  
  var event: Id
  
  @JSName("type")
  var type_DownloadErrorEvent: error
}
object DownloadErrorEvent {
  
  inline def apply(event: Id): DownloadErrorEvent = {
    val __obj = js.Dynamic.literal(error = "download", event = event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("error")
    __obj.asInstanceOf[DownloadErrorEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DownloadErrorEvent] (val x: Self) extends AnyVal {
    
    inline def setError(value: download): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: Id): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setType(value: error): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
