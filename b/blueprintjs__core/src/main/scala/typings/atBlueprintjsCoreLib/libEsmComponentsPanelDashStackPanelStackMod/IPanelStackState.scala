package typings
package atBlueprintjsCoreLib.libEsmComponentsPanelDashStackPanelStackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanelStackState extends js.Object {
  /** Whether the stack is currently animating the push or pop of a panel. */
  var direction: atBlueprintjsCoreLib.atBlueprintjsCoreLibStrings.push | atBlueprintjsCoreLib.atBlueprintjsCoreLibStrings.pop
  /** The current stack of panels. The first panel in the stack will be displayed. */
  var stack: js.Array[
    atBlueprintjsCoreLib.libEsmComponentsPanelDashStackPanelPropsMod.IPanel[js.Object]
  ]
}

object IPanelStackState {
  @scala.inline
  def apply(
    direction: atBlueprintjsCoreLib.atBlueprintjsCoreLibStrings.push | atBlueprintjsCoreLib.atBlueprintjsCoreLibStrings.pop,
    stack: js.Array[
      atBlueprintjsCoreLib.libEsmComponentsPanelDashStackPanelPropsMod.IPanel[js.Object]
    ]
  ): IPanelStackState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[IPanelStackState]
  }
}

