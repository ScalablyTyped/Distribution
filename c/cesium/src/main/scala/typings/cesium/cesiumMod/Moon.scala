package typings.cesium.cesiumMod

import typings.cesium.Anon_EllipsoidOnlySunLighting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Moon")
@js.native
class Moon () extends js.Object {
  def this(options: Anon_EllipsoidOnlySunLighting) = this()
  var ellipsoid: Ellipsoid = js.native
  var onlySunLighting: Boolean = js.native
  var show: Boolean = js.native
  var textureUrl: String = js.native
  def destroy(): Unit = js.native
  def isDestroyed(): Boolean = js.native
}

