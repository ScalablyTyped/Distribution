package typings.azureMsalCommon.anon

import typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEventStatus
import typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEvents
import typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.SubMeasurement
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@azure/msal-common.@azure/msal-common/dist/telemetry/performance/PerformanceEvent.PerformanceEvent> */
trait PartialPerformanceEvent extends StObject {
  
  var accessTokenSize: js.UndefOr[Double] = js.undefined
  
  var allowNativeBroker: js.UndefOr[Boolean] = js.undefined
  
  var appName: js.UndefOr[String] = js.undefined
  
  var appVersion: js.UndefOr[String] = js.undefined
  
  var authority: js.UndefOr[String] = js.undefined
  
  var cacheLookupPolicy: js.UndefOr[Double] = js.undefined
  
  var clientId: js.UndefOr[String] = js.undefined
  
  var correlationId: js.UndefOr[String] = js.undefined
  
  var durationMs: js.UndefOr[Double] = js.undefined
  
  var endPageVisibility: js.UndefOr[String | Null] = js.undefined
  
  var errorCode: js.UndefOr[String] = js.undefined
  
  var eventId: js.UndefOr[String] = js.undefined
  
  var extensionHandshakeTimedOut: js.UndefOr[Boolean] = js.undefined
  
  var extensionHandshakeTimeoutMs: js.UndefOr[Double] = js.undefined
  
  var extensionId: js.UndefOr[String] = js.undefined
  
  var extensionInstalled: js.UndefOr[Boolean] = js.undefined
  
  var extensionVersion: js.UndefOr[String] = js.undefined
  
  var fromCache: js.UndefOr[Boolean | Null] = js.undefined
  
  var httpVerAuthority: js.UndefOr[String] = js.undefined
  
  var httpVerToken: js.UndefOr[String] = js.undefined
  
  var idTokenSize: js.UndefOr[Double] = js.undefined
  
  var incompleteSubMeasurements: js.UndefOr[Map[String, SubMeasurement]] = js.undefined
  
  var incompleteSubsCount: js.UndefOr[Double] = js.undefined
  
  var isNativeBroker: js.UndefOr[Boolean] = js.undefined
  
  var libraryName: js.UndefOr[String] = js.undefined
  
  var libraryVersion: js.UndefOr[String] = js.undefined
  
  var matsAccountJoinOnEnd: js.UndefOr[String] = js.undefined
  
  var matsAccountJoinOnStart: js.UndefOr[String] = js.undefined
  
  var matsApiErrorCode: js.UndefOr[Double] = js.undefined
  
  var matsBrokerVersion: js.UndefOr[String] = js.undefined
  
  var matsDeviceJoin: js.UndefOr[String] = js.undefined
  
  var matsHttpEventCount: js.UndefOr[Double] = js.undefined
  
  var matsHttpStatus: js.UndefOr[Double] = js.undefined
  
  var matsPromptBehavior: js.UndefOr[String] = js.undefined
  
  var matsSilentBiSubCode: js.UndefOr[Double] = js.undefined
  
  var matsSilentCode: js.UndefOr[Double] = js.undefined
  
  var matsSilentMessage: js.UndefOr[String] = js.undefined
  
  var matsSilentStatus: js.UndefOr[Double] = js.undefined
  
  var matsUiVisible: js.UndefOr[Boolean] = js.undefined
  
  var name: js.UndefOr[PerformanceEvents] = js.undefined
  
  var queuedCount: js.UndefOr[Double] = js.undefined
  
  var queuedManuallyCompletedCount: js.UndefOr[Double] = js.undefined
  
  var queuedTimeMs: js.UndefOr[Double] = js.undefined
  
  var refreshTokenSize: js.UndefOr[Double] = js.undefined
  
  var requestId: js.UndefOr[String] = js.undefined
  
  var startPageVisibility: js.UndefOr[String | Null] = js.undefined
  
  var startTimeMs: js.UndefOr[Double] = js.undefined
  
  var status: js.UndefOr[PerformanceEventStatus] = js.undefined
  
  var subErrorCode: js.UndefOr[String] = js.undefined
  
  var success: js.UndefOr[Boolean | Null] = js.undefined
  
