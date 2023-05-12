package typings.azureMsalCommon

import typings.azureMsalCommon.distConfigClientConfigurationMod.ApplicationTelemetry
import typings.azureMsalCommon.distLoggerLoggerMod.Logger
import typings.azureMsalCommon.distTelemetryPerformanceIperformanceclientMod.IPerformanceClient
import typings.azureMsalCommon.distTelemetryPerformanceIperformanceclientMod.PerformanceCallbackFunction
import typings.azureMsalCommon.distTelemetryPerformanceIperformanceclientMod.QueueMeasurement
import typings.azureMsalCommon.distTelemetryPerformanceIperformancemeasurementMod.IPerformanceMeasurement
import typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.Counters
import typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEvent
import typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEvents
import typings.std.Map
import typings.std.ReadonlySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTelemetryPerformancePerformanceClientMod {
  
  /* note: abstract class */ @JSImport("@azure/msal-common/dist/telemetry/performance/PerformanceClient", "PerformanceClient")
  @js.native
  open class PerformanceClient protected ()
    extends StObject
       with IPerformanceClient {
    /**
      * Creates an instance of PerformanceClient,
      * an abstract class containing core performance telemetry logic.
      *
      * @constructor
      * @param {string} clientId Client ID of the application
      * @param {string} authority Authority used by the application
      * @param {Logger} logger Logger used by the application
      * @param {string} libraryName Name of the library
      * @param {string} libraryVersion Version of the library
      */
    def this(
      clientId: String,
      authority: String,
      logger: Logger,
      libraryName: String,
      libraryVersion: String,
      applicationTelemetry: ApplicationTelemetry
    ) = this()
    
    /* protected */ var applicationTelemetry: ApplicationTelemetry = js.native
    
    /* protected */ var authority: String = js.native
    
    /**
      * Upserts event into event cache.
      * First key is the correlation id, second key is the event id.
      * Allows for events to be grouped by correlation id,
      * and to easily allow for properties on them to be updated.
      *
      * @private
      * @param {PerformanceEvent} event
      */
    /* private */ var cacheEventByCorrelationId: Any = js.native
    
    /* protected */ var callbacks: Map[String, PerformanceCallbackFunction] = js.native
    
    /* protected */ var clientId: String = js.native
    
    /**
      * Removes cache for a given correlation id.
      *
      * @param {string} correlationId correlation identifier
      */
    /* private */ var discardCache: Any = js.native
    
    def endMeasurement(event: PerformanceEvent, measurement: IPerformanceMeasurement): PerformanceEvent | Null = js.native
    
    /**
      * Multiple events with the same correlation id.
      * @protected
      * @type {Map<string, PerformanceEvent>}
      */
    /* protected */ var eventsByCorrelationId: Map[String, PerformanceEvent] = js.native
    
    /**
      * Get integral fields.
      * Override to change the set.
      */
    def getIntFields(): ReadonlySet[String] = js.native
    
    /**
      * Gets map of pre-queue times by correlation Id
      *
      * @param {PerformanceEvents} eventName
      * @param {string} correlationId
      * @returns {number}
      */
    def getPreQueueTime(eventName: PerformanceEvents, correlationId: String): Double | Unit = js.native
    
    /* private */ var getQueueInfo: Any = js.native
    
    /**
      * Increment counters to be emitted when the measurements are flushed
      * @param counters {Counters}
      * @param correlationId {string} correlation identifier
      */
    def increment(counters: Counters, correlationId: String): Unit = js.native
    
    /* protected */ var libraryName: String = js.native
    
    /* protected */ var libraryVersion: String = js.native
    
    /* protected */ var logger: Logger = js.native
    
    /**
      * Map of pre-queue times by correlation Id
      *
      * @protected
      * @type {Map<string, PreQueueEvent>}
      */
    /* protected */ var preQueueTimeByCorrelationId: Map[String, PreQueueEvent] = js.native
    
    /**
      * Map of queue measurements by correlation Id
      *
      * @protected
      * @type {Map<string, Array<QueueMeasurement>>}
      */
    /* protected */ var queueMeasurements: Map[String, js.Array[QueueMeasurement]] = js.native
    
    /**
      * Enforce truncation of integral fields in performance event.
      * @param {PerformanceEvent} event performance event to update.
      * @param {Set<string>} intFields integral fields.
      */
    /* private */ var truncateIntegralFields: Any = js.native
  }
  
  trait PreQueueEvent extends StObject {
    
    var name: PerformanceEvents
    
    var time: Double
  }
  object PreQueueEvent {
    
    inline def apply(name: PerformanceEvents, time: Double): PreQueueEvent = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[PreQueueEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PreQueueEvent] (val x: Self) extends AnyVal {
      
      inline def setName(value: PerformanceEvents): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
}
