package typings.browserfs

import typings.browserfs.fileSystemMod.FileSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFs extends js.Object {
  var fs: FileSystem
  var path: String
}

object AnonFs {
  @scala.inline
  def apply(fs: FileSystem, path: String): AnonFs = {
    val __obj = js.Dynamic.literal(fs = fs.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFs]
  }
}

