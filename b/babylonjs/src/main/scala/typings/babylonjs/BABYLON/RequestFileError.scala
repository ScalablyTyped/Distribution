package typings.babylonjs.BABYLON

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestFileError extends Error {
  var request: WebRequest
}

object RequestFileError {
  @scala.inline
  def apply(message: String, name: String, request: WebRequest, stack: String = null): RequestFileError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestFileError]
  }
}

