package typings.chaiDashAsDashPromised.ChaiNs

import typings.std.Error
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromisedThrow extends js.Object {
  def apply(): PromisedAssertion = js.native
  def apply(constructor: js.Function): PromisedAssertion = js.native
  def apply(constructor: js.Function, expected: String): PromisedAssertion = js.native
  def apply(constructor: js.Function, expected: String, message: String): PromisedAssertion = js.native
  def apply(constructor: js.Function, expected: RegExp): PromisedAssertion = js.native
  def apply(constructor: js.Function, expected: RegExp, message: String): PromisedAssertion = js.native
  def apply(constructor: Error): PromisedAssertion = js.native
  def apply(constructor: Error, expected: String): PromisedAssertion = js.native
  def apply(constructor: Error, expected: String, message: String): PromisedAssertion = js.native
  def apply(constructor: Error, expected: RegExp): PromisedAssertion = js.native
  def apply(constructor: Error, expected: RegExp, message: String): PromisedAssertion = js.native
  def apply(expected: String): PromisedAssertion = js.native
  def apply(expected: String, message: String): PromisedAssertion = js.native
  def apply(expected: RegExp): PromisedAssertion = js.native
  def apply(expected: RegExp, message: String): PromisedAssertion = js.native
}

