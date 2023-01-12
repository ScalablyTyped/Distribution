package typings.cloudinaryUploadwidgetBrowser

import typings.cloudinaryUploadwidgetBrowser.anon.Tags
import typings.cloudinaryUploadwidgetBrowser.cloudinaryUploadwidgetBrowserStrings.tags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagsEvent
  extends StObject
     with CloudinaryEvent {
  
  var event: tags
  
  var info: Tags
}
object TagsEvent {
  
  inline def apply(info: Tags): TagsEvent = {
    val __obj = js.Dynamic.literal(event = "tags", info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagsEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TagsEvent] (val x: Self) extends AnyVal {
    
    inline def setEvent(value: tags): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setInfo(value: Tags): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
  }
}
