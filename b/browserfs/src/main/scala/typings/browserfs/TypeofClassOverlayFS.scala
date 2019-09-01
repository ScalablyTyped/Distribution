package typings.browserfs

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.browserfs.distNodeBackendOverlayFSMod.OverlayFS
import typings.browserfs.distNodeBackendOverlayFSMod.OverlayFSOptions
import typings.browserfs.distNodeBackendOverlayFSMod.default
import typings.browserfs.distNodeCoreFileUnderscoreSystemMod.BFSCallback
import typings.browserfs.distNodeCoreFileUnderscoreSystemMod.FileSystem
import typings.browserfs.distNodeCoreFileUnderscoreSystemMod.FileSystemOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassOverlayFS
  extends Instantiable2[/* writable */ FileSystem, /* readable */ FileSystem, default]
     with Instantiable3[
      /* writable */ FileSystem, 
      /* readable */ FileSystem, 
      /* deprecateMsg */ Boolean, 
      default
    ] {
  val Name: String = js.native
  val Options: FileSystemOptions = js.native
  /**
    * Constructs and initializes an OverlayFS instance with the given options.
    */
  def Create(opts: OverlayFSOptions, cb: BFSCallback[OverlayFS]): Unit = js.native
  def isAvailable(): Boolean = js.native
}

