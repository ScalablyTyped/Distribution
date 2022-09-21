package typings.cloudinaryUploadwidgetBrowser

import typings.cloudinaryUploadwidgetBrowser.cloudinaryUploadwidgetBrowserStrings.`queues-start`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueuesStartEvent
  extends StObject
     with CloudinaryEvent {
  
  var event: `queues-start`
}
object QueuesStartEvent {
  
  inline def apply(): QueuesStartEvent = {
    val __obj = js.Dynamic.literal(event = "queues-start")
    __obj.asInstanceOf[QueuesStartEvent]
  }
  
  extension [Self <: QueuesStartEvent](x: Self) {
    
    inline def setEvent(value: `queues-start`): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
