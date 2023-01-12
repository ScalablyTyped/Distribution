package typings.cloudinaryUploadwidgetBrowser

import typings.cloudinaryUploadwidgetBrowser.cloudinaryUploadwidgetBrowserStrings.`source-changed`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceChangedEvent
  extends StObject
     with CloudinaryEvent {
  
  var event: `source-changed`
  
  var info: typings.cloudinaryUploadwidgetBrowser.anon.Source
}
object SourceChangedEvent {
  
  inline def apply(info: typings.cloudinaryUploadwidgetBrowser.anon.Source): SourceChangedEvent = {
    val __obj = js.Dynamic.literal(event = "source-changed", info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceChangedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SourceChangedEvent] (val x: Self) extends AnyVal {
    
    inline def setEvent(value: `source-changed`): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setInfo(value: typings.cloudinaryUploadwidgetBrowser.anon.Source): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
  }
}
