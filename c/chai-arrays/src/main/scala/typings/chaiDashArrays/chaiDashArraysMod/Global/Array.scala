package typings.chaiDashArrays.chaiDashArraysMod.Global

import typings.chaiDashArrays.chaiDashArraysMod.Global.ChaiNs.Assertion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Array[T] extends js.Object {
  @JSName("should")
  var should_Original: Assertion = js.native
  def should(`type`: String): typings.chai.ChaiNs.Assertion = js.native
  def should(`type`: String, message: String): typings.chai.ChaiNs.Assertion = js.native
}

