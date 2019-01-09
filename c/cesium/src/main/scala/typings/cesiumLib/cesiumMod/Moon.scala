package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Moon")
@js.native
class Moon ()
  extends cesiumLib.cesiumMod.CesiumNs.Moon {
  def this(options: cesiumLib.Anon_EllipsoidOnlySunLighting) = this()
  /* CompleteClass */
  override var ellipsoid: cesiumLib.cesiumMod.CesiumNs.Ellipsoid = js.native
  /* CompleteClass */
  override var onlySunLighting: scala.Boolean = js.native
  /* CompleteClass */
  override var show: scala.Boolean = js.native
  /* CompleteClass */
  override var textureUrl: java.lang.String = js.native
  /* CompleteClass */
  override def destroy(): scala.Unit = js.native
  /* CompleteClass */
  override def isDestroyed(): scala.Boolean = js.native
}

