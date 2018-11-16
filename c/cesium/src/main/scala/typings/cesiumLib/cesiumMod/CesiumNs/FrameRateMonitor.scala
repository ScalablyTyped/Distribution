package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FrameRateMonitor extends js.Object {
  var lastFramesPerSecond: scala.Double
  var lowFrameRate: Event
  var minimumFrameRateAfterWarmup: scala.Double
  var minimumFrameRateDuringWarmup: scala.Double
  var nominalFrameRate: Event
  var quietPeriod: scala.Double
  var samplingWindow: scala.Double
  var scene: Scene
  var warmupPeriod: scala.Double
  def destroy(): scala.Unit
  def isDestroyed(): scala.Boolean
  def pause(): scala.Unit
  def unpause(): scala.Unit
}

