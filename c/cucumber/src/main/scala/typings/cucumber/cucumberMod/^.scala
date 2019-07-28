package typings.cucumber.cucumberMod

import org.scalablytyped.runtime.StringDictionary
import typings.cucumber.Anon_Attach
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cucumber", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def After(code: HookCode): Unit = js.native
  def After(options: String, code: HookCode): Unit = js.native
  def After(options: HookOptions, code: HookCode): Unit = js.native
  def AfterAll(code: GlobalHookCode): Unit = js.native
  def AfterAll(options: String, code: GlobalHookCode): Unit = js.native
  def AfterAll(options: HookOptions, code: GlobalHookCode): Unit = js.native
  def Before(code: HookCode): Unit = js.native
  def Before(options: String, code: HookCode): Unit = js.native
  def Before(options: HookOptions, code: HookCode): Unit = js.native
  def BeforeAll(code: GlobalHookCode): Unit = js.native
  def BeforeAll(options: String, code: GlobalHookCode): Unit = js.native
  def BeforeAll(options: HookOptions, code: GlobalHookCode): Unit = js.native
  def Given(pattern: String, code: StepDefinitionCode): Unit = js.native
  def Given(pattern: String, options: StepDefinitionOptions, code: StepDefinitionCode): Unit = js.native
  def Given(pattern: RegExp, code: StepDefinitionCode): Unit = js.native
  def Given(pattern: RegExp, options: StepDefinitionOptions, code: StepDefinitionCode): Unit = js.native
  def Listener(): EventListener = js.native
  def Then(pattern: String, code: StepDefinitionCode): Unit = js.native
  def Then(pattern: String, options: StepDefinitionOptions, code: StepDefinitionCode): Unit = js.native
  def Then(pattern: RegExp, code: StepDefinitionCode): Unit = js.native
  def Then(pattern: RegExp, options: StepDefinitionOptions, code: StepDefinitionCode): Unit = js.native
  def When(pattern: String, code: StepDefinitionCode): Unit = js.native
  def When(pattern: String, options: StepDefinitionOptions, code: StepDefinitionCode): Unit = js.native
  def When(pattern: RegExp, code: StepDefinitionCode): Unit = js.native
  def When(pattern: RegExp, options: StepDefinitionOptions, code: StepDefinitionCode): Unit = js.native
  def clearSupportCodeFns(): Unit = js.native
  def defineParameterType(transform: Transform): Unit = js.native
  def defineStep(pattern: String, code: StepDefinitionCode): Unit = js.native
  def defineStep(pattern: String, options: StepDefinitionOptions, code: StepDefinitionCode): Unit = js.native
  def defineStep(pattern: RegExp, code: StepDefinitionCode): Unit = js.native
  def defineStep(pattern: RegExp, options: StepDefinitionOptions, code: StepDefinitionCode): Unit = js.native
  def defineSupportCode(consumer: SupportCodeConsumer): Unit = js.native
  def getSupportCodeFns(): js.Array[SupportCodeConsumer] = js.native
  def setDefaultTimeout(time: Double): Unit = js.native
  def setDefinitionFunctionWrapper(fn: js.Function1[/* fn */ js.Function0[Unit], js.Function1[/* repeated */ _, _]]): Unit = js.native
  def setDefinitionFunctionWrapper(
    fn: js.Function2[
      /* fn */ js.Function0[Unit], 
      /* options */ js.UndefOr[StringDictionary[js.Any]], 
      js.Function1[/* repeated */ _, _]
    ]
  ): Unit = js.native
  def setWorldConstructor(world: js.Object): Unit = js.native
  def setWorldConstructor(world: js.ThisFunction1[/* this */ World, /* init */ Anon_Attach, Unit]): Unit = js.native
}

