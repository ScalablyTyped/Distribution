package typings.babylonjs.BABYLON

import typings.std.Error
import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadFileError extends Error {
  var file: js.UndefOr[File] = js.undefined
  var request: js.UndefOr[WebRequest] = js.undefined
}

object LoadFileError {
  @scala.inline
  def apply(message: String, name: String, file: File = null, request: WebRequest = null, stack: String = null): LoadFileError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadFileError]
  }
}

