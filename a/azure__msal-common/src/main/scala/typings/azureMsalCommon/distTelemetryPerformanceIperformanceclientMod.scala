package typings.azureMsalCommon

import typings.azureMsalCommon.anon.PartialPerformanceEvent
import typings.azureMsalCommon.distTelemetryPerformanceIperformancemeasurementMod.IPerformanceMeasurement
import typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEvent
import typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEvents
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTelemetryPerformanceIperformanceclientMod {
  
  @js.native
  trait IPerformanceClient extends StObject {
    
    def addPerformanceCallback(callback: PerformanceCallbackFunction): String = js.native
    
    def discardMeasurements(correlationId: String): Unit = js.native
    
    def emitEvents(events: js.Array[PerformanceEvent], correlationId: String): Unit = js.native
    
    def endMeasurement(event: PerformanceEvent): PerformanceEvent | Null = js.native
    
    def flushMeasurements(measureName: PerformanceEvents): Unit = js.native
    def flushMeasurements(measureName: PerformanceEvents, correlationId: String): Unit = js.native
    
    def generateId(): String = js.native
    
    def removePerformanceCallback(callbackId: String): Boolean = js.native
    
    def startMeasurement(measureName: PerformanceEvents): InProgressPerformanceEvent = js.native
    def startMeasurement(measureName: PerformanceEvents, correlationId: String): InProgressPerformanceEvent = js.native
    
    def startPerformanceMeasuremeant(measureName: String, correlationId: String): IPerformanceMeasurement = js.native
  }
  
  @js.native
  trait InProgressPerformanceEvent extends StObject {
    
    def discardMeasurement(): Unit = js.native
    
    def endMeasurement(): PerformanceEvent | Null = js.native
    def endMeasurement(event: PartialPerformanceEvent): PerformanceEvent | Null = js.native
    
    var event: PerformanceEvent = js.native
    
    def flushMeasurement(): Unit = js.native
    
    var measurement: IPerformanceMeasurement = js.native
  }
  
  type PerformanceCallbackFunction = js.Function1[/* events */ js.Array[PerformanceEvent], Unit]
}
