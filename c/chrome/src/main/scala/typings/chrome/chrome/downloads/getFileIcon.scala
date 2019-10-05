package typings.chrome.chrome.downloads

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.downloads.getFileIcon")
@js.native
object getFileIcon extends js.Object {
  def apply(downloadId: Double, callback: js.Function1[/* iconURL */ String, Unit]): Unit = js.native
  def apply(
    downloadId: Double,
    options: GetFileIconOptions,
    callback: js.Function1[/* iconURL */ String, Unit]
  ): Unit = js.native
}

