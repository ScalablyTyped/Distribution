package typings.azureMsalCommon

import typings.azureMsalCommon.distConfigClientConfigurationMod.ApplicationTelemetry
import typings.azureMsalCommon.distLoggerLoggerMod.Logger
import typings.azureMsalCommon.distTelemetryPerformanceIperformanceclientMod.IPerformanceClient
import typings.azureMsalCommon.distTelemetryPerformanceIperformanceclientMod.PerformanceCallbackFunction
import typings.azureMsalCommon.distTelemetryPerformanceIperformancemeasurementMod.IPerformanceMeasurement
import typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEvent
import typings.std.Map
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
    
    /**
      * Cache measurements by their id.
      *
      * @private
      * @param {PerformanceEvent} event
      * @param {IPerformanceMeasurement} measurement
      */
    /* private */ var cacheMeasurement: Any = js.native
    
    /* protected */ var callbacks: Map[String, PerformanceCallbackFunction] = js.native
    
    /* protected */ var clientId: String = js.native
    
    /**
      * Multiple events with the same correlation id.
      * Double keyed by correlation id and event id.
      * @protected
      * @type {Map<string, Map<string, PerformanceEvent>>}
      */
    /* protected */ var eventsByCorrelationId: Map[String, Map[String, PerformanceEvent]] = js.native
    
    /* protected */ var libraryName: String = js.native
    
    /* protected */ var libraryVersion: String = js.native
    
    /* protected */ var logger: Logger = js.native
    
    /**
      * Underlying performance measurements for each operation
      *
      * @protected
      * @type {Map<string, IPerformanceMeasurement>}
      */
    /* protected */ var measurementsById: Map[String, IPerformanceMeasurement] = js.native
  }
}
