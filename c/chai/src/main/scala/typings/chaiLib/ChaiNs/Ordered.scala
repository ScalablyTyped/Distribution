package typings
package chaiLib.ChaiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ordered extends js.Object {
  @JSName("members")
  var members_Original: Members = js.native
  def members(set: js.Array[_]): Assertion = js.native
  def members(set: js.Array[_], message: java.lang.String): Assertion = js.native
}

