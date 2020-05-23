package typings.chai.Chai

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Nested extends js.Object {
  @JSName("contain")
  var contain_Original: Include = js.native
  @JSName("contains")
  var contains_Original: Include = js.native
  @JSName("include")
  var include_Original: Include = js.native
  @JSName("includes")
  var includes_Original: Include = js.native
  @JSName("members")
  var members_Original: Members = js.native
  @JSName("property")
  var property_Original: Property = js.native
  def contain(value: js.Any): Assertion = js.native
  def contain(value: js.Any, message: String): Assertion = js.native
  def contains(value: js.Any): Assertion = js.native
  def contains(value: js.Any, message: String): Assertion = js.native
  def include(value: js.Any): Assertion = js.native
  def include(value: js.Any, message: String): Assertion = js.native
  def includes(value: js.Any): Assertion = js.native
  def includes(value: js.Any, message: String): Assertion = js.native
  def members(set: js.Array[_]): Assertion = js.native
  def members(set: js.Array[_], message: String): Assertion = js.native
  def property(name: String): Assertion = js.native
  def property(name: String, message: String): Assertion = js.native
  def property(name: String, value: js.Any): Assertion = js.native
  def property(name: String, value: js.Any, message: String): Assertion = js.native
}

