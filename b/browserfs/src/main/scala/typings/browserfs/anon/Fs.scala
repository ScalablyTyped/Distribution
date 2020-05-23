package typings.browserfs.anon

import typings.browserfs.fileSystemMod.FileSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fs extends js.Object {
  var fs: FileSystem
  var path: String
}

object Fs {
  @scala.inline
  def apply(fs: FileSystem, path: String): Fs = {
    val __obj = js.Dynamic.literal(fs = fs.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fs]
  }
}

