package typings.azureMsalCommon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTelemetryPerformancePerformanceEventMod {
  
  @js.native
  sealed trait PerformanceEventStatus extends StObject
  @JSImport("@azure/msal-common/dist/telemetry/performance/PerformanceEvent", "PerformanceEventStatus")
  @js.native
  object PerformanceEventStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[PerformanceEventStatus & Double] = js.native
    
    @js.native
    sealed trait Completed
      extends StObject
         with PerformanceEventStatus
    /* 2 */ val Completed: typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEventStatus.Completed & Double = js.native
    
    @js.native
    sealed trait InProgress
      extends StObject
         with PerformanceEventStatus
    /* 1 */ val InProgress: typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEventStatus.InProgress & Double = js.native
    
    @js.native
    sealed trait NotStarted
      extends StObject
         with PerformanceEventStatus
    /* 0 */ val NotStarted: typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEventStatus.NotStarted & Double = js.native
  }
  
  @js.native
  sealed trait PerformanceEvents extends StObject
  @JSImport("@azure/msal-common/dist/telemetry/performance/PerformanceEvent", "PerformanceEvents")
  @js.native
  object PerformanceEvents extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[PerformanceEvents & String] = js.native
    
    /**
      * acquireToken API in BrokerClientApplication.
      * Used to acquire a token on behalf of the embedded application (PW-Broker).
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
      * acquireToken API in NativeInteractionClient class (msal-browser).
      * Used to acquire a token from Native component when native brokering is enabled.
      */
    @js.native
    sealed trait NativeInteractionClientAcquireToken
      extends StObject
         with PerformanceEvents
    /* "nativeInteractionClientAcquireToken" */ val NativeInteractionClientAcquireToken: typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEvents.NativeInteractionClientAcquireToken & String = js.native
    
    /**
      * Time spent on the network for refresh token acquisition
      */
    @js.native
    sealed trait RefreshTokenClientExecuteTokenRequest
      extends StObject
         with PerformanceEvents
    /* "refreshTokenClientExecuteTokenRequest" */ val RefreshTokenClientExecuteTokenRequest: typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEvents.RefreshTokenClientExecuteTokenRequest & String = js.native
    
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
      * acquireToken API in the SilentIframeClient class (msal-browser).
      * Used to acquire a new set of tokens from the authorize endpoint in a hidden iframe.
      */
    @js.native
    sealed trait SilentIframeClientAcquireToken
      extends StObject
         with PerformanceEvents
    /* "silentIframeClientAcquireToken" */ val SilentIframeClientAcquireToken: typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEvents.SilentIframeClientAcquireToken & String = js.native
    
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
      * getDiscoveredAuthority API in StandardInteractionClient class (msal-browser).
      * Used to load authority metadata for a request.
      */
    @js.native
    sealed trait StandardInteractionClientGetDiscoveredAuthority
      extends StObject
         with PerformanceEvents
    /* "standardInteractionClientGetDiscoveredAuthority" */ val StandardInteractionClientGetDiscoveredAuthority: typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEvents.StandardInteractionClientGetDiscoveredAuthority & String = js.native
  }
  
  trait PerformanceEvent extends StObject {
    
    /**
      *
      * Size of the access token
      *
      * @type {number}
      */
    var accessTokenSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Application name as specified by the app.
      *
      * @type {?string}
      */
    var appName: js.UndefOr[String] = js.undefined
    
    /**
      * Application version as specified by the app.
      *
      * @type {?string}
      */
    var appVersion: js.UndefOr[String] = js.undefined
    
    /**
      * Login authority used for the request
      *
      * @type {string}
      */
    var authority: String
    
    /**
      * Client id for the application
      *
      * @type {string}
      */
    var clientId: String
    
    /**
      * Correlation ID used for the request
      *
      * @type {string}
      */
    var correlationId: String
    
    /**
      * End-to-end duration in milliseconds.
      * @date 3/22/2022 - 3:40:05 PM
      *
      * @type {number}
      */
    var durationMs: js.UndefOr[Double] = js.undefined
    
    /**
      * Visibility of the page when the event completed.
      * Read from: https://developer.mozilla.org/docs/Web/API/Page_Visibility_API
      *
      * @type {?(string | null)}
      */
    var endPageVisibility: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Add specific error code in case of failure
      *
      * @type {string}
      */
    var errorCode: js.UndefOr[String] = js.undefined
    
    /**
      * Unique id for the event
      *
      * @type {string}
      */
    var eventId: String
    
    /**
      * Whether the result was retrieved from the cache.
      *
      * @type {(boolean | null)}
      */
    var fromCache: js.UndefOr[Boolean | Null] = js.undefined
    
    /**
      * Size of the id token
      *
      * @type {number}
      */
    var idTokenSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether the response is from a native component (e.g., WAM)
      *
      * @type {?boolean}
      */
    var isNativeBroker: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Name of the library used for the operation.
      *
      * @type {string}
      */
    var libraryName: String
    
    /**
      * Version of the library used for the operation.
      *
      * @type {string}
      */
    var libraryVersion: String
    
    /**
      * Event name (usually in the form of classNameFunctionName)
      *
      * @type {PerformanceEvents}
      */
    var name: PerformanceEvents
    
    /**
      * Visibility of the page when the event completed.
      * Read from: https://developer.mozilla.org/docs/Web/API/Page_Visibility_API
      *
      * @type {?(string | null)}
      */
    var startPageVisibility: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Unix millisecond timestamp when the event was initiated.
      *
      * @type {number}
      */
    var startTimeMs: Double
    
    /**
      * State of the perforance measure.
      *
      * @type {PerformanceEventStatus}
      */
    var status: PerformanceEventStatus
    
    /**
      * Add specific sub error code in case of failure
      *
      * @type {string}
      */
    var subErrorCode: js.UndefOr[String] = js.undefined
    
    /**
      * Whether or the operation completed successfully.
      *
      * @type {(boolean | null)}
      */
    var success: js.UndefOr[Boolean | Null] = js.undefined
  }
  object PerformanceEvent {
    
    inline def apply(
      authority: String,
      clientId: String,
      correlationId: String,
      eventId: String,
      libraryName: String,
      libraryVersion: String,
      name: PerformanceEvents,
      startTimeMs: Double,
      status: PerformanceEventStatus
    ): PerformanceEvent = {
      val __obj = js.Dynamic.literal(authority = authority.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], correlationId = correlationId.asInstanceOf[js.Any], eventId = eventId.asInstanceOf[js.Any], libraryName = libraryName.asInstanceOf[js.Any], libraryVersion = libraryVersion.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], startTimeMs = startTimeMs.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[PerformanceEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PerformanceEvent] (val x: Self) extends AnyVal {
      
      inline def setAccessTokenSize(value: Double): Self = StObject.set(x, "accessTokenSize", value.asInstanceOf[js.Any])
      
      inline def setAccessTokenSizeUndefined: Self = StObject.set(x, "accessTokenSize", js.undefined)
      
      inline def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
      
      inline def setAppNameUndefined: Self = StObject.set(x, "appName", js.undefined)
      
      inline def setAppVersion(value: String): Self = StObject.set(x, "appVersion", value.asInstanceOf[js.Any])
      
      inline def setAppVersionUndefined: Self = StObject.set(x, "appVersion", js.undefined)
      
      inline def setAuthority(value: String): Self = StObject.set(x, "authority", value.asInstanceOf[js.Any])
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setCorrelationId(value: String): Self = StObject.set(x, "correlationId", value.asInstanceOf[js.Any])
      
      inline def setDurationMs(value: Double): Self = StObject.set(x, "durationMs", value.asInstanceOf[js.Any])
      
      inline def setDurationMsUndefined: Self = StObject.set(x, "durationMs", js.undefined)
      
      inline def setEndPageVisibility(value: String): Self = StObject.set(x, "endPageVisibility", value.asInstanceOf[js.Any])
      
      inline def setEndPageVisibilityNull: Self = StObject.set(x, "endPageVisibility", null)
      
      inline def setEndPageVisibilityUndefined: Self = StObject.set(x, "endPageVisibility", js.undefined)
      
      inline def setErrorCode(value: String): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
      
      inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
      
      inline def setEventId(value: String): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
      
      inline def setFromCache(value: Boolean): Self = StObject.set(x, "fromCache", value.asInstanceOf[js.Any])
      
      inline def setFromCacheNull: Self = StObject.set(x, "fromCache", null)
      
      inline def setFromCacheUndefined: Self = StObject.set(x, "fromCache", js.undefined)
      
      inline def setIdTokenSize(value: Double): Self = StObject.set(x, "idTokenSize", value.asInstanceOf[js.Any])
      
      inline def setIdTokenSizeUndefined: Self = StObject.set(x, "idTokenSize", js.undefined)
      
      inline def setIsNativeBroker(value: Boolean): Self = StObject.set(x, "isNativeBroker", value.asInstanceOf[js.Any])
      
      inline def setIsNativeBrokerUndefined: Self = StObject.set(x, "isNativeBroker", js.undefined)
      
      inline def setLibraryName(value: String): Self = StObject.set(x, "libraryName", value.asInstanceOf[js.Any])
      
      inline def setLibraryVersion(value: String): Self = StObject.set(x, "libraryVersion", value.asInstanceOf[js.Any])
      
      inline def setName(value: PerformanceEvents): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setStartPageVisibility(value: String): Self = StObject.set(x, "startPageVisibility", value.asInstanceOf[js.Any])
      
      inline def setStartPageVisibilityNull: Self = StObject.set(x, "startPageVisibility", null)
      
      inline def setStartPageVisibilityUndefined: Self = StObject.set(x, "startPageVisibility", js.undefined)
      
      inline def setStartTimeMs(value: Double): Self = StObject.set(x, "startTimeMs", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: PerformanceEventStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setSubErrorCode(value: String): Self = StObject.set(x, "subErrorCode", value.asInstanceOf[js.Any])
      
      inline def setSubErrorCodeUndefined: Self = StObject.set(x, "subErrorCode", js.undefined)
      
      inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      inline def setSuccessNull: Self = StObject.set(x, "success", null)
      
      inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    }
  }
}
