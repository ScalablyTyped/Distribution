package typings.browserfs.anon

import org.scalablytyped.runtime.Instantiable0
import typings.browserfs.distNodeBackendInMemoryMod.InMemoryFileSystem
import typings.browserfs.distNodeBackendInMemoryMod.default
import typings.browserfs.distNodeCoreFileSystemMod.BFSCallback
import typings.browserfs.distNodeCoreFileSystemMod.FileSystemOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofInMemory
  extends StObject
     with Instantiable0[default] {
  
  /**
    * Creates an InMemoryFileSystem instance.
    */
  def Create(options: Any, cb: BFSCallback[InMemoryFileSystem]): Unit = js.native
  
  val Name: String = js.native
  
  val Options: FileSystemOptions = js.native
}
