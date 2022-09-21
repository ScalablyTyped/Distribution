package typings.typescriptNn5FuAjk

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.resourcetimingbufferfull
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to performance-related information for the current page. It's part of the High Resolution Time API, but is enhanced by the Performance Timeline API, the Navigation Timing API, the User Timing API, and the Resource Timing API. */
@js.native
trait Performance
  extends StObject
     with EventTarget {
  
  @JSName("addEventListener")
  def addEventListener_resourcetimingbufferfull(
    `type`: resourcetimingbufferfull,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resourcetimingbufferfull(
    `type`: resourcetimingbufferfull,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resourcetimingbufferfull(
    `type`: resourcetimingbufferfull,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  def clearMarks(): Unit = js.native
  def clearMarks(markName: java.lang.String): Unit = js.native
  
  def clearMeasures(): Unit = js.native
  def clearMeasures(measureName: java.lang.String): Unit = js.native
  
  def clearResourceTimings(): Unit = js.native
  
  val eventCounts: EventCounts = js.native
  
  def getEntries(): PerformanceEntryList = js.native
  
  def getEntriesByName(name: java.lang.String): PerformanceEntryList = js.native
  def getEntriesByName(name: java.lang.String, `type`: java.lang.String): PerformanceEntryList = js.native
  
  def getEntriesByType(`type`: java.lang.String): PerformanceEntryList = js.native
  
  def mark(markName: java.lang.String): PerformanceMark = js.native
  def mark(markName: java.lang.String, markOptions: PerformanceMarkOptions): PerformanceMark = js.native
  
  def measure(measureName: java.lang.String): PerformanceMeasure = js.native
  def measure(measureName: java.lang.String, startOrMeasureOptions: java.lang.String): PerformanceMeasure = js.native
  def measure(measureName: java.lang.String, startOrMeasureOptions: java.lang.String, endMark: java.lang.String): PerformanceMeasure = js.native
  def measure(measureName: java.lang.String, startOrMeasureOptions: Unit, endMark: java.lang.String): PerformanceMeasure = js.native
  def measure(measureName: java.lang.String, startOrMeasureOptions: PerformanceMeasureOptions): PerformanceMeasure = js.native
  def measure(
    measureName: java.lang.String,
    startOrMeasureOptions: PerformanceMeasureOptions,
    endMark: java.lang.String
  ): PerformanceMeasure = js.native
  
  /** @deprecated */
  val navigation: PerformanceNavigation = js.native
  
  def now(): DOMHighResTimeStamp = js.native
  
  var onresourcetimingbufferfull: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  @JSName("removeEventListener")
  def removeEventListener_resourcetimingbufferfull(
    `type`: resourcetimingbufferfull,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resourcetimingbufferfull(
    `type`: resourcetimingbufferfull,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resourcetimingbufferfull(
    `type`: resourcetimingbufferfull,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  
  def setResourceTimingBufferSize(maxSize: Double): Unit = js.native
  
  val timeOrigin: DOMHighResTimeStamp = js.native
  
  /** @deprecated */
  val timing: PerformanceTiming = js.native
  
  def toJSON(): Any = js.native
}
