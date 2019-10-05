package typings.cucumber.cucumberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cucumber", "Before")
@js.native
object Before extends js.Object {
  def apply(code: HookCode): Unit = js.native
  def apply(options: String, code: HookCode): Unit = js.native
  def apply(options: HookOptions, code: HookCode): Unit = js.native
}

