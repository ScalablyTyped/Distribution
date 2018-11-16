package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "EllipsoidPrimitive")
@js.native
class EllipsoidPrimitive ()
  extends cesiumLib.cesiumMod.CesiumNs.EllipsoidPrimitive {
  def this(options: cesiumLib.Anon_ShowCenter) = this()
  /* CompleteClass */
  override var center: cesiumLib.cesiumMod.CesiumNs.Cartesian3 = js.native
  /* CompleteClass */
  override var debugShowBoundingVolume: scala.Boolean = js.native
  /* CompleteClass */
  override var id: js.Any = js.native
  /* CompleteClass */
  override var material: cesiumLib.cesiumMod.CesiumNs.Material = js.native
  /* CompleteClass */
  override var modelMatrix: cesiumLib.cesiumMod.CesiumNs.Matrix4 = js.native
  /* CompleteClass */
  override var radii: cesiumLib.cesiumMod.CesiumNs.Cartesian3 = js.native
  /* CompleteClass */
  override var show: scala.Boolean = js.native
  /* CompleteClass */
  override def destroy(): scala.Unit = js.native
  /* CompleteClass */
  override def isDestroyed(): scala.Boolean = js.native
  /* CompleteClass */
  override def update(): scala.Unit = js.native
}

