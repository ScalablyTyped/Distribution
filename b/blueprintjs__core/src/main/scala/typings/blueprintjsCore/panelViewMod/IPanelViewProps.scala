package typings.blueprintjsCore.panelViewMod

import typings.blueprintjsCore.panelPropsMod.IPanel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanelViewProps extends js.Object {
  /** The panel to be displayed. */
  var panel: IPanel[js.Object]
  /** The previous panel in the stack, for rendering the "back" button. */
  var previousPanel: js.UndefOr[IPanel[js.Object]] = js.undefined
  /** Whether to show the header with the "back" button. */
  var showHeader: Boolean
  /**
    * Callback invoked when the user presses the back button or a panel invokes
    * the `closePanel()` injected prop method.
    */
  def onClose(removedPanel: IPanel[js.Object]): Unit
  /**
    * Callback invoked when a panel invokes the `openPanel(panel)` injected
    * prop method.
    */
  def onOpen(addedPanel: IPanel[js.Object]): Unit
}

object IPanelViewProps {
  @scala.inline
  def apply(
    onClose: IPanel[js.Object] => Unit,
    onOpen: IPanel[js.Object] => Unit,
    panel: IPanel[js.Object],
    showHeader: Boolean,
    previousPanel: IPanel[js.Object] = null
  ): IPanelViewProps = {
    val __obj = js.Dynamic.literal(onClose = js.Any.fromFunction1(onClose), onOpen = js.Any.fromFunction1(onOpen), panel = panel.asInstanceOf[js.Any], showHeader = showHeader.asInstanceOf[js.Any])
    if (previousPanel != null) __obj.updateDynamic("previousPanel")(previousPanel.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPanelViewProps]
  }
}

