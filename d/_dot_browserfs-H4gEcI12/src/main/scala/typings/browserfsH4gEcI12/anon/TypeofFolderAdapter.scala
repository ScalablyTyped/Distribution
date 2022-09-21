package typings.browserfsH4gEcI12.anon

import org.scalablytyped.runtime.Instantiable2
import typings.browserfsH4gEcI12.fileSystemDTsMod.BFSCallback
import typings.browserfsH4gEcI12.fileSystemDTsMod.FileSystem
import typings.browserfsH4gEcI12.fileSystemDTsMod.FileSystemOptions
import typings.browserfsH4gEcI12.folderAdapterDTsMod.FolderAdapter
import typings.browserfsH4gEcI12.folderAdapterDTsMod.FolderAdapterOptions
import typings.browserfsH4gEcI12.folderAdapterDTsMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofFolderAdapter
  extends StObject
     with Instantiable2[/* folder */ String, /* wrapped */ FileSystem, default] {
  
  /**
    * Creates a FolderAdapter instance with the given options.
    */
  def Create(opts: FolderAdapterOptions, cb: BFSCallback[FolderAdapter]): Unit = js.native
  
  val Name: String = js.native
  
  val Options: FileSystemOptions = js.native
  
  def isAvailable(): Boolean = js.native
}
