package typings.cesium.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "RuntimeError")
@js.native
class RuntimeError () extends js.Object {
  def this(message: String) = this()
  var message: String = js.native
  var name: String = js.native
  var stack: String = js.native
}

