package typings.azureMsalCommon

import typings.azureMsalCommon.distConfigClientConfigurationMod.ApplicationTelemetry
import typings.azureMsalCommon.distLoggerLoggerMod.Logger
import typings.azureMsalCommon.distTelemetryPerformanceIperformancemeasurementMod.IPerformanceMeasurement
import typings.azureMsalCommon.distTelemetryPerformancePerformanceClientMod.PerformanceClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTelemetryPerformanceStubPerformanceClientMod {
  
  @JSImport("@azure/msal-common/dist/telemetry/performance/StubPerformanceClient", "StubPerformanceClient")
  @js.native
  open class StubPerformanceClient protected () extends PerformanceClient {
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
    
    def startPerformanceMeasuremeant(): IPerformanceMeasurement = js.native
  }
  
  @JSImport("@azure/msal-common/dist/telemetry/performance/StubPerformanceClient", "StubPerformanceMeasurement")
  @js.native
  open class StubPerformanceMeasurement ()
    extends StObject
       with IPerformanceMeasurement {
    
    /* CompleteClass */
    override def endMeasurement(): Unit = js.native
    
    /* CompleteClass */
    override def flushMeasurement(): Double | Null = js.native
    
    /* CompleteClass */
    override def startMeasurement(): Unit = js.native
  }
}
