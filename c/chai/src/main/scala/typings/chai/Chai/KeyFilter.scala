package typings.chai.Chai

import typings.chai.Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyFilter extends js.Object {
  @JSName("keys")
  var keys_Original: Keys = js.native
  @JSName("members")
  var members_Original: Members = js.native
  def keys(keys: String*): Assertion = js.native
  def keys(keys: js.Array[_]): Assertion = js.native
  def keys(keys: Object): Assertion = js.native
  def members(set: js.Array[_]): Assertion = js.native
  def members(set: js.Array[_], message: String): Assertion = js.native
}

