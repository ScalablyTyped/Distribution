package typings.cypressCucumberPreprocessor

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cypress-cucumber-preprocessor/steps", JSImport.Namespace)
@js.native
object stepsMod extends js.Object {
  def After(optionsOrImplementation: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  def After(
    optionsOrImplementation: js.Function1[/* repeated */ js.Any, Unit],
    implementation: js.Function1[/* repeated */ js.Any, Unit]
  ): Unit = js.native
  def After(optionsOrImplementation: js.Object): Unit = js.native
  def After(optionsOrImplementation: js.Object, implementation: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  @JSName("And")
  def And_(expression: String, implementation: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  @JSName("And")
  def And_(expression: RegExp, implementation: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  def Before(optionsOrImplementation: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  def Before(
    optionsOrImplementation: js.Function1[/* repeated */ js.Any, Unit],
    implementation: js.Function1[/* repeated */ js.Any, Unit]
  ): Unit = js.native
  def Before(optionsOrImplementation: js.Object): Unit = js.native
  def Before(optionsOrImplementation: js.Object, implementation: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  @JSName("But")
  def But_(expression: String, implementation: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  @JSName("But")
  def But_(expression: RegExp, implementation: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  @JSName("Given")
  def Given_(expression: String, implementation: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  @JSName("Given")
  def Given_(expression: RegExp, implementation: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  @JSName("Then")
  def Then_(expression: String, implementation: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  @JSName("Then")
  def Then_(expression: RegExp, implementation: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  @JSName("When")
  def When_(expression: String, implementation: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  @JSName("When")
  def When_(expression: RegExp, implementation: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
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

