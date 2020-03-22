package typings.cypressCucumberPreprocessor.stepsMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cypress-cucumber-preprocessor/steps", "when")
@js.native
object when extends js.Object {
  def apply(expression: String, implementation: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  def apply(expression: RegExp, implementation: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
}

