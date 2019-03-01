package typings
package chromeLib.chromeNs.sessionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filter extends js.Object {
  /**
    * Optional.
    * The maximum number of entries to be fetched in the requested list. Omit this parameter to fetch the maximum number of entries (sessions.MAX_SESSION_RESULTS).
    */
  var maxResults: js.UndefOr[scala.Double] = js.undefined
}

object Filter {
  @scala.inline
  def apply(maxResults: scala.Int | scala.Double = null): Filter = {
    val __obj = js.Dynamic.literal()
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
}

