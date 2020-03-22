package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultStatus extends js.Object {
  var errorMessage: String
  var success: Boolean
}

object ResultStatus {
  @scala.inline
  def apply(errorMessage: String, success: Boolean): ResultStatus = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResultStatus]
  }
}

