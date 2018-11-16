package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrthographicFrustum extends Frustum {
  var aspectRatio: scala.Double = js.native
  var width: scala.Double = js.native
  def clone(result: OrthographicFrustum): OrthographicFrustum = js.native
  def equals(): scala.Boolean = js.native
  def equals(other: OrthographicFrustum): scala.Boolean = js.native
  def pack(value: OrthographicFrustum, array: js.Array[scala.Double], startingIndex: scala.Double): js.Array[scala.Double] = js.native
  def unpack(array: js.Array[scala.Double], startingIndex: scala.Double, result: OrthographicFrustum): OrthographicFrustum = js.native
}

