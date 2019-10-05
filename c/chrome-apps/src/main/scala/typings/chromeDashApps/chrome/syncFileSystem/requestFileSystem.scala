package typings.chromeDashApps.chrome.syncFileSystem

import typings.filesystem.FileSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.syncFileSystem.requestFileSystem")
@js.native
object requestFileSystem extends js.Object {
  /**
    * Returns a syncable filesystem backed by Google Drive.
    * The returned DOMFileSystem instance can be operated on
    * in the same way as the Temporary and Persistant file systems
    * @see[More information]{@link http://dev.w3.org/2009/dap/file-system/file-dir-sys.html}
    * @description
    * Calling this multiple times from the same app will return the same handle to the same file system.
    * Note this call can fail.
    * For example, if the user is not signed in to Chrome
    * or if there is no network operation. To handle these
    * errors it is important chrome.runtime.lastError is
    * checked in the callback.
    * @param callback A callback type for requestFileSystem.
    */
  def apply(callback: js.Function1[/* fileSystem */ FileSystem, Unit]): Unit = js.native
}

