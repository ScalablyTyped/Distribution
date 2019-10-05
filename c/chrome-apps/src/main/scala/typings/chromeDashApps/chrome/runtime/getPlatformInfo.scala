package typings.chromeDashApps.chrome.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.runtime.getPlatformInfo")
@js.native
object getPlatformInfo extends js.Object {
  /**
    * Returns information about the current platform.
    * @since Chrome 29.
    * @param callback Called with results
    */
  def apply(callback: js.Function1[/* platformInfo */ PlatformInfo, Unit]): Unit = js.native
}

