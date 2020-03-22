package typings.browserfs

import org.scalablytyped.runtime.Instantiable0
import typings.browserfs.fileSystemMod.BFSCallback
import typings.browserfs.fileSystemMod.FileSystemOptions
import typings.browserfs.localStorageMod.LocalStorageFileSystem
import typings.browserfs.localStorageMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofLocalStorage extends Instantiable0[default] {
  val Name: String = js.native
  val Options: FileSystemOptions = js.native
  /**
    * Creates a LocalStorageFileSystem instance.
    */
  def Create(options: js.Any, cb: BFSCallback[LocalStorageFileSystem]): Unit = js.native
  def isAvailable(): Boolean = js.native
}

