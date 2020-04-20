package typings.browserfs.asyncMirrorMod

import typings.browserfs.fileSystemMod.FileSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncMirrorOptions extends js.Object {
  var async: FileSystem
  var sync: FileSystem
}

object AsyncMirrorOptions {
  @scala.inline
  def apply(async: FileSystem, sync: FileSystem): AsyncMirrorOptions = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], sync = sync.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncMirrorOptions]
  }
}

