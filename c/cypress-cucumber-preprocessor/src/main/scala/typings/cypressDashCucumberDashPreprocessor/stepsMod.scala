package typings.cypressDashCucumberDashPreprocessor

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cypress-cucumber-preprocessor/steps", JSImport.Namespace)
@js.native
object stepsMod extends js.Object {
  def And(expression: String, implementation: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  def And(expression: RegExp, implementation: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  def But(expression: String, implementation: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  def But(expression: RegExp, implementation: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  def Given(expression: String, implementation: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  def Given(expression: RegExp, implementation: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  def Then(expression: String, implementation: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  def Then(expression: RegExp, implementation: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  def When(expression: String, implementation: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  def When(expression: RegExp, implementation: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  def and(expression: String, implementation: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  def and(expression: RegExp, implementation: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  def but(expression: String, implementation: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  def but(expression: RegExp, implementation: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  def defineParameterType(): Unit = js.native
  def defineStep(expression: String, implementation: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  def defineStep(expression: RegExp, implementation: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  def given(expression: String, implementation: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  def given(expression: RegExp, implementation: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  def `then`(expression: String, implementation: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  def `then`(expression: RegExp, implementation: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  def when(expression: String, implementation: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  def when(expression: RegExp, implementation: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
}

