package typings.awsSdk.pinpointemailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutConfigurationSetTrackingOptionsRequest extends StObject {
  
  /**
    * The name of the configuration set that you want to add a custom tracking domain to.
    */
  var ConfigurationSetName: typings.awsSdk.pinpointemailMod.ConfigurationSetName
  
  /**
    * The domain that you want to use to track open and click events.
    */
  var CustomRedirectDomain: js.UndefOr[typings.awsSdk.pinpointemailMod.CustomRedirectDomain] = js.undefined
}
object PutConfigurationSetTrackingOptionsRequest {
  
  inline def apply(ConfigurationSetName: ConfigurationSetName): PutConfigurationSetTrackingOptionsRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutConfigurationSetTrackingOptionsRequest]
  }
  
  extension [Self <: PutConfigurationSetTrackingOptionsRequest](x: Self) {
    
    inline def setConfigurationSetName(value: ConfigurationSetName): Self = StObject.set(x, "ConfigurationSetName", value.asInstanceOf[js.Any])
    
    inline def setCustomRedirectDomain(value: CustomRedirectDomain): Self = StObject.set(x, "CustomRedirectDomain", value.asInstanceOf[js.Any])
    
    inline def setCustomRedirectDomainUndefined: Self = StObject.set(x, "CustomRedirectDomain", js.undefined)
  }
}
