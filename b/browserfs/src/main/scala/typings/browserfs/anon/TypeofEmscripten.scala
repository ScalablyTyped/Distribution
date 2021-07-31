package typings.browserfs.anon

import org.scalablytyped.runtime.Instantiable1
import typings.browserfs.emscriptenMod.EmscriptenFileSystem
import typings.browserfs.emscriptenMod.EmscriptenFileSystemOptions
import typings.browserfs.emscriptenMod.default
import typings.browserfs.fileSystemMod.BFSCallback
import typings.browserfs.fileSystemMod.FileSystemOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofEmscripten
  extends StObject
     with Instantiable1[/* _FS */ js.Any, default] {
  
  /**
    * Create an EmscriptenFileSystem instance with the given options.
    */
  def Create(opts: EmscriptenFileSystemOptions, cb: BFSCallback[EmscriptenFileSystem]): Unit = js.native
  
  val Name: String = js.native
  
  val Options: FileSystemOptions = js.native
  
  def isAvailable(): Boolean = js.native
}
