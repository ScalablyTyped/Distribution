package typings
package cordovaDashPluginDashBackgroundDashModeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CordovaPluginBackgroundMode extends js.Object {
  /**
    * Configure the default background notification
    */
  def configure(item: ICordovaPluginBackgroundModeNotificationItem): scala.Unit
  /**
    * The background mode can be disabled
    */
  def disable(): scala.Unit
  /**
    * The background mode can be enabled
    */
  def enable(): scala.Unit
  /**
    * Checks if the background mode is activated or not
    */
  def isActivated(): scala.Boolean
  /**
    * Checks if the background mode is enabled or not
    */
  def isEnabled(): scala.Boolean
  /**
    * Function to get notified when the background mode has been activated
    */
  def onactivate(): scala.Unit
  /**
    * Function to get notified when the background mode has been deactivated
    */
  def ondeactivate(): scala.Unit
  /**
    * Function to get notified when the background could not benn activated
    */
  def onfailure(callback: js.Function1[/* errorCode */ scala.Double, scala.Unit]): scala.Unit
  /**
    * Customize default title, ticker and text for the notification
    */
  def setDefaults(item: ICordovaPluginBackgroundModeNotificationItem): scala.Unit
}

object CordovaPluginBackgroundMode {
  @scala.inline
  def apply(
    configure: js.Function1[ICordovaPluginBackgroundModeNotificationItem, scala.Unit],
    disable: js.Function0[scala.Unit],
    enable: js.Function0[scala.Unit],
    isActivated: js.Function0[scala.Boolean],
    isEnabled: js.Function0[scala.Boolean],
    onactivate: js.Function0[scala.Unit],
    ondeactivate: js.Function0[scala.Unit],
    onfailure: js.Function1[js.Function1[/* errorCode */ scala.Double, scala.Unit], scala.Unit],
    setDefaults: js.Function1[ICordovaPluginBackgroundModeNotificationItem, scala.Unit]
  ): CordovaPluginBackgroundMode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("configure")(configure)
    __obj.updateDynamic("disable")(disable)
    __obj.updateDynamic("enable")(enable)
    __obj.updateDynamic("isActivated")(isActivated)
    __obj.updateDynamic("isEnabled")(isEnabled)
    __obj.updateDynamic("onactivate")(onactivate)
    __obj.updateDynamic("ondeactivate")(ondeactivate)
    __obj.updateDynamic("onfailure")(onfailure)
    __obj.updateDynamic("setDefaults")(setDefaults)
    __obj.asInstanceOf[CordovaPluginBackgroundMode]
  }
}

