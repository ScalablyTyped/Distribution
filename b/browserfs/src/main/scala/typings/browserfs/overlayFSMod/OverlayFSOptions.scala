package typings.browserfs.overlayFSMod

import typings.browserfs.fileSystemMod.FileSystem
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
    val __obj = js.Dynamic.literal(readable = readable.asInstanceOf[js.Any], writable = writable.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverlayFSOptions]
  }
}

