package typings.browserfs.anon

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.browserfs.distNodeBackendAsyncMirrorMod.AsyncMirrorOptions
import typings.browserfs.distNodeBackendAsyncMirrorMod.default
import typings.browserfs.distNodeCoreFileSystemMod.BFSCallback
import typings.browserfs.distNodeCoreFileSystemMod.FileSystem
import typings.browserfs.distNodeCoreFileSystemMod.FileSystemOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofAsyncMirror
  extends StObject
     with Instantiable2[/* sync */ FileSystem, /* async */ FileSystem, default]
     with Instantiable3[/* sync */ FileSystem, /* async */ FileSystem, /* deprecateMsg */ Boolean, default] {
  
  /**
    * Constructs and initializes an AsyncMirror file system with the given options.
    */
  def Create(
    opts: AsyncMirrorOptions,
    cb: BFSCallback[typings.browserfs.distNodeBackendAsyncMirrorMod.AsyncMirror]
  ): Unit = js.native
  
  val Name: String = js.native
  
  val Options: FileSystemOptions = js.native
  
  def isAvailable(): Boolean = js.native
}
