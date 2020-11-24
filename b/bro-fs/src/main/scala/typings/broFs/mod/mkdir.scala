package typings.broFs.mod

import typings.filesystem.DirectoryEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bro-fs", "mkdir")
@js.native
object mkdir extends js.Object {
  
  def apply(path: String): js.Promise[DirectoryEntry] = js.native
}
