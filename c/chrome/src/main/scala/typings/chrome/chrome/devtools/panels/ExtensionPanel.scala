package typings.chrome.chrome.devtools.panels

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionPanel extends js.Object {
  /** Fired when the user switches away from the panel. */
  var onHidden: PanelHiddenEvent
  /** Fired upon a search action (start of a new search, search result navigation, or search being canceled). */
  var onSearch: PanelSearchEvent
  /** Fired when the user switches to the panel. */
  var onShown: PanelShownEvent
  /**
    * Appends a button to the status bar of the panel.
    * @param iconPath Path to the icon of the button. The file should contain a 64x24-pixel image composed of two 32x24 icons. The left icon is used when the button is inactive; the right icon is displayed when the button is pressed.
    * @param tooltipText Text shown as a tooltip when user hovers the mouse over the button.
    * @param disabled Whether the button is disabled.
    */
  def createStatusBarButton(iconPath: String, tooltipText: String, disabled: Boolean): Button
}

object ExtensionPanel {
  @scala.inline
  def apply(
    createStatusBarButton: (String, String, Boolean) => Button,
    onHidden: PanelHiddenEvent,
    onSearch: PanelSearchEvent,
    onShown: PanelShownEvent
  ): ExtensionPanel = {
    val __obj = js.Dynamic.literal(createStatusBarButton = js.Any.fromFunction3(createStatusBarButton), onHidden = onHidden.asInstanceOf[js.Any], onSearch = onSearch.asInstanceOf[js.Any], onShown = onShown.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionPanel]
  }
}

