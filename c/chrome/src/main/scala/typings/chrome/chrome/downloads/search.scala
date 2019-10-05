package typings.chrome.chrome.downloads

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.downloads.search")
@js.native
object search extends js.Object {
  def apply(query: DownloadQuery, callback: js.Function1[/* results */ js.Array[DownloadItem], Unit]): Unit = js.native
}

