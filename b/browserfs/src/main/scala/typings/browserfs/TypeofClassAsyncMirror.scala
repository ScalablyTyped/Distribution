package typings.browserfs

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.browserfs.distNodeBackendAsyncMirrorMod.AsyncMirror
import typings.browserfs.distNodeBackendAsyncMirrorMod.AsyncMirrorOptions
import typings.browserfs.distNodeBackendAsyncMirrorMod.default
import typings.browserfs.distNodeCoreFileUnderscoreSystemMod.BFSCallback
import typings.browserfs.distNodeCoreFileUnderscoreSystemMod.FileSystem
import typings.browserfs.distNodeCoreFileUnderscoreSystemMod.FileSystemOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassAsyncMirror
  extends Instantiable2[/* sync */ FileSystem, /* async */ FileSystem, default]
     with Instantiable3[/* sync */ FileSystem, /* async */ FileSystem, /* deprecateMsg */ Boolean, default] {
  val Name: String = js.native
  val Options: FileSystemOptions = js.native
  /**
    * Constructs and initializes an AsyncMirror file system with the given options.
    */
  def Create(opts: AsyncMirrorOptions, cb: BFSCallback[AsyncMirror]): Unit = js.native
  def isAvailable(): Boolean = js.native
}

