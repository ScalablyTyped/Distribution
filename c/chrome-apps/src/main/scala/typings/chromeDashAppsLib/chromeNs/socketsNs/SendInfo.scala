package typings
package chromeDashAppsLib.chromeNs.socketsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendInfo extends js.Object {
  /** The number of bytes sent (if result == 0) */
  var bytesSent: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
  /** The result code returned from the underlying network call. A negative value indicates an error. */
  var resultCode: chromeDashAppsLib.chromeNs.integer
}

object SendInfo {
  @scala.inline
  def apply(
    resultCode: chromeDashAppsLib.chromeNs.integer,
    bytesSent: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
  ): SendInfo = {
    val __obj = js.Dynamic.literal(resultCode = resultCode)
    if (!js.isUndefined(bytesSent)) __obj.updateDynamic("bytesSent")(bytesSent)
    __obj.asInstanceOf[SendInfo]
  }
}

