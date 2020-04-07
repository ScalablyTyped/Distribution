package typings.babylonjs.miscIndexMod

import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Misc/index", "ReadFileError")
@js.native
class ReadFileError protected ()
  extends typings.babylonjs.fileToolsMod.ReadFileError {
  /**
    * Creates a new ReadFileError
    * @param message defines the message of the error
    * @param file defines the optional file
    */
  def this(message: String, file: File) = this()
}

