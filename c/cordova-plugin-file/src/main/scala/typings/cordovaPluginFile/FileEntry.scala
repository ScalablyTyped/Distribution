package typings.cordovaPluginFile

import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This interface represents a file on a file system. */
@js.native
trait FileEntry
  extends StObject
     with Entry {
  
  /**
    * Creates a new FileWriter associated with the file that this FileEntry represents.
    * @param successCallback A callback that is called with the new FileWriter.
    * @param errorCallback   A callback that is called when errors happen.
    */
  def createWriter(successCallback: js.Function1[/* writer */ FileWriter, Unit]): Unit = js.native
  def createWriter(
    successCallback: js.Function1[/* writer */ FileWriter, Unit],
    errorCallback: js.Function1[/* error */ FileError, Unit]
  ): Unit = js.native
  
  /**
    * Returns a File that represents the current state of the file that this FileEntry represents.
    * @param successCallback A callback that is called with the File.
    * @param errorCallback   A callback that is called when errors happen.
    */
  def file(successCallback: js.Function1[/* file */ File, Unit]): Unit = js.native
  def file(
    successCallback: js.Function1[/* file */ File, Unit],
    errorCallback: js.Function1[/* error */ FileError, Unit]
  ): Unit = js.native
}
