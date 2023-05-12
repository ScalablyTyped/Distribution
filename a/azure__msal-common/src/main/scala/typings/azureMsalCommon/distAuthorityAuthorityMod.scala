package typings.azureMsalCommon

import typings.azureMsalCommon.distAuthorityAuthorityOptionsMod.AuthorityOptions
import typings.azureMsalCommon.distAuthorityAuthorityTypeMod.AuthorityType
import typings.azureMsalCommon.distAuthorityCloudDiscoveryMetadataMod.CloudDiscoveryMetadata
import typings.azureMsalCommon.distAuthorityOpenIdConfigResponseMod.OpenIdConfigResponse
import typings.azureMsalCommon.distAuthorityProtocolModeMod.ProtocolMode
import typings.azureMsalCommon.distAuthorityRegionDiscoveryMetadataMod.RegionDiscoveryMetadata
import typings.azureMsalCommon.distCacheInterfaceIcachemanagerMod.ICacheManager
import typings.azureMsalCommon.distConfigClientConfigurationMod.AzureCloudOptions
import typings.azureMsalCommon.distLoggerLoggerMod.Logger
import typings.azureMsalCommon.distNetworkInetworkmoduleMod.INetworkModule
import typings.azureMsalCommon.distTelemetryPerformanceIperformanceclientMod.IPerformanceClient
import typings.azureMsalCommon.distUrlIuriMod.IUri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAuthorityAuthorityMod {
  
  @JSImport("@azure/msal-common/dist/authority/Authority", "Authority")
  @js.native
  open class Authority protected () extends StObject {
    def this(
      authority: String,
      networkInterface: INetworkModule,
      cacheManager: ICacheManager,
      authorityOptions: AuthorityOptions,
      logger: Logger
    ) = this()
    def this(
      authority: String,
      networkInterface: INetworkModule,
      cacheManager: ICacheManager,
      authorityOptions: AuthorityOptions,
      logger: Logger,
      performanceClient: IPerformanceClient
    ) = this()
    def this(
      authority: String,
      networkInterface: INetworkModule,
      cacheManager: ICacheManager,
      authorityOptions: AuthorityOptions,
      logger: Logger,
      performanceClient: Unit,
      correlationId: String
    ) = this()
    def this(
      authority: String,
      networkInterface: INetworkModule,
      cacheManager: ICacheManager,
      authorityOptions: AuthorityOptions,
      logger: Logger,
      performanceClient: IPerformanceClient,
      correlationId: String
    ) = this()
    
    /* private */ var _canonicalAuthority: Any = js.native
    
    /* private */ var _canonicalAuthorityUrlComponents: Any = js.native
    
    /* private */ var authorityOptions: Any = js.native
    
    def authorityType: AuthorityType = js.native
    
    /**
      * OAuth /authorize endpoint for requests
      */
    def authorizationEndpoint: String = js.native
    
    /* protected */ var cacheManager: ICacheManager = js.native
    
    /**
      * A URL that is the authority set by the developer
      */
    def canonicalAuthority: String = js.native
    
    /**
      * Get authority components.
      */
    def canonicalAuthorityUrlComponents: IUri = js.native
    
    /**
      * Sets canonical authority.
      */
    def canonicalAuthority_=(url: String): Unit = js.native
    
    /* protected */ var correlationId: js.UndefOr[String] = js.native
    
    /**
      * The default open id configuration endpoint for any canonical authority.
      */
    /* protected */ def defaultOpenIdConfigurationEndpoint: String = js.native
    
    def deviceCodeEndpoint: String = js.native
    
    /**
      * Boolean that returns whethr or not tenant discovery has been completed.
      */
    def discoveryComplete(): Boolean = js.native
    
    /**
      * OAuth logout endpoint for requests
      */
    def endSessionEndpoint: String = js.native
    
    /**
      * Parse cloudDiscoveryMetadata config or check knownAuthorities
      */
    /* private */ var getCloudDiscoveryMetadataFromConfig: Any = js.native
    
    /**
      * Get cloud discovery metadata for common authorities
      */
    /* private */ var getCloudDiscoveryMetadataFromHarcodedValues: Any = js.native
    
    /**
      * Called to get metadata from network if CloudDiscoveryMetadata was not populated by config
      *
      * @param hasHardcodedMetadata boolean
      */
    /* private */ var getCloudDiscoveryMetadataFromNetwork: Any = js.native
    
    /**
      * Parse authorityMetadata config option
      */
    /* private */ var getEndpointMetadataFromConfig: Any = js.native
    
    /**
      * Get OAuth endpoints for common authorities.
      */
    /* private */ var getEndpointMetadataFromHardcodedValues: Any = js.native
    
    /**
      * Gets OAuth endpoints from the given OpenID configuration endpoint.
      *
      * @param hasHardcodedMetadata boolean
      */
    /* private */ var getEndpointMetadataFromNetwork: Any = js.native
    
    /**
      * helper function to generate environment from authority object
      */
    def getPreferredCache(): String = js.native
    
    /**
      * Get hostname and port i.e. login.microsoftonline.com
      */
    def hostnameAndPort: String = js.native
    
    /**
      * Returns whether or not the provided host is an alias of this authority instance
      * @param host
      */
    def isAlias(host: String): Boolean = js.native
    
    /**
      * Compares the number of url components after the domain to determine if the cached
      * authority metadata can be used for the requested authority. Protects against same domain different
      * authority such as login.microsoftonline.com/tenant and login.microsoftonline.com/tfp/tenant/policy
      * @param metadataEntity
      */
    /* private */ var isAuthoritySameType: Any = js.native
    
    /**
      * Helper function to determine if this host is included in the knownAuthorities config option
      */
    /* private */ var isInKnownAuthorities: Any = js.native
    
    /**
      * Jwks_uri for token signing keys
      */
    def jwksUri: String = js.native
    
    /* private */ var logger: Any = js.native
    
    /* private */ var metadata: Any = js.native
    
    /* protected */ var networkInterface: INetworkModule = js.native
    
    /**
      * Returns authorityOptions which can be used to reinstantiate a new authority instance
      */
    def options: AuthorityOptions = js.native
    
    /* protected */ var performanceClient: js.UndefOr[IPerformanceClient] = js.native
    
    /**
      * ProtocolMode enum representing the way endpoints are constructed.
      */
    def protocolMode: ProtocolMode = js.native
    
    /* private */ var regionDiscovery: Any = js.native
    
    var regionDiscoveryMetadata: RegionDiscoveryMetadata = js.native
    
    /**
      * Replaces path such as tenant or policy with the current tenant or policy.
      * @param urlString
      */
    /* private */ var replacePath: Any = js.native
    
    /**
      * Replaces tenant in url path with current tenant. Defaults to common.
      * @param urlString
      */
    /* private */ var replaceTenant: Any = js.native
    
    /**
      * Perform endpoint discovery to discover aliases, preferred_cache, preferred_network
      * and the /authorize, /token and logout endpoints.
      */
    def resolveEndpointsAsync(): js.Promise[Unit] = js.native
    
    /**
      * OAuth issuer for requests
      */
    def selfSignedJwtAudience: String = js.native
    
    /**
      * Get tenant for authority.
      */
    def tenant: String = js.native
    
    /**
      * OAuth /token endpoint for requests
      */
    def tokenEndpoint: String = js.native
    
    /**
      * Updates the AuthorityMetadataEntity with new aliases, preferred_network and preferred_cache
      * and returns where the information was retrieved from
      * @param metadataEntity
      * @returns AuthorityMetadataSource
      */
    /* private */ var updateCloudDiscoveryMetadata: Any = js.native
    
    /**
      * Update AuthorityMetadataEntity with new endpoints and return where the information came from
      * @param metadataEntity
      */
    /* private */ var updateEndpointMetadata: Any = js.native
    
    /**
      * Update the retrieved metadata with regional information.
      */
    /* private */ var updateMetadataWithRegionalInformation: Any = js.native
  }
  /* static members */
  object Authority {
    
    @JSImport("@azure/msal-common/dist/authority/Authority", "Authority")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Rebuild the authority string with the region
      *
      * @param host string
      * @param region string
      */
    inline def buildRegionalAuthorityString(host: String, region: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildRegionalAuthorityString")(host.asInstanceOf[js.Any], region.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def buildRegionalAuthorityString(host: String, region: String, queryString: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildRegionalAuthorityString")(host.asInstanceOf[js.Any], region.asInstanceOf[js.Any], queryString.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * Creates cloud discovery metadata object from a given host
      * @param host
      */
    inline def createCloudDiscoveryMetadataFromHost(host: String): CloudDiscoveryMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("createCloudDiscoveryMetadataFromHost")(host.asInstanceOf[js.Any]).asInstanceOf[CloudDiscoveryMetadata]
    
    /**
      * helper function to populate the authority based on azureCloudOptions
      * @param authorityString
      * @param azureCloudOptions
      */
    inline def generateAuthority(authorityString: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateAuthority")(authorityString.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def generateAuthority(authorityString: String, azureCloudOptions: AzureCloudOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateAuthority")(authorityString.asInstanceOf[js.Any], azureCloudOptions.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * Searches instance discovery network response for the entry that contains the host in the aliases list
      * @param response
      * @param authority
      */
    inline def getCloudDiscoveryMetadataFromNetworkResponse(response: js.Array[CloudDiscoveryMetadata], authority: String): CloudDiscoveryMetadata | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getCloudDiscoveryMetadataFromNetworkResponse")(response.asInstanceOf[js.Any], authority.asInstanceOf[js.Any])).asInstanceOf[CloudDiscoveryMetadata | Null]
    
    /**
      * Checks whether the provided host is that of a public cloud authority
      *
      * @param authority string
      * @returns bool
      */
    inline def isPublicCloudAuthority(host: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPublicCloudAuthority")(host.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Replace the endpoints in the metadata object with their regional equivalents.
      *
      * @param metadata OpenIdConfigResponse
      * @param azureRegion string
      */
    inline def replaceWithRegionalInformation(metadata: OpenIdConfigResponse, azureRegion: String): OpenIdConfigResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceWithRegionalInformation")(metadata.asInstanceOf[js.Any], azureRegion.asInstanceOf[js.Any])).asInstanceOf[OpenIdConfigResponse]
    
    /**
      * Transform CIAM_AUTHORIY as per the below rules:
      * If no path segments found and it is a CIAM authority (hostname ends with .ciamlogin.com), then transform it
      *
      * NOTE: The transformation path should go away once STS supports CIAM with the format: `tenantIdorDomain.ciamlogin.com`
      * `ciamlogin.com` can also change in the future and we should accommodate the same
      *
      * @param authority
      */
    inline def transformCIAMAuthority(authority: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("transformCIAMAuthority")(authority.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}
