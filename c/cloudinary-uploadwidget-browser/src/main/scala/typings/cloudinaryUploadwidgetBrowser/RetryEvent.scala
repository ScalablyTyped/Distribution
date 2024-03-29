package typings.cloudinaryUploadwidgetBrowser

import typings.cloudinaryUploadwidgetBrowser.anon.All
import typings.cloudinaryUploadwidgetBrowser.cloudinaryUploadwidgetBrowserStrings.retry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RetryEvent
  extends StObject
     with CloudinaryEvent {
  
  var event: retry
  
  var info: All
}
object RetryEvent {
  
  inline def apply(info: All): RetryEvent = {
    val __obj = js.Dynamic.literal(event = "retry", info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetryEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RetryEvent] (val x: Self) extends AnyVal {
    
    inline def setEvent(value: retry): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setInfo(value: All): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
  }
}
