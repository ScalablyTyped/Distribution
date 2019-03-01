package typings
package chromeLib.chromeNs.historyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistoryItem extends js.Object {
  /** The unique identifier for the item. */
  var id: java.lang.String
  /** Optional. When this page was last loaded, represented in milliseconds since the epoch. */
  var lastVisitTime: js.UndefOr[scala.Double] = js.undefined
  /** Optional. The title of the page when it was last loaded. */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** Optional. The number of times the user has navigated to this page by typing in the address. */
  var typedCount: js.UndefOr[scala.Double] = js.undefined
  /** Optional. The URL navigated to by a user. */
  var url: js.UndefOr[java.lang.String] = js.undefined
  /** Optional. The number of times the user has navigated to this page. */
  var visitCount: js.UndefOr[scala.Double] = js.undefined
}

object HistoryItem {
  @scala.inline
  def apply(
    id: java.lang.String,
    lastVisitTime: scala.Int | scala.Double = null,
    title: java.lang.String = null,
    typedCount: scala.Int | scala.Double = null,
    url: java.lang.String = null,
    visitCount: scala.Int | scala.Double = null
  ): HistoryItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    if (lastVisitTime != null) __obj.updateDynamic("lastVisitTime")(lastVisitTime.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    if (typedCount != null) __obj.updateDynamic("typedCount")(typedCount.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    if (visitCount != null) __obj.updateDynamic("visitCount")(visitCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryItem]
  }
}

