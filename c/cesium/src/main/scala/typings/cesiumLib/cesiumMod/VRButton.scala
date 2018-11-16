package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "VRButton")
@js.native
class VRButton protected ()
  extends cesiumLib.cesiumMod.CesiumNs.VRButton {
  def this(container: java.lang.String, scene: cesiumLib.cesiumMod.CesiumNs.Scene, vrElement: java.lang.String) = this()
  def this(container: java.lang.String, scene: cesiumLib.cesiumMod.CesiumNs.Scene, vrElement: stdLib.Element) = this()
  def this(container: stdLib.Element, scene: cesiumLib.cesiumMod.CesiumNs.Scene, vrElement: java.lang.String) = this()
  def this(container: stdLib.Element, scene: cesiumLib.cesiumMod.CesiumNs.Scene, vrElement: stdLib.Element) = this()
  /* CompleteClass */
  override var container: stdLib.Element = js.native
  /* CompleteClass */
  override var viewModel: cesiumLib.cesiumMod.CesiumNs.VRButtonViewModel = js.native
  /* CompleteClass */
  override def destroy(): scala.Unit = js.native
  /* CompleteClass */
  override def isDestroyed(): scala.Boolean = js.native
}

