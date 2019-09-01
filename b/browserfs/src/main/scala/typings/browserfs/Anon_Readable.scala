package typings.browserfs

import typings.browserfs.distNodeCoreFileUnderscoreSystemMod.FileSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Readable extends js.Object {
  var readable: FileSystem
  var writable: FileSystem
}

object Anon_Readable {
  @scala.inline
  def apply(readable: FileSystem, writable: FileSystem): Anon_Readable = {
    val __obj = js.Dynamic.literal(readable = readable, writable = writable)
  
    __obj.asInstanceOf[Anon_Readable]
  }
}

