package typings.chaiDashAlmost.chaiDashAlmostMod.Global.ChaiNs.ChaiAlmostNs

import typings.chai.ChaiNs.Equal
import typings.chaiDashAlmost.chaiDashAlmostMod.Global.ChaiNs.Assertion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeepAlmost extends js.Object {
  @JSName("eq")
  var eq_Original: Equal = js.native
  @JSName("equal")
  var equal_Original: Equal = js.native
  @JSName("equals")
  var equals_Original: Equal = js.native
  def apply(value: js.Any): Assertion = js.native
  def apply(value: js.Any, toleranceOverride: Double): Assertion = js.native
  def eq(value: js.Any): typings.chai.ChaiNs.Assertion = js.native
  def eq(value: js.Any, message: String): typings.chai.ChaiNs.Assertion = js.native
  def equal(value: js.Any): typings.chai.ChaiNs.Assertion = js.native
  def equal(value: js.Any, message: String): typings.chai.ChaiNs.Assertion = js.native
  def equals(value: js.Any): typings.chai.ChaiNs.Assertion = js.native
  def equals(value: js.Any, message: String): typings.chai.ChaiNs.Assertion = js.native
}

