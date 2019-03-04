package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContainerInstructionsInitiallyVisible extends js.Object {
  var container: stdLib.Element | java.lang.String
  var instructionsInitiallyVisible: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_ContainerInstructionsInitiallyVisible {
  @scala.inline
  def apply(
    container: stdLib.Element | java.lang.String,
    instructionsInitiallyVisible: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_ContainerInstructionsInitiallyVisible = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
    if (!js.isUndefined(instructionsInitiallyVisible)) __obj.updateDynamic("instructionsInitiallyVisible")(instructionsInitiallyVisible)
    __obj.asInstanceOf[Anon_ContainerInstructionsInitiallyVisible]
  }
}

