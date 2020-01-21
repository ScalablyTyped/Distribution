package typings.betterSqlite3.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SqliteError extends Error {
  var code: String
}

object SqliteError {
  @scala.inline
  def apply(code: String, message: String, name: String, stack: String = null): SqliteError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqliteError]
  }
}

