package typings.cloudinaryUploadwidgetBrowser

import typings.cloudinaryUploadwidgetBrowser.anon.File
import typings.cloudinaryUploadwidgetBrowser.cloudinaryUploadwidgetBrowserStrings.`upload-added`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadAddedEvent
  extends StObject
     with CloudinaryEvent {
  
  var event: `upload-added`
  
  var info: File
}
object UploadAddedEvent {
  
  inline def apply(info: File): UploadAddedEvent = {
    val __obj = js.Dynamic.literal(event = "upload-added", info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadAddedEvent]
  }
  
  extension [Self <: UploadAddedEvent](x: Self) {
    
    inline def setEvent(value: `upload-added`): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setInfo(value: File): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
  }
}
