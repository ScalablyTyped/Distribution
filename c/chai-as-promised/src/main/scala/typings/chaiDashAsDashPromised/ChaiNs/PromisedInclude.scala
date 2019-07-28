package typings.chaiDashAsDashPromised.ChaiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromisedInclude extends js.Object {
  var all: PromisedKeyFilter = js.native
  var any: PromisedKeyFilter = js.native
  var deep: PromisedDeep = js.native
  @JSName("keys")
  var keys_Original: PromisedKeys = js.native
  @JSName("members")
  var members_Original: PromisedMembers = js.native
  var ordered: PromisedOrdered = js.native
  def apply(value: String): PromisedAssertion = js.native
  def apply(value: String, message: String): PromisedAssertion = js.native
  def apply(value: js.Object): PromisedAssertion = js.native
  def apply(value: js.Object, message: String): PromisedAssertion = js.native
  def apply(value: Double): PromisedAssertion = js.native
  def apply(value: Double, message: String): PromisedAssertion = js.native
  def keys(keys: String*): PromisedAssertion = js.native
  def keys(keys: js.Array[_]): PromisedAssertion = js.native
  def keys(keys: js.Object): PromisedAssertion = js.native
  def members(set: js.Array[_]): PromisedAssertion = js.native
  def members(set: js.Array[_], message: String): PromisedAssertion = js.native
}

