package typings.chartJs.distChunksHelpersDotcoreMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateAdapter[T /* <: AnyObject */] extends StObject {
  
  /**
    * Adds the specified `amount` of `unit` to the given `timestamp`.
    * @param timestamp - the input timestamp
    * @param amount - the amount to add
    * @param unit - the unit as string
    */
  def add(timestamp: Double, amount: Double, unit: TimeUnit): Double = js.native
  
  /**
    * Returns the number of `unit` between the given timestamps.
    * @param a - the input timestamp (reference)
    * @param b - the timestamp to subtract
    * @param unit - the unit as string
    */
  def diff(a: Double, b: Double, unit: TimeUnit): Double = js.native
  
  @JSName("endOf")
  @scala.annotation.targetName("endOf_isoWeek")
  def endOf(timestamp: Double, unit: "isoWeek"): Double = js.native
  /**
    * Returns end of `unit` for the given `timestamp`.
    * @param timestamp - the input timestamp
    * @param unit - the unit as string
    */
  def endOf(timestamp: Double, unit: TimeUnit): Double = js.native
  
  /**
    * Returns the formatted date in the specified `format` for a given `timestamp`.
    * @param timestamp - the timestamp to format
    * @param format - the date/time token
    */
  def format(timestamp: Double, format: TimeUnit): String = js.native
  
  /**
    * Returns a map of time formats for the supported formatting units defined
    * in Unit as well as 'datetime' representing a detailed date/time string.
    */
  def formats(): Record[String, String] = js.native
  
  /**
    * Will called with chart options after adapter creation.
    */
  def init(chartOptions: ChartOptions[ChartType]): Unit = js.native
  
  val options: T = js.native
  
  /**
    * Parses the given `value` and return the associated timestamp.
    * @param value - the value to parse (usually comes from the data)
    * @param [format] - the expected data format
    */
  def parse(value: Any): Double | Null = js.native
  def parse(value: Any, format: TimeUnit): Double | Null = js.native
  
  @JSName("startOf")
  @scala.annotation.targetName("startOf_isoWeek")
  def startOf(timestamp: Double, unit: "isoWeek"): Double = js.native
  @JSName("startOf")
  @scala.annotation.targetName("startOf_isoWeek")
  def startOf(timestamp: Double, unit: "isoWeek", weekday: Double): Double = js.native
  /**
    * Returns start of `unit` for the given `timestamp`.
    * @param timestamp - the input timestamp
    * @param unit - the unit as string
    * @param [weekday] - the ISO day of the week with 1 being Monday
    * and 7 being Sunday (only needed if param *unit* is `isoWeek`).
    */
  def startOf(timestamp: Double, unit: TimeUnit): Double = js.native
  def startOf(timestamp: Double, unit: TimeUnit, weekday: Double): Double = js.native
}
