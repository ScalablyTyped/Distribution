package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "OrthographicFrustum")
@js.native
class OrthographicFrustum () extends Frustum {
  def this(options: cesiumLib.Anon_AspectRatio) = this()
  var aspectRatio: scala.Double = js.native
  var width: scala.Double = js.native
  def clone(result: OrthographicFrustum): OrthographicFrustum = js.native
  def equals(): scala.Boolean = js.native
  def equals(other: OrthographicFrustum): scala.Boolean = js.native
  def pack(value: OrthographicFrustum, array: js.Array[scala.Double], startingIndex: scala.Double): js.Array[scala.Double] = js.native
  def unpack(array: js.Array[scala.Double], startingIndex: scala.Double, result: OrthographicFrustum): OrthographicFrustum = js.native
}

/* static members */
@JSImport("cesium", "OrthographicFrustum")
@js.native
object OrthographicFrustum extends js.Object {
  var packedLength: scala.Double = js.native
}

