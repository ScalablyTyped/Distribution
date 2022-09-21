package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutEmailIdentityConfigurationSetAttributesRequest extends StObject {
  
  /**
    * The configuration set to associate with an email identity.
    */
  var ConfigurationSetName: js.UndefOr[typings.awsSdk.sesv2Mod.ConfigurationSetName] = js.undefined
  
  /**
    * The email address or domain to associate with a configuration set.
    */
  var EmailIdentity: Identity
}
object PutEmailIdentityConfigurationSetAttributesRequest {
  
  inline def apply(EmailIdentity: Identity): PutEmailIdentityConfigurationSetAttributesRequest = {
    val __obj = js.Dynamic.literal(EmailIdentity = EmailIdentity.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutEmailIdentityConfigurationSetAttributesRequest]
  }
  
  extension [Self <: PutEmailIdentityConfigurationSetAttributesRequest](x: Self) {
    
    inline def setConfigurationSetName(value: ConfigurationSetName): Self = StObject.set(x, "ConfigurationSetName", value.asInstanceOf[js.Any])
    
    inline def setConfigurationSetNameUndefined: Self = StObject.set(x, "ConfigurationSetName", js.undefined)
    
    inline def setEmailIdentity(value: Identity): Self = StObject.set(x, "EmailIdentity", value.asInstanceOf[js.Any])
  }
}
