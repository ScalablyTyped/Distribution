package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Xrstandardsqueeze extends js.Object {
  var `xr-standard-squeeze`: RootNodeName
  var `xr-standard-thumbstick`: RootNodeName
  var `xr-standard-touchpad`: LabelAnchorNodeName
  var `xr-standard-trigger`: RootNodeName
}

object Xrstandardsqueeze {
  @scala.inline
  def apply(
    `xr-standard-squeeze`: RootNodeName,
    `xr-standard-thumbstick`: RootNodeName,
    `xr-standard-touchpad`: LabelAnchorNodeName,
    `xr-standard-trigger`: RootNodeName
  ): Xrstandardsqueeze = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("xr-standard-squeeze")(`xr-standard-squeeze`.asInstanceOf[js.Any])
    __obj.updateDynamic("xr-standard-thumbstick")(`xr-standard-thumbstick`.asInstanceOf[js.Any])
    __obj.updateDynamic("xr-standard-touchpad")(`xr-standard-touchpad`.asInstanceOf[js.Any])
    __obj.updateDynamic("xr-standard-trigger")(`xr-standard-trigger`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Xrstandardsqueeze]
  }
}

