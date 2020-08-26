package typings.chrome.chrome.history

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistoryQuery extends js.Object {
  /** Optional. Limit results to those visited before this date, represented in milliseconds since the epoch. */
  var endTime: js.UndefOr[Double] = js.native
  /** Optional. The maximum number of results to retrieve. Defaults to 100. */
  var maxResults: js.UndefOr[Double] = js.native
  /** Optional. Limit results to those visited after this date, represented in milliseconds since the epoch. */
  var startTime: js.UndefOr[Double] = js.native
  /** A free-text query to the history service. Leave empty to retrieve all pages. */
  var text: String = js.native
}

object HistoryQuery {
  @scala.inline
  def apply(text: String): HistoryQuery = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryQuery]
  }
  @scala.inline
  implicit class HistoryQueryOps[Self <: HistoryQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndTime(value: Double): Self = this.set("endTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setStartTime(value: Double): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
  }
  
}

