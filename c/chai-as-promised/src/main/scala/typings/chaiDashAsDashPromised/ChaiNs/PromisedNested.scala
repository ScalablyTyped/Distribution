package typings.chaiDashAsDashPromised.ChaiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromisedNested extends js.Object {
  @JSName("include")
  var include_Original: PromisedInclude = js.native
  @JSName("members")
  var members_Original: PromisedMembers = js.native
  @JSName("property")
  var property_Original: PromisedProperty = js.native
  def include(value: String): PromisedAssertion = js.native
  def include(value: String, message: String): PromisedAssertion = js.native
  def include(value: js.Object): PromisedAssertion = js.native
  def include(value: js.Object, message: String): PromisedAssertion = js.native
  def include(value: Double): PromisedAssertion = js.native
  def include(value: Double, message: String): PromisedAssertion = js.native
  def members(set: js.Array[_]): PromisedAssertion = js.native
  def members(set: js.Array[_], message: String): PromisedAssertion = js.native
  def property(name: String): PromisedAssertion = js.native
  def property(name: String, value: js.Any): PromisedAssertion = js.native
  def property(name: String, value: js.Any, message: String): PromisedAssertion = js.native
}

