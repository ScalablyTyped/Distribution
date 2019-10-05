package typings.chromeDashApps.chrome.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.runtime.connectNative")
@js.native
object connectNative extends js.Object {
  /**
    * Connects to a native application in the host machine.
    * @since Chrome 28.
    * @param application The name of the registered application to connect to.
    */
  def apply(application: String): Port = js.native
}

