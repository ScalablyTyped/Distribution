package typings.azureSb.mod.Azure.ServiceBus

import typings.azureSb.anon.ContentRootElement
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationHubRegistration extends StObject {
  
  var BodyTemplate: js.UndefOr[js.Any] = js.undefined
  
  var ChannelUri: js.UndefOr[String] = js.undefined
  
  var DeviceToken: js.UndefOr[String] = js.undefined
  
  var Expiry: js.UndefOr[Date] = js.undefined
  
  var GcmRegistrationId: js.UndefOr[String] = js.undefined
  
  var MpnsHeaders: js.UndefOr[js.Any] = js.undefined
  
  var RegistrationId: String
  
  var Tags: js.UndefOr[String] = js.undefined
  
  var WnsHeaders: js.UndefOr[js.Any] = js.undefined
  
  @JSName("_")
  var _underscore: ContentRootElement
}
object NotificationHubRegistration {
  
  inline def apply(RegistrationId: String, _underscore: ContentRootElement): NotificationHubRegistration = {
    val __obj = js.Dynamic.literal(RegistrationId = RegistrationId.asInstanceOf[js.Any])
    __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationHubRegistration]
  }
  
  extension [Self <: NotificationHubRegistration](x: Self) {
    
    inline def setBodyTemplate(value: js.Any): Self = StObject.set(x, "BodyTemplate", value.asInstanceOf[js.Any])
    
    inline def setBodyTemplateUndefined: Self = StObject.set(x, "BodyTemplate", js.undefined)
    
    inline def setChannelUri(value: String): Self = StObject.set(x, "ChannelUri", value.asInstanceOf[js.Any])
    
    inline def setChannelUriUndefined: Self = StObject.set(x, "ChannelUri", js.undefined)
    
    inline def setDeviceToken(value: String): Self = StObject.set(x, "DeviceToken", value.asInstanceOf[js.Any])
    
    inline def setDeviceTokenUndefined: Self = StObject.set(x, "DeviceToken", js.undefined)
    
    inline def setExpiry(value: Date): Self = StObject.set(x, "Expiry", value.asInstanceOf[js.Any])
    
    inline def setExpiryUndefined: Self = StObject.set(x, "Expiry", js.undefined)
    
    inline def setGcmRegistrationId(value: String): Self = StObject.set(x, "GcmRegistrationId", value.asInstanceOf[js.Any])
    
    inline def setGcmRegistrationIdUndefined: Self = StObject.set(x, "GcmRegistrationId", js.undefined)
    
    inline def setMpnsHeaders(value: js.Any): Self = StObject.set(x, "MpnsHeaders", value.asInstanceOf[js.Any])
    
    inline def setMpnsHeadersUndefined: Self = StObject.set(x, "MpnsHeaders", js.undefined)
    
    inline def setRegistrationId(value: String): Self = StObject.set(x, "RegistrationId", value.asInstanceOf[js.Any])
    
    inline def setTags(value: String): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setWnsHeaders(value: js.Any): Self = StObject.set(x, "WnsHeaders", value.asInstanceOf[js.Any])
    
    inline def setWnsHeadersUndefined: Self = StObject.set(x, "WnsHeaders", js.undefined)
    
    inline def set_underscore(value: ContentRootElement): Self = StObject.set(x, "_", value.asInstanceOf[js.Any])
  }
}
