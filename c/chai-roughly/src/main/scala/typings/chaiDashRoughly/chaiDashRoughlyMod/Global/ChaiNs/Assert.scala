package typings.chaiDashRoughly.chaiDashRoughlyMod.Global.ChaiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// For Assert APIs
@js.native
trait Assert extends js.Object {
  @JSName("roughly")
  var roughly_Original: Roughly = js.native
  def roughly(): Assertion = js.native
  def roughly(tolerance: Double): Assertion = js.native
  def roughly(`type`: String): typings.chai.ChaiNs.Assertion = js.native
  def roughly(`type`: String, message: String): typings.chai.ChaiNs.Assertion = js.native
}

