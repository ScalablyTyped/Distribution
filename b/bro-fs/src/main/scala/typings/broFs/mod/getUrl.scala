package typings.broFs.mod

import typings.filesystem.FileEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bro-fs", "getUrl")
@js.native
object getUrl extends js.Object {
  
  def apply(path: String): js.Promise[String] = js.native
  def apply(path: FileEntry): js.Promise[String] = js.native
}
