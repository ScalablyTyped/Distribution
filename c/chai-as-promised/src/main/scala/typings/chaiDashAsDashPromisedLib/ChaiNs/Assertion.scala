package typings
package chaiDashAsDashPromisedLib.ChaiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// For BDD API
@js.native
trait Assertion
  extends chaiLib.ChaiNs.LanguageChains
     with chaiLib.ChaiNs.NumericComparison
     with chaiLib.ChaiNs.TypeComparison {
  var eventually: PromisedAssertion = js.native
  var fulfilled: PromisedAssertion = js.native
  var rejected: PromisedAssertion = js.native
  @JSName("rejectedWith")
  var rejectedWith_Original: PromisedThrow = js.native
  def become(expected: js.Any): PromisedAssertion = js.native
  def notify(fn: js.Function): PromisedAssertion = js.native
  def rejectedWith(): PromisedAssertion = js.native
  def rejectedWith(constructor: js.Function): PromisedAssertion = js.native
  def rejectedWith(constructor: js.Function, expected: java.lang.String): PromisedAssertion = js.native
  def rejectedWith(constructor: js.Function, expected: java.lang.String, message: java.lang.String): PromisedAssertion = js.native
  def rejectedWith(constructor: js.Function, expected: stdLib.RegExp): PromisedAssertion = js.native
  def rejectedWith(constructor: js.Function, expected: stdLib.RegExp, message: java.lang.String): PromisedAssertion = js.native
  def rejectedWith(constructor: stdLib.Error): PromisedAssertion = js.native
  def rejectedWith(constructor: stdLib.Error, expected: java.lang.String): PromisedAssertion = js.native
  def rejectedWith(constructor: stdLib.Error, expected: java.lang.String, message: java.lang.String): PromisedAssertion = js.native
  def rejectedWith(constructor: stdLib.Error, expected: stdLib.RegExp): PromisedAssertion = js.native
  def rejectedWith(constructor: stdLib.Error, expected: stdLib.RegExp, message: java.lang.String): PromisedAssertion = js.native
  def rejectedWith(expected: java.lang.String): PromisedAssertion = js.native
  def rejectedWith(expected: java.lang.String, message: java.lang.String): PromisedAssertion = js.native
  def rejectedWith(expected: stdLib.RegExp): PromisedAssertion = js.native
  def rejectedWith(expected: stdLib.RegExp, message: java.lang.String): PromisedAssertion = js.native
}

