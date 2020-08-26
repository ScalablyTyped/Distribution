package typings.blueprintjsCore.panelViewMod

import typings.blueprintjsCore.panelPropsMod.IPanel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPanelViewProps extends js.Object {
  /** The panel to be displayed. */
  var panel: IPanel[js.Object] = js.native
  /** The previous panel in the stack, for rendering the "back" button. */
  var previousPanel: js.UndefOr[IPanel[js.Object]] = js.native
  /** Whether to show the header with the "back" button. */
  var showHeader: Boolean = js.native
  /**
    * Callback invoked when the user presses the back button or a panel invokes
    * the `closePanel()` injected prop method.
    */
  def onClose(removedPanel: IPanel[js.Object]): Unit = js.native
  /**
    * Callback invoked when a panel invokes the `openPanel(panel)` injected
    * prop method.
    */
  def onOpen(addedPanel: IPanel[js.Object]): Unit = js.native
}

object IPanelViewProps {
  @scala.inline
  def apply(
    onClose: IPanel[js.Object] => Unit,
    onOpen: IPanel[js.Object] => Unit,
    panel: IPanel[js.Object],
    showHeader: Boolean
  ): IPanelViewProps = {
    val __obj = js.Dynamic.literal(onClose = js.Any.fromFunction1(onClose), onOpen = js.Any.fromFunction1(onOpen), panel = panel.asInstanceOf[js.Any], showHeader = showHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPanelViewProps]
  }
  @scala.inline
  implicit class IPanelViewPropsOps[Self <: IPanelViewProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOnClose(value: IPanel[js.Object] => Unit): Self = this.set("onClose", js.Any.fromFunction1(value))
    @scala.inline
    def setOnOpen(value: IPanel[js.Object] => Unit): Self = this.set("onOpen", js.Any.fromFunction1(value))
    @scala.inline
    def setPanel(value: IPanel[js.Object]): Self = this.set("panel", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowHeader(value: Boolean): Self = this.set("showHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreviousPanel(value: IPanel[js.Object]): Self = this.set("previousPanel", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviousPanel: Self = this.set("previousPanel", js.undefined)
  }
  
}

