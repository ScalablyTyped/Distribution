package typings.chromeApps.chrome.syncFileSystem

import typings.chromeApps.AnonQuotaBytes
import typings.filesystem.FileSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.syncFileSystem.getUsageAndQuota")
@js.native
object getUsageAndQuota extends js.Object {
  /**
    * Returns the current usage and quota in bytes for the 'syncable' file storage for the app.
    * @param fileSystem
    * @param callback
    */
  def apply(fileSystem: FileSystem, callback: js.Function1[/* info */ AnonQuotaBytes, Unit]): Unit = js.native
}

