package typings.babylonjs.mod

import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs", "ReadFileError")
@js.native
class ReadFileError protected ()
  extends typings.babylonjs.legacyMod.ReadFileError {
  /**
    * Creates a new ReadFileError
    * @param message defines the message of the error
    * @param file defines the optional file
    */
  def this(message: String, file: File) = this()
}

