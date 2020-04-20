package typings.baiduApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonErrCode extends js.Object {
  var errCode: Double
  var errMsg: String
}

object AnonErrCode {
  @scala.inline
  def apply(errCode: Double, errMsg: String): AnonErrCode = {
    val __obj = js.Dynamic.literal(errCode = errCode.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonErrCode]
  }
}

