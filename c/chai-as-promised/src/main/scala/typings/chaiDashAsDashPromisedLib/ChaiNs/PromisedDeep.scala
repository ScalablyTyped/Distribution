package typings
package chaiDashAsDashPromisedLib.ChaiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromisedDeep extends js.Object {
  @JSName("eq")
  var eq_Original: PromisedEqual = js.native
  @JSName("equal")
  var equal_Original: PromisedEqual = js.native
  @JSName("equals")
  var equals_Original: PromisedEqual = js.native
  @JSName("include")
  var include_Original: PromisedInclude = js.native
  @JSName("members")
  var members_Original: PromisedMembers = js.native
  var ordered: PromisedOrdered = js.native
  @JSName("property")
  var property_Original: PromisedProperty = js.native
  def eq(value: js.Any): PromisedAssertion = js.native
  def eq(value: js.Any, message: java.lang.String): PromisedAssertion = js.native
  def equal(value: js.Any): PromisedAssertion = js.native
  def equal(value: js.Any, message: java.lang.String): PromisedAssertion = js.native
  def equals(value: js.Any): PromisedAssertion = js.native
  def equals(value: js.Any, message: java.lang.String): PromisedAssertion = js.native
  def include(value: java.lang.String): PromisedAssertion = js.native
  def include(value: java.lang.String, message: java.lang.String): PromisedAssertion = js.native
  def include(value: js.Object): PromisedAssertion = js.native
  def include(value: js.Object, message: java.lang.String): PromisedAssertion = js.native
  def include(value: scala.Double): PromisedAssertion = js.native
  def include(value: scala.Double, message: java.lang.String): PromisedAssertion = js.native
  def members(set: js.Array[_]): PromisedAssertion = js.native
  def members(set: js.Array[_], message: java.lang.String): PromisedAssertion = js.native
  def property(name: java.lang.String): PromisedAssertion = js.native
  def property(name: java.lang.String, value: js.Any): PromisedAssertion = js.native
  def property(name: java.lang.String, value: js.Any, message: java.lang.String): PromisedAssertion = js.native
}

