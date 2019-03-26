package typings
package cypressLib.ChaiNs

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
  def eq(value: js.Any, message: java.lang.String): Assertion = js.native
  def equal(value: js.Any): Assertion = js.native
  def equal(value: js.Any, message: java.lang.String): Assertion = js.native
  def equals(value: js.Any): Assertion = js.native
  def equals(value: js.Any, message: java.lang.String): Assertion = js.native
  def include(value: cypressLib.Object): Assertion = js.native
  def include(value: cypressLib.Object, message: java.lang.String): Assertion = js.native
  def include(value: java.lang.String): Assertion = js.native
  def include(value: java.lang.String, message: java.lang.String): Assertion = js.native
  def include(value: scala.Double): Assertion = js.native
  def include(value: scala.Double, message: java.lang.String): Assertion = js.native
  def members(set: js.Array[_]): Assertion = js.native
  def members(set: js.Array[_], message: java.lang.String): Assertion = js.native
  def property(name: java.lang.String): Assertion = js.native
  def property(name: java.lang.String, value: js.Any): Assertion = js.native
  def property(name: java.lang.String, value: js.Any, message: java.lang.String): Assertion = js.native
}

