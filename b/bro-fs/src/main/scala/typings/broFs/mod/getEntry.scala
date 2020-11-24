package typings.broFs.mod

import typings.filesystem.FileEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bro-fs", "getEntry")
@js.native
object getEntry extends js.Object {
  
  def apply(path: FileEntry): js.Promise[FileEntry] = js.native
}
