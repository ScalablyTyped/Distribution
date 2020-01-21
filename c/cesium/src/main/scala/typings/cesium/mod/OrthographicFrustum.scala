package typings.cesium.mod

import typings.cesium.AnonAspectRatio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "OrthographicFrustum")
@js.native
class OrthographicFrustum () extends Frustum {
  def this(options: AnonAspectRatio) = this()
  var aspectRatio: Double = js.native
  var width: Double = js.native
  def clone(result: OrthographicFrustum): OrthographicFrustum = js.native
  def equals(): Boolean = js.native
  def equals(other: OrthographicFrustum): Boolean = js.native
  def pack(value: OrthographicFrustum, array: js.Array[Double], startingIndex: Double): js.Array[Double] = js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: OrthographicFrustum): OrthographicFrustum = js.native
}

/* static members */
@JSImport("cesium", "OrthographicFrustum")
@js.native
object OrthographicFrustum extends js.Object {
  var packedLength: Double = js.native
}

