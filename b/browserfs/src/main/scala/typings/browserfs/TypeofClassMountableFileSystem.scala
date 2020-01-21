package typings.browserfs

import org.scalablytyped.runtime.Instantiable0
import typings.browserfs.fileSystemMod.BFSCallback
import typings.browserfs.fileSystemMod.FileSystemOptions
import typings.browserfs.mountableFileSystemMod.MountableFileSystem
import typings.browserfs.mountableFileSystemMod.MountableFileSystemOptions
import typings.browserfs.mountableFileSystemMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassMountableFileSystem extends Instantiable0[default] {
  val Name: String = js.native
  val Options: FileSystemOptions = js.native
  /**
    * Creates a MountableFileSystem instance with the given options.
    */
  def Create(opts: MountableFileSystemOptions, cb: BFSCallback[MountableFileSystem]): Unit = js.native
  def isAvailable(): Boolean = js.native
}