  var visibilityChangeCount: js.UndefOr[Double] = js.undefined
}
object PartialPerformanceEvent {
  
  inline def apply(): PartialPerformanceEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPerformanceEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialPerformanceEvent] (val x: Self) extends AnyVal {
    
    inline def setAccessTokenSize(value: Double): Self = StObject.set(x, "accessTokenSize", value.asInstanceOf[js.Any])
    
    inline def setAccessTokenSizeUndefined: Self = StObject.set(x, "accessTokenSize", js.undefined)
    
    inline def setAllowNativeBroker(value: Boolean): Self = StObject.set(x, "allowNativeBroker", value.asInstanceOf[js.Any])
    
    inline def setAllowNativeBrokerUndefined: Self = StObject.set(x, "allowNativeBroker", js.undefined)
    
    inline def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
    
    inline def setAppNameUndefined: Self = StObject.set(x, "appName", js.undefined)
    
    inline def setAppVersion(value: String): Self = StObject.set(x, "appVersion", value.asInstanceOf[js.Any])
    
    inline def setAppVersionUndefined: Self = StObject.set(x, "appVersion", js.undefined)
    
    inline def setAuthority(value: String): Self = StObject.set(x, "authority", value.asInstanceOf[js.Any])
    
    inline def setAuthorityUndefined: Self = StObject.set(x, "authority", js.undefined)
    
    inline def setCacheLookupPolicy(value: Double): Self = StObject.set(x, "cacheLookupPolicy", value.asInstanceOf[js.Any])
    
    inline def setCacheLookupPolicyUndefined: Self = StObject.set(x, "cacheLookupPolicy", js.undefined)
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    inline def setCorrelationId(value: String): Self = StObject.set(x, "correlationId", value.asInstanceOf[js.Any])
    
    inline def setCorrelationIdUndefined: Self = StObject.set(x, "correlationId", js.undefined)
    
    inline def setDurationMs(value: Double): Self = StObject.set(x, "durationMs", value.asInstanceOf[js.Any])
    
    inline def setDurationMsUndefined: Self = StObject.set(x, "durationMs", js.undefined)
    
    inline def setEndPageVisibility(value: String): Self = StObject.set(x, "endPageVisibility", value.asInstanceOf[js.Any])
    
    inline def setEndPageVisibilityNull: Self = StObject.set(x, "endPageVisibility", null)
    
    inline def setEndPageVisibilityUndefined: Self = StObject.set(x, "endPageVisibility", js.undefined)
    
    inline def setErrorCode(value: String): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    inline def setEventId(value: String): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
    
    inline def setEventIdUndefined: Self = StObject.set(x, "eventId", js.undefined)
    
    inline def setExtensionHandshakeTimedOut(value: Boolean): Self = StObject.set(x, "extensionHandshakeTimedOut", value.asInstanceOf[js.Any])
    
    inline def setExtensionHandshakeTimedOutUndefined: Self = StObject.set(x, "extensionHandshakeTimedOut", js.undefined)
    
    inline def setExtensionHandshakeTimeoutMs(value: Double): Self = StObject.set(x, "extensionHandshakeTimeoutMs", value.asInstanceOf[js.Any])
    
    inline def setExtensionHandshakeTimeoutMsUndefined: Self = StObject.set(x, "extensionHandshakeTimeoutMs", js.undefined)
    
    inline def setExtensionId(value: String): Self = StObject.set(x, "extensionId", value.asInstanceOf[js.Any])
    
    inline def setExtensionIdUndefined: Self = StObject.set(x, "extensionId", js.undefined)
    
    inline def setExtensionInstalled(value: Boolean): Self = StObject.set(x, "extensionInstalled", value.asInstanceOf[js.Any])
    
    inline def setExtensionInstalledUndefined: Self = StObject.set(x, "extensionInstalled", js.undefined)
    
    inline def setExtensionVersion(value: String): Self = StObject.set(x, "extensionVersion", value.asInstanceOf[js.Any])
    
    inline def setExtensionVersionUndefined: Self = StObject.set(x, "extensionVersion", js.undefined)
    
    inline def setFromCache(value: Boolean): Self = StObject.set(x, "fromCache", value.asInstanceOf[js.Any])
    
    inline def setFromCacheNull: Self = StObject.set(x, "fromCache", null)
    
    inline def setFromCacheUndefined: Self = StObject.set(x, "fromCache", js.undefined)
    
    inline def setHttpVerAuthority(value: String): Self = StObject.set(x, "httpVerAuthority", value.asInstanceOf[js.Any])
    
    inline def setHttpVerAuthorityUndefined: Self = StObject.set(x, "httpVerAuthority", js.undefined)
    
    inline def setHttpVerToken(value: String): Self = StObject.set(x, "httpVerToken", value.asInstanceOf[js.Any])
    
    inline def setHttpVerTokenUndefined: Self = StObject.set(x, "httpVerToken", js.undefined)
    
    inline def setIdTokenSize(value: Double): Self = StObject.set(x, "idTokenSize", value.asInstanceOf[js.Any])
    
    inline def setIdTokenSizeUndefined: Self = StObject.set(x, "idTokenSize", js.undefined)
    
    inline def setIncompleteSubMeasurements(value: Map[String, SubMeasurement]): Self = StObject.set(x, "incompleteSubMeasurements", value.asInstanceOf[js.Any])
    
    inline def setIncompleteSubMeasurementsUndefined: Self = StObject.set(x, "incompleteSubMeasurements", js.undefined)
    
    inline def setIncompleteSubsCount(value: Double): Self = StObject.set(x, "incompleteSubsCount", value.asInstanceOf[js.Any])
    
    inline def setIncompleteSubsCountUndefined: Self = StObject.set(x, "incompleteSubsCount", js.undefined)
    
    inline def setIsNativeBroker(value: Boolean): Self = StObject.set(x, "isNativeBroker", value.asInstanceOf[js.Any])
    
    inline def setIsNativeBrokerUndefined: Self = StObject.set(x, "isNativeBroker", js.undefined)
    
    inline def setLibraryName(value: String): Self = StObject.set(x, "libraryName", value.asInstanceOf[js.Any])
    
    inline def setLibraryNameUndefined: Self = StObject.set(x, "libraryName", js.undefined)
    
    inline def setLibraryVersion(value: String): Self = StObject.set(x, "libraryVersion", value.asInstanceOf[js.Any])
    
    inline def setLibraryVersionUndefined: Self = StObject.set(x, "libraryVersion", js.undefined)
    
    inline def setMatsAccountJoinOnEnd(value: String): Self = StObject.set(x, "matsAccountJoinOnEnd", value.asInstanceOf[js.Any])
    
    inline def setMatsAccountJoinOnEndUndefined: Self = StObject.set(x, "matsAccountJoinOnEnd", js.undefined)
    
    inline def setMatsAccountJoinOnStart(value: String): Self = StObject.set(x, "matsAccountJoinOnStart", value.asInstanceOf[js.Any])
    
    inline def setMatsAccountJoinOnStartUndefined: Self = StObject.set(x, "matsAccountJoinOnStart", js.undefined)
    
    inline def setMatsApiErrorCode(value: Double): Self = StObject.set(x, "matsApiErrorCode", value.asInstanceOf[js.Any])
    
    inline def setMatsApiErrorCodeUndefined: Self = StObject.set(x, "matsApiErrorCode", js.undefined)
    
    inline def setMatsBrokerVersion(value: String): Self = StObject.set(x, "matsBrokerVersion", value.asInstanceOf[js.Any])
    
    inline def setMatsBrokerVersionUndefined: Self = StObject.set(x, "matsBrokerVersion", js.undefined)
    
    inline def setMatsDeviceJoin(value: String): Self = StObject.set(x, "matsDeviceJoin", value.asInstanceOf[js.Any])
    
    inline def setMatsDeviceJoinUndefined: Self = StObject.set(x, "matsDeviceJoin", js.undefined)
    
    inline def setMatsHttpEventCount(value: Double): Self = StObject.set(x, "matsHttpEventCount", value.asInstanceOf[js.Any])
    
    inline def setMatsHttpEventCountUndefined: Self = StObject.set(x, "matsHttpEventCount", js.undefined)
    
    inline def setMatsHttpStatus(value: Double): Self = StObject.set(x, "matsHttpStatus", value.asInstanceOf[js.Any])
    
    inline def setMatsHttpStatusUndefined: Self = StObject.set(x, "matsHttpStatus", js.undefined)
    
    inline def setMatsPromptBehavior(value: String): Self = StObject.set(x, "matsPromptBehavior", value.asInstanceOf[js.Any])
    
    inline def setMatsPromptBehaviorUndefined: Self = StObject.set(x, "matsPromptBehavior", js.undefined)
    
    inline def setMatsSilentBiSubCode(value: Double): Self = StObject.set(x, "matsSilentBiSubCode", value.asInstanceOf[js.Any])
    
    inline def setMatsSilentBiSubCodeUndefined: Self = StObject.set(x, "matsSilentBiSubCode", js.undefined)
    
    inline def setMatsSilentCode(value: Double): Self = StObject.set(x, "matsSilentCode", value.asInstanceOf[js.Any])
    
    inline def setMatsSilentCodeUndefined: Self = StObject.set(x, "matsSilentCode", js.undefined)
    
    inline def setMatsSilentMessage(value: String): Self = StObject.set(x, "matsSilentMessage", value.asInstanceOf[js.Any])
    
    inline def setMatsSilentMessageUndefined: Self = StObject.set(x, "matsSilentMessage", js.undefined)
    
    inline def setMatsSilentStatus(value: Double): Self = StObject.set(x, "matsSilentStatus", value.asInstanceOf[js.Any])
    
    inline def setMatsSilentStatusUndefined: Self = StObject.set(x, "matsSilentStatus", js.undefined)
    
    inline def setMatsUiVisible(value: Boolean): Self = StObject.set(x, "matsUiVisible", value.asInstanceOf[js.Any])
    
    inline def setMatsUiVisibleUndefined: Self = StObject.set(x, "matsUiVisible", js.undefined)
    
    inline def setName(value: PerformanceEvents): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setQueuedCount(value: Double): Self = StObject.set(x, "queuedCount", value.asInstanceOf[js.Any])
    
    inline def setQueuedCountUndefined: Self = StObject.set(x, "queuedCount", js.undefined)
    
    inline def setQueuedManuallyCompletedCount(value: Double): Self = StObject.set(x, "queuedManuallyCompletedCount", value.asInstanceOf[js.Any])
    
    inline def setQueuedManuallyCompletedCountUndefined: Self = StObject.set(x, "queuedManuallyCompletedCount", js.undefined)
    
    inline def setQueuedTimeMs(value: Double): Self = StObject.set(x, "queuedTimeMs", value.asInstanceOf[js.Any])
    
    inline def setQueuedTimeMsUndefined: Self = StObject.set(x, "queuedTimeMs", js.undefined)
    
    inline def setRefreshTokenSize(value: Double): Self = StObject.set(x, "refreshTokenSize", value.asInstanceOf[js.Any])
    
    inline def setRefreshTokenSizeUndefined: Self = StObject.set(x, "refreshTokenSize", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
    
    inline def setStartPageVisibility(value: String): Self = StObject.set(x, "startPageVisibility", value.asInstanceOf[js.Any])
    
    inline def setStartPageVisibilityNull: Self = StObject.set(x, "startPageVisibility", null)
    
    inline def setStartPageVisibilityUndefined: Self = StObject.set(x, "startPageVisibility", js.undefined)
    
    inline def setStartTimeMs(value: Double): Self = StObject.set(x, "startTimeMs", value.asInstanceOf[js.Any])
    
    inline def setStartTimeMsUndefined: Self = StObject.set(x, "startTimeMs", js.undefined)
    
    inline def setStatus(value: PerformanceEventStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSubErrorCode(value: String): Self = StObject.set(x, "subErrorCode", value.asInstanceOf[js.Any])
    
    inline def setSubErrorCodeUndefined: Self = StObject.set(x, "subErrorCode", js.undefined)
    
    inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setSuccessNull: Self = StObject.set(x, "success", null)
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setVisibilityChangeCount(value: Double): Self = StObject.set(x, "visibilityChangeCount", value.asInstanceOf[js.Any])
    
    inline def setVisibilityChangeCountUndefined: Self = StObject.set(x, "visibilityChangeCount", js.undefined)
  }
}
