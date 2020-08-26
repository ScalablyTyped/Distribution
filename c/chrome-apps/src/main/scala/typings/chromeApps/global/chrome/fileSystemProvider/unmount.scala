package typings.chromeApps.global.chrome.fileSystemProvider

import typings.chromeApps.chrome.fileSystemProvider.UnmountOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.fileSystemProvider.unmount")
@js.native
object unmount extends js.Object {
  /**
    * Unmounts a file system with the given fileSystemId.
    * It must be called after onUnmountRequested is invoked.
    * Also, the providing extension can decide to perform unmounting if not requested
    * (eg. in case of lost connection, or a file error).
    *
    * In case of an error, runtime.lastError will be set with a corresponding error code.
    *
    * @param callback A generic result callback to indicate success or failure.
    */
  def apply(options: UnmountOptions): Unit = js.native
  def apply(options: UnmountOptions, callback: js.Function0[Unit]): Unit = js.native
}

