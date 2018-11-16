package typings
package chromeDashAppsLib.WebViewNs

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
  var since: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
}

