package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "SkyAtmosphere")
@js.native
class SkyAtmosphere () extends js.Object {
  def this(ellipsoid: Ellipsoid) = this()
  var ellipsoid: Ellipsoid = js.native
  var show: scala.Boolean = js.native
  def destroy(): scala.Unit = js.native
  def isDestroyed(): scala.Boolean = js.native
}

