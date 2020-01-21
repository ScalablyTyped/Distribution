package typings.cesium

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContainerInstructionsInitiallyVisible extends js.Object {
  var container: Element | String
  var instructionsInitiallyVisible: js.UndefOr[Boolean] = js.undefined
}

object AnonContainerInstructionsInitiallyVisible {
  @scala.inline
  def apply(container: Element | String, instructionsInitiallyVisible: js.UndefOr[Boolean] = js.undefined): AnonContainerInstructionsInitiallyVisible = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
    if (!js.isUndefined(instructionsInitiallyVisible)) __obj.updateDynamic("instructionsInitiallyVisible")(instructionsInitiallyVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContainerInstructionsInitiallyVisible]
  }
}

