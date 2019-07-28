package typings.chromeDashApps.chromeNs.socketsNs

import typings.chromeDashApps.chromeNs.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendInfo extends js.Object {
  /** The number of bytes sent (if result == 0) */
  var bytesSent: js.UndefOr[integer] = js.undefined
  /** The result code returned from the underlying network call. A negative value indicates an error. */
  var resultCode: integer
}

object SendInfo {
  @scala.inline
  def apply(resultCode: integer, bytesSent: js.UndefOr[integer] = js.undefined): SendInfo = {
    val __obj = js.Dynamic.literal(resultCode = resultCode)
    if (!js.isUndefined(bytesSent)) __obj.updateDynamic("bytesSent")(bytesSent)
    __obj.asInstanceOf[SendInfo]
  }
}

