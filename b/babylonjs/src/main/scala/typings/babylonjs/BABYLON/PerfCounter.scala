package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PerfCounter extends js.Object {
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
    * Call this method to monitor a count of something (e.g. mesh drawn in viewport count)
    * @param newCount the count value to add to the monitored count
    * @param fetchResult true when it's the last time in the frame you add to the counter and you wish to update the statistics properties (min/max/average), false if you only want to update statistics.
    */
  def addCount(newCount: Double, fetchResult: Boolean): Unit = js.native
  /**
    * Returns the average value since the performance counter is running
    */
  def average: Double = js.native
  /**
    * Start monitoring this performance counter
    */
  def beginMonitoring(): Unit = js.native
  /**
    * Gets the total value count
    */
  def count: Double = js.native
  /**
    * Returns the current value
    */
  def current: Double = js.native
  /**
    * Compute the time lapsed since the previous beginMonitoring() call.
    * @param newFrame true by default to fetch the result and monitor a new frame, if false the time monitored will be added to the current frame counter
    */
  def endMonitoring(): Unit = js.native
  def endMonitoring(newFrame: Boolean): Unit = js.native
  /**
    * Call this method to start monitoring a new frame.
    * This scenario is typically used when you accumulate monitoring time many times for a single frame, you call this method at the start of the frame, then beginMonitoring to start recording and endMonitoring(false) to accumulated the recorded time to the PerfCounter or addCount() to accumulate a monitored count.
    */
  def fetchNewFrame(): Unit = js.native
  /**
    * Returns the average value of the last second the counter was monitored
    */
  def lastSecAverage: Double = js.native
  /**
    * Returns the biggest value ever
    */
  def max: Double = js.native
  /**
    * Returns the smallest value ever
    */
  def min: Double = js.native
  /**
    * Gets the accumulated total
    */
  def total: Double = js.native
}

