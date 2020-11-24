package typings.cesium.mod

import typings.cesium.anon.CanAnimate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Clock")
@js.native
class Clock protected () extends js.Object {
  def this(options: CanAnimate) = this()
  
  var canAnimate: Boolean = js.native
  
  var clockRange: ClockRange = js.native
  
  var clockStep: ClockStep = js.native
  
  var currentTime: JulianDate = js.native
  
  var multiplier: Double = js.native
  
  var onTick: Event[js.Array[Clock]] = js.native
  
  var shouldAnimate: Boolean = js.native
  
  var startTime: JulianDate = js.native
  
  var stopTime: JulianDate = js.native
  
  def tick(): JulianDate = js.native
}
