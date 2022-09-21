package typings.browserfsH4gEcI12.anon

import org.scalablytyped.runtime.Instantiable0
import typings.browserfsH4gEcI12.fileSystemDTsMod.BFSCallback
import typings.browserfsH4gEcI12.fileSystemDTsMod.FileSystemOptions
import typings.browserfsH4gEcI12.localStorageDTsMod.LocalStorageFileSystem
import typings.browserfsH4gEcI12.localStorageDTsMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofLocalStorage
  extends StObject
     with Instantiable0[default] {
  
  /**
    * Creates a LocalStorageFileSystem instance.
    */
  def Create(options: Any, cb: BFSCallback[LocalStorageFileSystem]): Unit = js.native
  
  val Name: String = js.native
  
  val Options: FileSystemOptions = js.native
  
  def isAvailable(): Boolean = js.native
}
