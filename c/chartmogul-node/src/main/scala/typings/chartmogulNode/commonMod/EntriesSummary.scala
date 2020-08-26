package typings.chartmogulNode.commonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntriesSummary[T] extends js.Object {
  var entries: js.Array[T] = js.native
  var summary: Summary = js.native
}

object EntriesSummary {
  @scala.inline
  def apply[T](entries: js.Array[T], summary: Summary): EntriesSummary[T] = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntriesSummary[T]]
  }
  @scala.inline
  implicit class EntriesSummaryOps[Self <: EntriesSummary[_], T] (val x: Self with EntriesSummary[T]) extends AnyVal {
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
    def setEntriesVarargs(value: T*): Self = this.set("entries", js.Array(value :_*))
    @scala.inline
    def setEntries(value: js.Array[T]): Self = this.set("entries", value.asInstanceOf[js.Any])
    @scala.inline
    def setSummary(value: Summary): Self = this.set("summary", value.asInstanceOf[js.Any])
  }
  
}

