package typings.chromeApps.chrome.sockets

import typings.chromeApps.chrome.integer
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
  def apply(resultCode: integer, bytesSent: Int | Double = null): SendInfo = {
    val __obj = js.Dynamic.literal(resultCode = resultCode.asInstanceOf[js.Any])
    if (bytesSent != null) __obj.updateDynamic("bytesSent")(bytesSent.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendInfo]
  }
}

