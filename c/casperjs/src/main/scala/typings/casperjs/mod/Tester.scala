package typings.casperjs.mod

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tester extends StObject {
  
  def assert(condition: Boolean): js.Any = js.native
  def assert(condition: Boolean, message: String): js.Any = js.native
  
  def assertDoesntExist(selector: String): js.Any = js.native
  def assertDoesntExist(selector: String, message: String): js.Any = js.native
  
  def assertElementCount(selctor: String, expected: Double): js.Any = js.native
  def assertElementCount(selctor: String, expected: Double, message: String): js.Any = js.native
  
  def assertEquals(testValue: js.Any, expected: js.Any): js.Any = js.native
  def assertEquals(testValue: js.Any, expected: js.Any, message: String): js.Any = js.native
  
  def assertEval(fn: js.Function, message: String, args: js.Any): js.Any = js.native
  
  def assertEvalEquals(fn: js.Function, expected: js.Any): js.Any = js.native
  def assertEvalEquals(fn: js.Function, expected: js.Any, message: js.UndefOr[scala.Nothing], args: js.Any): js.Any = js.native
  def assertEvalEquals(fn: js.Function, expected: js.Any, message: String): js.Any = js.native
  def assertEvalEquals(fn: js.Function, expected: js.Any, message: String, args: js.Any): js.Any = js.native
  
  def assertExists(selector: String): js.Any = js.native
  def assertExists(selector: String, message: String): js.Any = js.native
  
  def assertFalsy(subject: js.Any): js.Any = js.native
  def assertFalsy(subject: js.Any, message: String): js.Any = js.native
  
  def assertField(inputName: String, expected: String): js.Any = js.native
  def assertField(inputName: String, expected: String, message: String): js.Any = js.native
  
  def assertFieldCSS(cssSelector: String, expected: String): js.Any = js.native
  def assertFieldCSS(cssSelector: String, expected: String, message: String): js.Any = js.native
  
  def assertFieldName(inputName: String, expected: String): js.Any = js.native
  def assertFieldName(inputName: String, expected: String, message: js.UndefOr[scala.Nothing], options: js.Any): js.Any = js.native
  def assertFieldName(inputName: String, expected: String, message: String): js.Any = js.native
  def assertFieldName(inputName: String, expected: String, message: String, options: js.Any): js.Any = js.native
  
  def assertFieldXPath(xpathSelector: String, expected: String): js.Any = js.native
  def assertFieldXPath(xpathSelector: String, expected: String, message: String): js.Any = js.native
  
  def assertHttpStatus(status: Double): js.Any = js.native
  def assertHttpStatus(status: Double, message: String): js.Any = js.native
  
  def assertInstanceOf(input: js.Any, ctor: js.Function): js.Any = js.native
  def assertInstanceOf(input: js.Any, ctor: js.Function, message: String): js.Any = js.native
  
  def assertMatch(subject: js.Any, pattern: RegExp): js.Any = js.native
  def assertMatch(subject: js.Any, pattern: RegExp, message: String): js.Any = js.native
  
  def assertNot(subject: js.Any): js.Any = js.native
  def assertNot(subject: js.Any, message: String): js.Any = js.native
  
  def assertNotEquals(testValue: js.Any, expected: js.Any): js.Any = js.native
  def assertNotEquals(testValue: js.Any, expected: js.Any, message: String): js.Any = js.native
  
  def assertNotVisible(selector: String): js.Any = js.native
  def assertNotVisible(selector: String, message: String): js.Any = js.native
  
  def assertRaises(fn: js.Function, args: js.Array[_]): js.Any = js.native
  def assertRaises(fn: js.Function, args: js.Array[_], message: String): js.Any = js.native
  
  def assertResourceExists(testFx: js.Function): js.Any = js.native
  def assertResourceExists(testFx: js.Function, message: String): js.Any = js.native
  
  def assertSelectorDoesntHaveText(selector: String, text: String): js.Any = js.native
  def assertSelectorDoesntHaveText(selector: String, text: String, message: String): js.Any = js.native
  
  def assertSelectorExists(selector: String): js.Any = js.native
  def assertSelectorExists(selector: String, message: String): js.Any = js.native
  
  def assertSelectorHasText(selector: String, text: String): js.Any = js.native
  def assertSelectorHasText(selector: String, text: String, message: String): js.Any = js.native
  
  def assertTextDoesntExist(unexpected: String, message: String): js.Any = js.native
  
  def assertTextExists(expected: String): js.Any = js.native
  def assertTextExists(expected: String, message: String): js.Any = js.native
  
  def assertTitle(expected: String): js.Any = js.native
  def assertTitle(expected: String, message: String): js.Any = js.native
  
  def assertTitleMatch(pattern: RegExp): js.Any = js.native
  def assertTitleMatch(pattern: RegExp, message: String): js.Any = js.native
  
  def assertTruthy(subject: js.Any): js.Any = js.native
  def assertTruthy(subject: js.Any, message: String): js.Any = js.native
  
  def assertType(input: js.Any, `type`: String): js.Any = js.native
  def assertType(input: js.Any, `type`: String, message: String): js.Any = js.native
  
  def assertUrlMatch(pattern: String): js.Any = js.native
  def assertUrlMatch(pattern: String, message: String): js.Any = js.native
  def assertUrlMatch(pattern: RegExp): js.Any = js.native
  def assertUrlMatch(pattern: RegExp, message: String): js.Any = js.native
  
  def assertVisible(selector: String): js.Any = js.native
  def assertVisible(selector: String, message: String): js.Any = js.native
  
  def begin(description: String, config: js.Object): js.Any = js.native
  def begin(description: String, planned: Double, config: js.Object): js.Any = js.native
  /* since 1.1 */
  def begin(description: String, planned: Double, suite: js.Function): js.Any = js.native
  def begin(description: String, suite: js.Function): js.Any = js.native
  
  def colorize(message: String, style: String): js.Any = js.native
  
  def comment(message: String): js.Any = js.native
  
  def done(): js.Any = js.native
  def done(expected: Double): js.Any = js.native
  
  def error(message: String): js.Any = js.native
  
  def fail(message: String): js.Any = js.native
  
  def formatMessage(message: String, style: String): js.Any = js.native
  
  def getFailures(): Cases = js.native
  
  def getPasses(): Cases = js.native
  
  def info(message: String): js.Any = js.native
  
  def pass(message: String): js.Any = js.native
  
  def renderResults(exit: Boolean, status: Double, save: String): js.Any = js.native
  
  def setup(fn: js.Function): js.Any = js.native
  
  def skip(nb: Double, message: String): js.Any = js.native
  
  def tearDown(fn: js.Function): js.Any = js.native
}
