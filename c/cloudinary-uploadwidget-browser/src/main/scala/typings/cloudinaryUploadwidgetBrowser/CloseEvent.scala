package typings.cloudinaryUploadwidgetBrowser

import typings.cloudinaryUploadwidgetBrowser.cloudinaryUploadwidgetBrowserStrings.close
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloseEvent
  extends StObject
     with CloudinaryEvent {
  
  var event: close
}
object CloseEvent {
  
  inline def apply(): CloseEvent = {
    val __obj = js.Dynamic.literal(event = "close")
    __obj.asInstanceOf[CloseEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CloseEvent] (val x: Self) extends AnyVal {
    
    inline def setEvent(value: close): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
