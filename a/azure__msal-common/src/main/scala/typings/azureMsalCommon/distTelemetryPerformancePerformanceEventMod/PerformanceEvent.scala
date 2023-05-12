package typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PerformanceEvent
  extends StObject
     with StaticFields
     with Counters {
  
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
    * Sub-measurements for internal use. To be deleted before flushing.
    */
  var incompleteSubMeasurements: js.UndefOr[Map[String, SubMeasurement]] = js.undefined
  
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
    * Amount of time spent in the JS queue in milliseconds.
    *
    * @type {?number}
    */
  var queuedTimeMs: js.UndefOr[Double] = js.undefined
  
  /**
    * Request ID returned from the response
    *
    * @type {?string}
    */
  var requestId: js.UndefOr[String] = js.undefined
  
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
    
    inline def setIncompleteSubMeasurements(value: Map[String, SubMeasurement]): Self = StObject.set(x, "incompleteSubMeasurements", value.asInstanceOf[js.Any])
    
    inline def setIncompleteSubMeasurementsUndefined: Self = StObject.set(x, "incompleteSubMeasurements", js.undefined)
    
    inline def setIsNativeBroker(value: Boolean): Self = StObject.set(x, "isNativeBroker", value.asInstanceOf[js.Any])
    
    inline def setIsNativeBrokerUndefined: Self = StObject.set(x, "isNativeBroker", js.undefined)
    
    inline def setLibraryName(value: String): Self = StObject.set(x, "libraryName", value.asInstanceOf[js.Any])
    
    inline def setLibraryVersion(value: String): Self = StObject.set(x, "libraryVersion", value.asInstanceOf[js.Any])
    
    inline def setName(value: PerformanceEvents): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setQueuedTimeMs(value: Double): Self = StObject.set(x, "queuedTimeMs", value.asInstanceOf[js.Any])
    
    inline def setQueuedTimeMsUndefined: Self = StObject.set(x, "queuedTimeMs", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
    
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
