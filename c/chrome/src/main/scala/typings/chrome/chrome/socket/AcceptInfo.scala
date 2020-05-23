package typings.chrome.chrome.socket

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AcceptInfo extends js.Object {
  var resultCode: Double
  var socketId: js.UndefOr[Double] = js.undefined
}

object AcceptInfo {
  @scala.inline
  def apply(resultCode: Double, socketId: js.UndefOr[Double] = js.undefined): AcceptInfo = {
    val __obj = js.Dynamic.literal(resultCode = resultCode.asInstanceOf[js.Any])
    if (!js.isUndefined(socketId)) __obj.updateDynamic("socketId")(socketId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptInfo]
  }
}

