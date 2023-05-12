package typings.azureMsalCommon.mod

import typings.azureMsalCommon.distAuthorityAuthorityOptionsMod.AuthorityOptions
import typings.azureMsalCommon.distAuthorityCloudDiscoveryMetadataMod.CloudDiscoveryMetadata
import typings.azureMsalCommon.distAuthorityOpenIdConfigResponseMod.OpenIdConfigResponse
import typings.azureMsalCommon.distCacheInterfaceIcachemanagerMod.ICacheManager
import typings.azureMsalCommon.distConfigClientConfigurationMod.AzureCloudOptions
import typings.azureMsalCommon.distNetworkInetworkmoduleMod.INetworkModule
import typings.azureMsalCommon.distTelemetryPerformanceIperformanceclientMod.IPerformanceClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/msal-common", "Authority")
@js.native
open class Authority protected ()
  extends typings.azureMsalCommon.distAuthorityAuthorityMod.Authority {
  def this(
    authority: String,
    networkInterface: INetworkModule,
    cacheManager: ICacheManager,
    authorityOptions: AuthorityOptions,
    logger: typings.azureMsalCommon.distLoggerLoggerMod.Logger
  ) = this()
  def this(
    authority: String,
    networkInterface: INetworkModule,
    cacheManager: ICacheManager,
    authorityOptions: AuthorityOptions,
    logger: typings.azureMsalCommon.distLoggerLoggerMod.Logger,
    performanceClient: IPerformanceClient
  ) = this()
  def this(
    authority: String,
    networkInterface: INetworkModule,
    cacheManager: ICacheManager,
    authorityOptions: AuthorityOptions,
    logger: typings.azureMsalCommon.distLoggerLoggerMod.Logger,
    performanceClient: Unit,
    correlationId: String
  ) = this()
  def this(
    authority: String,
    networkInterface: INetworkModule,
    cacheManager: ICacheManager,
    authorityOptions: AuthorityOptions,
    logger: typings.azureMsalCommon.distLoggerLoggerMod.Logger,
    performanceClient: IPerformanceClient,
    correlationId: String
  ) = this()
}
/* static members */
object Authority {
  
  @JSImport("@azure/msal-common", "Authority")
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
