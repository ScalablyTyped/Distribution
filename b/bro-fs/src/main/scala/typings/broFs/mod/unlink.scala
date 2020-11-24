package typings.broFs.mod

import typings.filesystem.FileEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bro-fs", "unlink")
@js.native
object unlink extends js.Object {
  
  def apply(path: String): js.Promise[Boolean] = js.native
  def apply(path: FileEntry): js.Promise[Boolean] = js.native
}
