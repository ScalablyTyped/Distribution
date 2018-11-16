package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "ViewportQuad")
@js.native
class ViewportQuad ()
  extends cesiumLib.cesiumMod.CesiumNs.ViewportQuad {
  def this(rectangle: cesiumLib.cesiumMod.CesiumNs.BoundingRectangle) = this()
  def this(rectangle: cesiumLib.cesiumMod.CesiumNs.BoundingRectangle, material: cesiumLib.cesiumMod.CesiumNs.Material) = this()
  /* CompleteClass */
  override var material: cesiumLib.cesiumMod.CesiumNs.Material = js.native
  /* CompleteClass */
  override var rectangle: cesiumLib.cesiumMod.CesiumNs.BoundingRectangle = js.native
  /* CompleteClass */
  override var show: scala.Boolean = js.native
  /* CompleteClass */
  override def destroy(): scala.Unit = js.native
  /* CompleteClass */
  override def isDestroyed(): scala.Boolean = js.native
  /* CompleteClass */
  override def update(): scala.Unit = js.native
}

