package typings.cloudinaryUploadwidgetBrowser

import typings.cloudinaryUploadwidgetBrowser.cloudinaryUploadwidgetBrowserStrings.`queues-end`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueuesEndEvent
  extends StObject
     with CloudinaryEvent {
  
  var event: `queues-end`
  
  var info: Any
}
object QueuesEndEvent {
  
  inline def apply(info: Any): QueuesEndEvent = {
    val __obj = js.Dynamic.literal(event = "queues-end", info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueuesEndEvent]
  }
  
  extension [Self <: QueuesEndEvent](x: Self) {
    
    inline def setEvent(value: `queues-end`): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setInfo(value: Any): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
  }
}
