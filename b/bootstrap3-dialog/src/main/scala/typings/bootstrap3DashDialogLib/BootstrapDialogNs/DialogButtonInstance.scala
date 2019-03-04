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
    disable: js.Function0[scala.Unit],
    enable: js.Function0[scala.Unit],
    spin: js.Function0[scala.Unit],
    stopSpin: js.Function0[scala.Unit],
    toggleEnable: js.Function1[scala.Boolean, scala.Unit],
    toggleSpin: js.Function1[scala.Boolean, scala.Unit]
  ): DialogButtonInstance = {
    val __obj = js.Dynamic.literal(disable = disable, enable = enable, spin = spin, stopSpin = stopSpin, toggleEnable = toggleEnable, toggleSpin = toggleSpin)
  
    __obj.asInstanceOf[DialogButtonInstance]
  }
}

