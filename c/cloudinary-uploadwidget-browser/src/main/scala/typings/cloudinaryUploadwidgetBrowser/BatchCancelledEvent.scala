package typings.cloudinaryUploadwidgetBrowser

import typings.cloudinaryUploadwidgetBrowser.anon.Reason
import typings.cloudinaryUploadwidgetBrowser.cloudinaryUploadwidgetBrowserStrings.`batch-cancelled`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchCancelledEvent
  extends StObject
     with CloudinaryEvent {
  
  var event: `batch-cancelled`
  
  var info: Reason
}
object BatchCancelledEvent {
  
  inline def apply(info: Reason): BatchCancelledEvent = {
    val __obj = js.Dynamic.literal(event = "batch-cancelled", info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchCancelledEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchCancelledEvent] (val x: Self) extends AnyVal {
    
    inline def setEvent(value: `batch-cancelled`): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setInfo(value: Reason): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
  }
}
