package typings
package chromeLib.chromeNs.socketNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AcceptInfo extends js.Object {
  var resultCode: scala.Double
  var socketId: js.UndefOr[scala.Double] = js.undefined
}

object AcceptInfo {
  @scala.inline
  def apply(resultCode: scala.Double, socketId: scala.Int | scala.Double = null): AcceptInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("resultCode")(resultCode)
    if (socketId != null) __obj.updateDynamic("socketId")(socketId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptInfo]
  }
}

