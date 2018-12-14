package typings
package cucumberLib.cucumberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cucumber", JSImport.Namespace)
@js.native
object cucumberModMembers extends js.Object {
  def After(code: HookCode): scala.Unit = js.native
  def After(options: HookOptions, code: HookCode): scala.Unit = js.native
  def After(options: java.lang.String, code: HookCode): scala.Unit = js.native
  def AfterAll(code: GlobalHookCode): scala.Unit = js.native
  def AfterAll(options: HookOptions, code: GlobalHookCode): scala.Unit = js.native
  def AfterAll(options: java.lang.String, code: GlobalHookCode): scala.Unit = js.native
  def Before(code: HookCode): scala.Unit = js.native
  def Before(options: HookOptions, code: HookCode): scala.Unit = js.native
  def Before(options: java.lang.String, code: HookCode): scala.Unit = js.native
  def BeforeAll(code: GlobalHookCode): scala.Unit = js.native
  def BeforeAll(options: HookOptions, code: GlobalHookCode): scala.Unit = js.native
  def BeforeAll(options: java.lang.String, code: GlobalHookCode): scala.Unit = js.native
  def Given(pattern: java.lang.String, code: StepDefinitionCode): scala.Unit = js.native
  def Given(pattern: java.lang.String, options: StepDefinitionOptions, code: StepDefinitionCode): scala.Unit = js.native
  def Given(pattern: stdLib.RegExp, code: StepDefinitionCode): scala.Unit = js.native
  def Given(pattern: stdLib.RegExp, options: StepDefinitionOptions, code: StepDefinitionCode): scala.Unit = js.native
  def Listener(): EventListener = js.native
  def Then(pattern: java.lang.String, code: StepDefinitionCode): scala.Unit = js.native
  def Then(pattern: java.lang.String, options: StepDefinitionOptions, code: StepDefinitionCode): scala.Unit = js.native
  def Then(pattern: stdLib.RegExp, code: StepDefinitionCode): scala.Unit = js.native
  def Then(pattern: stdLib.RegExp, options: StepDefinitionOptions, code: StepDefinitionCode): scala.Unit = js.native
  def When(pattern: java.lang.String, code: StepDefinitionCode): scala.Unit = js.native
  def When(pattern: java.lang.String, options: StepDefinitionOptions, code: StepDefinitionCode): scala.Unit = js.native
  def When(pattern: stdLib.RegExp, code: StepDefinitionCode): scala.Unit = js.native
  def When(pattern: stdLib.RegExp, options: StepDefinitionOptions, code: StepDefinitionCode): scala.Unit = js.native
  def clearSupportCodeFns(): scala.Unit = js.native
  def defineParameterType(transform: Transform): scala.Unit = js.native
  def defineStep(pattern: java.lang.String, code: StepDefinitionCode): scala.Unit = js.native
  def defineStep(pattern: java.lang.String, options: StepDefinitionOptions, code: StepDefinitionCode): scala.Unit = js.native
  def defineStep(pattern: stdLib.RegExp, code: StepDefinitionCode): scala.Unit = js.native
  def defineStep(pattern: stdLib.RegExp, options: StepDefinitionOptions, code: StepDefinitionCode): scala.Unit = js.native
  def defineSupportCode(consumer: SupportCodeConsumer): scala.Unit = js.native
  def getSupportCodeFns(): js.Array[SupportCodeConsumer] = js.native
  def setDefaultTimeout(time: scala.Double): scala.Unit = js.native
  def setDefinitionFunctionWrapper(fn: js.Function0[scala.Unit]): scala.Unit = js.native
  def setDefinitionFunctionWrapper(fn: js.Function0[scala.Unit], options: org.scalablytyped.runtime.StringDictionary[js.Any]): scala.Unit = js.native
  def setWorldConstructor(world: js.Object): scala.Unit = js.native
  def setWorldConstructor(world: js.ThisFunction1[/* this */ World, /* init */ cucumberLib.Anon_Parameters, scala.Unit]): scala.Unit = js.native
}

