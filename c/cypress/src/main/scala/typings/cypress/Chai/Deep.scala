package typings.cypress.Chai

import typings.cypress.Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Deep extends js.Object {
  @JSName("eq")
  var eq_Original: Equal = js.native
  @JSName("equal")
  var equal_Original: Equal = js.native
  @JSName("equals")
  var equals_Original: Equal = js.native
  @JSName("include")
  var include_Original: Include = js.native
  @JSName("members")
  var members_Original: Members = js.native
  var ordered: Ordered = js.native
  @JSName("property")
  var property_Original: Property = js.native
  def eq(value: js.Any): Assertion = js.native
  def eq(value: js.Any, message: String): Assertion = js.native
  def equal(value: js.Any): Assertion = js.native
  def equal(value: js.Any, message: String): Assertion = js.native
  def equals(value: js.Any): Assertion = js.native
  def equals(value: js.Any, message: String): Assertion = js.native
  def include(value: String): Assertion = js.native
  def include(value: String, message: String): Assertion = js.native
  def include(value: Double): Assertion = js.native
  def include(value: Double, message: String): Assertion = js.native
  def include(value: Object): Assertion = js.native
  def include(value: Object, message: String): Assertion = js.native
  def members(set: js.Array[_]): Assertion = js.native
  def members(set: js.Array[_], message: String): Assertion = js.native
  def property(name: String): Assertion = js.native
  def property(name: String, value: js.Any): Assertion = js.native
  def property(name: String, value: js.Any, message: String): Assertion = js.native
}

