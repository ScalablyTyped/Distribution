package typings.chrome.chrome.history

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.history.search")
@js.native
object search extends js.Object {
  def apply(query: HistoryQuery, callback: js.Function1[/* results */ js.Array[HistoryItem], Unit]): Unit = js.native
}

