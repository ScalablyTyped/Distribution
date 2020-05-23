package typings.cordovaPluginWebsql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SqlError extends js.Object {
  var code: Double
  var message: String
}

object SqlError {
  @scala.inline
  def apply(code: Double, message: String): SqlError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqlError]
  }
}

