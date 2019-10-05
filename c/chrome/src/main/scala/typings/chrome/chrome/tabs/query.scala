package typings.chrome.chrome.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.tabs.query")
@js.native
object query extends js.Object {
  def apply(queryInfo: QueryInfo, callback: js.Function1[/* result */ js.Array[Tab], Unit]): Unit = js.native
}

