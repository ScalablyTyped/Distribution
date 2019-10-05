package typings.chrome.chrome.history

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.history.getVisits")
@js.native
object getVisits extends js.Object {
  def apply(details: Url, callback: js.Function1[/* results */ js.Array[VisitItem], Unit]): Unit = js.native
}

