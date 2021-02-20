package typings.azureSb.mod.Azure.ServiceBus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICreateNotificationHubOptions extends StObject {
  
  var apns: Dictionary[String] = js.native
  
  var gcm: Dictionary[String] = js.native
  
  var mpns: Dictionary[String] = js.native
  
  var wns: Dictionary[String] = js.native
}
object ICreateNotificationHubOptions {
  
  @scala.inline
  def apply(
    apns: Dictionary[String],
    gcm: Dictionary[String],
    mpns: Dictionary[String],
    wns: Dictionary[String]
  ): ICreateNotificationHubOptions = {
    val __obj = js.Dynamic.literal(apns = apns.asInstanceOf[js.Any], gcm = gcm.asInstanceOf[js.Any], mpns = mpns.asInstanceOf[js.Any], wns = wns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICreateNotificationHubOptions]
  }
  
  @scala.inline
  implicit class ICreateNotificationHubOptionsMutableBuilder[Self <: ICreateNotificationHubOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApns(value: Dictionary[String]): Self = StObject.set(x, "apns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGcm(value: Dictionary[String]): Self = StObject.set(x, "gcm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMpns(value: Dictionary[String]): Self = StObject.set(x, "mpns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWns(value: Dictionary[String]): Self = StObject.set(x, "wns", value.asInstanceOf[js.Any])
  }
}
