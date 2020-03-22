package typings.blueprintjsCore.panelStackMod

import typings.blueprintjsCore.panelPropsMod.IPanel
import typings.blueprintjsCore.propsMod.IProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanelStackProps extends IProps {
  /**
    * The initial panel to show on mount. This panel cannot be removed from the
    * stack and will appear when the stack is empty.
    * This prop is only used in uncontrolled mode and is thus mutually
    * exclusive with the `stack` prop.
    */
  var initialPanel: js.UndefOr[IPanel[_]] = js.undefined
  /**
    * Callback invoked when the user presses the back button or a panel invokes
    * the `closePanel()` injected prop method.
    */
  var onClose: js.UndefOr[js.Function1[/* removedPanel */ IPanel[js.Object], Unit]] = js.undefined
  /**
    * Callback invoked when a panel invokes the `openPanel(panel)` injected
    * prop method.
    */
  var onOpen: js.UndefOr[js.Function1[/* addedPanel */ IPanel[js.Object], Unit]] = js.undefined
  /**
    * If false, PanelStack will render all panels in the stack to the DOM, allowing their
    * React component trees to maintain state as a user navigates through the stack.
    * Panels other than the currently active one will be invisible.
    * @default true
    */
  var renderActivePanelOnly: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to show the header with the "back" button in each panel.
    * @default true
    */
  var showPanelHeader: js.UndefOr[Boolean] = js.undefined
  /**
    * The full stack of panels in controlled mode. The last panel in the stack
    * will be displayed.
    */
  var stack: js.UndefOr[js.Array[IPanel[_]]] = js.undefined
}

object IPanelStackProps {
  @scala.inline
  def apply(
    className: String = null,
    initialPanel: IPanel[_] = null,
    onClose: /* removedPanel */ IPanel[js.Object] => Unit = null,
    onOpen: /* addedPanel */ IPanel[js.Object] => Unit = null,
    renderActivePanelOnly: js.UndefOr[Boolean] = js.undefined,
    showPanelHeader: js.UndefOr[Boolean] = js.undefined,
    stack: js.Array[IPanel[_]] = null
  ): IPanelStackProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (initialPanel != null) __obj.updateDynamic("initialPanel")(initialPanel.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction1(onOpen))
    if (!js.isUndefined(renderActivePanelOnly)) __obj.updateDynamic("renderActivePanelOnly")(renderActivePanelOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(showPanelHeader)) __obj.updateDynamic("showPanelHeader")(showPanelHeader.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPanelStackProps]
  }
}

