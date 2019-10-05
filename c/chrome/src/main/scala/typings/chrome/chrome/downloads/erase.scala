package typings.chrome.chrome.downloads

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.downloads.erase")
@js.native
object erase extends js.Object {
  def apply(query: DownloadQuery, callback: js.Function1[/* erasedIds */ js.Array[Double], Unit]): Unit = js.native
}

