package typings.cesium.mod

import typings.cesium.AnonFar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "PerspectiveFrustum")
@js.native
class PerspectiveFrustum () extends Frustum {
  def this(options: AnonFar) = this()
  var aspectRatio: Double = js.native
  var fov: Double = js.native
  val fovy: Double = js.native
  val infiniteProjectionMatrix: Matrix4 = js.native
  var xOffset: Double = js.native
  var yOffset: Double = js.native
  def clone(result: PerspectiveFrustum): PerspectiveFrustum = js.native
  def equals(): Boolean = js.native
  def equals(other: PerspectiveFrustum): Boolean = js.native
  def pack(value: PerspectiveFrustum, array: js.Array[Double], startingIndex: Double): js.Array[Double] = js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: PerspectiveFrustum): PerspectiveFrustum = js.native
}

/* static members */
@JSImport("cesium", "PerspectiveFrustum")
@js.native
object PerspectiveFrustum extends js.Object {
  var packedLength: Double = js.native
}

