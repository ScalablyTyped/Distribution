package typings.browserfs.distNodeBackendOverlayFSMod

import typings.browserfs.distNodeCoreFileUnderscoreSystemMod.FileSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverlayFSOptions extends js.Object {
  var readable: FileSystem
  var writable: FileSystem
}

object OverlayFSOptions {
  @scala.inline
  def apply(readable: FileSystem, writable: FileSystem): OverlayFSOptions = {
    val __obj = js.Dynamic.literal(readable = readable, writable = writable)
  
    __obj.asInstanceOf[OverlayFSOptions]
  }
}

