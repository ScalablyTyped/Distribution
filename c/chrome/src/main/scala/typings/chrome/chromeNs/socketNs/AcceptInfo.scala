package typings.chrome.chromeNs.socketNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AcceptInfo extends js.Object {
  var resultCode: Double
  var socketId: js.UndefOr[Double] = js.undefined
}

object AcceptInfo {
  @scala.inline
  def apply(resultCode: Double, socketId: Int | Double = null): AcceptInfo = {
    val __obj = js.Dynamic.literal(resultCode = resultCode)
    if (socketId != null) __obj.updateDynamic("socketId")(socketId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptInfo]
  }
}

