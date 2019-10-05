package typings.chromeDashApps.chrome.runtime

import typings.filesystem.DirectoryEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.runtime.getPackageDirectoryEntry")
@js.native
object getPackageDirectoryEntry extends js.Object {
  /**
    * Returns a DirectoryEntry for the package directory.
    * @since Chrome 29.
    */
  def apply(callback: js.Function1[/* directoryEntry */ DirectoryEntry, Unit]): Unit = js.native
}

