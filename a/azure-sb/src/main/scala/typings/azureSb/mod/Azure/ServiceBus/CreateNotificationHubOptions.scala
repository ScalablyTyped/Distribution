package typings.azureSb.mod.Azure.ServiceBus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<azure-sb.azure-sb.Azure.ServiceBus.ICreateNotificationHubOptions> */
trait CreateNotificationHubOptions extends StObject {
  
  var apns: js.UndefOr[Dictionary[String]] = js.undefined
  
  var gcm: js.UndefOr[Dictionary[String]] = js.undefined
  
  var mpns: js.UndefOr[Dictionary[String]] = js.undefined
  
  var wns: js.UndefOr[Dictionary[String]] = js.undefined
}
object CreateNotificationHubOptions {
  
  inline def apply(): CreateNotificationHubOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateNotificationHubOptions]
  }
  
  extension [Self <: CreateNotificationHubOptions](x: Self) {
    
    inline def setApns(value: Dictionary[String]): Self = StObject.set(x, "apns", value.asInstanceOf[js.Any])
    
    inline def setApnsUndefined: Self = StObject.set(x, "apns", js.undefined)
    
    inline def setGcm(value: Dictionary[String]): Self = StObject.set(x, "gcm", value.asInstanceOf[js.Any])
    
    inline def setGcmUndefined: Self = StObject.set(x, "gcm", js.undefined)
    
    inline def setMpns(value: Dictionary[String]): Self = StObject.set(x, "mpns", value.asInstanceOf[js.Any])
    
    inline def setMpnsUndefined: Self = StObject.set(x, "mpns", js.undefined)
    
    inline def setWns(value: Dictionary[String]): Self = StObject.set(x, "wns", value.asInstanceOf[js.Any])
    
    inline def setWnsUndefined: Self = StObject.set(x, "wns", js.undefined)
  }
}
