package typings
package codeLib.codeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeError extends js.Object {
  var column: java.lang.String
  var filename: java.lang.String
  var line: java.lang.String
}

object CodeError {
  @scala.inline
  def apply(column: java.lang.String, filename: java.lang.String, line: java.lang.String): CodeError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("column")(column)
    __obj.updateDynamic("filename")(filename)
    __obj.updateDynamic("line")(line)
    __obj.asInstanceOf[CodeError]
  }
}

