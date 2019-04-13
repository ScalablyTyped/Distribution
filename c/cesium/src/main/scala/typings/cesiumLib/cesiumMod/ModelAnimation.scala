package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "ModelAnimation")
@js.native
class ModelAnimation () extends js.Object {
  var delay: scala.Double = js.native
  var loop: ModelAnimationLoop = js.native
  var name: java.lang.String = js.native
  var removeOnStop: scala.Boolean = js.native
  var reverse: scala.Boolean = js.native
  var speedup: scala.Double = js.native
  var start: Event[js.Array[_]] = js.native
  var startTime: JulianDate = js.native
  var stop: Event[js.Array[_]] = js.native
  var stopTime: JulianDate = js.native
  var update: Event[js.Array[_]] = js.native
}

