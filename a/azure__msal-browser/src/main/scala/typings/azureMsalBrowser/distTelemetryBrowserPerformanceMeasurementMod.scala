package typings.azureMsalBrowser

import typings.azureMsalCommon.distTelemetryPerformanceIperformancemeasurementMod.IPerformanceMeasurement
import typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.SubMeasurement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTelemetryBrowserPerformanceMeasurementMod {
  
  @JSImport("@azure/msal-browser/dist/telemetry/BrowserPerformanceMeasurement", "BrowserPerformanceMeasurement")
  @js.native
  open class BrowserPerformanceMeasurement protected ()
    extends StObject
       with IPerformanceMeasurement {
    def this(name: String, correlationId: String) = this()
    
    /* private */ val correlationId: Any = js.native
    
    /* private */ val endMark: Any = js.native
    
    /* CompleteClass */
    override def endMeasurement(): Unit = js.native
    
    /* CompleteClass */
    override def flushMeasurement(): Double | Null = js.native
    
    /* private */ val measureName: Any = js.native
    
    /* private */ val startMark: Any = js.native
    
    /* CompleteClass */
    override def startMeasurement(): Unit = js.native
  }
  /* static members */
  object BrowserPerformanceMeasurement {
    
    @JSImport("@azure/msal-browser/dist/telemetry/BrowserPerformanceMeasurement", "BrowserPerformanceMeasurement")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Flush browser marks and measurements.
      * @param {string} correlationId
      * @param {SubMeasurement} measurements
      */
    inline def flushMeasurements(correlationId: String, measurements: js.Array[SubMeasurement]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("flushMeasurements")(correlationId.asInstanceOf[js.Any], measurements.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("@azure/msal-browser/dist/telemetry/BrowserPerformanceMeasurement", "BrowserPerformanceMeasurement.makeEndMark")
    @js.native
    def makeEndMark: Any = js.native
    inline def makeEndMark_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("makeEndMark")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-browser/dist/telemetry/BrowserPerformanceMeasurement", "BrowserPerformanceMeasurement.makeMeasureName")
    @js.native
    def makeMeasureName: Any = js.native
    inline def makeMeasureName_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("makeMeasureName")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-browser/dist/telemetry/BrowserPerformanceMeasurement", "BrowserPerformanceMeasurement.makeStartMark")
    @js.native
    def makeStartMark: Any = js.native
    inline def makeStartMark_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("makeStartMark")(x.asInstanceOf[js.Any])
    
    inline def supportsBrowserPerformance(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsBrowserPerformance")().asInstanceOf[Boolean]
  }
}
