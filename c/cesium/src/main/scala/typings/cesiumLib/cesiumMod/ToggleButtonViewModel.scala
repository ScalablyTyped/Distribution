package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "ToggleButtonViewModel")
@js.native
class ToggleButtonViewModel protected ()
  extends cesiumLib.cesiumMod.CesiumNs.ToggleButtonViewModel {
  def this(command: cesiumLib.cesiumMod.CesiumNs.Command) = this()
  def this(command: cesiumLib.cesiumMod.CesiumNs.Command, options: cesiumLib.Anon_TooltipToggled) = this()
  /* CompleteClass */
  override var command: cesiumLib.cesiumMod.CesiumNs.Command = js.native
  /* CompleteClass */
  override var toggled: scala.Boolean = js.native
  /* CompleteClass */
  override var tooltip: java.lang.String = js.native
}

