package typings.browserfs

import org.scalablytyped.runtime.Instantiable1
import typings.browserfs.emscriptenMod.EmscriptenFileSystem
import typings.browserfs.emscriptenMod.EmscriptenFileSystemOptions
import typings.browserfs.emscriptenMod.default
import typings.browserfs.fileSystemMod.BFSCallback
import typings.browserfs.fileSystemMod.FileSystemOptions
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

