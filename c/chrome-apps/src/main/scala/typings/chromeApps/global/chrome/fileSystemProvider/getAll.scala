package typings.chromeApps.global.chrome.fileSystemProvider

import typings.chromeApps.chrome.fileSystemProvider.FileSystemInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("chrome.fileSystemProvider.getAll")
@js.native
object getAll extends js.Object {
  
  /**
    * Returns all file systems mounted by the app.
    * @param callback Callback to receive the result of getAll function.
    */
  def apply(callback: js.Function1[/* fileSystems */ js.Array[FileSystemInfo], Unit]): Unit = js.native
}
