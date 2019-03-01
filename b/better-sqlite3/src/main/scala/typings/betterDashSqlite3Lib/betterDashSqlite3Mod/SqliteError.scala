package typings
package betterDashSqlite3Lib.betterDashSqlite3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SqliteError
  extends stdLib.Error {
  var code: java.lang.String
}

object SqliteError {
  @scala.inline
  def apply(
    code: java.lang.String,
    message: java.lang.String,
    name: java.lang.String,
    stack: java.lang.String = null
  ): SqliteError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("code")(code)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("name")(name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[SqliteError]
  }
}

