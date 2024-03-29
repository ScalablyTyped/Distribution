package typings.browserfs.anon

import org.scalablytyped.runtime.Instantiable1
import typings.browserfs.distNodeBackendEmscriptenMod.EmscriptenFileSystem
import typings.browserfs.distNodeBackendEmscriptenMod.EmscriptenFileSystemOptions
import typings.browserfs.distNodeBackendEmscriptenMod.default
import typings.browserfs.distNodeCoreFileSystemMod.BFSCallback
import typings.browserfs.distNodeCoreFileSystemMod.FileSystemOptions
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
