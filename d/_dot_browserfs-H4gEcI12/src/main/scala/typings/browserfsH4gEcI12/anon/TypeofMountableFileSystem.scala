package typings.browserfsH4gEcI12.anon

import org.scalablytyped.runtime.Instantiable0
import typings.browserfsH4gEcI12.fileSystemDTsMod.BFSCallback
import typings.browserfsH4gEcI12.fileSystemDTsMod.FileSystemOptions
import typings.browserfsH4gEcI12.mountableFileSystemDTsMod.MountableFileSystem
import typings.browserfsH4gEcI12.mountableFileSystemDTsMod.MountableFileSystemOptions
import typings.browserfsH4gEcI12.mountableFileSystemDTsMod.default
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
