package typings.debug.debugMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Debugger extends js.Object {
  var enabled: Boolean = js.native
  var namespace: String = js.native
  def apply(formatter: js.Any, args: js.Any*): Unit = js.native
  def destroy(): Boolean = js.native
  def extend(namespace: String): Debugger = js.native
  def extend(namespace: String, delimiter: String): Debugger = js.native
  def log(args: js.Any*): js.Any = js.native
}

