package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonXrstandardsqueeze extends js.Object {
  var `xr-standard-squeeze`: AnonRootNodeName
  var `xr-standard-thumbstick`: AnonRootNodeName
  var `xr-standard-touchpad`: AnonLabelAnchorNodeName
  var `xr-standard-trigger`: AnonRootNodeName
}

object AnonXrstandardsqueeze {
  @scala.inline
  def apply(
    `xr-standard-squeeze`: AnonRootNodeName,
    `xr-standard-thumbstick`: AnonRootNodeName,
    `xr-standard-touchpad`: AnonLabelAnchorNodeName,
    `xr-standard-trigger`: AnonRootNodeName
  ): AnonXrstandardsqueeze = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("xr-standard-squeeze")(`xr-standard-squeeze`.asInstanceOf[js.Any])
    __obj.updateDynamic("xr-standard-thumbstick")(`xr-standard-thumbstick`.asInstanceOf[js.Any])
    __obj.updateDynamic("xr-standard-touchpad")(`xr-standard-touchpad`.asInstanceOf[js.Any])
    __obj.updateDynamic("xr-standard-trigger")(`xr-standard-trigger`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonXrstandardsqueeze]
  }
}

