package typings.chaiDashThings.ChaiNs

import typings.chai.ChaiNs.Assertion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayInclude extends js.Object {
  var a: Item = js.native
  var an: Item = js.native
  @JSName("any")
  var any_Original: Anything = js.native
  @JSName("one")
  var one_Original: Something = js.native
  @JSName("some")
  var some_Original: Something = js.native
  @JSName("something")
  var something_Original: Something = js.native
  def apply(item: js.Any): js.Any = js.native
  def any(): js.Any = js.native
  def any(`type`: String): Assertion = js.native
  def any(`type`: String, message: String): Assertion = js.native
  def one(): js.Any = js.native
  def one(`type`: String): Assertion = js.native
  def one(`type`: String, message: String): Assertion = js.native
  def some(): js.Any = js.native
  def some(`type`: String): Assertion = js.native
  def some(`type`: String, message: String): Assertion = js.native
  def something(): js.Any = js.native
  def something(`type`: String): Assertion = js.native
  def something(`type`: String, message: String): Assertion = js.native
}

