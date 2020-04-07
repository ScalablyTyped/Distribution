package typings.babylonjs.BABYLON

import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.LoadFileError")
@js.native
class LoadFileError protected () extends BaseError {
  /**
    * Creates a new LoadFileError
    * @param message defines the message of the error
    * @param request defines the optional web request
    * @param file defines the optional file
    */
  def this(message: String) = this()
  def this(message: String, `object`: WebRequest) = this()
  def this(message: String, `object`: File) = this()
  var file: js.UndefOr[File] = js.native
  var request: js.UndefOr[WebRequest] = js.native
}

