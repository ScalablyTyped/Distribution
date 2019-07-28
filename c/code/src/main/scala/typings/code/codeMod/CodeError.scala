package typings.code.codeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeError extends js.Object {
  var column: String
  var filename: String
  var line: String
}

object CodeError {
  @scala.inline
  def apply(column: String, filename: String, line: String): CodeError = {
    val __obj = js.Dynamic.literal(column = column, filename = filename, line = line)
  
    __obj.asInstanceOf[CodeError]
  }
}

