package typings.azureMsalBrowser

import typings.azureMsalCommon.iperformancemeasurementMod.IPerformanceMeasurement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browserPerformanceMeasurementMod {
  
  @JSImport("@azure/msal-browser/dist/telemetry/BrowserPerformanceMeasurement", "BrowserPerformanceMeasurement")
  @js.native
  open class BrowserPerformanceMeasurement protected ()
    extends StObject
       with IPerformanceMeasurement {
    def this(name: String, correlationId: String) = this()
    
    /* private */ var correlationId: Any = js.native
    
    /* private */ var endMark: Any = js.native
    
    /* CompleteClass */
    override def endMeasurement(): Unit = js.native
    
    /* CompleteClass */
    override def flushMeasurement(): Double | Null = js.native
    
    /* private */ var measureName: Any = js.native
    
    /* private */ var startMark: Any = js.native
    
    /* CompleteClass */
    override def startMeasurement(): Unit = js.native
  }
  /* static members */
  object BrowserPerformanceMeasurement {
    
    @JSImport("@azure/msal-browser/dist/telemetry/BrowserPerformanceMeasurement", "BrowserPerformanceMeasurement")
    @js.native
    val ^ : js.Any = js.native
    
    inline def supportsBrowserPerformance(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsBrowserPerformance")().asInstanceOf[Boolean]
  }
}
