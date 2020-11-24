package typings.chromeApps.global.chrome.fileSystemProvider

import typings.chromeApps.chrome.fileSystemProvider.MountOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("chrome.fileSystemProvider.mount")
@js.native
object mount extends js.Object {
  
  ///\/\/|\/\/\\\
  /// METHODS \\\
  ///\/\/|\/\/\\\
  /**
    * Mounts a file system with the given fileSystemId and displayName.
    * displayName will be shown in the left panel of the Files app.
    * displayName can contain any characters including '/', but cannot be an empty string.
    * displayName must be descriptive but doesn't have to be unique.
    * The fileSystemId must not be an empty string.
    *
    * Depending on the type of the file system being mounted, the source option must be set appropriately.
    *
    * In case of an error, runtime.lastError will be set with a corresponding error code.
    *
    * @param callback A generic result callback to indicate success or failure.
    */
  def apply(options: MountOptions): Unit = js.native
  def apply(options: MountOptions, callback: js.Function0[Unit]): Unit = js.native
}
