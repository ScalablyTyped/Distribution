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
    val __obj = js.Dynamic.literal(fs = fs, path = path)
  
    __obj.asInstanceOf[Anon_Fs]
  }
}

