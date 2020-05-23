package typings.babylonjs.global.BABYLON

import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.ReadFileError")
@js.native
class ReadFileError protected ()
  extends typings.babylonjs.BABYLON.ReadFileError {
  /**
    * Creates a new ReadFileError
    * @param message defines the message of the error
    * @param file defines the optional file
    */
  def this(message: String, file: File) = this()
  /* CompleteClass */
  override var file: File = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
}

