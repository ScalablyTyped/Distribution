package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationHelpButtonViewModel extends js.Object {
  var command: Command
  var showClick: Command
  var showInstructions: scala.Boolean
  var showTouch: Command
  var tooltip: java.lang.String
}

object NavigationHelpButtonViewModel {
  @scala.inline
  def apply(
    command: Command,
    showClick: Command,
    showInstructions: scala.Boolean,
    showTouch: Command,
    tooltip: java.lang.String
  ): NavigationHelpButtonViewModel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("command")(command)
    __obj.updateDynamic("showClick")(showClick)
    __obj.updateDynamic("showInstructions")(showInstructions)
    __obj.updateDynamic("showTouch")(showTouch)
    __obj.updateDynamic("tooltip")(tooltip)
    __obj.asInstanceOf[NavigationHelpButtonViewModel]
  }
}

