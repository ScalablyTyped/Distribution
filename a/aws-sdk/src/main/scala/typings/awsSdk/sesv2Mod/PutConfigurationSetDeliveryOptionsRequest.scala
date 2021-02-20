package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutConfigurationSetDeliveryOptionsRequest extends StObject {
  
  /**
    * The name of the configuration set that you want to associate with a dedicated IP pool.
    */
  var ConfigurationSetName: typings.awsSdk.sesv2Mod.ConfigurationSetName = js.native
  
  /**
    * The name of the dedicated IP pool that you want to associate with the configuration set.
    */
  var SendingPoolName: js.UndefOr[typings.awsSdk.sesv2Mod.SendingPoolName] = js.native
  
  /**
    * Specifies whether messages that use the configuration set are required to use Transport Layer Security (TLS). If the value is Require, messages are only delivered if a TLS connection can be established. If the value is Optional, messages can be delivered in plain text if a TLS connection can't be established.
    */
  var TlsPolicy: js.UndefOr[typings.awsSdk.sesv2Mod.TlsPolicy] = js.native
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
    def setSendingPoolName(value: SendingPoolName): Self = StObject.set(x, "SendingPoolName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendingPoolNameUndefined: Self = StObject.set(x, "SendingPoolName", js.undefined)
    
    @scala.inline
    def setTlsPolicy(value: TlsPolicy): Self = StObject.set(x, "TlsPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTlsPolicyUndefined: Self = StObject.set(x, "TlsPolicy", js.undefined)
  }
}
