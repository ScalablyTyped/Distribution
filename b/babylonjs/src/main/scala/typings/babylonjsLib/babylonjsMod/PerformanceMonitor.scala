package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Performance monitor tracks rolling average frame-time and frame-time variance over a user defined sliding-window
  */
@JSImport("babylonjs", "PerformanceMonitor")
@js.native
/**
  * constructor
  * @param frameSampleSize The number of samples required to saturate the sliding window
  */
class PerformanceMonitor ()
  extends babylonjsLib.BABYLONNs.PerformanceMonitor {
  def this(frameSampleSize: scala.Double) = this()
}

