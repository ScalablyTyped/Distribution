package typings.chai.ChaiNs

import typings.chai.Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Keys extends js.Object {
  def apply(keys: String*): Assertion = js.native
  def apply(keys: js.Array[_]): Assertion = js.native
  def apply(keys: Object): Assertion = js.native
}

