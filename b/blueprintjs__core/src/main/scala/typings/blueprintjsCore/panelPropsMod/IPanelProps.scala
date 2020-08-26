package typings.blueprintjsCore.panelPropsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPanelProps extends js.Object {
  /**
    * Call this method to programatically close this panel. If this is the only
    * panel on the stack then this method will do nothing.
    *
    * Remember that the panel header always contains a "back" button that
    * closes this panel on click (unless there is only one panel on the stack).
    */
  def closePanel(): Unit = js.native
  /**
    * Call this method to open a new panel on the top of the stack.
    */
  def openPanel[P](panel: IPanel[P]): Unit = js.native
}

object IPanelProps {
  @scala.inline
  def apply(closePanel: () => Unit, openPanel: IPanel[js.Any] => Unit): IPanelProps = {
    val __obj = js.Dynamic.literal(closePanel = js.Any.fromFunction0(closePanel), openPanel = js.Any.fromFunction1(openPanel))
    __obj.asInstanceOf[IPanelProps]
  }
  @scala.inline
  implicit class IPanelPropsOps[Self <: IPanelProps] (val x: Self) extends AnyVal {
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
    def setClosePanel(value: () => Unit): Self = this.set("closePanel", js.Any.fromFunction0(value))
    @scala.inline
    def setOpenPanel(value: IPanel[js.Any] => Unit): Self = this.set("openPanel", js.Any.fromFunction1(value))
  }
  
}

