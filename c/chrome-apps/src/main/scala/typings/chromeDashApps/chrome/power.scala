package typings.chromeDashApps.chrome

import typings.chromeDashApps.Anon_DISPLAY
import typings.chromeDashApps.chromeDashAppsStrings.display
import typings.std.Exclude
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
object power extends js.Object {
  /** Releases a request previously made via requestKeepAwake(). */
  def releaseKeepAwake(): Unit = js.native
  /**
    * Requests that power management be temporarily disabled.
    * @param level Level describes the degree to which power management should be disabled.
    *              If a request previously made by the same app is still active, it will be replaced by the new request.
    * @see Enum: chrome.power.Level
    */
  def requestKeepAwake(
    level: ToStringLiteral[
      Anon_DISPLAY, 
      String, 
      Exclude[String, typings.chromeDashApps.chromeDashAppsStrings.system | display]
    ]
  ): Unit = js.native
  /**
    * @enum
    * @property SYSTEM - Prevent the system from sleeping in response to user inactivity.
    * @property DISPLAY - Prevent the display from being turned off or dimmed or the system from sleeping in response to user inactivity.
    */
  @js.native
  object Level extends js.Object {
    var DISPLAY: display = js.native
    var SYSTEM: typings.chromeDashApps.chromeDashAppsStrings.system = js.native
  }
  
}

