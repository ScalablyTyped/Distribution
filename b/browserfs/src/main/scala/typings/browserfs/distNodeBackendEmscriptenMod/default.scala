package typings.browserfs.distNodeBackendEmscriptenMod

import typings.browserfs.distNodeCoreFileUnderscoreSystemMod.BFSCallback
import typings.browserfs.distNodeCoreFileUnderscoreSystemMod.FileSystemOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browserfs/dist/node/backend/Emscripten", JSImport.Default)
@js.native
class default protected () extends EmscriptenFileSystem {
  /**
    * Creates a BrowserFS file system for the given Emscripten file system.
    * @param _FS The Emscripten file system (`FS`).
    */
  def this(_FS: js.Any) = this()
}

/* static members */
@JSImport("browserfs/dist/node/backend/Emscripten", JSImport.Default)
@js.native
object default extends js.Object {
  val Name: String = js.native
  val Options: FileSystemOptions = js.native
  /**
    * Create an EmscriptenFileSystem instance with the given options.
    */
  def Create(opts: EmscriptenFileSystemOptions, cb: BFSCallback[EmscriptenFileSystem]): Unit = js.native
  def isAvailable(): Boolean = js.native
}

