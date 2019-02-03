package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class is used to track a performance counter which is number based.
  * The user has access to many properties which give statistics of different nature.
  *
  * The implementer can track two kinds of Performance Counter: time and count.
  * For time you can optionally call fetchNewFrame() to notify the start of a new frame to monitor, then call beginMonitoring() to start and endMonitoring() to record the lapsed time. endMonitoring takes a newFrame parameter for you to specify if the monitored time should be set for a new frame or accumulated to the current frame being monitored.
  * For count you first have to call fetchNewFrame() to notify the start of a new frame to monitor, then call addCount() how many time required to increment the count value you monitor.
  */
@JSGlobal("BABYLON.PerfCounter")
@js.native
/**
  * Creates a new counter
  */
class PerfCounter () extends js.Object {
  var _average: js.Any = js.native
  var _current: js.Any = js.native
  var _fetchResult: js.Any = js.native
  var _lastSecAccumulated: js.Any = js.native
  var _lastSecAverage: js.Any = js.native
  var _lastSecTime: js.Any = js.native
  var _lastSecValueCount: js.Any = js.native
  var _max: js.Any = js.native
  var _min: js.Any = js.native
  var _startMonitoringTime: js.Any = js.native
  var _totalAccumulated: js.Any = js.native
  var _totalValueCount: js.Any = js.native
  /**
    * Returns the average value since the performance counter is running
    */
  val average: scala.Double = js.native
  /**
    * Gets the total value count
    */
  val count: scala.Double = js.native
  /**
    * Returns the current value
    */
  val current: scala.Double = js.native
  /**
    * Returns the average value of the last second the counter was monitored
    */
  val lastSecAverage: scala.Double = js.native
  /**
    * Returns the biggest value ever
    */
  val max: scala.Double = js.native
  /**
    * Returns the smallest value ever
    */
  val min: scala.Double = js.native
  /**
    * Gets the accumulated total
    */
  val total: scala.Double = js.native
  /**
    * Call this method to monitor a count of something (e.g. mesh drawn in viewport count)
    * @param newCount the count value to add to the monitored count
    * @param fetchResult true when it's the last time in the frame you add to the counter and you wish to update the statistics properties (min/max/average), false if you only want to update statistics.
    */
  def addCount(newCount: scala.Double, fetchResult: scala.Boolean): scala.Unit = js.native
  /**
    * Start monitoring this performance counter
    */
  def beginMonitoring(): scala.Unit = js.native
  /**
    * Compute the time lapsed since the previous beginMonitoring() call.
    * @param newFrame true by default to fetch the result and monitor a new frame, if false the time monitored will be added to the current frame counter
    */
  def endMonitoring(): scala.Unit = js.native
  def endMonitoring(newFrame: scala.Boolean): scala.Unit = js.native
  /**
    * Call this method to start monitoring a new frame.
    * This scenario is typically used when you accumulate monitoring time many times for a single frame, you call this method at the start of the frame, then beginMonitoring to start recording and endMonitoring(false) to accumulated the recorded time to the PerfCounter or addCount() to accumulate a monitored count.
    */
  def fetchNewFrame(): scala.Unit = js.native
}

/* static members */
@JSGlobal("BABYLON.PerfCounter")
@js.native
object PerfCounter extends js.Object {
  /**
    * Gets or sets a global boolean to turn on and off all the counters
    */
  var Enabled: scala.Boolean = js.native
}

