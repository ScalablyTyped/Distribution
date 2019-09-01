package typings.browserfs

import org.scalablytyped.runtime.Instantiable1
import typings.browserfs.distNodeBackendEmscriptenMod.EmscriptenFileSystem
import typings.browserfs.distNodeBackendEmscriptenMod.EmscriptenFileSystemOptions
import typings.browserfs.distNodeBackendEmscriptenMod.default
import typings.browserfs.distNodeCoreFileUnderscoreSystemMod.BFSCallback
import typings.browserfs.distNodeCoreFileUnderscoreSystemMod.FileSystemOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassEmscripten
  extends Instantiable1[/* _FS */ js.Any, default] {
  val Name: String = js.native
  val Options: FileSystemOptions = js.native
  /**
    * Create an EmscriptenFileSystem instance with the given options.
    */
  def Create(opts: EmscriptenFileSystemOptions, cb: BFSCallback[EmscriptenFileSystem]): Unit = js.native
  def isAvailable(): Boolean = js.native
}

