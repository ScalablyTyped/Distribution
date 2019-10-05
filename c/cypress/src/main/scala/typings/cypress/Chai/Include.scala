package typings.cypress.Chai

import typings.cypress.Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Include extends js.Object {
  var all: KeyFilter = js.native
  var any: KeyFilter = js.native
  var deep: Deep = js.native
  @JSName("keys")
  var keys_Original: Keys = js.native
  @JSName("members")
  var members_Original: Members = js.native
  var ordered: Ordered = js.native
  def apply(value: String): Assertion = js.native
  def apply(value: String, message: String): Assertion = js.native
  def apply(value: Double): Assertion = js.native
  def apply(value: Double, message: String): Assertion = js.native
  def apply(value: Object): Assertion = js.native
  def apply(value: Object, message: String): Assertion = js.native
  def html(html: String): Assertion = js.native
  def keys(keys: String*): Assertion = js.native
  def keys(keys: js.Array[_]): Assertion = js.native
  def keys(keys: Object): Assertion = js.native
  def members(set: js.Array[_]): Assertion = js.native
  def members(set: js.Array[_], message: String): Assertion = js.native
  def text(text: String): Assertion = js.native
  def value(text: String): Assertion = js.native
}

