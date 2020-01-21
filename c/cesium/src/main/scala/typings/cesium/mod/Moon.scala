package typings.cesium.mod

import typings.cesium.AnonEllipsoidOnlySunLighting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Moon")
@js.native
class Moon () extends js.Object {
  def this(options: AnonEllipsoidOnlySunLighting) = this()
  var ellipsoid: Ellipsoid = js.native
  var onlySunLighting: Boolean = js.native
  var show: Boolean = js.native
  var textureUrl: String = js.native
  def destroy(): Unit = js.native
  def isDestroyed(): Boolean = js.native
}

