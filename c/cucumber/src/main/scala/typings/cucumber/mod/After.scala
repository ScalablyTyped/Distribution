package typings.cucumber.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cucumber", "After")
@js.native
object After extends js.Object {
  def apply(code: HookCode): Unit = js.native
  def apply(options: String, code: HookCode): Unit = js.native
  def apply(options: HookOptions, code: HookCode): Unit = js.native
}

