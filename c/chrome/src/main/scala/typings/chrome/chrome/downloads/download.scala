package typings.chrome.chrome.downloads

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.downloads.download")
@js.native
object download extends js.Object {
  def apply(options: DownloadOptions): Unit = js.native
  def apply(options: DownloadOptions, callback: js.Function1[/* downloadId */ Double, Unit]): Unit = js.native
}

