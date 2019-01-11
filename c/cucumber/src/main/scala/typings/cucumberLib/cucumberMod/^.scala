package typings
package cucumberLib.cucumberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cucumber", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def After(code: cucumberLib.cucumberMod.HookCode): scala.Unit = js.native
  def After(options: cucumberLib.cucumberMod.HookOptions, code: cucumberLib.cucumberMod.HookCode): scala.Unit = js.native
  def After(options: java.lang.String, code: cucumberLib.cucumberMod.HookCode): scala.Unit = js.native
  def AfterAll(code: cucumberLib.cucumberMod.GlobalHookCode): scala.Unit = js.native
  def AfterAll(options: cucumberLib.cucumberMod.HookOptions, code: cucumberLib.cucumberMod.GlobalHookCode): scala.Unit = js.native
  def AfterAll(options: java.lang.String, code: cucumberLib.cucumberMod.GlobalHookCode): scala.Unit = js.native
  def Before(code: cucumberLib.cucumberMod.HookCode): scala.Unit = js.native
  def Before(options: cucumberLib.cucumberMod.HookOptions, code: cucumberLib.cucumberMod.HookCode): scala.Unit = js.native
  def Before(options: java.lang.String, code: cucumberLib.cucumberMod.HookCode): scala.Unit = js.native
  def BeforeAll(code: cucumberLib.cucumberMod.GlobalHookCode): scala.Unit = js.native
  def BeforeAll(options: cucumberLib.cucumberMod.HookOptions, code: cucumberLib.cucumberMod.GlobalHookCode): scala.Unit = js.native
  def BeforeAll(options: java.lang.String, code: cucumberLib.cucumberMod.GlobalHookCode): scala.Unit = js.native
  def Given(pattern: java.lang.String, code: cucumberLib.cucumberMod.StepDefinitionCode): scala.Unit = js.native
  def Given(
    pattern: java.lang.String,
    options: cucumberLib.cucumberMod.StepDefinitionOptions,
    code: cucumberLib.cucumberMod.StepDefinitionCode
  ): scala.Unit = js.native
  def Given(pattern: stdLib.RegExp, code: cucumberLib.cucumberMod.StepDefinitionCode): scala.Unit = js.native
  def Given(
    pattern: stdLib.RegExp,
    options: cucumberLib.cucumberMod.StepDefinitionOptions,
    code: cucumberLib.cucumberMod.StepDefinitionCode
  ): scala.Unit = js.native
  def Listener(): cucumberLib.cucumberMod.EventListener = js.native
  def Then(pattern: java.lang.String, code: cucumberLib.cucumberMod.StepDefinitionCode): scala.Unit = js.native
  def Then(
    pattern: java.lang.String,
    options: cucumberLib.cucumberMod.StepDefinitionOptions,
    code: cucumberLib.cucumberMod.StepDefinitionCode
  ): scala.Unit = js.native
  def Then(pattern: stdLib.RegExp, code: cucumberLib.cucumberMod.StepDefinitionCode): scala.Unit = js.native
  def Then(
    pattern: stdLib.RegExp,
    options: cucumberLib.cucumberMod.StepDefinitionOptions,
    code: cucumberLib.cucumberMod.StepDefinitionCode
  ): scala.Unit = js.native
  def When(pattern: java.lang.String, code: cucumberLib.cucumberMod.StepDefinitionCode): scala.Unit = js.native
  def When(
    pattern: java.lang.String,
    options: cucumberLib.cucumberMod.StepDefinitionOptions,
    code: cucumberLib.cucumberMod.StepDefinitionCode
  ): scala.Unit = js.native
  def When(pattern: stdLib.RegExp, code: cucumberLib.cucumberMod.StepDefinitionCode): scala.Unit = js.native
  def When(
    pattern: stdLib.RegExp,
    options: cucumberLib.cucumberMod.StepDefinitionOptions,
    code: cucumberLib.cucumberMod.StepDefinitionCode
  ): scala.Unit = js.native
  def clearSupportCodeFns(): scala.Unit = js.native
  def defineParameterType(transform: cucumberLib.cucumberMod.Transform): scala.Unit = js.native
  def defineStep(pattern: java.lang.String, code: cucumberLib.cucumberMod.StepDefinitionCode): scala.Unit = js.native
  def defineStep(
    pattern: java.lang.String,
    options: cucumberLib.cucumberMod.StepDefinitionOptions,
    code: cucumberLib.cucumberMod.StepDefinitionCode
  ): scala.Unit = js.native
  def defineStep(pattern: stdLib.RegExp, code: cucumberLib.cucumberMod.StepDefinitionCode): scala.Unit = js.native
  def defineStep(
    pattern: stdLib.RegExp,
    options: cucumberLib.cucumberMod.StepDefinitionOptions,
    code: cucumberLib.cucumberMod.StepDefinitionCode
  ): scala.Unit = js.native
  def defineSupportCode(consumer: cucumberLib.cucumberMod.SupportCodeConsumer): scala.Unit = js.native
  def getSupportCodeFns(): js.Array[cucumberLib.cucumberMod.SupportCodeConsumer] = js.native
  def setDefaultTimeout(time: scala.Double): scala.Unit = js.native
  def setDefinitionFunctionWrapper(fn: js.Function0[scala.Unit]): scala.Unit = js.native
  def setDefinitionFunctionWrapper(fn: js.Function0[scala.Unit], options: org.scalablytyped.runtime.StringDictionary[js.Any]): scala.Unit = js.native
  def setWorldConstructor(world: js.Object): scala.Unit = js.native
  def setWorldConstructor(
    world: js.ThisFunction1[
      /* this */ cucumberLib.cucumberMod.World, 
      /* init */ cucumberLib.Anon_Attach, 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

