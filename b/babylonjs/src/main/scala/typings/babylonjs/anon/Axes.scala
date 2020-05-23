package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Axes extends js.Object {
  var axes: Xrstandardthumbstick
  var buttons: Xrstandardsqueeze
  var defaultAxis: MaxNodeName
  var defaultButton: PressedNodeName
}

object Axes {
  @scala.inline
  def apply(
    axes: Xrstandardthumbstick,
    buttons: Xrstandardsqueeze,
    defaultAxis: MaxNodeName,
    defaultButton: PressedNodeName
  ): Axes = {
    val __obj = js.Dynamic.literal(axes = axes.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], defaultAxis = defaultAxis.asInstanceOf[js.Any], defaultButton = defaultButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[Axes]
  }
}

