package typings
package bootstrap3DashDialogLib.BootstrapDialogNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogButtonInstance extends js.Object {
  /** Equals to $button.toggleEnable(false); */
  def disable(): scala.Unit
  /** Equals to $button.toggleEnable(true); */
  def enable(): scala.Unit
  /** Equals to $button.toggleSpin(true); */
  def spin(): scala.Unit
  /** Equals to $button.toggleSpin(false); */
  def stopSpin(): scala.Unit
  def toggleEnable(enabled: scala.Boolean): scala.Unit
  def toggleSpin(spin: scala.Boolean): scala.Unit
}

object DialogButtonInstance {
  @scala.inline
  def apply(
    disable: () => scala.Unit,
    enable: () => scala.Unit,
    spin: () => scala.Unit,
    stopSpin: () => scala.Unit,
    toggleEnable: scala.Boolean => scala.Unit,
    toggleSpin: scala.Boolean => scala.Unit
  ): DialogButtonInstance = {
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), spin = js.Any.fromFunction0(spin), stopSpin = js.Any.fromFunction0(stopSpin), toggleEnable = js.Any.fromFunction1(toggleEnable), toggleSpin = js.Any.fromFunction1(toggleSpin))
  
    __obj.asInstanceOf[DialogButtonInstance]
  }
}

