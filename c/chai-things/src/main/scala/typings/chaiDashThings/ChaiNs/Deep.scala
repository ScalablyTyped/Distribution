package typings.chaiDashThings.ChaiNs

import typings.chai.ChaiNs.Assertion
import typings.chai.ChaiNs.Equal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Deep extends js.Object {
  @JSName("equals")
  var equals_Original: Equal = js.native
  def equals(value: js.Any): Assertion = js.native
  def equals(value: js.Any, message: String): Assertion = js.native
}

