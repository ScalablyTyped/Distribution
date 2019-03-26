package typings
package chromeDashAppsLib.chromeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// #region chrome.power
///////////
// Power //
///////////
/**
  * Use the chrome.power API to override the system's power management features.
  * @requires Permissions: 'power'
  * @since Chrome 27.
  */
@JSGlobal("chrome.power")
@js.native
object powerNs extends js.Object {
  /**
    * @enum
    * @property SYSTEM - Prevent the system from sleeping in response to user inactivity.
    * @property DISPLAY - Prevent the display from being turned off or dimmed or the system from sleeping in response to user inactivity.
    */
  val Level: chromeDashAppsLib.Anon_DISPLAY = js.native
  /** Releases a request previously made via requestKeepAwake(). */
  def releaseKeepAwake(): scala.Unit = js.native
  /**
    * Requests that power management be temporarily disabled.
    * @param level Level describes the degree to which power management should be disabled.
    *              If a request previously made by the same app is still active, it will be replaced by the new request.
    * @see Enum: chrome.power.Level
    */
  def requestKeepAwake(
    level: chromeDashAppsLib.chromeNs.ToStringLiteral[
      chromeDashAppsLib.Anon_DISPLAY, 
      java.lang.String, 
      stdLib.Exclude[
        java.lang.String, 
        chromeDashAppsLib.chromeDashAppsLibStrings.system | chromeDashAppsLib.chromeDashAppsLibStrings.display
      ]
    ]
  ): scala.Unit = js.native
}

