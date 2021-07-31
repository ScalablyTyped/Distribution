package typings.chunkedDc.jasmine

import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Spec
  extends StObject
     with SuiteOrSpec
     with Instantiable3[/* env */ Env, /* suite */ Suite, /* description */ String, js.Any] {
  
  def addBeforesAndAftersToQueue(): Unit = js.native
  
  def addMatcherResult(result: Result): Unit = js.native
  
  def addMatchers(matchersPrototype: CustomMatcherFactories): Unit = js.native
  
  def addToQueue(block: Block): Unit = js.native
  
  def after(doAfter: SpecFunction): Unit = js.native
  
  var afterCallbacks: js.Array[SpecFunction] = js.native
  
  def execute(): js.Any = js.native
  def execute(onComplete: js.Function0[Unit]): js.Any = js.native
  
  def expect(actual: js.Any): js.Any = js.native
  
  def explodes(): Unit = js.native
  
  def fail(): Unit = js.native
  def fail(e: js.Any): Unit = js.native
  
  def finish(): Unit = js.native
  def finish(onComplete: js.Function0[Unit]): Unit = js.native
  
  def finishCallback(): Unit = js.native
  
  def getFullName(): String = js.native
  
  def getMatchersClass_(): Matchers = js.native
  
  def log(arguments: js.Any): js.Any = js.native
  
  var matchersClass: Matchers = js.native
  
  def removeAllSpies(): Unit = js.native
  
  def results(): NestedResults = js.native
  
  var results_ : NestedResults = js.native
  
  def runs(func: SpecFunction): Spec = js.native
  
  var spies_ : js.Array[Spy] = js.native
  
  def spyOn(obj: js.Any, methodName: String, ignoreMethodDoesntExist: Boolean): Spy = js.native
  
  var suite: Suite = js.native
  
  def waits(timeout: Double): Spec = js.native
  
  def waitsFor(latchFunction: SpecFunction): Spec = js.native
  def waitsFor(latchFunction: SpecFunction, timeoutMessage: String): Spec = js.native
  def waitsFor(latchFunction: SpecFunction, timeoutMessage: String, timeout: Double): Spec = js.native
  def waitsFor(latchFunction: SpecFunction, timeoutMessage: Unit, timeout: Double): Spec = js.native
}
