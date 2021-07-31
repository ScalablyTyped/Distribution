package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutConfigurationSetDeliveryOptionsRequest extends StObject {
  
  /**
    * The name of the configuration set that you want to specify the delivery options for.
    */
  var ConfigurationSetName: typings.awsSdk.sesMod.ConfigurationSetName
  
  /**
    * Specifies whether messages that use the configuration set are required to use Transport Layer Security (TLS).
    */
  var DeliveryOptions: js.UndefOr[typings.awsSdk.sesMod.DeliveryOptions] = js.undefined
}
object PutConfigurationSetDeliveryOptionsRequest {
  
  @scala.inline
  def apply(ConfigurationSetName: ConfigurationSetName): PutConfigurationSetDeliveryOptionsRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutConfigurationSetDeliveryOptionsRequest]
  }
  
  @scala.inline
  implicit class PutConfigurationSetDeliveryOptionsRequestMutableBuilder[Self <: PutConfigurationSetDeliveryOptionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationSetName(value: ConfigurationSetName): Self = StObject.set(x, "ConfigurationSetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryOptions(value: DeliveryOptions): Self = StObject.set(x, "DeliveryOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryOptionsUndefined: Self = StObject.set(x, "DeliveryOptions", js.undefined)
  }
}
