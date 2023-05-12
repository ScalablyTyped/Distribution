package typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PerformanceEvents extends StObject
@JSImport("@azure/msal-common/dist/telemetry/performance/PerformanceEvent", "PerformanceEvents")
@js.native
object PerformanceEvents extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PerformanceEvents & String] = js.native
  
  /**
    * Time taken for token acquisition by broker
    */
  @js.native
  sealed trait AcquireTokenByBroker
    extends StObject
       with PerformanceEvents
  /* "acquireTokenByBroker" */ val AcquireTokenByBroker: typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEvents.AcquireTokenByBroker & String = js.native
  
  /**
    * acquireTokenByCode API (msal-browser and msal-node).
    * Used to acquire tokens by trading an authorization code against the token endpoint.
    */
  @js.native
  sealed trait AcquireTokenByCode
    extends StObject
       with PerformanceEvents
  /* "acquireTokenByCode" */ val AcquireTokenByCode: typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEvents.AcquireTokenByCode & String = js.native
  
  @js.native
  sealed trait AcquireTokenByCodeAsync
    extends StObject
       with PerformanceEvents
  /* "acquireTokenByCodeAsync" */ val AcquireTokenByCodeAsync: typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEvents.AcquireTokenByCodeAsync & String = js.native
  
  /**
    * acquireTokenByRefreshToken API (msal-browser and msal-node).
    * Used to renew an access token using a refresh token against the token endpoint.
    */
  @js.native
  sealed trait AcquireTokenByRefreshToken
    extends StObject
       with PerformanceEvents
  /* "acquireTokenByRefreshToken" */ val AcquireTokenByRefreshToken: typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEvents.AcquireTokenByRefreshToken & String = js.native
  
  /**
    * acquireTokenByRefreshToken API in BrokerClientApplication (PW-Broker) .
    */
  @js.native
  sealed trait AcquireTokenByRefreshTokenInBroker
    extends StObject
       with PerformanceEvents
  /* "acquireTokenByRefreshTokenInBroker" */ val AcquireTokenByRefreshTokenInBroker: typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEvents.AcquireTokenByRefreshTokenInBroker & String = js.native
  
  /**
    * acquireTokenBySilentIframe (msal-browser).
    * Internal API for acquiring token by silent Iframe
    */
  @js.native
  sealed trait AcquireTokenBySilentIframe
    extends StObject
       with PerformanceEvents
  /* "acquireTokenBySilentIframe" */ val AcquireTokenBySilentIframe: typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEvents.AcquireTokenBySilentIframe & String = js.native
  
  /**
    * acquireTokenFromCache (msal-browser).
    * Internal API for acquiring token from cache
    */
  @js.native
  sealed trait AcquireTokenFromCache
    extends StObject
       with PerformanceEvents
  /* "acquireTokenFromCache" */ val AcquireTokenFromCache: typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEvents.AcquireTokenFromCache & String = js.native
  
  /**
    * acquireTokenPopup (msal-browser).
    * Used to acquire a new access token interactively through pop ups
    */
  @js.native
  sealed trait AcquireTokenPopup
    extends StObject
       with PerformanceEvents
  /* "acquireTokenPopup" */ val AcquireTokenPopup: typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEvents.AcquireTokenPopup & String = js.native
  
  /**
    * acquireTokenSilent API (msal-browser and msal-node).
    * Used to silently acquire a new access token (from the cache or the network).
    */
  @js.native
  sealed trait AcquireTokenSilent
    extends StObject
       with PerformanceEvents
  /* "acquireTokenSilent" */ val AcquireTokenSilent: typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEvents.AcquireTokenSilent & String = js.native
  
  /**
    * acquireTokenSilentAsync (msal-browser).
    * Internal API for acquireTokenSilent.
    */
  @js.native
  sealed trait AcquireTokenSilentAsync
    extends StObject
       with PerformanceEvents
  /* "acquireTokenSilentAsync" */ val AcquireTokenSilentAsync: typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEvents.AcquireTokenSilentAsync & String = js.native
  
  /**
    * APIs in Authorization Code Client (msal-common)
    */
  @js.native
  sealed trait AuthClientAcquireToken
    extends StObject
       with PerformanceEvents
  /* "authClientAcquireToken" */ val AuthClientAcquireToken: typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEvents.AuthClientAcquireToken & String = js.native
  
  @js.native
  sealed trait AuthClientCreateQueryString
    extends StObject
       with PerformanceEvents
  /* "authClientCreateQueryString" */ val AuthClientCreateQueryString: typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEvents.AuthClientCreateQueryString & String = js.native
  
  @js.native
  sealed trait AuthClientCreateTokenRequestBody
    extends StObject
       with PerformanceEvents
  /* "authClientCreateTokenRequestBody" */ val AuthClientCreateTokenRequestBody: typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEvents.AuthClientCreateTokenRequestBody & String = js.native
  
  @js.native
  sealed trait AuthClientExecuteTokenRequest
    extends StObject
       with PerformanceEvents
  /* "authClientExecuteTokenRequest" */ val AuthClientExecuteTokenRequest: typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEvents.AuthClientExecuteTokenRequest & String = js.native
  
  /**
    * Authority functions
    */
  @js.native
  sealed trait AuthorityFactoryCreateDiscoveredInstance
    extends StObject
       with PerformanceEvents
  /* "authorityFactoryCreateDiscoveredInstance" */ val AuthorityFactoryCreateDiscoveredInstance: typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEvents.AuthorityFactoryCreateDiscoveredInstance & String = js.native
  
  @js.native
  sealed trait AuthorityGetCloudDiscoveryMetadataFromNetwork
    extends StObject
       with PerformanceEvents
  /* "authorityGetCloudDiscoveryMetadataFromNetwork" */ val AuthorityGetCloudDiscoveryMetadataFromNetwork: typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEvents.AuthorityGetCloudDiscoveryMetadataFromNetwork & String = js.native
  
  @js.native
  sealed trait AuthorityGetEndpointMetadataFromNetwork
    extends StObject
       with PerformanceEvents
  /* "authorityGetEndpointMetadataFromNetwork" */ val AuthorityGetEndpointMetadataFromNetwork: typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEvents.AuthorityGetEndpointMetadataFromNetwork & String = js.native
  
  @js.native
  sealed trait AuthorityResolveEndpointsAsync
    extends StObject
       with PerformanceEvents
  /* "authorityResolveEndpointsAsync" */ val AuthorityResolveEndpointsAsync: typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEvents.AuthorityResolveEndpointsAsync & String = js.native
  
  @js.native
  sealed trait AuthorityUpdateCloudDiscoveryMetadata
    extends StObject
       with PerformanceEvents
  /* "authorityUpdateCloudDiscoveryMetadata" */ val AuthorityUpdateCloudDiscoveryMetadata: typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEvents.AuthorityUpdateCloudDiscoveryMetadata & String = js.native
  
  @js.native
  sealed trait AuthorityUpdateEndpointMetadata
    extends StObject
       with PerformanceEvents
  /* "authorityUpdateEndpointMetadata" */ val AuthorityUpdateEndpointMetadata: typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEvents.AuthorityUpdateEndpointMetadata & String = js.native
  
  @js.native
  sealed trait AuthorityUpdateMetadataWithRegionalInformation
    extends StObject
       with PerformanceEvents
  /* "authorityUpdateMetadataWithRegionalInformation" */ val AuthorityUpdateMetadataWithRegionalInformation: typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEvents.AuthorityUpdateMetadataWithRegionalInformation & String = js.native
  
  /**
    * Time spent creating default headers for requests to token endpoint
    */
  @js.native
  sealed trait BaseClientCreateTokenRequestHeaders
    extends StObject
       with PerformanceEvents
  /* "baseClientCreateTokenRequestHeaders" */ val BaseClientCreateTokenRequestHeaders: typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEvents.BaseClientCreateTokenRequestHeaders & String = js.native
  
  /**
    * Used to measure the time taken for completing embedded-broker handshake (PW-Broker).
    */
  @js.native
  sealed trait BrokerHandhshake
    extends StObject
       with PerformanceEvents
  /* "brokerHandshake" */ val BrokerHandhshake: typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEvents.BrokerHandhshake & String = js.native
  
  /**
    * getPublicKeyThumbprint API in CryptoOpts class (msal-browser).
    * Used to generate a public/private keypair and generate a public key thumbprint for pop requests.
    */
  @js.native
  sealed trait CryptoOptsGetPublicKeyThumbprint
    extends StObject
       with PerformanceEvents
  /* "cryptoOptsGetPublicKeyThumbprint" */ val CryptoOptsGetPublicKeyThumbprint: typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEvents.CryptoOptsGetPublicKeyThumbprint & String = js.native
  
  /**
    * signJwt API in CryptoOpts class (msal-browser).
    * Used to signed a pop token.
    */
  @js.native
  sealed trait CryptoOptsSignJwt
    extends StObject
       with PerformanceEvents
  /* "cryptoOptsSignJwt" */ val CryptoOptsSignJwt: typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEvents.CryptoOptsSignJwt & String = js.native
  
  /**
    * acquireToken APIs in msal-browser.
    * Used to make an /authorize endpoint call with native brokering enabled.
    */
  @js.native
  sealed trait FetchAccountIdWithNativeBroker
    extends StObject
       with PerformanceEvents
  /* "fetchAccountIdWithNativeBroker" */ val FetchAccountIdWithNativeBroker: typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEvents.FetchAccountIdWithNativeBroker & String = js.native
  
  /**
    * getAuthCodeUrl API (msal-browser and msal-node).
    */
  @js.native
  sealed trait GetAuthCodeUrl
    extends StObject
       with PerformanceEvents
  /* "getAuthCodeUrl" */ val GetAuthCodeUrl: typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEvents.GetAuthCodeUrl & String = js.native
  
  @js.native
  sealed trait GetCloudDiscoveryMetadataFromNetworkMeasurement
    extends StObject
       with PerformanceEvents
  /* "getCloudDiscoveryMetadataFromNetworkMeasurement" */ val GetCloudDiscoveryMetadataFromNetworkMeasurement: typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEvents.GetCloudDiscoveryMetadataFromNetworkMeasurement & String = js.native
  
  @js.native
  sealed trait GetEndpointMetadataFromNetwork
    extends StObject
       with PerformanceEvents
  /* "getEndpointMetadataFromNetwork" */ val GetEndpointMetadataFromNetwork: typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEvents.GetEndpointMetadataFromNetwork & String = js.native
  
  @js.native
  sealed trait HandleCodeResponseFromHash
    extends StObject
       with PerformanceEvents
  /* "handleCodeResponseFromHash" */ val HandleCodeResponseFromHash: typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEvents.HandleCodeResponseFromHash & String = js.native
  
  /**
    * Functions from InteractionHandler (msal-browser)
    */
  @js.native
  sealed trait HandleCodeResponseFromServer
    extends StObject
       with PerformanceEvents
  /* "handleCodeResponseFromServer" */ val HandleCodeResponseFromServer: typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEvents.HandleCodeResponseFromServer & String = js.native
  
  @js.native
  sealed trait HandleRedirectPromiseMeasurement
    extends StObject
       with PerformanceEvents
  /* "handleRedirectPromiseMeasurement" */ val HandleRedirectPromiseMeasurement: typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEvents.HandleRedirectPromiseMeasurement & String = js.native
  
  /**
    * handleServerTokenResponse API in ResponseHandler (msal-common)
    */
  @js.native
  sealed trait HandleServerTokenResponse
    extends StObject
       with PerformanceEvents
  /* "handleServerTokenResponse" */ val HandleServerTokenResponse: typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEvents.HandleServerTokenResponse & String = js.native
  
  /**
    * Internal API for initializing base request in BaseInteractionClient (msal-browser)
    */
  @js.native
  sealed trait InitializeBaseRequest
    extends StObject
       with PerformanceEvents
  /* "initializeBaseRequest" */ val InitializeBaseRequest: typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEvents.InitializeBaseRequest & String = js.native
  
  @js.native
  sealed trait InitializeClientApplication
    extends StObject
       with PerformanceEvents
  /* "initializeClientApplication" */ val InitializeClientApplication: typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEvents.InitializeClientApplication & String = js.native
  
  /**
    * Internal API for initializing silent request in SilentCacheClient (msal-browser)
    */
  @js.native
  sealed trait InitializeSilentRequest
    extends StObject
       with PerformanceEvents
  /* "initializeSilentRequest" */ val InitializeSilentRequest: typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEvents.InitializeSilentRequest & String = js.native
  
  /**
    * acquireToken API in NativeInteractionClient class (msal-browser).
    * Used to acquire a token from Native component when native brokering is enabled.
    */
  @js.native
  sealed trait NativeInteractionClientAcquireToken
    extends StObject
       with PerformanceEvents
  /* "nativeInteractionClientAcquireToken" */ val NativeInteractionClientAcquireToken: typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEvents.NativeInteractionClientAcquireToken & String = js.native
  
  @js.native
  sealed trait NativeMessageHandlerHandshake
    extends StObject
       with PerformanceEvents
  /* "nativeMessageHandlerHandshake" */ val NativeMessageHandlerHandshake: typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEvents.NativeMessageHandlerHandshake & String = js.native
  
  /**
    * Generate functions in PopTokenGenerator (msal-common)
    */
  @js.native
  sealed trait PopTokenGenerateCnf
    extends StObject
       with PerformanceEvents
  /* "popTokenGenerateCnf" */ val PopTokenGenerateCnf: typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEvents.PopTokenGenerateCnf & String = js.native
  
  @js.native
  sealed trait PopTokenGenerateKid
    extends StObject
       with PerformanceEvents
  /* "popTokenGenerateKid" */ val PopTokenGenerateKid: typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEvents.PopTokenGenerateKid & String = js.native
  
  /**
    * Time taken for acquiring refresh token , records RT size
    */
  @js.native
  sealed trait RefreshTokenClientAcquireToken
    extends StObject
       with PerformanceEvents
  /* "refreshTokenClientAcquireToken" */ val RefreshTokenClientAcquireToken: typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEvents.RefreshTokenClientAcquireToken & String = js.native
  
  /**
    * acquireTokenByRefreshToken API in RefreshTokenClient (msal-common).
    */
  @js.native
  sealed trait RefreshTokenClientAcquireTokenByRefreshToken
    extends StObject
       with PerformanceEvents
  /* "refreshTokenClientAcquireTokenByRefreshToken" */ val RefreshTokenClientAcquireTokenByRefreshToken: typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEvents.RefreshTokenClientAcquireTokenByRefreshToken & String = js.native
  
  /**
    * Time taken for acquiring cached refresh token
    */
  @js.native
  sealed trait RefreshTokenClientAcquireTokenWithCachedRefreshToken
    extends StObject
       with PerformanceEvents
  /* "refreshTokenClientAcquireTokenWithCachedRefreshToken" */ val RefreshTokenClientAcquireTokenWithCachedRefreshToken: typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEvents.RefreshTokenClientAcquireTokenWithCachedRefreshToken & String = js.native
  
  /**
    * Helper function to create token request body in RefreshTokenClient (msal-common).
    */
  @js.native
  sealed trait RefreshTokenClientCreateTokenRequestBody
    extends StObject
       with PerformanceEvents
  /* "refreshTokenClientCreateTokenRequestBody" */ val RefreshTokenClientCreateTokenRequestBody: typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEvents.RefreshTokenClientCreateTokenRequestBody & String = js.native
  
  /**
    * Time spent on the network for refresh token acquisition
    */
  @js.native
  sealed trait RefreshTokenClientExecuteTokenRequest
    extends StObject
       with PerformanceEvents
  /* "refreshTokenClientExecuteTokenRequest" */ val RefreshTokenClientExecuteTokenRequest: typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEvents.RefreshTokenClientExecuteTokenRequest & String = js.native
  
  /**
    * Region Discovery functions
    */
  @js.native
  sealed trait RegionDiscoveryDetectRegion
    extends StObject
       with PerformanceEvents
  /* "regionDiscoveryDetectRegion" */ val RegionDiscoveryDetectRegion: typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEvents.RegionDiscoveryDetectRegion & String = js.native
  
  @js.native
  sealed trait RegionDiscoveryGetCurrentVersion
    extends StObject
       with PerformanceEvents
  /* "regionDiscoveryGetCurrentVersion" */ val RegionDiscoveryGetCurrentVersion: typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEvents.RegionDiscoveryGetCurrentVersion & String = js.native
  
  @js.native
  sealed trait RegionDiscoveryGetRegionFromIMDS
    extends StObject
       with PerformanceEvents
  /* "regionDiscoveryGetRegionFromIMDS" */ val RegionDiscoveryGetRegionFromIMDS: typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEvents.RegionDiscoveryGetRegionFromIMDS & String = js.native
  
  /**
    * acquireToken API in the SilentCacheClient class (msal-browser).
    * Used to read access tokens from the cache.
    */
  @js.native
  sealed trait SilentCacheClientAcquireToken
    extends StObject
       with PerformanceEvents
  /* "silentCacheClientAcquireToken" */ val SilentCacheClientAcquireToken: typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEvents.SilentCacheClientAcquireToken & String = js.native
  
  /**
    * SilentHandler
    */
  @js.native
  sealed trait SilentHandlerInitiateAuthRequest
    extends StObject
       with PerformanceEvents
  /* "silentHandlerInitiateAuthRequest" */ val SilentHandlerInitiateAuthRequest: typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEvents.SilentHandlerInitiateAuthRequest & String = js.native
  
  @js.native
  sealed trait SilentHandlerLoadFrame
    extends StObject
       with PerformanceEvents
  /* "silentHandlerLoadFrame" */ val SilentHandlerLoadFrame: typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEvents.SilentHandlerLoadFrame & String = js.native
  
  @js.native
  sealed trait SilentHandlerMonitorIframeForHash
    extends StObject
       with PerformanceEvents
  /* "silentHandlerMonitorIframeForHash" */ val SilentHandlerMonitorIframeForHash: typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEvents.SilentHandlerMonitorIframeForHash & String = js.native
  
  /**
    * acquireToken API in the SilentIframeClient class (msal-browser).
    * Used to acquire a new set of tokens from the authorize endpoint in a hidden iframe.
    */
  @js.native
  sealed trait SilentIframeClientAcquireToken
    extends StObject
       with PerformanceEvents
  /* "silentIframeClientAcquireToken" */ val SilentIframeClientAcquireToken: typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEvents.SilentIframeClientAcquireToken & String = js.native
  
  /**
    * Helper function in SilentIframeClient class (msal-browser).
    */
  @js.native
  sealed trait SilentIframeClientTokenHelper
    extends StObject
       with PerformanceEvents
  /* "silentIframeClientTokenHelper" */ val SilentIframeClientTokenHelper: typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEvents.SilentIframeClientTokenHelper & String = js.native
  
  /**
    * acquireToken API in SilentRereshClient (msal-browser).
    * Used to acquire a new set of tokens from the token endpoint using a refresh token.
    */
  @js.native
  sealed trait SilentRefreshClientAcquireToken
    extends StObject
       with PerformanceEvents
  /* "silentRefreshClientAcquireToken" */ val SilentRefreshClientAcquireToken: typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEvents.SilentRefreshClientAcquireToken & String = js.native
  
  /**
    * ssoSilent API (msal-browser).
    * Used to silently acquire an authorization code and set of tokens using a hidden iframe.
    */
  @js.native
  sealed trait SsoSilent
    extends StObject
       with PerformanceEvents
  /* "ssoSilent" */ val SsoSilent: typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEvents.SsoSilent & String = js.native
  
  /**
    * Helper functions in StandardInteractionClient class (msal-browser)
    */
  @js.native
  sealed trait StandardInteractionClientCreateAuthCodeClient
    extends StObject
       with PerformanceEvents
  /* "standardInteractionClientCreateAuthCodeClient" */ val StandardInteractionClientCreateAuthCodeClient: typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEvents.StandardInteractionClientCreateAuthCodeClient & String = js.native
  
  @js.native
  sealed trait StandardInteractionClientGetClientConfiguration
    extends StObject
       with PerformanceEvents
  /* "standardInteractionClientGetClientConfiguration" */ val StandardInteractionClientGetClientConfiguration: typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEvents.StandardInteractionClientGetClientConfiguration & String = js.native
  
  /**
    * getDiscoveredAuthority API in StandardInteractionClient class (msal-browser).
    * Used to load authority metadata for a request.
    */
  @js.native
  sealed trait StandardInteractionClientGetDiscoveredAuthority
    extends StObject
       with PerformanceEvents
  /* "standardInteractionClientGetDiscoveredAuthority" */ val StandardInteractionClientGetDiscoveredAuthority: typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEvents.StandardInteractionClientGetDiscoveredAuthority & String = js.native
  
  @js.native
  sealed trait StandardInteractionClientInitializeAuthorizationCodeRequest
    extends StObject
       with PerformanceEvents
  /* "standardInteractionClientInitializeAuthorizationCodeRequest" */ val StandardInteractionClientInitializeAuthorizationCodeRequest: typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEvents.StandardInteractionClientInitializeAuthorizationCodeRequest & String = js.native
  
  @js.native
  sealed trait StandardInteractionClientInitializeAuthorizationRequest
    extends StObject
       with PerformanceEvents
  /* "standardInteractionClientInitializeAuthorizationRequest" */ val StandardInteractionClientInitializeAuthorizationRequest: typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEvents.StandardInteractionClientInitializeAuthorizationRequest & String = js.native
  
  @js.native
  sealed trait UpdateCloudDiscoveryMetadataMeasurement
    extends StObject
       with PerformanceEvents
  /* "updateCloudDiscoveryMetadataMeasurement" */ val UpdateCloudDiscoveryMetadataMeasurement: typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEvents.UpdateCloudDiscoveryMetadataMeasurement & String = js.native
  
  @js.native
  sealed trait UpdateTokenEndpointAuthority
    extends StObject
       with PerformanceEvents
  /* "updateTokenEndpointAuthority" */ val UpdateTokenEndpointAuthority: typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEvents.UpdateTokenEndpointAuthority & String = js.native
  
  @js.native
  sealed trait UsernamePasswordClientAcquireToken
    extends StObject
       with PerformanceEvents
  /* "usernamePasswordClientAcquireToken" */ val UsernamePasswordClientAcquireToken: typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEvents.UsernamePasswordClientAcquireToken & String = js.native
}
