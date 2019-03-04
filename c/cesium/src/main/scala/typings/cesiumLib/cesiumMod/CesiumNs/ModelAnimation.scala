package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelAnimation extends js.Object {
  var delay: scala.Double
  var loop: ModelAnimationLoop
  var name: java.lang.String
  var removeOnStop: scala.Boolean
  var reverse: scala.Boolean
  var speedup: scala.Double
  var start: Event
  var startTime: JulianDate
  var stop: Event
  var stopTime: JulianDate
  var update: Event
}

object ModelAnimation {
  @scala.inline
  def apply(
    delay: scala.Double,
    loop: ModelAnimationLoop,
    name: java.lang.String,
    removeOnStop: scala.Boolean,
    reverse: scala.Boolean,
    speedup: scala.Double,
    start: Event,
    startTime: JulianDate,
    stop: Event,
    stopTime: JulianDate,
    update: Event
  ): ModelAnimation = {
    val __obj = js.Dynamic.literal(delay = delay, loop = loop, name = name, removeOnStop = removeOnStop, reverse = reverse, speedup = speedup, start = start, startTime = startTime, stop = stop, stopTime = stopTime, update = update)
  
    __obj.asInstanceOf[ModelAnimation]
  }
}

