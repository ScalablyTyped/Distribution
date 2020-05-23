package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.RequestFileError")
@js.native
class RequestFileError protected ()
  extends typings.babylonjs.BABYLON.RequestFileError {
  /**
    * Creates a new LoadFileError
    * @param message defines the message of the error
    * @param request defines the optional web request
    */
  def this(message: String, request: typings.babylonjs.BABYLON.WebRequest) = this()
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  override var request: typings.babylonjs.BABYLON.WebRequest = js.native
}

