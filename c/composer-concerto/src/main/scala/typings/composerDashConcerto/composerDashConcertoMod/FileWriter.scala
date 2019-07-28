package typings.composerDashConcerto.composerDashConcertoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("composer-concerto", "FileWriter")
@js.native
class FileWriter protected () extends Writer {
  /**
    * Create a FileWriter.
    */
  def this(outputDirectory: String) = this()
  /**
    * Closes the current open file.
    */
  def closeFile(): Unit = js.native
  /**
    * Opens a file for writing. The file will be created in the
    * root directory of this FileWriter.
    */
  def openFile(fileName: String): Unit = js.native
  /**
    * Opens a file for writing, with a location relative to the
    * root directory of this FileWriter.
    */
  def openRelativeFile(relativeDir: String, fileName: String): Unit = js.native
}

