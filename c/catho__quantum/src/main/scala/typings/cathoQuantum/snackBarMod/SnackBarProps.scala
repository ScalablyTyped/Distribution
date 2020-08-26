package typings.cathoQuantum.snackBarMod

import typings.cathoQuantum.anon.BaseFontSizeBreakpoints
import typings.cathoQuantum.anon.CallbackFn
import typings.cathoQuantum.cathoQuantumStrings.error
import typings.cathoQuantum.cathoQuantumStrings.neutral
import typings.cathoQuantum.cathoQuantumStrings.primary
import typings.cathoQuantum.cathoQuantumStrings.success
import typings.cathoQuantum.cathoQuantumStrings.warning
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnackBarProps extends js.Object {
  var actionTrigger: js.UndefOr[CallbackFn] = js.native
  var closeButtonAriaLabel: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var inverted: js.UndefOr[Boolean] = js.native
  var onClose: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
  var secondsToClose: js.UndefOr[Double] = js.native
  var skin: js.UndefOr[primary | success | error | neutral | warning] = js.native
  var text: js.UndefOr[String] = js.native
  var theme: js.UndefOr[BaseFontSizeBreakpoints] = js.native
}

object SnackBarProps {
  @scala.inline
  def apply(): SnackBarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnackBarProps]
  }
  @scala.inline
  implicit class SnackBarPropsOps[Self <: SnackBarProps] (val x: Self) extends AnyVal {
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
    def setActionTrigger(value: CallbackFn): Self = this.set("actionTrigger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActionTrigger: Self = this.set("actionTrigger", js.undefined)
    @scala.inline
    def setCloseButtonAriaLabel(value: String): Self = this.set("closeButtonAriaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseButtonAriaLabel: Self = this.set("closeButtonAriaLabel", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInverted(value: Boolean): Self = this.set("inverted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInverted: Self = this.set("inverted", js.undefined)
    @scala.inline
    def setOnClose(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = this.set("onClose", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    @scala.inline
    def setSecondsToClose(value: Double): Self = this.set("secondsToClose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondsToClose: Self = this.set("secondsToClose", js.undefined)
    @scala.inline
    def setSkin(value: primary | success | error | neutral | warning): Self = this.set("skin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkin: Self = this.set("skin", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setTheme(value: BaseFontSizeBreakpoints): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

