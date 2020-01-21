package typings.baiduApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonErrMsg extends js.Object {
  var errMsg: String
}

object AnonErrMsg {
  @scala.inline
  def apply(errMsg: String): AnonErrMsg = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonErrMsg]
  }
}

