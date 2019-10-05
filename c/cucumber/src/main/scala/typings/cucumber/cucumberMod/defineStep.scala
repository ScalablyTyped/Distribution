package typings.cucumber.cucumberMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cucumber", "defineStep")
@js.native
object defineStep extends js.Object {
  def apply(pattern: String, code: StepDefinitionCode): Unit = js.native
  def apply(pattern: String, options: StepDefinitionOptions, code: StepDefinitionCode): Unit = js.native
  def apply(pattern: RegExp, code: StepDefinitionCode): Unit = js.native
  def apply(pattern: RegExp, options: StepDefinitionOptions, code: StepDefinitionCode): Unit = js.native
}

