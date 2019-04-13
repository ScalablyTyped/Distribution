package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "EllipsoidPrimitive")
@js.native
class EllipsoidPrimitive () extends js.Object {
  def this(options: cesiumLib.Anon_CenterDebugShowBoundingVolume) = this()
  var center: Cartesian3 = js.native
  var debugShowBoundingVolume: scala.Boolean = js.native
  var id: js.Any = js.native
  var material: Material = js.native
  var modelMatrix: Matrix4 = js.native
  var radii: Cartesian3 = js.native
  var show: scala.Boolean = js.native
  def destroy(): scala.Unit = js.native
  def isDestroyed(): scala.Boolean = js.native
  def update(): scala.Unit = js.native
}

