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
  
  @scala.inline
  def apply(RegistrationId: String, _underscore: ContentRootElement): NotificationHubRegistration = {
    val __obj = js.Dynamic.literal(RegistrationId = RegistrationId.asInstanceOf[js.Any])
    __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationHubRegistration]
  }
  
  @scala.inline
  implicit class NotificationHubRegistrationMutableBuilder[Self <: NotificationHubRegistration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBodyTemplate(value: js.Any): Self = StObject.set(x, "BodyTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyTemplateUndefined: Self = StObject.set(x, "BodyTemplate", js.undefined)
    
    @scala.inline
    def setChannelUri(value: String): Self = StObject.set(x, "ChannelUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelUriUndefined: Self = StObject.set(x, "ChannelUri", js.undefined)
    
    @scala.inline
    def setDeviceToken(value: String): Self = StObject.set(x, "DeviceToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceTokenUndefined: Self = StObject.set(x, "DeviceToken", js.undefined)
    
    @scala.inline
    def setExpiry(value: Date): Self = StObject.set(x, "Expiry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiryUndefined: Self = StObject.set(x, "Expiry", js.undefined)
    
    @scala.inline
    def setGcmRegistrationId(value: String): Self = StObject.set(x, "GcmRegistrationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGcmRegistrationIdUndefined: Self = StObject.set(x, "GcmRegistrationId", js.undefined)
    
    @scala.inline
    def setMpnsHeaders(value: js.Any): Self = StObject.set(x, "MpnsHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMpnsHeadersUndefined: Self = StObject.set(x, "MpnsHeaders", js.undefined)
    
    @scala.inline
    def setRegistrationId(value: String): Self = StObject.set(x, "RegistrationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: String): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setWnsHeaders(value: js.Any): Self = StObject.set(x, "WnsHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWnsHeadersUndefined: Self = StObject.set(x, "WnsHeaders", js.undefined)
    
    @scala.inline
    def set_underscore(value: ContentRootElement): Self = StObject.set(x, "_", value.asInstanceOf[js.Any])
  }
}
