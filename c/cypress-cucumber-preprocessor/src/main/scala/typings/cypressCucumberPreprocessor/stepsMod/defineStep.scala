package typings.cypressCucumberPreprocessor.stepsMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cypress-cucumber-preprocessor/steps", "defineStep")
@js.native
object defineStep extends js.Object {
  
  def apply(expression: String, implementation: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  def apply(expression: RegExp, implementation: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
}
