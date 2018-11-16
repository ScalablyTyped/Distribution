package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PerspectiveFrustum extends Frustum {
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

