package typings.chaiDashAsDashPromised.ChaiNs

import typings.chai.ChaiNs.LanguageChains
import typings.chai.ChaiNs.NumericComparison
import typings.chai.ChaiNs.TypeComparison
import typings.std.Error
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// For BDD API
@js.native
trait Assertion
  extends LanguageChains
     with NumericComparison
     with TypeComparison {
  @JSName("eventually")
  var eventually_Original: PromisedAssertion = js.native
  @JSName("fulfilled")
  var fulfilled_Original: PromisedAssertion = js.native
  @JSName("rejectedWith")
  var rejectedWith_Original: PromisedThrow = js.native
  @JSName("rejected")
  var rejected_Original: PromisedAssertion = js.native
  def become(expected: js.Any): PromisedAssertion = js.native
  def eventually(`type`: String): PromisedAssertion = js.native
  def eventually(`type`: String, message: String): PromisedAssertion = js.native
  def fulfilled(`type`: String): PromisedAssertion = js.native
  def fulfilled(`type`: String, message: String): PromisedAssertion = js.native
  def notify(fn: js.Function): PromisedAssertion = js.native
  def rejected(`type`: String): PromisedAssertion = js.native
  def rejected(`type`: String, message: String): PromisedAssertion = js.native
  def rejectedWith(): PromisedAssertion = js.native
  def rejectedWith(constructor: js.Function): PromisedAssertion = js.native
  def rejectedWith(constructor: js.Function, expected: String): PromisedAssertion = js.native
  def rejectedWith(constructor: js.Function, expected: String, message: String): PromisedAssertion = js.native
  def rejectedWith(constructor: js.Function, expected: RegExp): PromisedAssertion = js.native
  def rejectedWith(constructor: js.Function, expected: RegExp, message: String): PromisedAssertion = js.native
  def rejectedWith(constructor: Error): PromisedAssertion = js.native
  def rejectedWith(constructor: Error, expected: String): PromisedAssertion = js.native
  def rejectedWith(constructor: Error, expected: String, message: String): PromisedAssertion = js.native
  def rejectedWith(constructor: Error, expected: RegExp): PromisedAssertion = js.native
  def rejectedWith(constructor: Error, expected: RegExp, message: String): PromisedAssertion = js.native
  def rejectedWith(expected: String): PromisedAssertion = js.native
  def rejectedWith(expected: String, message: String): PromisedAssertion = js.native
  def rejectedWith(expected: RegExp): PromisedAssertion = js.native
  def rejectedWith(expected: RegExp, message: String): PromisedAssertion = js.native
}

