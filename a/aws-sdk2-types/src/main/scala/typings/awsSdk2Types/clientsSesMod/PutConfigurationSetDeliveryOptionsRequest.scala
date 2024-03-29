package typings.awsSdk2Types.clientsSesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutConfigurationSetDeliveryOptionsRequest extends StObject {
  
  /**
    * The name of the configuration set that you want to specify the delivery options for.
    */
  var ConfigurationSetName: typings.awsSdk2Types.clientsSesMod.ConfigurationSetName
  
  /**
    * Specifies whether messages that use the configuration set are required to use Transport Layer Security (TLS).
    */
  var DeliveryOptions: js.UndefOr[typings.awsSdk2Types.clientsSesMod.DeliveryOptions] = js.undefined
}
object PutConfigurationSetDeliveryOptionsRequest {
  
  inline def apply(ConfigurationSetName: ConfigurationSetName): PutConfigurationSetDeliveryOptionsRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutConfigurationSetDeliveryOptionsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutConfigurationSetDeliveryOptionsRequest] (val x: Self) extends AnyVal {
    
    inline def setConfigurationSetName(value: ConfigurationSetName): Self = StObject.set(x, "ConfigurationSetName", value.asInstanceOf[js.Any])
    
    inline def setDeliveryOptions(value: DeliveryOptions): Self = StObject.set(x, "DeliveryOptions", value.asInstanceOf[js.Any])
    
    inline def setDeliveryOptionsUndefined: Self = StObject.set(x, "DeliveryOptions", js.undefined)
  }
}
