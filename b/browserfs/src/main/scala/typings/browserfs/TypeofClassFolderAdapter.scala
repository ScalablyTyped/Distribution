package typings.browserfs

import org.scalablytyped.runtime.Instantiable2
import typings.browserfs.distNodeBackendFolderAdapterMod.FolderAdapter
import typings.browserfs.distNodeBackendFolderAdapterMod.FolderAdapterOptions
import typings.browserfs.distNodeBackendFolderAdapterMod.default
import typings.browserfs.distNodeCoreFileUnderscoreSystemMod.BFSCallback
import typings.browserfs.distNodeCoreFileUnderscoreSystemMod.FileSystem
import typings.browserfs.distNodeCoreFileUnderscoreSystemMod.FileSystemOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassFolderAdapter extends Instantiable2[/* folder */ String, /* wrapped */ FileSystem, default] {
  val Name: String = js.native
  val Options: FileSystemOptions = js.native
  /**
    * Creates a FolderAdapter instance with the given options.
    */
  def Create(opts: FolderAdapterOptions, cb: BFSCallback[FolderAdapter]): Unit = js.native
  def isAvailable(): Boolean = js.native
}

