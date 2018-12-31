package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Performance monitor tracks rolling average frame-time and frame-time variance over a user defined sliding-window
  */
@JSGlobal("BABYLON.PerformanceMonitor")
@js.native
/**
  * constructor
  * @param frameSampleSize The number of samples required to saturate the sliding window
  */
class PerformanceMonitor () extends js.Object {
  def this(frameSampleSize: scala.Double) = this()
  var _enabled: js.Any = js.native
  var _lastFrameTimeMs: js.Any = js.native
  var _rollingFrameTime: js.Any = js.native
  /**
    * Returns the average framerate in frames per second over the sliding window (or the subset of frames sampled so far)
    */
  val averageFPS: scala.Double = js.native
  /**
    * Returns the average frame time in milliseconds over the sliding window (or the subset of frames sampled so far)
    */
  val averageFrameTime: scala.Double = js.native
  /**
    * Returns the variance frame time in milliseconds over the sliding window (or the subset of frames sampled so far)
    */
  val averageFrameTimeVariance: scala.Double = js.native
  /**
    * Returns the average framerate in frames per second using the most recent frame time
    */
  val instantaneousFPS: scala.Double = js.native
  /**
    * Returns the frame time of the most recent frame
    */
  val instantaneousFrameTime: scala.Double = js.native
  /**
    * Returns true if sampling is enabled
    */
  val isEnabled: scala.Boolean = js.native
  /**
    * Returns true if enough samples have been taken to completely fill the sliding window
    */
  val isSaturated: scala.Boolean = js.native
  /**
    * Disables contributions to the sliding window sample set
    * Samples will not be interpolated over the disabled period
    */
  def disable(): scala.Unit = js.native
  /**
    * Enables contributions to the sliding window sample set
    */
  def enable(): scala.Unit = js.native
  /**
    * Resets performance monitor
    */
  def reset(): scala.Unit = js.native
  /**
    * Samples current frame
    * @param timeMs A timestamp in milliseconds of the current frame to compare with other frames
    */
  def sampleFrame(): scala.Unit = js.native
  def sampleFrame(timeMs: scala.Double): scala.Unit = js.native
}

