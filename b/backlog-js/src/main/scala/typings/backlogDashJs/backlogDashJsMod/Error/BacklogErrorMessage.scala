package typings.backlogDashJs.backlogDashJsMod.Error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BacklogErrorMessage extends js.Object {
  var code: Double
  var errorInfo: String
  var message: String
  var moreInfo: String
}

object BacklogErrorMessage {
  @scala.inline
  def apply(code: Double, errorInfo: String, message: String, moreInfo: String): BacklogErrorMessage = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], errorInfo = errorInfo.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], moreInfo = moreInfo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BacklogErrorMessage]
  }
}

