package typings
package chaiDashAsDashPromisedLib.ChaiNs

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
  def include(value: chaiLib.Object): PromisedAssertion = js.native
  def include(value: chaiLib.Object, message: java.lang.String): PromisedAssertion = js.native
  def include(value: java.lang.String): PromisedAssertion = js.native
  def include(value: java.lang.String, message: java.lang.String): PromisedAssertion = js.native
  def include(value: scala.Double): PromisedAssertion = js.native
  def include(value: scala.Double, message: java.lang.String): PromisedAssertion = js.native
  def members(set: js.Array[_]): PromisedAssertion = js.native
  def members(set: js.Array[_], message: java.lang.String): PromisedAssertion = js.native
  def property(name: java.lang.String): PromisedAssertion = js.native
  def property(name: java.lang.String, value: js.Any): PromisedAssertion = js.native
  def property(name: java.lang.String, value: js.Any, message: java.lang.String): PromisedAssertion = js.native
}

