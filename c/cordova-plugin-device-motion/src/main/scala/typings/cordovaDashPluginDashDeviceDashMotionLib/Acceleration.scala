package typings
package cordovaDashPluginDashDeviceDashMotionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Contains Accelerometer data captured at a specific point in time. Acceleration values include
 * the effect of gravity (9.81 m/s^2), so that when a device lies flat and facing up, x, y, and z
 * values returned should be 0, 0, and 9.81.
 */

trait Acceleration extends js.Object {
  /** Creation timestamp in milliseconds. */
  var timestamp: scala.Double
  /** Amount of acceleration on the x-axis. (in m/s^2) */
  var x: scala.Double
  /** Amount of acceleration on the y-axis. (in m/s^2) */
  var y: scala.Double
  /** Amount of acceleration on the z-axis. (in m/s^2) */
  var z: scala.Double
}

