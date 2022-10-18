package typings.azureMsalCommon.mod

import typings.azureMsalCommon.distAuthorityAuthorityOptionsMod.AuthorityOptions
import typings.azureMsalCommon.distAuthorityCloudDiscoveryMetadataMod.CloudDiscoveryMetadata
import typings.azureMsalCommon.distAuthorityOpenIdConfigResponseMod.OpenIdConfigResponse
import typings.azureMsalCommon.distCacheInterfaceIcachemanagerMod.ICacheManager
import typings.azureMsalCommon.distConfigClientConfigurationMod.AzureCloudOptions
import typings.azureMsalCommon.distNetworkInetworkmoduleMod.INetworkModule
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
    authorityOptions: AuthorityOptions
  ) = this()
  def this(
    authority: String,
    networkInterface: INetworkModule,
    cacheManager: ICacheManager,
    authorityOptions: AuthorityOptions,
    proxyUrl: String
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
}
