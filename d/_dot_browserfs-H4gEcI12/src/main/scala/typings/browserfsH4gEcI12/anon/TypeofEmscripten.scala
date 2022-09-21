package typings.browserfsH4gEcI12.anon

import org.scalablytyped.runtime.Instantiable1
import typings.browserfsH4gEcI12.emscriptenDTsMod.EmscriptenFileSystem
import typings.browserfsH4gEcI12.emscriptenDTsMod.EmscriptenFileSystemOptions
import typings.browserfsH4gEcI12.emscriptenDTsMod.default
import typings.browserfsH4gEcI12.fileSystemDTsMod.BFSCallback
import typings.browserfsH4gEcI12.fileSystemDTsMod.FileSystemOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofEmscripten
  extends StObject
     with Instantiable1[/* _FS */ Any, default] {
  
  /**
    * Create an EmscriptenFileSystem instance with the given options.
    */
  def Create(opts: EmscriptenFileSystemOptions, cb: BFSCallback[EmscriptenFileSystem]): Unit = js.native
  
  val Name: String = js.native
  
  val Options: FileSystemOptions = js.native
  
  def isAvailable(): Boolean = js.native
}
