package typings.azureMsalCommon.anon

import typings.azureMsalCommon.distAuthorityAuthorityMod.Authority
import typings.azureMsalCommon.distConfigClientConfigurationMod.AzureCloudOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<@azure/msal-common.@azure/msal-common/dist/config/ClientConfiguration.AuthOptions> */
trait RequiredAuthOptions extends StObject {
  
  var authority: Authority
  
  var azureCloudOptions: AzureCloudOptions
  
  var clientCapabilities: js.Array[String]
  
  var clientId: String
  
  var skipAuthorityMetadataCache: Boolean
}
object RequiredAuthOptions {
  
  inline def apply(
    authority: Authority,
    azureCloudOptions: AzureCloudOptions,
    clientCapabilities: js.Array[String],
    clientId: String,
    skipAuthorityMetadataCache: Boolean
  ): RequiredAuthOptions = {
    val __obj = js.Dynamic.literal(authority = authority.asInstanceOf[js.Any], azureCloudOptions = azureCloudOptions.asInstanceOf[js.Any], clientCapabilities = clientCapabilities.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], skipAuthorityMetadataCache = skipAuthorityMetadataCache.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredAuthOptions]
  }
  
  extension [Self <: RequiredAuthOptions](x: Self) {
    
    inline def setAuthority(value: Authority): Self = StObject.set(x, "authority", value.asInstanceOf[js.Any])
    
    inline def setAzureCloudOptions(value: AzureCloudOptions): Self = StObject.set(x, "azureCloudOptions", value.asInstanceOf[js.Any])
    
    inline def setClientCapabilities(value: js.Array[String]): Self = StObject.set(x, "clientCapabilities", value.asInstanceOf[js.Any])
    
    inline def setClientCapabilitiesVarargs(value: String*): Self = StObject.set(x, "clientCapabilities", js.Array(value*))
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setSkipAuthorityMetadataCache(value: Boolean): Self = StObject.set(x, "skipAuthorityMetadataCache", value.asInstanceOf[js.Any])
  }
}
