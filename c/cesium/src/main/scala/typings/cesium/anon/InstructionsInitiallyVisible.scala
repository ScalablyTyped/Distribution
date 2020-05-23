package typings.cesium.anon

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstructionsInitiallyVisible extends js.Object {
  var container: Element | String
  var instructionsInitiallyVisible: js.UndefOr[Boolean] = js.undefined
}

object InstructionsInitiallyVisible {
  @scala.inline
  def apply(container: Element | String, instructionsInitiallyVisible: js.UndefOr[Boolean] = js.undefined): InstructionsInitiallyVisible = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
    if (!js.isUndefined(instructionsInitiallyVisible)) __obj.updateDynamic("instructionsInitiallyVisible")(instructionsInitiallyVisible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstructionsInitiallyVisible]
  }
}

