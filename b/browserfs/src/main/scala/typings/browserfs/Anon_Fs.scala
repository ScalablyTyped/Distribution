package typings.browserfs

import typings.browserfs.distNodeCoreFileUnderscoreSystemMod.FileSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fs extends js.Object {
  var fs: FileSystem
  var path: String
}

object Anon_Fs {
  @scala.inline
  def apply(fs: FileSystem, path: String): Anon_Fs = {
    val __obj = js.Dynamic.literal(fs = fs.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Fs]
  }
}

