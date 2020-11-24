package typings.cucumber.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cucumber", "BeforeAll")
@js.native
object BeforeAll extends js.Object {
  
  def apply(code: GlobalHookCode): Unit = js.native
  def apply(options: String, code: GlobalHookCode): Unit = js.native
  def apply(options: HookOptions, code: GlobalHookCode): Unit = js.native
}
