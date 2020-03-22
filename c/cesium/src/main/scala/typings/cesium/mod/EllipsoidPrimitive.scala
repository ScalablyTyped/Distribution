package typings.cesium.mod

import typings.cesium.AnonDebugShowBoundingVolume
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "EllipsoidPrimitive")
@js.native
class EllipsoidPrimitive () extends js.Object {
  def this(options: AnonDebugShowBoundingVolume) = this()
  var center: Cartesian3 = js.native
  var debugShowBoundingVolume: Boolean = js.native
  var id: js.Any = js.native
  var material: Material = js.native
  var modelMatrix: Matrix4 = js.native
  var radii: Cartesian3 = js.native
  var show: Boolean = js.native
  def destroy(): Unit = js.native
  def isDestroyed(): Boolean = js.native
  def update(): Unit = js.native
}

