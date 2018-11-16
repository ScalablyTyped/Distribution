package typings
package chaiLib.ChaiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Nested extends js.Object {
  @JSName("include")
  var include_Original: Include = js.native
  @JSName("members")
  var members_Original: Members = js.native
  @JSName("property")
  var property_Original: Property = js.native
  def include(value: java.lang.String): Assertion = js.native
  def include(value: java.lang.String, message: java.lang.String): Assertion = js.native
  def include(value: js.Object): Assertion = js.native
  def include(value: js.Object, message: java.lang.String): Assertion = js.native
  def include(value: scala.Double): Assertion = js.native
  def include(value: scala.Double, message: java.lang.String): Assertion = js.native
  def members(set: js.Array[_]): Assertion = js.native
  def members(set: js.Array[_], message: java.lang.String): Assertion = js.native
  def property(name: java.lang.String): Assertion = js.native
  def property(name: java.lang.String, value: js.Any): Assertion = js.native
  def property(name: java.lang.String, value: js.Any, message: java.lang.String): Assertion = js.native
}

