package typings.browserfs.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.browserfs.fileSystemMod.BFSCallback
import typings.browserfs.fileSystemMod.FileSystemOptions
import typings.browserfs.indexedDBMod.IndexedDBFileSystem
import typings.browserfs.indexedDBMod.IndexedDBFileSystemOptions
import typings.browserfs.indexedDBMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofIndexedDB
  extends Instantiable1[/* cb */ BFSCallback[IndexedDBFileSystem], default]
     with Instantiable2[/* cb */ BFSCallback[IndexedDBFileSystem], /* storeName */ String, default]
     with Instantiable3[
      /* cb */ BFSCallback[IndexedDBFileSystem], 
      js.UndefOr[/* storeName */ String], 
      /* deprecateMsg */ Boolean, 
      default
    ] {
  
  /**
    * Constructs an IndexedDB file system with the given options.
    */
  def Create(opts: IndexedDBFileSystemOptions, cb: BFSCallback[IndexedDBFileSystem]): Unit = js.native
  
  val Name: String = js.native
  
  val Options: FileSystemOptions = js.native
  
  def isAvailable(): Boolean = js.native
}
