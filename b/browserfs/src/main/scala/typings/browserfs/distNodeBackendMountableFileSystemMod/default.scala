package typings.browserfs.distNodeBackendMountableFileSystemMod

import typings.browserfs.distNodeCoreFileUnderscoreSystemMod.BFSCallback
import typings.browserfs.distNodeCoreFileUnderscoreSystemMod.FileSystemOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browserfs/dist/node/backend/MountableFileSystem", JSImport.Default)
@js.native
/**
  * Creates a new, empty MountableFileSystem.
  */
class default () extends MountableFileSystem

/* static members */
@JSImport("browserfs/dist/node/backend/MountableFileSystem", JSImport.Default)
@js.native
object default extends js.Object {
  val Name: String = js.native
  val Options: FileSystemOptions = js.native
  /**
    * Creates a MountableFileSystem instance with the given options.
    */
  def Create(opts: MountableFileSystemOptions, cb: BFSCallback[MountableFileSystem]): Unit = js.native
  def isAvailable(): Boolean = js.native
}

