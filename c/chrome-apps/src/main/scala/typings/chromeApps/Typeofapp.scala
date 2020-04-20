package typings.chromeApps

import typings.chromeApps.chrome.app.ChromeAppWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofapp extends js.Object {
  /**
    * @enum
    * @internal
    * @private
    */
  val _State: AnonFULLSCREEN
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
  val runtime: Typeofruntime
  val window: ChromeAppWindow
}

object Typeofapp {
  @scala.inline
  def apply(_State: AnonFULLSCREEN, runtime: Typeofruntime, window: ChromeAppWindow): Typeofapp = {
    val __obj = js.Dynamic.literal(_State = _State.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofapp]
  }
}

