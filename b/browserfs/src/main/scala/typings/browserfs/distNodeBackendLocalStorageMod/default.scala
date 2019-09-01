package typings.browserfs.distNodeBackendLocalStorageMod

import typings.browserfs.distNodeCoreFileUnderscoreSystemMod.BFSCallback
import typings.browserfs.distNodeCoreFileUnderscoreSystemMod.FileSystemOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browserfs/dist/node/backend/LocalStorage", JSImport.Default)
@js.native
/**
  * Creates a new LocalStorage file system using the contents of `localStorage`.
  */
class default () extends LocalStorageFileSystem

/* static members */
@JSImport("browserfs/dist/node/backend/LocalStorage", JSImport.Default)
@js.native
object default extends js.Object {
  val Name: String = js.native
  val Options: FileSystemOptions = js.native
  /**
    * Creates a LocalStorageFileSystem instance.
    */
  def Create(options: js.Any, cb: BFSCallback[LocalStorageFileSystem]): Unit = js.native
  def isAvailable(): Boolean = js.native
}

