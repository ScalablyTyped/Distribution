package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "PerspectiveOffCenterFrustum")
@js.native
class PerspectiveOffCenterFrustum () extends Frustum {
  def this(options: cesiumLib.Anon_Bottom) = this()
  var bottom: scala.Double = js.native
  val infiniteProjectionMatrix: Matrix4 = js.native
  var left: scala.Double = js.native
  var right: scala.Double = js.native
  var top: scala.Double = js.native
  def clone(result: PerspectiveOffCenterFrustum): PerspectiveOffCenterFrustum = js.native
  def equals(): scala.Boolean = js.native
  def equals(other: PerspectiveOffCenterFrustum): scala.Boolean = js.native
}

