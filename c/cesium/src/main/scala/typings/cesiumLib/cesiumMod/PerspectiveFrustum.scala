package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "PerspectiveFrustum")
@js.native
class PerspectiveFrustum () extends Frustum {
  def this(options: cesiumLib.Anon_AspectRatioFar) = this()
  var aspectRatio: scala.Double = js.native
  var fov: scala.Double = js.native
  val fovy: scala.Double = js.native
  val infiniteProjectionMatrix: Matrix4 = js.native
  var xOffset: scala.Double = js.native
  var yOffset: scala.Double = js.native
  def clone(result: PerspectiveFrustum): PerspectiveFrustum = js.native
  def equals(): scala.Boolean = js.native
  def equals(other: PerspectiveFrustum): scala.Boolean = js.native
  def pack(value: PerspectiveFrustum, array: js.Array[scala.Double], startingIndex: scala.Double): js.Array[scala.Double] = js.native
  def unpack(array: js.Array[scala.Double], startingIndex: scala.Double, result: PerspectiveFrustum): PerspectiveFrustum = js.native
}

/* static members */
@JSImport("cesium", "PerspectiveFrustum")
@js.native
object PerspectiveFrustum extends js.Object {
  var packedLength: scala.Double = js.native
}

