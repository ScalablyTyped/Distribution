package typings.browserfs.anon

import org.scalablytyped.runtime.Instantiable0
import typings.browserfs.distNodeBackendMountableFileSystemMod.MountableFileSystem
import typings.browserfs.distNodeBackendMountableFileSystemMod.MountableFileSystemOptions
import typings.browserfs.distNodeBackendMountableFileSystemMod.default
import typings.browserfs.distNodeCoreFileSystemMod.BFSCallback
import typings.browserfs.distNodeCoreFileSystemMod.FileSystemOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofMountableFileSystem
  extends StObject
     with Instantiable0[default] {
  
  /**
    * Creates a MountableFileSystem instance with the given options.
    */
  def Create(opts: MountableFileSystemOptions, cb: BFSCallback[MountableFileSystem]): Unit = js.native
  
  val Name: String = js.native
  
  val Options: FileSystemOptions = js.native
  
  def isAvailable(): Boolean = js.native
}
