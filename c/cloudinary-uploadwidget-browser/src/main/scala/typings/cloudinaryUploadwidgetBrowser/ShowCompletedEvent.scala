package typings.cloudinaryUploadwidgetBrowser

import typings.cloudinaryUploadwidgetBrowser.anon.Items
import typings.cloudinaryUploadwidgetBrowser.cloudinaryUploadwidgetBrowserStrings.`show-completed`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShowCompletedEvent
  extends StObject
     with CloudinaryEvent {
  
  var event: `show-completed`
  
  var info: Items
}
object ShowCompletedEvent {
  
  inline def apply(info: Items): ShowCompletedEvent = {
    val __obj = js.Dynamic.literal(event = "show-completed", info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowCompletedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShowCompletedEvent] (val x: Self) extends AnyVal {
    
    inline def setEvent(value: `show-completed`): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setInfo(value: Items): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
  }
}
