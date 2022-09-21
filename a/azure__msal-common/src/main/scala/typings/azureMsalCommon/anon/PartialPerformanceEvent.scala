package typings.azureMsalCommon.anon

import typings.azureMsalCommon.performanceEventMod.PerformanceEventStatus
import typings.azureMsalCommon.performanceEventMod.PerformanceEvents
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@azure/msal-common.@azure/msal-common/dist/telemetry/performance/PerformanceEvent.PerformanceEvent> */
trait PartialPerformanceEvent extends StObject {
  
  var accessTokenSize: js.UndefOr[Double] = js.undefined
  
  var appName: js.UndefOr[String] = js.undefined
  
  var appVersion: js.UndefOr[String] = js.undefined
  
  var authority: js.UndefOr[String] = js.undefined
  
  var clientId: js.UndefOr[String] = js.undefined
  
  var correlationId: js.UndefOr[String] = js.undefined
  
  var durationMs: js.UndefOr[Double] = js.undefined
  
  var endPageVisibility: js.UndefOr[String | Null] = js.undefined
  
  var errorCode: js.UndefOr[String] = js.undefined
  
  var eventId: js.UndefOr[String] = js.undefined
  
  var fromCache: js.UndefOr[Boolean | Null] = js.undefined
  
  var idTokenSize: js.UndefOr[Double] = js.undefined
  
  var isNativeBroker: js.UndefOr[Boolean] = js.undefined
  
  var libraryName: js.UndefOr[String] = js.undefined
  
  var libraryVersion: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[PerformanceEvents] = js.undefined
  
  var startPageVisibility: js.UndefOr[String | Null] = js.undefined
  
  var startTimeMs: js.UndefOr[Double] = js.undefined
  
  var status: js.UndefOr[PerformanceEventStatus] = js.undefined
  
  var subErrorCode: js.UndefOr[String] = js.undefined
  
  var success: js.UndefOr[Boolean | Null] = js.undefined
}
object PartialPerformanceEvent {
  
  inline def apply(): PartialPerformanceEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPerformanceEvent]
  }
  
  extension [Self <: PartialPerformanceEvent](x: Self) {
    
    inline def setAccessTokenSize(value: Double): Self = StObject.set(x, "accessTokenSize", value.asInstanceOf[js.Any])
    
    inline def setAccessTokenSizeUndefined: Self = StObject.set(x, "accessTokenSize", js.undefined)
    
    inline def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
    
    inline def setAppNameUndefined: Self = StObject.set(x, "appName", js.undefined)
    
    inline def setAppVersion(value: String): Self = StObject.set(x, "appVersion", value.asInstanceOf[js.Any])
    
    inline def setAppVersionUndefined: Self = StObject.set(x, "appVersion", js.undefined)
    
    inline def setAuthority(value: String): Self = StObject.set(x, "authority", value.asInstanceOf[js.Any])
    
    inline def setAuthorityUndefined: Self = StObject.set(x, "authority", js.undefined)
    
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
    
    inline def setFromCache(value: Boolean): Self = StObject.set(x, "fromCache", value.asInstanceOf[js.Any])
    
    inline def setFromCacheNull: Self = StObject.set(x, "fromCache", null)
    
    inline def setFromCacheUndefined: Self = StObject.set(x, "fromCache", js.undefined)
    
    inline def setIdTokenSize(value: Double): Self = StObject.set(x, "idTokenSize", value.asInstanceOf[js.Any])
    
    inline def setIdTokenSizeUndefined: Self = StObject.set(x, "idTokenSize", js.undefined)
    
    inline def setIsNativeBroker(value: Boolean): Self = StObject.set(x, "isNativeBroker", value.asInstanceOf[js.Any])
    
    inline def setIsNativeBrokerUndefined: Self = StObject.set(x, "isNativeBroker", js.undefined)
    
    inline def setLibraryName(value: String): Self = StObject.set(x, "libraryName", value.asInstanceOf[js.Any])
    
    inline def setLibraryNameUndefined: Self = StObject.set(x, "libraryName", js.undefined)
    
    inline def setLibraryVersion(value: String): Self = StObject.set(x, "libraryVersion", value.asInstanceOf[js.Any])
    
    inline def setLibraryVersionUndefined: Self = StObject.set(x, "libraryVersion", js.undefined)
    
    inline def setName(value: PerformanceEvents): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
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
  }
}
