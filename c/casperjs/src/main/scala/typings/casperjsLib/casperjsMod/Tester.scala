package typings
package casperjsLib.casperjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tester extends js.Object {
  def assert(condition: scala.Boolean): js.Any = js.native
  def assert(condition: scala.Boolean, message: java.lang.String): js.Any = js.native
  def assertDoesntExist(selector: java.lang.String): js.Any = js.native
  def assertDoesntExist(selector: java.lang.String, message: java.lang.String): js.Any = js.native
  def assertElementCount(selctor: java.lang.String, expected: scala.Double): js.Any = js.native
  def assertElementCount(selctor: java.lang.String, expected: scala.Double, message: java.lang.String): js.Any = js.native
  def assertEquals(testValue: js.Any, expected: js.Any): js.Any = js.native
  def assertEquals(testValue: js.Any, expected: js.Any, message: java.lang.String): js.Any = js.native
  def assertEval(fn: js.Function, message: java.lang.String, args: js.Any): js.Any = js.native
  def assertEvalEquals(fn: js.Function, expected: js.Any): js.Any = js.native
  def assertEvalEquals(fn: js.Function, expected: js.Any, message: java.lang.String): js.Any = js.native
  def assertEvalEquals(fn: js.Function, expected: js.Any, message: java.lang.String, args: js.Any): js.Any = js.native
  def assertExists(selector: java.lang.String): js.Any = js.native
  def assertExists(selector: java.lang.String, message: java.lang.String): js.Any = js.native
  def assertFalsy(subject: js.Any): js.Any = js.native
  def assertFalsy(subject: js.Any, message: java.lang.String): js.Any = js.native
  def assertField(inputName: java.lang.String, expected: java.lang.String): js.Any = js.native
  def assertField(inputName: java.lang.String, expected: java.lang.String, message: java.lang.String): js.Any = js.native
  def assertFieldCSS(cssSelector: java.lang.String, expected: java.lang.String): js.Any = js.native
  def assertFieldCSS(cssSelector: java.lang.String, expected: java.lang.String, message: java.lang.String): js.Any = js.native
  def assertFieldName(inputName: java.lang.String, expected: java.lang.String): js.Any = js.native
  def assertFieldName(inputName: java.lang.String, expected: java.lang.String, message: java.lang.String): js.Any = js.native
  def assertFieldName(
    inputName: java.lang.String,
    expected: java.lang.String,
    message: java.lang.String,
    options: js.Any
  ): js.Any = js.native
  def assertFieldXPath(xpathSelector: java.lang.String, expected: java.lang.String): js.Any = js.native
  def assertFieldXPath(xpathSelector: java.lang.String, expected: java.lang.String, message: java.lang.String): js.Any = js.native
  def assertHttpStatus(status: scala.Double): js.Any = js.native
  def assertHttpStatus(status: scala.Double, message: java.lang.String): js.Any = js.native
  def assertInstanceOf(input: js.Any, ctor: js.Function): js.Any = js.native
  def assertInstanceOf(input: js.Any, ctor: js.Function, message: java.lang.String): js.Any = js.native
  def assertMatch(subject: js.Any, pattern: stdLib.RegExp): js.Any = js.native
  def assertMatch(subject: js.Any, pattern: stdLib.RegExp, message: java.lang.String): js.Any = js.native
  def assertNot(subject: js.Any): js.Any = js.native
  def assertNot(subject: js.Any, message: java.lang.String): js.Any = js.native
  def assertNotEquals(testValue: js.Any, expected: js.Any): js.Any = js.native
  def assertNotEquals(testValue: js.Any, expected: js.Any, message: java.lang.String): js.Any = js.native
  def assertNotVisible(selector: java.lang.String): js.Any = js.native
  def assertNotVisible(selector: java.lang.String, message: java.lang.String): js.Any = js.native
  def assertRaises(fn: js.Function, args: js.Array[_]): js.Any = js.native
  def assertRaises(fn: js.Function, args: js.Array[_], message: java.lang.String): js.Any = js.native
  def assertResourceExists(testFx: js.Function): js.Any = js.native
  def assertResourceExists(testFx: js.Function, message: java.lang.String): js.Any = js.native
  def assertSelectorDoesntHaveText(selector: java.lang.String, text: java.lang.String): js.Any = js.native
  def assertSelectorDoesntHaveText(selector: java.lang.String, text: java.lang.String, message: java.lang.String): js.Any = js.native
  def assertSelectorExists(selector: java.lang.String): js.Any = js.native
  def assertSelectorExists(selector: java.lang.String, message: java.lang.String): js.Any = js.native
  def assertSelectorHasText(selector: java.lang.String, text: java.lang.String): js.Any = js.native
  def assertSelectorHasText(selector: java.lang.String, text: java.lang.String, message: java.lang.String): js.Any = js.native
  def assertTextDoesntExist(unexpected: java.lang.String, message: java.lang.String): js.Any = js.native
  def assertTextExists(expected: java.lang.String): js.Any = js.native
  def assertTextExists(expected: java.lang.String, message: java.lang.String): js.Any = js.native
  def assertTitle(expected: java.lang.String): js.Any = js.native
  def assertTitle(expected: java.lang.String, message: java.lang.String): js.Any = js.native
  def assertTitleMatch(pattern: stdLib.RegExp): js.Any = js.native
  def assertTitleMatch(pattern: stdLib.RegExp, message: java.lang.String): js.Any = js.native
  def assertTruthy(subject: js.Any): js.Any = js.native
  def assertTruthy(subject: js.Any, message: java.lang.String): js.Any = js.native
  def assertType(input: js.Any, `type`: java.lang.String): js.Any = js.native
  def assertType(input: js.Any, `type`: java.lang.String, message: java.lang.String): js.Any = js.native
  def assertUrlMatch(pattern: java.lang.String): js.Any = js.native
  def assertUrlMatch(pattern: java.lang.String, message: java.lang.String): js.Any = js.native
  def assertUrlMatch(pattern: stdLib.RegExp): js.Any = js.native
  def assertUrlMatch(pattern: stdLib.RegExp, message: java.lang.String): js.Any = js.native
  def assertVisible(selector: java.lang.String): js.Any = js.native
  def assertVisible(selector: java.lang.String, message: java.lang.String): js.Any = js.native
  def begin(description: java.lang.String, config: js.Object): js.Any = js.native
  def begin(description: java.lang.String, planned: scala.Double, config: js.Object): js.Any = js.native
  /* since 1.1 */
  def begin(description: java.lang.String, planned: scala.Double, suite: js.Function): js.Any = js.native
  def begin(description: java.lang.String, suite: js.Function): js.Any = js.native
  def colorize(message: java.lang.String, style: java.lang.String): js.Any = js.native
  def comment(message: java.lang.String): js.Any = js.native
  def done(): js.Any = js.native
  def done(expected: scala.Double): js.Any = js.native
  def error(message: java.lang.String): js.Any = js.native
  def fail(message: java.lang.String): js.Any = js.native
  def formatMessage(message: java.lang.String, style: java.lang.String): js.Any = js.native
  def getFailures(): Cases = js.native
  def getPasses(): Cases = js.native
  def info(message: java.lang.String): js.Any = js.native
  def pass(message: java.lang.String): js.Any = js.native
  def renderResults(exit: scala.Boolean, status: scala.Double, save: java.lang.String): js.Any = js.native
  def setup(fn: js.Function): js.Any = js.native
  def skip(nb: scala.Double, message: java.lang.String): js.Any = js.native
  def tearDown(fn: js.Function): js.Any = js.native
}

