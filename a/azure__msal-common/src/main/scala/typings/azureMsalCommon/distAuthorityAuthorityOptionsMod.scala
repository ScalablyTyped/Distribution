package typings.azureMsalCommon

import typings.azureMsalCommon.distAuthorityAzureRegionConfigurationMod.AzureRegionConfiguration
import typings.azureMsalCommon.distAuthorityProtocolModeMod.ProtocolMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAuthorityAuthorityOptionsMod {
  
  @js.native
  sealed trait AzureCloudInstance extends StObject
  @JSImport("@azure/msal-common/dist/authority/AuthorityOptions", "AzureCloudInstance")
  @js.native
  object AzureCloudInstance extends StObject {
    
    @JSBracketAccess
    def apply(value: Double | String): js.UndefOr[AzureCloudInstance & (Double | String)] = js.native
    
    @js.native
    sealed trait AzureChina
      extends StObject
         with AzureCloudInstance
    /* "https://login.chinacloudapi.cn" */ val AzureChina: typings.azureMsalCommon.distAuthorityAuthorityOptionsMod.AzureCloudInstance.AzureChina & (Double | String) = js.native
    
    @js.native
    sealed trait AzureGermany
      extends StObject
         with AzureCloudInstance
    /* "https://login.microsoftonline.de" */ val AzureGermany: typings.azureMsalCommon.distAuthorityAuthorityOptionsMod.AzureCloudInstance.AzureGermany & (Double | String) = js.native
    
    @js.native
    sealed trait AzurePpe
      extends StObject
         with AzureCloudInstance
    /* "https://login.windows-ppe.net" */ val AzurePpe: typings.azureMsalCommon.distAuthorityAuthorityOptionsMod.AzureCloudInstance.AzurePpe & (Double | String) = js.native
    
    @js.native
    sealed trait AzurePublic
      extends StObject
         with AzureCloudInstance
    /* "https://login.microsoftonline.com" */ val AzurePublic: typings.azureMsalCommon.distAuthorityAuthorityOptionsMod.AzureCloudInstance.AzurePublic & (Double | String) = js.native
    
    @js.native
    sealed trait AzureUsGovernment
      extends StObject
         with AzureCloudInstance
    /* "https://login.microsoftonline.us" */ val AzureUsGovernment: typings.azureMsalCommon.distAuthorityAuthorityOptionsMod.AzureCloudInstance.AzureUsGovernment & (Double | String) = js.native
    
    @js.native
    sealed trait None
      extends StObject
         with AzureCloudInstance
    /* 0 */ val None: typings.azureMsalCommon.distAuthorityAuthorityOptionsMod.AzureCloudInstance.None & (Double | String) = js.native
  }
  
  trait AuthorityOptions extends StObject {
    
    var authorityMetadata: String
    
    var azureRegionConfiguration: js.UndefOr[AzureRegionConfiguration] = js.undefined
    
    var cloudDiscoveryMetadata: String
    
    var knownAuthorities: js.Array[String]
    
    var protocolMode: ProtocolMode
    
    var skipAuthorityMetadataCache: js.UndefOr[Boolean] = js.undefined
  }
  object AuthorityOptions {
    
    inline def apply(
      authorityMetadata: String,
      cloudDiscoveryMetadata: String,
      knownAuthorities: js.Array[String],
      protocolMode: ProtocolMode
    ): AuthorityOptions = {
      val __obj = js.Dynamic.literal(authorityMetadata = authorityMetadata.asInstanceOf[js.Any], cloudDiscoveryMetadata = cloudDiscoveryMetadata.asInstanceOf[js.Any], knownAuthorities = knownAuthorities.asInstanceOf[js.Any], protocolMode = protocolMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthorityOptions]
    }
    
    extension [Self <: AuthorityOptions](x: Self) {
      
      inline def setAuthorityMetadata(value: String): Self = StObject.set(x, "authorityMetadata", value.asInstanceOf[js.Any])
      
      inline def setAzureRegionConfiguration(value: AzureRegionConfiguration): Self = StObject.set(x, "azureRegionConfiguration", value.asInstanceOf[js.Any])
      
      inline def setAzureRegionConfigurationUndefined: Self = StObject.set(x, "azureRegionConfiguration", js.undefined)
      
      inline def setCloudDiscoveryMetadata(value: String): Self = StObject.set(x, "cloudDiscoveryMetadata", value.asInstanceOf[js.Any])
      
      inline def setKnownAuthorities(value: js.Array[String]): Self = StObject.set(x, "knownAuthorities", value.asInstanceOf[js.Any])
      
      inline def setKnownAuthoritiesVarargs(value: String*): Self = StObject.set(x, "knownAuthorities", js.Array(value*))
      
      inline def setProtocolMode(value: ProtocolMode): Self = StObject.set(x, "protocolMode", value.asInstanceOf[js.Any])
      
      inline def setSkipAuthorityMetadataCache(value: Boolean): Self = StObject.set(x, "skipAuthorityMetadataCache", value.asInstanceOf[js.Any])
      
      inline def setSkipAuthorityMetadataCacheUndefined: Self = StObject.set(x, "skipAuthorityMetadataCache", js.undefined)
    }
  }
}
