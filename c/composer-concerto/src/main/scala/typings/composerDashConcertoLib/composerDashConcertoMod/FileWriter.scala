package typings
package composerDashConcertoLib.composerDashConcertoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("composer-concerto", "FileWriter")
@js.native
class FileWriter protected () extends Writer {
  /**
    * Create a FileWriter.
    */
  def this(outputDirectory: java.lang.String) = this()
  /**
    * Closes the current open file.
    */
  def closeFile(): scala.Unit = js.native
  /**
    * Opens a file for writing. The file will be created in the
    * root directory of this FileWriter.
    */
  def openFile(fileName: java.lang.String): scala.Unit = js.native
  /**
    * Opens a file for writing, with a location relative to the
    * root directory of this FileWriter.
    */
  def openRelativeFile(relativeDir: java.lang.String, fileName: java.lang.String): scala.Unit = js.native
}

