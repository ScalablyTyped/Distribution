package typings.cordovaPluginFile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface lets a user list files and directories in a directory. If there are
  * no additions to or deletions from a directory between the first and last call to
  * readEntries, and no errors occur, then:
  *     A series of calls to readEntries must return each entry in the directory exactly once.
  *     Once all entries have been returned, the next call to readEntries must produce an empty array.
  *     If not all entries have been returned, the array produced by readEntries must not be empty.
  *     The entries produced by readEntries must not include the directory itself ["."] or its parent [".."].
  */
@js.native
trait DirectoryReader extends StObject {
  
  /**
    * Read the next block of entries from this directory.
    * @param successCallback Called once per successful call to readEntries to deliver the next
    *                        previously-unreported set of Entries in the associated Directory.
    *                        If all Entries have already been returned from previous invocations
    *                        of readEntries, successCallback must be called with a zero-length array as an argument.
    * @param errorCallback   A callback indicating that there was an error reading from the Directory.
    */
  def readEntries(successCallback: js.Function1[/* entries */ js.Array[Entry], Unit]): Unit = js.native
  def readEntries(
    successCallback: js.Function1[/* entries */ js.Array[Entry], Unit],
    errorCallback: js.Function1[/* error */ FileError, Unit]
  ): Unit = js.native
}
