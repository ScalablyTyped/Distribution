package typings.chromeDashApps.WebView

import typings.chromeDashApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Options that determine what data should be cleared by *clearData* */
trait ClearDataOptions extends js.Object {
  /**
    * Clear data accumulated on or after this date,
    * represented in milliseconds since the epoch
    * (accessible via the getTime method of the JavaScript Date object).
    * If absent, defaults to 0 (which would remove all browsing data).
    * @default 0
    */
  var since: js.UndefOr[integer] = js.undefined
}

object ClearDataOptions {
  @scala.inline
  def apply(since: Int | Double = null): ClearDataOptions = {
    val __obj = js.Dynamic.literal()
    if (since != null) __obj.updateDynamic("since")(since.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearDataOptions]
  }
}

