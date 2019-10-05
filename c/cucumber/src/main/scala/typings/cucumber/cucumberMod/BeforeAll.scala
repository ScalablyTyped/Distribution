package typings.cucumber.cucumberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cucumber", "BeforeAll")
@js.native
object BeforeAll extends js.Object {
  def apply(code: GlobalHookCode): Unit = js.native
  def apply(options: String, code: GlobalHookCode): Unit = js.native
  def apply(options: HookOptions, code: GlobalHookCode): Unit = js.native
}

