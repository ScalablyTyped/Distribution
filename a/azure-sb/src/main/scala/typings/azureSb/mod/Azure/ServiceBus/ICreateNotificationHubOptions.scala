package typings.azureSb.mod.Azure.ServiceBus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICreateNotificationHubOptions extends StObject {
  
  var apns: Dictionary[String]
  
  var gcm: Dictionary[String]
  
  var mpns: Dictionary[String]
  
  var wns: Dictionary[String]
}
object ICreateNotificationHubOptions {
  
  inline def apply(
    apns: Dictionary[String],
    gcm: Dictionary[String],
    mpns: Dictionary[String],
    wns: Dictionary[String]
  ): ICreateNotificationHubOptions = {
    val __obj = js.Dynamic.literal(apns = apns.asInstanceOf[js.Any], gcm = gcm.asInstanceOf[js.Any], mpns = mpns.asInstanceOf[js.Any], wns = wns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICreateNotificationHubOptions]
  }
  
  extension [Self <: ICreateNotificationHubOptions](x: Self) {
    
    inline def setApns(value: Dictionary[String]): Self = StObject.set(x, "apns", value.asInstanceOf[js.Any])
    
    inline def setGcm(value: Dictionary[String]): Self = StObject.set(x, "gcm", value.asInstanceOf[js.Any])
    
    inline def setMpns(value: Dictionary[String]): Self = StObject.set(x, "mpns", value.asInstanceOf[js.Any])
    
    inline def setWns(value: Dictionary[String]): Self = StObject.set(x, "wns", value.asInstanceOf[js.Any])
  }
}
