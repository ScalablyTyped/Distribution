package typings.chartmogulNode.commonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntriesSummary[T] extends js.Object {
  var entries: js.Array[T]
  var summary: Summary
}

object EntriesSummary {
  @scala.inline
  def apply[T](entries: js.Array[T], summary: Summary): EntriesSummary[T] = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntriesSummary[T]]
  }
}

