package typings
package atBlueprintjsCoreLib.libEsmComponentsPanelDashStackPanelStackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanelStackProps
  extends atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps {
  /**
    * The initial panel to show on mount. This panel cannot be removed from the
    * stack and will appear when the stack is empty.
    */
  var initialPanel: atBlueprintjsCoreLib.libEsmComponentsPanelDashStackPanelPropsMod.IPanel[_]
  /**
    * Callback invoked when the user presses the back button or a panel invokes
    * the `closePanel()` injected prop method.
    */
  var onClose: js.UndefOr[
    js.Function1[
      /* removedPanel */ atBlueprintjsCoreLib.libEsmComponentsPanelDashStackPanelPropsMod.IPanel[js.Object], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Callback invoked when a panel invokes the `openPanel(panel)` injected
    * prop method.
    */
  var onOpen: js.UndefOr[
    js.Function1[
      /* addedPanel */ atBlueprintjsCoreLib.libEsmComponentsPanelDashStackPanelPropsMod.IPanel[js.Object], 
      scala.Unit
    ]
  ] = js.undefined
}

