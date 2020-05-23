package typings.browserfs.anon

import typings.browserfs.fileSystemMod.FileSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Readable extends js.Object {
  var readable: FileSystem
  var writable: FileSystem
}

object Readable {
  @scala.inline
  def apply(readable: FileSystem, writable: FileSystem): Readable = {
    val __obj = js.Dynamic.literal(readable = readable.asInstanceOf[js.Any], writable = writable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Readable]
  }
}

