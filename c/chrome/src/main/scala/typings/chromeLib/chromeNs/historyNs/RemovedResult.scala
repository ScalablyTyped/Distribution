package typings
package chromeLib.chromeNs.historyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemovedResult extends js.Object {
  /** True if all history was removed. If true, then urls will be empty. */
  var allHistory: scala.Boolean
  /** Optional. */
  var urls: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object RemovedResult {
  @scala.inline
  def apply(allHistory: scala.Boolean, urls: js.Array[java.lang.String] = null): RemovedResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("allHistory")(allHistory)
    if (urls != null) __obj.updateDynamic("urls")(urls)
    __obj.asInstanceOf[RemovedResult]
  }
}

