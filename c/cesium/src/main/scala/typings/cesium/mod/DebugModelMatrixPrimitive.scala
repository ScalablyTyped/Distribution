package typings.cesium.mod

import typings.cesium.AnonId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "DebugModelMatrixPrimitive")
@js.native
class DebugModelMatrixPrimitive () extends js.Object {
  def this(options: AnonId) = this()
  var id: js.Any = js.native
  var length: Double = js.native
  var modelMatrix: Matrix4 = js.native
  var show: Boolean = js.native
  var width: Double = js.native
  def destroy(): Unit = js.native
  def isDestroyed(): Boolean = js.native
}

