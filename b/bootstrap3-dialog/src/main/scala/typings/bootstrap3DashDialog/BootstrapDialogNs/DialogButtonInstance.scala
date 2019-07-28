package typings.bootstrap3DashDialog.BootstrapDialogNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogButtonInstance extends js.Object {
  /** Equals to $button.toggleEnable(false); */
  def disable(): Unit
  /** Equals to $button.toggleEnable(true); */
  def enable(): Unit
  /** Equals to $button.toggleSpin(true); */
  def spin(): Unit
  /** Equals to $button.toggleSpin(false); */
  def stopSpin(): Unit
  def toggleEnable(enabled: Boolean): Unit
  def toggleSpin(spin: Boolean): Unit
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
}

