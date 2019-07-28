package typings.betterDashSqlite3.betterDashSqlite3Mod

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
    val __obj = js.Dynamic.literal(code = code, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[SqliteError]
  }
}

