package typings
package cordovaDashPluginDashFileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interface represents a file on a file system. */
@js.native
trait FileEntry extends Entry {
  /**
    * Creates a new FileWriter associated with the file that this FileEntry represents.
    * @param successCallback A callback that is called with the new FileWriter.
    * @param errorCallback   A callback that is called when errors happen.
    */
  def createWriter(successCallback: js.Function1[/* writer */ FileWriter, scala.Unit]): scala.Unit = js.native
  def createWriter(
    successCallback: js.Function1[/* writer */ FileWriter, scala.Unit],
    errorCallback: js.Function1[/* error */ FileError, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Returns a File that represents the current state of the file that this FileEntry represents.
    * @param successCallback A callback that is called with the File.
    * @param errorCallback   A callback that is called when errors happen.
    */
  def file(successCallback: js.Function1[/* file */ stdLib.File, scala.Unit]): scala.Unit = js.native
  def file(
    successCallback: js.Function1[/* file */ stdLib.File, scala.Unit],
    errorCallback: js.Function1[/* error */ FileError, scala.Unit]
  ): scala.Unit = js.native
}

