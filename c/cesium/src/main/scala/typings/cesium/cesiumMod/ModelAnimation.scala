package typings.cesium.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "ModelAnimation")
@js.native
class ModelAnimation () extends js.Object {
  var delay: Double = js.native
  var loop: ModelAnimationLoop = js.native
  var name: String = js.native
  var removeOnStop: Boolean = js.native
  var reverse: Boolean = js.native
  var speedup: Double = js.native
  var start: Event[js.Array[_]] = js.native
  var startTime: JulianDate = js.native
  var stop: Event[js.Array[_]] = js.native
  var stopTime: JulianDate = js.native
  var update: Event[js.Array[_]] = js.native
}

