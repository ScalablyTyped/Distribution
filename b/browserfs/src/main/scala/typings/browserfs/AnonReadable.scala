package typings.browserfs

import typings.browserfs.fileSystemMod.FileSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReadable extends js.Object {
  var readable: FileSystem
  var writable: FileSystem
}

object AnonReadable {
  @scala.inline
  def apply(readable: FileSystem, writable: FileSystem): AnonReadable = {
    val __obj = js.Dynamic.literal(readable = readable.asInstanceOf[js.Any], writable = writable.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonReadable]
  }
}

