package typings.browserfs

import org.scalablytyped.runtime.Instantiable0
import typings.browserfs.distNodeBackendLocalStorageMod.LocalStorageFileSystem
import typings.browserfs.distNodeBackendLocalStorageMod.default
import typings.browserfs.distNodeCoreFileUnderscoreSystemMod.BFSCallback
import typings.browserfs.distNodeCoreFileUnderscoreSystemMod.FileSystemOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassLocalStorage extends Instantiable0[default] {
  val Name: String = js.native
  val Options: FileSystemOptions = js.native
  /**
    * Creates a LocalStorageFileSystem instance.
    */
  def Create(options: js.Any, cb: BFSCallback[LocalStorageFileSystem]): Unit = js.native
  def isAvailable(): Boolean = js.native
}

