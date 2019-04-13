package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Moon")
@js.native
class Moon () extends js.Object {
  def this(options: cesiumLib.Anon_EllipsoidOnlySunLighting) = this()
  var ellipsoid: Ellipsoid = js.native
  var onlySunLighting: scala.Boolean = js.native
  var show: scala.Boolean = js.native
  var textureUrl: java.lang.String = js.native
  def destroy(): scala.Unit = js.native
  def isDestroyed(): scala.Boolean = js.native
}

