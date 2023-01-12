package typings.cloudinaryUploadwidgetBrowser

import typings.cloudinaryUploadwidgetBrowser.anon.Id
import typings.cloudinaryUploadwidgetBrowser.cloudinaryUploadwidgetBrowserStrings.publicid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublicIdEvent
  extends StObject
     with CloudinaryEvent {
  
  var event: publicid
  
  var info: Id
}
object PublicIdEvent {
  
  inline def apply(info: Id): PublicIdEvent = {
    val __obj = js.Dynamic.literal(event = "publicid", info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicIdEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PublicIdEvent] (val x: Self) extends AnyVal {
    
    inline def setEvent(value: publicid): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setInfo(value: Id): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
  }
}
