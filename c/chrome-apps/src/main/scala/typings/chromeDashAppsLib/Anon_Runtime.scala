package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Runtime extends js.Object {
  /**
    * @enum
    * @internal
    * @private
    */
  val _State: Anon_FULLSCREEN
  // #endregion
  // #region chrome.app.*
  /////////////////
  // App Runtime //
  /////////////////
  /**
    * @since Chrome 24.
    * @description
    * Use the chrome.app.runtime API to manage the app lifecycle.
    * The app runtime manages app installation, controls the event page,
    * and can shut down the app at anytime.
    */
  val runtimeNs: Anon_ActionType
  val window: chromeDashAppsLib.chromeNs.appNs.ChromeAppWindow
}

object Anon_Runtime {
  @scala.inline
  def apply(
    _State: Anon_FULLSCREEN,
    runtimeNs: Anon_ActionType,
    window: chromeDashAppsLib.chromeNs.appNs.ChromeAppWindow
  ): Anon_Runtime = {
    val __obj = js.Dynamic.literal(_State = _State, runtimeNs = runtimeNs, window = window)
  
    __obj.asInstanceOf[Anon_Runtime]
  }
}

