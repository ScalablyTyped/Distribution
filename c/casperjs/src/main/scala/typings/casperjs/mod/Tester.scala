package typings.casperjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tester extends StObject {
  
  def assert(condition: Boolean): Any = js.native
  def assert(condition: Boolean, message: String): Any = js.native
  
  def assertDoesntExist(selector: String): Any = js.native
  def assertDoesntExist(selector: String, message: String): Any = js.native
  
  def assertElementCount(selctor: String, expected: Double): Any = js.native
  def assertElementCount(selctor: String, expected: Double, message: String): Any = js.native
  
  def assertEquals(testValue: Any, expected: Any): Any = js.native
  def assertEquals(testValue: Any, expected: Any, message: String): Any = js.native
  
  def assertEval(fn: js.Function, message: String, args: Any): Any = js.native
  
  def assertEvalEquals(fn: js.Function, expected: Any): Any = js.native
  def assertEvalEquals(fn: js.Function, expected: Any, message: String): Any = js.native
  def assertEvalEquals(fn: js.Function, expected: Any, message: String, args: Any): Any = js.native
  def assertEvalEquals(fn: js.Function, expected: Any, message: Unit, args: Any): Any = js.native
  
  def assertExists(selector: String): Any = js.native
  def assertExists(selector: String, message: String): Any = js.native
  
  def assertFalsy(subject: Any): Any = js.native
  def assertFalsy(subject: Any, message: String): Any = js.native
  
  def assertField(inputName: String, expected: String): Any = js.native
  def assertField(inputName: String, expected: String, message: String): Any = js.native
  
  def assertFieldCSS(cssSelector: String, expected: String): Any = js.native
  def assertFieldCSS(cssSelector: String, expected: String, message: String): Any = js.native
  
  def assertFieldName(inputName: String, expected: String): Any = js.native
  def assertFieldName(inputName: String, expected: String, message: String): Any = js.native
  def assertFieldName(inputName: String, expected: String, message: String, options: Any): Any = js.native
  def assertFieldName(inputName: String, expected: String, message: Unit, options: Any): Any = js.native
  
  def assertFieldXPath(xpathSelector: String, expected: String): Any = js.native
  def assertFieldXPath(xpathSelector: String, expected: String, message: String): Any = js.native
  
  def assertHttpStatus(status: Double): Any = js.native
  def assertHttpStatus(status: Double, message: String): Any = js.native
  
  def assertInstanceOf(input: Any, ctor: js.Function): Any = js.native
  def assertInstanceOf(input: Any, ctor: js.Function, message: String): Any = js.native
  
  def assertMatch(subject: Any, pattern: js.RegExp): Any = js.native
  def assertMatch(subject: Any, pattern: js.RegExp, message: String): Any = js.native
  
  def assertNot(subject: Any): Any = js.native
  def assertNot(subject: Any, message: String): Any = js.native
  
  def assertNotEquals(testValue: Any, expected: Any): Any = js.native
  def assertNotEquals(testValue: Any, expected: Any, message: String): Any = js.native
  
  def assertNotVisible(selector: String): Any = js.native
  def assertNotVisible(selector: String, message: String): Any = js.native
  
  def assertRaises(fn: js.Function, args: js.Array[Any]): Any = js.native
  def assertRaises(fn: js.Function, args: js.Array[Any], message: String): Any = js.native
  
  def assertResourceExists(testFx: js.Function): Any = js.native
  def assertResourceExists(testFx: js.Function, message: String): Any = js.native
  
  def assertSelectorDoesntHaveText(selector: String, text: String): Any = js.native
  def assertSelectorDoesntHaveText(selector: String, text: String, message: String): Any = js.native
  
  def assertSelectorExists(selector: String): Any = js.native
  def assertSelectorExists(selector: String, message: String): Any = js.native
  
  def assertSelectorHasText(selector: String, text: String): Any = js.native
  def assertSelectorHasText(selector: String, text: String, message: String): Any = js.native
  
  def assertTextDoesntExist(unexpected: String, message: String): Any = js.native
  
  def assertTextExists(expected: String): Any = js.native
  def assertTextExists(expected: String, message: String): Any = js.native
  
  def assertTitle(expected: String): Any = js.native
  def assertTitle(expected: String, message: String): Any = js.native
  
  def assertTitleMatch(pattern: js.RegExp): Any = js.native
  def assertTitleMatch(pattern: js.RegExp, message: String): Any = js.native
  
  def assertTruthy(subject: Any): Any = js.native
  def assertTruthy(subject: Any, message: String): Any = js.native
  
  def assertType(input: Any, `type`: String): Any = js.native
  def assertType(input: Any, `type`: String, message: String): Any = js.native
  
  def assertUrlMatch(pattern: String): Any = js.native
  def assertUrlMatch(pattern: String, message: String): Any = js.native
  def assertUrlMatch(pattern: js.RegExp): Any = js.native
  def assertUrlMatch(pattern: js.RegExp, message: String): Any = js.native
  
  def assertVisible(selector: String): Any = js.native
  def assertVisible(selector: String, message: String): Any = js.native
  
  def begin(description: String, config: js.Object): Any = js.native
  def begin(description: String, planned: Double, config: js.Object): Any = js.native
  /* since 1.1 */
  def begin(description: String, planned: Double, suite: js.Function): Any = js.native
  def begin(description: String, suite: js.Function): Any = js.native
  
  def colorize(message: String, style: String): Any = js.native
  
  def comment(message: String): Any = js.native
  
  def done(): Any = js.native
  def done(expected: Double): Any = js.native
  
  def error(message: String): Any = js.native
  
  def fail(message: String): Any = js.native
  
  def formatMessage(message: String, style: String): Any = js.native
  
  def getFailures(): Cases = js.native
  
  def getPasses(): Cases = js.native
  
  def info(message: String): Any = js.native
  
  def pass(message: String): Any = js.native
  
  def renderResults(exit: Boolean, status: Double, save: String): Any = js.native
  
  def setup(fn: js.Function): Any = js.native
  
  def skip(nb: Double, message: String): Any = js.native
  
  def tearDown(fn: js.Function): Any = js.native
}
