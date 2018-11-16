package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "VRButtonViewModel")
@js.native
class VRButtonViewModel protected ()
  extends cesiumLib.cesiumMod.CesiumNs.VRButtonViewModel {
  def this(scene: cesiumLib.cesiumMod.CesiumNs.Scene, vrElement: java.lang.String) = this()
  def this(scene: cesiumLib.cesiumMod.CesiumNs.Scene, vrElement: stdLib.Element) = this()
  /* CompleteClass */
  override var command: cesiumLib.cesiumMod.CesiumNs.Command = js.native
  /* CompleteClass */
  override var isVREnabled: scala.Boolean = js.native
  /* CompleteClass */
  override var isVRMode: scala.Boolean = js.native
  /* CompleteClass */
  override var tooltip: java.lang.String = js.native
  /* CompleteClass */
  override var vrElement: stdLib.Element = js.native
  /* CompleteClass */
  override def destroy(): scala.Unit = js.native
  /* CompleteClass */
  override def isDestroyed(): scala.Boolean = js.native
}

