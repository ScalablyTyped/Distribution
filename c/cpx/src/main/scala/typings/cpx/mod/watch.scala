package typings.cpx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cpx", "watch")
@js.native
object watch extends js.Object {
  
  def apply(source: String, dest: String): Watcher = js.native
  def apply(source: String, dest: String, options: WatchOptions): Watcher = js.native
}
