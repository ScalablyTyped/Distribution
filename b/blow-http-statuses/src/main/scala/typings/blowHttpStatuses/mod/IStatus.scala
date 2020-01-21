package typings.blowHttpStatuses.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStatus extends js.Object {
  var code: Double
  var message: String
}

object IStatus {
  @scala.inline
  def apply(code: Double, message: String): IStatus = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IStatus]
  }
}

