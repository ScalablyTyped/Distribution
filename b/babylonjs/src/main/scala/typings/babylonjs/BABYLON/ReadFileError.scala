package typings.babylonjs.BABYLON

import typings.std.Error
import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadFileError extends Error {
  var file: File
}

object ReadFileError {
  @scala.inline
  def apply(file: File, message: String, name: String, stack: String = null): ReadFileError = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadFileError]
  }
}

