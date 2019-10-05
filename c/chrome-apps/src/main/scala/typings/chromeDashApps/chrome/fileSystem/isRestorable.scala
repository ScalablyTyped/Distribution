package typings.chromeDashApps.chrome.fileSystem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.fileSystem.isRestorable")
@js.native
object isRestorable extends js.Object {
  /**
    * Returns whether the app has permission to restore the entry with the given id.
    * @since Chrome 29.
    **/
  def apply(id: String, callback: js.Function1[/* isRestorable */ Boolean, Unit]): Unit = js.native
}

