package typings.bootstrap3Dialog.BootstrapDialog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DialogButtonInstance extends js.Object {
  /** Equals to $button.toggleEnable(false); */
  def disable(): Unit = js.native
  /** Equals to $button.toggleEnable(true); */
  def enable(): Unit = js.native
  /** Equals to $button.toggleSpin(true); */
  def spin(): Unit = js.native
  /** Equals to $button.toggleSpin(false); */
  def stopSpin(): Unit = js.native
  def toggleEnable(enabled: Boolean): Unit = js.native
  def toggleSpin(spin: Boolean): Unit = js.native
}

object DialogButtonInstance {
  @scala.inline
  def apply(
    disable: () => Unit,
    enable: () => Unit,
    spin: () => Unit,
    stopSpin: () => Unit,
    toggleEnable: Boolean => Unit,
    toggleSpin: Boolean => Unit
  ): DialogButtonInstance = {
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), spin = js.Any.fromFunction0(spin), stopSpin = js.Any.fromFunction0(stopSpin), toggleEnable = js.Any.fromFunction1(toggleEnable), toggleSpin = js.Any.fromFunction1(toggleSpin))
    __obj.asInstanceOf[DialogButtonInstance]
  }
  @scala.inline
  implicit class DialogButtonInstanceOps[Self <: DialogButtonInstance] (val x: Self) extends AnyVal {
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
    def setDisable(value: () => Unit): Self = this.set("disable", js.Any.fromFunction0(value))
    @scala.inline
    def setEnable(value: () => Unit): Self = this.set("enable", js.Any.fromFunction0(value))
    @scala.inline
    def setSpin(value: () => Unit): Self = this.set("spin", js.Any.fromFunction0(value))
    @scala.inline
    def setStopSpin(value: () => Unit): Self = this.set("stopSpin", js.Any.fromFunction0(value))
    @scala.inline
    def setToggleEnable(value: Boolean => Unit): Self = this.set("toggleEnable", js.Any.fromFunction1(value))
    @scala.inline
    def setToggleSpin(value: Boolean => Unit): Self = this.set("toggleSpin", js.Any.fromFunction1(value))
  }
  
}

