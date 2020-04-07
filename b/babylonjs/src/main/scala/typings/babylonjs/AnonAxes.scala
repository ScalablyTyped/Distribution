package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAxes extends js.Object {
  var axes: AnonXrstandardthumbstick
  var buttons: AnonXrstandardsqueeze
  var defaultAxis: AnonMaxNodeName
  var defaultButton: AnonPressedNodeName
}

object AnonAxes {
  @scala.inline
  def apply(
    axes: AnonXrstandardthumbstick,
    buttons: AnonXrstandardsqueeze,
    defaultAxis: AnonMaxNodeName,
    defaultButton: AnonPressedNodeName
  ): AnonAxes = {
    val __obj = js.Dynamic.literal(axes = axes.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], defaultAxis = defaultAxis.asInstanceOf[js.Any], defaultButton = defaultButton.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAxes]
  }
}

