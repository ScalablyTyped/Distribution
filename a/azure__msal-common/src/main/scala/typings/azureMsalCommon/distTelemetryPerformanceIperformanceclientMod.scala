package typings.azureMsalCommon

import typings.azureMsalCommon.anon.PartialPerformanceEvent
import typings.azureMsalCommon.distTelemetryPerformanceIperformancemeasurementMod.IPerformanceMeasurement
import typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.Counters
import typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEvent
import typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEvents
import typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.StaticFields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTelemetryPerformanceIperformanceclientMod {
  
  @js.native
  trait IPerformanceClient extends StObject {
    
    def addPerformanceCallback(callback: PerformanceCallbackFunction): String = js.native
    
    def addQueueMeasurement(eventName: PerformanceEvents): Unit = js.native
    def addQueueMeasurement(eventName: PerformanceEvents, correlationId: String): Unit = js.native
    def addQueueMeasurement(eventName: PerformanceEvents, correlationId: String, queueTime: Double): Unit = js.native
    def addQueueMeasurement(eventName: PerformanceEvents, correlationId: String, queueTime: Double, manuallyCompleted: Boolean): Unit = js.native
    def addQueueMeasurement(eventName: PerformanceEvents, correlationId: String, queueTime: Unit, manuallyCompleted: Boolean): Unit = js.native
    def addQueueMeasurement(eventName: PerformanceEvents, correlationId: Unit, queueTime: Double): Unit = js.native
    def addQueueMeasurement(eventName: PerformanceEvents, correlationId: Unit, queueTime: Double, manuallyCompleted: Boolean): Unit = js.native
    def addQueueMeasurement(eventName: PerformanceEvents, correlationId: Unit, queueTime: Unit, manuallyCompleted: Boolean): Unit = js.native
    
    def addStaticFields(staticFields: StaticFields, correlationId: String): Unit = js.native
    
    def calculateQueuedTime(preQueueTime: Double, currentTime: Double): Double = js.native
    
    def discardMeasurements(correlationId: String): Unit = js.native
    
    def emitEvents(events: js.Array[PerformanceEvent], correlationId: String): Unit = js.native
    
    def endMeasurement(event: PerformanceEvent): PerformanceEvent | Null = js.native
    
    def generateId(): String = js.native
    
    def removePerformanceCallback(callbackId: String): Boolean = js.native
    
    def setPreQueueTime(eventName: PerformanceEvents): Unit = js.native
    def setPreQueueTime(eventName: PerformanceEvents, correlationId: String): Unit = js.native
    
    def startMeasurement(measureName: PerformanceEvents): InProgressPerformanceEvent = js.native
    def startMeasurement(measureName: PerformanceEvents, correlationId: String): InProgressPerformanceEvent = js.native
    
    def startPerformanceMeasuremeant(measureName: String, correlationId: String): IPerformanceMeasurement = js.native
    
    def startPerformanceMeasurement(measureName: String, correlationId: String): IPerformanceMeasurement = js.native
  }
  
  @js.native
  trait InProgressPerformanceEvent extends StObject {
    
    def addStaticFields(staticFields: StaticFields): Unit = js.native
    
    def discardMeasurement(): Unit = js.native
    
    def endMeasurement(): PerformanceEvent | Null = js.native
    def endMeasurement(event: PartialPerformanceEvent): PerformanceEvent | Null = js.native
    
    var event: PerformanceEvent = js.native
    
    def increment(counters: Counters): Unit = js.native
    
    var measurement: IPerformanceMeasurement = js.native
  }
  
  type PerformanceCallbackFunction = js.Function1[/* events */ js.Array[PerformanceEvent], Unit]
  
  trait QueueMeasurement extends StObject {
    
    /**
      * Name of performance event
      */
    var eventName: PerformanceEvents
    
    /**
      * Incomplete pre-queue events are instrumentation bugs that should be fixed.
      */
    var manuallyCompleted: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Time spent in JS queue
      */
    var queueTime: Double
  }
  object QueueMeasurement {
    
    inline def apply(eventName: PerformanceEvents, queueTime: Double): QueueMeasurement = {
      val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], queueTime = queueTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueueMeasurement]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QueueMeasurement] (val x: Self) extends AnyVal {
      
      inline def setEventName(value: PerformanceEvents): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
      
      inline def setManuallyCompleted(value: Boolean): Self = StObject.set(x, "manuallyCompleted", value.asInstanceOf[js.Any])
      
      inline def setManuallyCompletedUndefined: Self = StObject.set(x, "manuallyCompleted", js.undefined)
      
      inline def setQueueTime(value: Double): Self = StObject.set(x, "queueTime", value.asInstanceOf[js.Any])
    }
  }
}
