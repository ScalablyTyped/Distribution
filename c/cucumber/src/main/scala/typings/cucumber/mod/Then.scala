package typings.cucumber.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cucumber", "Then")
@js.native
object Then extends js.Object {
  
  def apply(pattern: String, code: StepDefinitionCode): Unit = js.native
  def apply(pattern: String, options: StepDefinitionOptions, code: StepDefinitionCode): Unit = js.native
  def apply(pattern: RegExp, code: StepDefinitionCode): Unit = js.native
  def apply(pattern: RegExp, options: StepDefinitionOptions, code: StepDefinitionCode): Unit = js.native
}
