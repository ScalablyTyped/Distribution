package typings.chromeDashApps.chrome.management

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.management.uninstallSelf")
@js.native
object uninstallSelf extends js.Object {
  /**
    * Uninstalls the calling extension.
    * Note: This function can be used without requesting the 'management' permission in the manifest.
    * @since Chrome 26.
    * @param [options] Optional unstall options
    * @param [callback]
    */
  def apply(): Unit = js.native
  def apply(options: UninstallOptions): Unit = js.native
  def apply(options: UninstallOptions, callback: js.Function0[Unit]): Unit = js.native
}

