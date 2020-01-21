package typings.debug

import typings.debug.mod.Debug
import typings.debug.mod.Debugger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDebug extends js.Object {
  @JSName("debug")
  var debug_Original: Debug = js.native
  @JSName("default")
  var default_Original: Debug = js.native
  def debug(namespace: String): Debugger = js.native
  def default(namespace: String): Debugger = js.native
}

