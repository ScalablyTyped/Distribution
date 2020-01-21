package typings.cypress.Chai_

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
  def apply(value: js.Any): Assertion = js.native
  def apply(value: js.Any, message: String): Assertion = js.native
  def html(html: String): Assertion = js.native
  def keys(keys: String*): Assertion = js.native
  def keys(keys: js.Array[_]): Assertion = js.native
  def keys(keys: Object): Assertion = js.native
  def members(set: js.Array[_]): Assertion = js.native
  def members(set: js.Array[_], message: String): Assertion = js.native
  def text(text: String): Assertion = js.native
  def value(text: String): Assertion = js.native
}

