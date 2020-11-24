package typings.azureSb.mod.Azure.ServiceBus

import typings.azureSb.anon.ContentRootElement
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationHubRegistration extends js.Object {
  
  var BodyTemplate: js.UndefOr[js.Any] = js.native
  
  var ChannelUri: js.UndefOr[String] = js.native
  
  var DeviceToken: js.UndefOr[String] = js.native
  
  var Expiry: js.UndefOr[Date] = js.native
  
  var GcmRegistrationId: js.UndefOr[String] = js.native
  
  var MpnsHeaders: js.UndefOr[js.Any] = js.native
  
  var RegistrationId: String = js.native
  
  var Tags: js.UndefOr[String] = js.native
  
  var WnsHeaders: js.UndefOr[js.Any] = js.native
  
  @JSName("_")
  var _underscore: ContentRootElement = js.native
}
object NotificationHubRegistration {
  
  @scala.inline
  def apply(RegistrationId: String, _underscore: ContentRootElement): NotificationHubRegistration = {
    val __obj = js.Dynamic.literal(RegistrationId = RegistrationId.asInstanceOf[js.Any])
    __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationHubRegistration]
  }
  
  @scala.inline
  implicit class NotificationHubRegistrationOps[Self <: NotificationHubRegistration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRegistrationId(value: String): Self = this.set("RegistrationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_underscore(value: ContentRootElement): Self = this.set("_", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyTemplate(value: js.Any): Self = this.set("BodyTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBodyTemplate: Self = this.set("BodyTemplate", js.undefined)
    
    @scala.inline
    def setChannelUri(value: String): Self = this.set("ChannelUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelUri: Self = this.set("ChannelUri", js.undefined)
    
    @scala.inline
    def setDeviceToken(value: String): Self = this.set("DeviceToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceToken: Self = this.set("DeviceToken", js.undefined)
    
    @scala.inline
    def setExpiry(value: Date): Self = this.set("Expiry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpiry: Self = this.set("Expiry", js.undefined)
    
    @scala.inline
    def setGcmRegistrationId(value: String): Self = this.set("GcmRegistrationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGcmRegistrationId: Self = this.set("GcmRegistrationId", js.undefined)
    
    @scala.inline
    def setMpnsHeaders(value: js.Any): Self = this.set("MpnsHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMpnsHeaders: Self = this.set("MpnsHeaders", js.undefined)
    
    @scala.inline
    def setTags(value: String): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    
    @scala.inline
    def setWnsHeaders(value: js.Any): Self = this.set("WnsHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWnsHeaders: Self = this.set("WnsHeaders", js.undefined)
  }
}
