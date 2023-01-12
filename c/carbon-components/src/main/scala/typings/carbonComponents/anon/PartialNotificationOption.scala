package typings.carbonComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<carbon-components.carbon-components/components/notification/notification.NotificationOptions> */
trait PartialNotificationOption extends StObject {
  
  var eventAfterDeleteNotification: js.UndefOr[String] = js.undefined
  
  var eventBeforeDeleteNotification: js.UndefOr[String] = js.undefined
  
  var selectorButton: js.UndefOr[String] = js.undefined
  
  var selectorInit: js.UndefOr[String] = js.undefined
}
object PartialNotificationOption {
  
  inline def apply(): PartialNotificationOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialNotificationOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialNotificationOption] (val x: Self) extends AnyVal {
    
    inline def setEventAfterDeleteNotification(value: String): Self = StObject.set(x, "eventAfterDeleteNotification", value.asInstanceOf[js.Any])
    
    inline def setEventAfterDeleteNotificationUndefined: Self = StObject.set(x, "eventAfterDeleteNotification", js.undefined)
    
    inline def setEventBeforeDeleteNotification(value: String): Self = StObject.set(x, "eventBeforeDeleteNotification", value.asInstanceOf[js.Any])
    
    inline def setEventBeforeDeleteNotificationUndefined: Self = StObject.set(x, "eventBeforeDeleteNotification", js.undefined)
    
    inline def setSelectorButton(value: String): Self = StObject.set(x, "selectorButton", value.asInstanceOf[js.Any])
    
    inline def setSelectorButtonUndefined: Self = StObject.set(x, "selectorButton", js.undefined)
    
    inline def setSelectorInit(value: String): Self = StObject.set(x, "selectorInit", value.asInstanceOf[js.Any])
    
    inline def setSelectorInitUndefined: Self = StObject.set(x, "selectorInit", js.undefined)
  }
}
