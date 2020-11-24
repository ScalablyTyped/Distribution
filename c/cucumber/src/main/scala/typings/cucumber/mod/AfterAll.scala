package typings.cucumber.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cucumber", "AfterAll")
@js.native
object AfterAll extends js.Object {
  
  def apply(code: GlobalHookCode): Unit = js.native
  def apply(options: String, code: GlobalHookCode): Unit = js.native
  def apply(options: HookOptions, code: GlobalHookCode): Unit = js.native
}
