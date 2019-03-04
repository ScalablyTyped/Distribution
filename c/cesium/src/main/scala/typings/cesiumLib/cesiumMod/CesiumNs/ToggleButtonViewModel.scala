package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToggleButtonViewModel extends js.Object {
  var command: Command
  var toggled: scala.Boolean
  var tooltip: java.lang.String
}

object ToggleButtonViewModel {
  @scala.inline
  def apply(command: Command, toggled: scala.Boolean, tooltip: java.lang.String): ToggleButtonViewModel = {
    val __obj = js.Dynamic.literal(command = command, toggled = toggled, tooltip = tooltip)
  
    __obj.asInstanceOf[ToggleButtonViewModel]
  }
}

