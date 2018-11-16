package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "SkyAtmosphere")
@js.native
class SkyAtmosphere ()
  extends cesiumLib.cesiumMod.CesiumNs.SkyAtmosphere {
  def this(ellipsoid: cesiumLib.cesiumMod.CesiumNs.Ellipsoid) = this()
  /* CompleteClass */
  override var ellipsoid: cesiumLib.cesiumMod.CesiumNs.Ellipsoid = js.native
  /* CompleteClass */
  override var show: scala.Boolean = js.native
  /* CompleteClass */
  override def destroy(): scala.Unit = js.native
  /* CompleteClass */
  override def isDestroyed(): scala.Boolean = js.native
}

