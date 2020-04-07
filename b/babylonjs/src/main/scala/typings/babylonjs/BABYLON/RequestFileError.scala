package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.RequestFileError")
@js.native
class RequestFileError protected () extends BaseError {
  /**
    * Creates a new LoadFileError
    * @param message defines the message of the error
    * @param request defines the optional web request
    */
  def this(message: String, request: WebRequest) = this()
  var request: WebRequest = js.native
}

