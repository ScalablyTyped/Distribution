package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "HomeButton")
@js.native
class HomeButton protected ()
  extends cesiumLib.cesiumMod.CesiumNs.HomeButton {
  def this(container: java.lang.String, scene: cesiumLib.cesiumMod.CesiumNs.Scene) = this()
  def this(container: stdLib.Element, scene: cesiumLib.cesiumMod.CesiumNs.Scene) = this()
  def this(container: java.lang.String, scene: cesiumLib.cesiumMod.CesiumNs.Scene, duration: scala.Double) = this()
  def this(container: stdLib.Element, scene: cesiumLib.cesiumMod.CesiumNs.Scene, duration: scala.Double) = this()
  /* CompleteClass */
  override var container: stdLib.Element = js.native
  /* CompleteClass */
  override var viewModel: cesiumLib.cesiumMod.CesiumNs.HomeButtonViewModel = js.native
  /* CompleteClass */
  override def destroy(): scala.Unit = js.native
  /* CompleteClass */
  override def isDestroyed(): scala.Boolean = js.native
}

