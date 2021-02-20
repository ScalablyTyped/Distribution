package typings.azureSb.mod.Azure.ServiceBus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<azure-sb.azure-sb.Azure.ServiceBus.ICreateNotificationHubOptions> */
@js.native
trait CreateNotificationHubOptions extends StObject {
  
  var apns: js.UndefOr[Dictionary[String]] = js.native
  
  var gcm: js.UndefOr[Dictionary[String]] = js.native
  
  var mpns: js.UndefOr[Dictionary[String]] = js.native
  
  var wns: js.UndefOr[Dictionary[String]] = js.native
}
object CreateNotificationHubOptions {
  
  @scala.inline
  def apply(): CreateNotificationHubOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateNotificationHubOptions]
  }
  
  @scala.inline
  implicit class CreateNotificationHubOptionsMutableBuilder[Self <: CreateNotificationHubOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApns(value: Dictionary[String]): Self = StObject.set(x, "apns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApnsUndefined: Self = StObject.set(x, "apns", js.undefined)
    
    @scala.inline
    def setGcm(value: Dictionary[String]): Self = StObject.set(x, "gcm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGcmUndefined: Self = StObject.set(x, "gcm", js.undefined)
    
    @scala.inline
    def setMpns(value: Dictionary[String]): Self = StObject.set(x, "mpns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMpnsUndefined: Self = StObject.set(x, "mpns", js.undefined)
    
    @scala.inline
    def setWns(value: Dictionary[String]): Self = StObject.set(x, "wns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWnsUndefined: Self = StObject.set(x, "wns", js.undefined)
  }
}
