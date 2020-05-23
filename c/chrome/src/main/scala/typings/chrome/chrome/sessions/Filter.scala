package typings.chrome.chrome.sessions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filter extends js.Object {
  /**
    * Optional.
    * The maximum number of entries to be fetched in the requested list. Omit this parameter to fetch the maximum number of entries (sessions.MAX_SESSION_RESULTS).
    */
  var maxResults: js.UndefOr[Double] = js.undefined
}

object Filter {
  @scala.inline
  def apply(maxResults: js.UndefOr[Double] = js.undefined): Filter = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
}

